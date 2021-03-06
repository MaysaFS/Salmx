/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.controle;

import Principal.controle.ControlePrincipal;
import Principal.view.PanelPrincipal;
import Principal.view.TelaPrincipal;
import Setor.model.RnSetor;
import Setor.model.Setor;
import Setor.model.SetorDAO;
import Setor.view.JDTelaSetor;
import Setor.view.GSetor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Maysa
 */
public class ControleSetor implements MouseListener {
    GSetor gSetor;
    TelaPrincipal principal;    
    SetorDAO rn;
    ControlePrincipal cp;
    JDTelaSetor telasetor;
    private DefaultTableModel modelo;
    private int codigo;
    private  boolean edit;
    private  boolean delete;
    private List<Setor> setores;

      public ControleSetor( TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        setores=new ArrayList<Setor>();
        this.principal= principal;        
        this.cp=cp;        
        carregaTela();        
        modelo = (DefaultTableModel)gSetor.getjTableSetorList().getModel();       
        rn= new SetorDAO(conexao);        
        escutaEventos();          
        edit=false;
        delete=false;
        limpaTabela();
        listaDados();
    }
      public void carregaTela(){        
          this.gSetor = new  GSetor();          
          this.telasetor= new JDTelaSetor(principal,true);
          telasetor.getjLabelExcluir().setVisible(false);
      }
    public void escutaEventos(){
        gSetor.getNovoSetor().addMouseListener(this);
        gSetor.getEditarSetor().addMouseListener(this);
        gSetor.getExcluirSetor().addMouseListener(this);  
        gSetor.getBtPesquisarSetor().addMouseListener(this);
        gSetor.getjLabelVoltar().addMouseListener(this);
        telasetor.getjLabelSalvar().addMouseListener(this);
        telasetor.getjLabelExcluir().addMouseListener(this);
    }
    public GSetor getTela(){       
        return gSetor;
    }
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel) gSetor.getjTableSetorList().getModel();
    }
    public void eventosNovoSetor(){
        
        telasetor.getjLabelSalvar().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gSetor.getNovoSetor()){
            telasetor.limpaTela();
            telasetor.mudaEstadoBotton();
            telasetor.habilitaCampos();
            telasetor.setVisible(true);                      
                    //  eventosNovoSetor();          
        }        
        if(e.getSource() == gSetor.getEditarSetor()){
            edit=true;             
            editaDados();             
        }        
        if(e.getSource() == gSetor.getExcluirSetor()){
            exibeDados();
               
            
        }
        if(e.getSource() == gSetor.getBtPesquisarSetor()){
            this.pesquisa();
        }
        if(e.getSource() == gSetor.getjLabelVoltar()){
            gSetor.show();
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();            
        }
        if(e.getSource()==telasetor.getjLabelSalvar()){
            //System.out.println("funciona o botão salvar");
           if(telasetor.validaCampos()==true){
                 salvarDados();
                 
           }                      
        }
        if(e.getSource()==telasetor.getjLabelExcluir()){
             excluirSetor();
             telasetor.mudaEstadoBotton();
        }
    }
    public void salvarDados(){
            Setor setor= new Setor();
            setor.setNome(telasetor.getTxtNomeSetor().getText());
            setor.setRamal(telasetor.getTxtRamalSetor().getText());
            setor.setObservacao(telasetor.getTxtObservSetor().getText());
            
            if((telasetor.getTxtCodSetor().getText().equalsIgnoreCase(""))|| edit==false){
              rn.salvarSetor(setor);              
              telasetor.dispose();
              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }else{    
                setor.setCodigo(Integer.parseInt(telasetor.getTxtCodSetor().getText()));
                rn.editarSetor(setor);
                telasetor.dispose();
                JOptionPane.showMessageDialog(null, "Edição realizada com sucesso!");
                edit=false;  
            }            
            listaDados();
            telasetor.limpaTela();
            
                      
    }
    public void editaDados(){
        int item = gSetor.itemSelecionado();
        if(item >= 0){
          telasetor.getTxtNomeSetor().setText(setores.get(item).getNome());
          telasetor.getTxtRamalSetor().setText(setores.get(item).getRamal());
          telasetor.getTxtObservSetor().setText(setores.get(item).getObservacao());
          telasetor.getTxtCodSetor().setText(String.valueOf(setores.get(item).getCodigo()));
          codigo=setores.get(item).getCodigo();
          telasetor.mudaEstadoBotton();
          telasetor.habilitaCampos();
          telasetor.setVisible(true);
        } 
    }
    
    private void exibeDados(){
        int item = gSetor.itemSelecionado();
        if(item >= 0){
            
         
          telasetor.getTxtNomeSetor().setText(setores.get(item).getNome());         
          telasetor.getTxtRamalSetor().setText(setores.get(item).getRamal());          
          telasetor.getTxtObservSetor().setText(setores.get(item).getObservacao());
          telasetor.getTxtCodSetor().setText(String.valueOf(setores.get(item).getCodigo()));
          telasetor.desabilitaCampos();  
          telasetor.habilitaBotConfirmaExc();          
          codigo=setores.get(item).getCodigo();
          telasetor.setVisible(true);
        } 
    }
    private void excluirSetor(){
       rn.excluirSetor(codigo);
       listaDados();
       telasetor.mudaEstadoBotton();
       telasetor.habilitaCampos();
       telasetor.limpaTela();       
       telasetor.dispose(); 
       JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso!");
       delete=false;       
    }
  private void pesquisa(){
      boolean buscar=false;
      limpaTabela(); 
      if(gSetor.getjTextBuscaSetor().getText().equals("")==false){
          setores.clear();
          setores.addAll(rn.buscarSetor(gSetor.getjTextBuscaSetor().getText()));
          
         if(setores.size()>0){              
             for(int i=0;i<setores.size();i++){
                    
                  addTabela(
                          setores.get(i).getCodigo(),
                          setores.get(i).getNome(),
                          setores.get(i).getRamal(),
                          setores.get(i).getObservacao()
                          );
                  buscar=true;
              }  
             
         }
         if(buscar==false){
             JOptionPane.showMessageDialog(gSetor,"Setor não encontrado!"); 
            
             listaDados();
         }
      }else{
          
          listaDados();
       }
      gSetor.limparBusca();
  }
  
 public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }

   private void listaDados() {

        limpaTabela(); 
        setores.clear();
        setores.addAll(rn.listarSetor());
        for(int i=0;i<setores.size();i++){
            addTabela(
                    setores.get(i).getCodigo(),
                    setores.get(i).getNome(),
                    setores.get(i).getRamal(),
                    setores.get(i).getObservacao()
                    );
        }
    }
    
private void limpaTabela(){
       int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
 }  
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    
    
}
