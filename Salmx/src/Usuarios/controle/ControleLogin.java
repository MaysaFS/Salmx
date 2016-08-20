/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.controle;

import Principal.view.TelaPrincipal;
import Usuarios.view.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Maysa
 */
public class ControleLogin implements ActionListener,MouseListener{
    private TelaPrincipal principal;
    private LoginFrame login;

    public ControleLogin(TelaPrincipal principal, LoginFrame login) {
        this.principal = principal;
        this.login = login;
        
        adicionaEventos();
       this.login.setVisible(true);
    }    
            
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void adicionaEventos() {
        login.getjLabelLogin().addMouseListener(this);
        login.getjLabelErroOK().addMouseListener(this);
        login.getjPasswordFieldUserPass().addKeyListener(e);
    }
   

    private void validaAcesso() {
      if(login.validaCampos()==true){  
        if(login.getjTextFieldUser().getText().equalsIgnoreCase("admin") && 
                login.getjPasswordFieldUserPass().getText().equalsIgnoreCase("admin")){
                login.dispose();
                principal.setVisible(true);
                
        } else{
            login.exibeErro("Acesso Negado");
            //JOptionPane.showMessageDialog(null, "Acesso Negado");
        }
      }
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==login.getjLabelLogin()){
            validaAcesso();
        }
        if(e.getSource() == login.getjLabelErroOK()){
            login.getjLabelErro().setText("    ");
            login.getjLabelErroOK().setVisible(false);
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
    KeyListener e = new KeyListener() {
            
            @Override
            public void keyPressed(KeyEvent e) {
               if(e.getKeyCode() == e.VK_ENTER){
                   //System.out.println("ENTER PRESSIONADO");
                   validaAcesso();
               }
               
            }
            
            
            @Override
            public void keyTyped(KeyEvent e) {
            }


            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
       
}
