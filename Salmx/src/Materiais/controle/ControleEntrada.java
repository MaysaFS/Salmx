/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maysa
 */
public class ControleEntrada {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
      private TelaPessoa tela;
    
    private TelaPrincipal principal;
    
    private PessoaDao dao;
    
    private DefaultTableModel modelo;
    
    private boolean edit;
    
    private Connection conexao;
    
    private int id;

    public ControlePessoa(TelaPrincipal principal,Connection conexao) {
        
        tela = new TelaPessoa();
        
        this.principal = principal;
        
        this.conexao = conexao;
        
        dao = new PessoaDao(this.conexao);
        
        modelo = (DefaultTableModel)tela.getjTablePessoa().getModel();
        
        adicionaEventos();
        
        edit = false;
        
        id = 0;
        
        listaDados();
        
    }

    public TelaPessoa getTela() {
        return tela;
    }

    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) tela.getjTablePessoa().getModel();
    }
    
    

    private void adicionaEventos() {
        tela.getjButtonGravar().addActionListener(this);
        tela.getjButtonRemove().addActionListener(this);
        tela.getjButtonEditar().addActionListener(this);
        tela.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == tela.getjButtonGravar()){
            if(tela.validaCampos()== true){
                gravaDados();
            }
        }
        
        if(e.getSource() == tela.getjButtonRemove()){
            removeDados();
        }
        
        if(e.getSource() == tela.getjButtonEditar()){
            edit = true;
            editaDados();
        }
        
        if(e.getSource() == tela.getjButtonSair()){
            principal.setContentPane(principal.getjPanel1());
            principal.repaint();
            principal.validate();
        }
        
    }

    private void gravaDados() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(tela.getjTextFieldNome().getText());
        pessoa.setCpf(tela.getjTextFieldCpf().getText());
        if(edit == false){
            dao.adiciona(pessoa);
        } else{
            pessoa.setId(id);
            dao.altera(pessoa);
        }
        listaDados();
        tela.limpaTela();
        edit = false;
    }

    private void listaDados() {
        limpaTabela();   
        List<Pessoa> listaPessoas = dao.lista();
        for(int i=0;i<listaPessoas.size();i++){
            addTabela(
                    listaPessoas.get(i).getId(),
                    listaPessoas.get(i).getNome(),
                    listaPessoas.get(i).getCpf()                    
                    );
        }
    }
    
    private void limpaTabela(){
        int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
    }

    private void removeDados() {
        int item = tela.itemSelecionado();
        if(item >= 0){      
          int id = Integer.parseInt(modelo.getValueAt(item, 0).toString());          
          modelo.removeRow(item);
          dao.exclui(id);
        } 
    }

    private void editaDados() {
        int item = tela.itemSelecionado();
        if(item >= 0){
          tela.getjTextFieldNome().setText(modelo.getValueAt(item, 1).toString());
          tela.getjTextFieldCpf().setText(modelo.getValueAt(item, 2).toString());
          this.id = Integer.parseInt(modelo.getValueAt(item, 0).toString());
        } 
    }
    
    private void salvar(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(tela.getjTextFieldNome().getText());
        pessoa.setCpf(tela.getjTextFieldCpf().getText());
        addTabela(pessoa.getNome(),pessoa.getCpf());
    }
    
    public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }
    
    
    
}

    
}
