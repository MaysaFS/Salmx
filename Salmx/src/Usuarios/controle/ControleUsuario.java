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
import Principal.view.TelaPrincipal;
import Usuarios.view.GUsuario;
import Usuarios.view.NovoUsuario;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        
    }
    public GUsuario getTela(){
        return gUsuario;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gUsuario.getNovoUsuario()){
            
        }
     
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
