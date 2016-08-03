/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.controle;

import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import Setor.model.RnSetor;
import Setor.view.novo.GSetor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maysa
 */
public class ControleSetor implements MouseListener {
    GSetor gSetor;
    TelaPrincipal principal;
    ControlePrincipal cp;
    RnSetor rn;
     private DefaultTableModel modelo;

    public ControleSetor( TelaPrincipal principal, ControlePrincipal cp) {
        this.gSetor = new  GSetor();
        this.cp=cp;
        this.principal= principal;
        modelo = (DefaultTableModel)gSetor.getjTableSetorList().getModel();
        escutaEventos();        
    }
    public ControleSetor( TelaPrincipal principal) {
        this.gSetor = new  GSetor();
        this.cp=cp;
        this.principal= principal;
        modelo = (DefaultTableModel)gSetor.getjTableSetorList().getModel();
        escutaEventos();        
    }
    public void escutaEventos(){
        gSetor.getNovoSetor().addMouseListener(this);
        gSetor.getEditarSetor().addMouseListener(this);
        gSetor.getExcluirSetor().addMouseListener(this);  
        gSetor.getBtPesquisarSetor().addMouseListener(this);
        gSetor.getRetornarPrincip().addMouseListener(this);
    }
    public GSetor getTela(){
        return gSetor;
    }
    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) gSetor.getjTableSetorList().getModel();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gSetor.getNovoSetor()){
           rn= new RnSetor(principal);
           principal.setContentPane(rn.getTela());
           principal.repaint();
           principal.validate();
        }
        
        if(e.getSource() == gSetor.getEditarSetor()){
           rn= new RnSetor(principal);
           principal.setContentPane(rn.getTela());
           principal.repaint();
           principal.validate();
        }
        
        if(e.getSource() == gSetor.getExcluirSetor()){
            
        }
        if(e.getSource() == gSetor.getBtPesquisarSetor()){
            
        }
        if(e.getSource() == gSetor.getRetornarPrincip()){
            gSetor.show(true);           
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
