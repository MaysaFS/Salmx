/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.controle;

/**
 *
 * @author jimmy
 */
import Principal.controle.ControlePrincipal;
import Principal.view.PanelPrincipal;
import Principal.view.TelaPrincipal;
import Setor.model.RnSetor;
import Usuarios.view.GUsuario;
import Usuarios.view.NovoUsuario;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControleUsuario implements MouseListener{
    GUsuario gUsuario;
    TelaPrincipal principal;
    ControlePrincipal cp;
     
    public ControleUsuario( TelaPrincipal principal, ControlePrincipal cp) {
        this.gUsuario = new  GUsuario();
        this.cp = cp;
        this.principal = principal;
        escutaEventos();        
    }
 
    public void escutaEventos(){
        gUsuario.getNovoUsuario().addMouseListener(this);
        gUsuario.getEditarUsuario().addMouseListener(this);
        gUsuario.getExcluirUsuario().addMouseListener(this);  
        gUsuario.getPesquisarUsuario().addMouseListener(this);
        gUsuario.getVoltar().addMouseListener(this);
    }
    public GUsuario getTela(){
        return gUsuario;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gUsuario.getVoltar()){
           principal.setContentPane(cp.getTela());
           principal.repaint();
           principal.validate();
           
        }
        if(e.getSource() == gUsuario.getNovoUsuario()){
            NovoUsuario novo = new NovoUsuario();
            novo.setVisible(true);
        }
        
     
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}
