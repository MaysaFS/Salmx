/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria.controle;

import Categoria.model.Categoria;
import Categoria.model.RnCategoria;
import Categoria.view.GestaoCat;
import Categoria.view.JDTelaCat;
import java.awt.event.MouseListener;
import Principal.controle.ControlePrincipal;
import Principal.view.PanelPrincipal;
import Principal.view.TelaPrincipal;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Erick
 */
public abstract  class  ControleCategoria implements MouseListener {
    TelaPrincipal principal;
    GestaoCat gtCat;
    RnCategoria rn;
    ControlePrincipal cp;
    JDTelaCat telacat;
    private DefaultTableModel modelo;
    private boolean edit;
    
     public ControleCategoria (TelaPrincipal principal, ControlePrincipal cp){
      this.principal= principal;
      this.cp=cp;
      carregaTela();
      rn= new RnCategoria();
      escutaEventos();
      edit=false;
     }
           public void carregaTela(){
            this.gtCat= new GestaoCat();
            this.telacat= new JDTelaCat(principal, true);
           }
    
           public void escutaEventos(){
           gtCat.getCadCategoria().addMouseListener(this);
           gtCat.getEditCategoria().addMouseListener(this);
           gtCat.getRemoCategoria().addMouseListener(this);
           gtCat.getBotBuscar().addMouseListener(this);
           gtCat.getjLabelVoltar().addMouseListener(this);
           //telacat.getLabelSalvar().addMouseListener(this);
           }
           public GestaoCat getTela(){
            return gtCat;
           }
           
           public DefaultTableModel getTableModel(){
               return (DefaultTableModel)gtCat.getjTablecatList().getModel();
           }
           
           
           public void eventosNovoSetor(){
        
            telacat.getjLabelSalvar().addMouseListener(this);
           } 

    /**
     *
     * @param e
     */

    @Override
           public void mouseClicked(MouseEvent e){
               if(e.getSource()==gtCat.getCadCategoria()){
               telacat.setVisible(true);
               }
               
               if(e.getSource()== gtCat.getEditCategoria()){
                editaDados();
                edit=true;
                telacat.setVisible(true);
               }
               
               if(e.getSource()==gtCat.getRemoCategoria()){
               
               }
               if(e.getSource()==gtCat.getBotBuscar()){
               
               }
              
               if(e.getSource()==gtCat.getjLabelVoltar()){
                 gtCat.show();
                 principal.setContentPane(cp.getTela());
                 principal.repaint();
                 principal.validate();
               }
               if(e.getSource()==telacat.getjLabelSalvar()){
                if(telacat.validaCampos()==true){
                salvarDados();
                }
            
               }
           }
           public void salvarDados(){
              Categoria categoria=new Categoria();
                 categoria.setNome(telacat.getTxtNomeCat().getText());
           }
           public void editaDados(){
              int item=gtCat.itemSelecionado();
              if(item >=0){
                telacat.getTxtNomeCat().setText(rn.listarCat().get(item).getNome());
              }
           }
           public final void addTabela(Object... objects) {
             modelo.addRow(objects);
           }
           
            private void listaDados() {

        limpaTabela();        
        for(int i=0;i<rn.listarCat().size();i++){
            addTabela(rn.listarCat().get(i).getNome());
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
