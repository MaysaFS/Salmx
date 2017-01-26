
package Fornecedor.controle;

import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import Fornecedor.model.Fornecedor;
import Fornecedor.model.FornecedorDAO;
import Fornecedor.view.GestaoFornecedor;
import Fornecedor.view.NovoFornecedor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;




public class ControleFornecedor implements MouseListener {
   
    GestaoFornecedor gfornecedor;
    TelaPrincipal principal;    
    FornecedorDAO rn;
    ControlePrincipal cp;
    NovoFornecedor nfornecedor;
    private DefaultTableModel modelo;
    private  boolean edit;
    private  boolean delete;
    private int codigo;
    private int codE;
    private List<Fornecedor> listfornecedores;
   
      
    public ControleFornecedor( TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        listfornecedores=new ArrayList<Fornecedor>();  
        this.principal= principal;
        this.cp=cp;
        carregaTela();
        modelo = (DefaultTableModel)gfornecedor.getjTableFornecedor().getModel();
        rn= new FornecedorDAO(conexao);
        escutaEventos();  
        delete=false;
        limpaTabela();
        listaDados();
        
    }
      
      
      public void carregaTela(){
        
          this.gfornecedor = new  GestaoFornecedor();
          this.nfornecedor= new NovoFornecedor(principal,true);
      }
    public void escutaEventos(){
        gfornecedor.getBtAddForn().addMouseListener(this);
        gfornecedor.getBtEditForn().addMouseListener(this);
        gfornecedor.getBtExcForn().addMouseListener(this);
        gfornecedor.getBtPesquisa().addMouseListener(this);
        gfornecedor.getjLabelVoltar().addMouseListener(this);
        nfornecedor.getjLabelSalvarFornecedor().addMouseListener(this);
        nfornecedor.getjLabelExcluirFornecedor().addMouseListener(this);
    }
    
