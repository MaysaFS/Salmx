/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.controle;

import Principal.view.PanelPrincipal;
import Principal.view.TelaPrincipal;
import Setor.controle.ControleSetor;
import Setor.view.TelaSetor;
import Usuarios.controle.ControleLogin;
import Usuarios.controle.ControleUsuario;
import Usuarios.view.GUsuario;
import Usuarios.view.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.management.GarbageCollectorMXBean;

/**
 *
 * @author Maysa
 */
public class ControlePrincipal implements ActionListener,MouseListener {
    
    TelaPrincipal telaPrincipal;
    LoginFrame telaLogin;
    TelaSetor telaSetor;
    ControleLogin controleLogin;
    ControleSetor controleSetor;
    ControleUsuario controleUsuario;
    PanelPrincipal pp;

    public ControlePrincipal() {
        carregaTelas();        
        escutaEventos();
        controleLogin= new ControleLogin(telaPrincipal, telaLogin);        
        
    }    
    public void carregaTelas(){
        pp= new PanelPrincipal();
        telaPrincipal= new TelaPrincipal();
        telaPrincipal.setContentPane(pp);      
        telaPrincipal.repaint();
        telaPrincipal.validate();
        telaLogin= new LoginFrame();
    }  
             
    public void escutaEventos(){
        pp.getFornecedores_Icone().addMouseListener(this);
        pp.getUsuarios_Icone().addMouseListener(this);
        pp.getSetores_Icone().addMouseListener(this);
        pp.getCategorias_Icone().addMouseListener(this);
        pp.getMateriais_Icone().addMouseListener(this);
        pp.getRelatorios_Icone().addMouseListener(this);
    }

    public PanelPrincipal getTela() {
        return pp;
    }

    public TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    
   
    
    @Override
    public void actionPerformed(ActionEvent e){}

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == pp.getSetores_Icone()){
           controleSetor =  new ControleSetor(telaPrincipal,this);
           telaPrincipal.setContentPane(controleSetor.getTela());
           telaPrincipal.repaint();
           telaPrincipal.validate();
        }
         if(e.getSource() == pp.getMateriais_Icone()){
          // controlePessoa =  new ControlePessoa();
          // telaPrincipal.setContentPane(controlePessoa.getTela());
          // telaPrincipal.repaint();
          // telaPrincipal.validate();
        }
          if(e.getSource() == pp.getUsuarios_Icone()){
            controleUsuario =  new ControleUsuario(telaPrincipal, this);
            telaPrincipal.setContentPane(controleUsuario.getTela());
            telaPrincipal.repaint();
            telaPrincipal.validate();
        }
           if(e.getSource() == pp.getFornecedores_Icone()){
          // controlePessoa =  new ControlePessoa();
          // telaPrincipal.setContentPane(controlePessoa.getTela());
          // telaPrincipal.repaint();
          // telaPrincipal.validate();
        }
            if(e.getSource() == pp.getRelatorios_Icone()){
          // controlePessoa =  new ControlePessoa();
          // telaPrincipal.setContentPane(controlePessoa.getTela());
          // telaPrincipal.repaint();
          // telaPrincipal.validate();
        }
             if(e.getSource() == pp.getCategorias_Icone()){
          // controlePessoa =  new ControlePessoa();
          // telaPrincipal.setContentPane(controlePessoa.getTela());
          // telaPrincipal.repaint();
          // telaPrincipal.validate();
        }
    
    }

    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
