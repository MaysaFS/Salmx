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
import Setor.view.JDTelaSetor;
import Setor.view.GSetor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Maysa
 */
public class ControleSetor implements MouseListener {
    GSetor gSetor;
    TelaPrincipal principal;    
    RnSetor rn;
    ControlePrincipal cp;
    JDTelaSetor telasetor;
    private DefaultTableModel modelo;
    private  boolean edit;

      public ControleSetor( TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
          
        this.principal= principal;
        
        this.cp=cp;
        
        carregaTela();
        
        modelo = (DefaultTableModel)gSetor.getjTableSetorList().getModel();
        
        rn= new RnSetor();
        
        escutaEventos();  
        
        edit=false;
    }
      public void carregaTela(){
        
          this.gSetor = new  GSetor();
          
          this.telasetor= new JDTelaSetor(principal,true);
      }
    public void escutaEventos(){
        gSetor.getNovoSetor().addMouseListener(this);
        gSetor.getEditarSetor().addMouseListener(this);
        gSetor.getExcluirSetor().addMouseListener(this);  
        gSetor.getBtPesquisarSetor().addMouseListener(this);
        gSetor.getjLabelVoltar().addMouseListener(this);
        telasetor.getjLabelSalvar().addMouseListener(this);
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
            telasetor.setVisible(true);
                      
                    //  eventosNovoSetor();
           
        }
        
        if(e.getSource() == gSetor.getEditarSetor()){
            editaDados();            
            edit=true;
            telasetor.setVisible(true);
        }
        
        if(e.getSource() == gSetor.getExcluirSetor()){
            
        }
        if(e.getSource() == gSetor.getBtPesquisarSetor()){
            
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
    }
    public void salvarDados(){
        Setor setor= new Setor();
            setor.setNome(telasetor.getTxtNomeSetor().getText());
            setor.setRamal(telasetor.getTxtRamalSetor().getText());
            setor.setObservacao(telasetor.getTxtObservSetor().getText());
            if(edit==false){
              rn.salvarSetor(setor);  
              
            }else{
                rn.editarSetor(setor, gSetor.itemSelecionado());
            }            
            listaDados();
            telasetor.limpaTela();
            telasetor.dispose();
            edit=false;
            
    }
    public void editaDados(){
        int item = gSetor.itemSelecionado();
        if(item >= 0){
          telasetor.getTxtNomeSetor().setText(rn.listarSetor().get(item).getNome());
          telasetor.getTxtRamalSetor().setText(rn.listarSetor().get(item).getRamal());
          telasetor.getTxtObservSetor().setText(rn.listarSetor().get(item).getObservacao());
        } 
    }
    public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }
    
    
 

       private void listaDados() {

        limpaTabela();        
        for(int i=0;i<rn.listarSetor().size();i++){
            addTabela(
                    rn.listarSetor().get(i).getNome(),
                    rn.listarSetor().get(i).getRamal(),
                    rn.listarSetor().get(i).getObservacao()
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