    public GestaoFornecedor getGfornecedor(){
       return gfornecedor ;
    }   
    
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel) gfornecedor.getjTableFornecedor().getModel();
    }
   
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gfornecedor.getBtAddForn()){
            edit=false;
            nfornecedor.limpaTela();
            nfornecedor.mudaEstadoBotton();
            nfornecedor.habilitaCampos();
            nfornecedor.setVisible(true);                       
        }        
        if(e.getSource() == gfornecedor.getBtEditForn()){            
            edit=true;
            editaDados();            
            nfornecedor.habilitaCampos();
            
        }        
        if(e.getSource() == gfornecedor.getBtExcForn()){
            exibeDados();
            
        }        
        if(e.getSource() == gfornecedor.getBtPesquisa()){
            this.pesquisa();
        }        
        if(e.getSource() == gfornecedor.getjLabelVoltar()){
            gfornecedor.show();
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();            
        }
        if(e.getSource()==nfornecedor.getjLabelSalvarFornecedor()){            
           if(nfornecedor.validaCampos()==true){
               salvarDados();
           }            
        }
        if(e.getSource()==nfornecedor.getjLabelExcluirFornecedor()){
             excluiFornecedor();
             
        }
    }
    public void salvarDados(){
        Fornecedor forn= new Fornecedor();
       
            forn.setRazaosocial(nfornecedor.getjTextFieldRazaoSocial().getText());
            forn.setCnpj(nfornecedor.getjTextFieldCnpj().getText());
            forn.setInscricaoestadual(nfornecedor.getjTextFieldInscriçãoEstadual().getText());
            forn.setTelefone1(nfornecedor.getjTextFieldTelefone1().getText());           
            forn.setTelefoneII(nfornecedor.getjTextFieldTelefoneII().getText());
            forn.setEmail(nfornecedor.getjTextFieldEmail().getText());
            
            forn.getEndereço().setRua(nfornecedor.getjTextFieldRua().getText());
            forn.getEndereço().setNumero(nfornecedor.getjTextFieldNumEnd().getText());
            forn.getEndereço().setBairro(nfornecedor.getjTextFieldBairro().getText());
            forn.getEndereço().setComplemento(nfornecedor.getjTextFieldComplemento().getText());
            forn.getEndereço().setCidade(nfornecedor.getjTextFieldCidade().getText());
            forn.getEndereço().setCep(nfornecedor.getjTextFieldCep().getText());
            forn.getEndereço().setUf(nfornecedor.getjTextFieldUf().getText());           
            
            if(edit==true){
                forn.setCodigo(codigo);
                forn.getEndereço().setId(codE);
                rn.editarFornecedor(forn);
                nfornecedor.dispose();
                JOptionPane.showMessageDialog(null, "Edição realizada com sucesso!");
            }else{            
                rn.salvarFornecedor(forn);
                nfornecedor.dispose();
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                
            }
            listaDados();
            nfornecedor.limpaTela();
            
    }
    
    
    public void editaDados(){
       
        int item = gfornecedor.itemSelecionado();
        if(item >= 0){
          nfornecedor.getjTextFieldRazaoSocial().setText(listfornecedores.get(item).getRazaosocial());
          nfornecedor.getjTextFieldInscriçãoEstadual().setText(listfornecedores.get(item).getInscricaoestadual());
          nfornecedor.getjTextFieldCnpj().setText(listfornecedores.get(item).getCnpj());
          nfornecedor.getjTextFieldTelefone1().setText(listfornecedores.get(item).getTelefone1());
          nfornecedor.getjTextFieldTelefoneII().setText(listfornecedores.get(item).getTelefoneII());
          nfornecedor.getjTextFieldEmail().setText(listfornecedores.get(item).getEmail());
          nfornecedor.getjTextFieldRua().setText(listfornecedores.get(item).getEndereço().getRua());
          nfornecedor.getjTextFieldNumEnd().setText(listfornecedores.get(item).getEndereço().getNumero());
          nfornecedor.getjTextFieldBairro().setText(listfornecedores.get(item).getEndereço().getBairro());
          nfornecedor.getjTextFieldComplemento().setText(listfornecedores.get(item).getEndereço().getComplemento());
          nfornecedor.getjTextFieldCidade().setText(listfornecedores.get(item).getEndereço().getCidade());
          nfornecedor.getjTextFieldCep().setText(listfornecedores.get(item).getEndereço().getCep());
          nfornecedor.getjTextFieldUf().setText(listfornecedores.get(item).getEndereço().getUf());
          codigo=listfornecedores.get(item).getCodigo();
          codE= listfornecedores.get(item).getEndereço().getId();
          nfornecedor.mudaEstadoBotton();
          nfornecedor.habilitaCampos();
          nfornecedor.setVisible(true);
          
        }
        edit=true;
    }
    private void exibeDados(){
        int item = gfornecedor.itemSelecionado();
        if(item >= 0){
            
          nfornecedor.getjTextFieldRazaoSocial().setText(listfornecedores.get(item).getRazaosocial());
          nfornecedor.getjTextFieldInscriçãoEstadual().setText(listfornecedores.get(item).getInscricaoestadual());
          nfornecedor.getjTextFieldCnpj().setText(listfornecedores.get(item).getCnpj());
          nfornecedor.getjTextFieldTelefone1().setText(listfornecedores.get(item).getTelefone1());
          nfornecedor.getjTextFieldTelefoneII().setText(listfornecedores.get(item).getTelefoneII());
          nfornecedor.getjTextFieldEmail().setText(listfornecedores.get(item).getEmail());
          nfornecedor.getjTextFieldRua().setText(listfornecedores.get(item).getEndereço().getRua());
          nfornecedor.getjTextFieldNumEnd().setText(listfornecedores.get(item).getEndereço().getNumero());
          nfornecedor.getjTextFieldBairro().setText(listfornecedores.get(item).getEndereço().getBairro());
          nfornecedor.getjTextFieldComplemento().setText(listfornecedores.get(item).getEndereço().getComplemento());
          nfornecedor.getjTextFieldCidade().setText(listfornecedores.get(item).getEndereço().getCidade());
          nfornecedor.getjTextFieldCep().setText(listfornecedores.get(item).getEndereço().getCep());
          nfornecedor.getjTextFieldUf().setText(listfornecedores.get(item).getEndereço().getUf());                 
          codigo=listfornecedores.get(item).getCodigo();
          codE= listfornecedores.get(item).getEndereço().getId();
          nfornecedor.abilitaBotConfirmExc();  
          nfornecedor.setVisible(true);
        } 
    }
    
    private void excluiFornecedor(){
          rn.excluiFornecedor(codigo);
          listaDados();     
          nfornecedor.mudaEstadoBotton();
          nfornecedor.habilitaCampos();
          nfornecedor.limpaTela();       
          nfornecedor.dispose();  
          JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
          delete=false;       
    }
    private void pesquisa(){
      boolean buscar=false;
      limpaTabela(); 
      if(gfornecedor.getjTextFieldPesquisa().getText().equals("")==false){
          listfornecedores.clear();
          listfornecedores.addAll(rn.buscarFornecedor(gfornecedor.getjTextFieldPesquisa().getText()));
          if(listfornecedores.size()>0){ 
              
              for(int i=0;i<listfornecedores.size();i++){
            
                addTabela(
                    listfornecedores.get(i).getCodigo(),
                    listfornecedores.get(i).getRazaosocial(),
                    listfornecedores.get(i).getCnpj(),
                    listfornecedores.get(i).getInscricaoestadual(),
                    listfornecedores.get(i).getEmail(),
                    listfornecedores.get(i).getTelefone1(),
                    listfornecedores.get(i).getTelefoneII()
                    
                    );
                buscar=true;
            }       
         }
         if(buscar==false){
             JOptionPane.showMessageDialog(gfornecedor,"Fornecedor não encontrado!"); 
             listaDados();

         }
      }else{
         listaDados();
      }
      gfornecedor.limpaCampoBusca();
  }
    
    
    public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }
    
    
    private void listaDados() {
        limpaTabela();    
        listfornecedores.clear();
        listfornecedores.addAll(rn.listarFornecedor());
        for(int i=0;i<listfornecedores.size();i++){
            addTabela(
                    listfornecedores.get(i).getCodigo(),
                    listfornecedores.get(i).getRazaosocial(),
                    listfornecedores.get(i).getCnpj(),
                    listfornecedores.get(i).getInscricaoestadual(),
                    listfornecedores.get(i).getEmail(),
                    listfornecedores.get(i).getTelefone1(),
                    listfornecedores.get(i).getTelefoneII()
                    
                    );
        }
    }
    
    
    
    private void limpaTabela(){
        int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
    }  
    
    
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
    
    
}


