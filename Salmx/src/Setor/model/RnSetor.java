/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.model;

import Principal.view.TelaPrincipal;
import Setor.controle.ControleSetor;
import Setor.view.novo.GSetor;
import Setor.view.TelaSetor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Maysa
 */
public class RnSetor implements MouseListener {
    TelaSetor ts;
    TelaPrincipal tp;
   
    
    
      public RnSetor(TelaPrincipal tp) {
        ts= new TelaSetor();
        this.tp=tp;
        addEvent();
        
    }
    public void addEvent(){
       ts.getjLabelSalvar().addMouseListener(this);
       ts.getjLabelCancelar().addMouseListener(this);
       
   }
    public TelaSetor getTela(){
       return ts;
   }
    
    public void editarDados(){
        
    }
    public void gravaDados(){
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
         if(e.getSource() == ts.getjLabelSalvar()){
            
        }
        if(e.getSource() == ts.getjLabelCancelar()){
            ts.show();  
           ControleSetor controleSetor = new ControleSetor(tp);
           tp.setContentPane(controleSetor.getTela());
           tp.repaint();
           tp.validate();
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
