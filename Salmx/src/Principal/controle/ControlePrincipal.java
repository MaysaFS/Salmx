/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.controle;

import Fornecedor.controle.ControleFornecedor;
import Fornecedor.view.GestaoFornecedor;
import Fornecedor.view.NovoFornecedor;
import Principal.view.PanelPrincipal;
import Principal.view.TelaPrincipal;
import Setor.controle.ControleSetor;
import Setor.view.JDTelaSetor;
import Usuarios.controle.ControleLogin;
import Usuarios.controle.ControleUsuario;
import Usuarios.view.GUsuario;
import Usuarios.view.LoginFrame;
import conexao.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.management.GarbageCollectorMXBean;
import java.sql.Connection;

/**
 *
 * @author Maysa
 */
public class ControlePrincipal implements ActionListener,MouseListener {
    
    private TelaPrincipal telaPrincipal;
    private LoginFrame telaLogin;
    private JDTelaSetor telaSetor;
    private ControleLogin controleLogin;
    private ControleSetor controleSetor;
    private ControleUsuario controleUsuario;
    private PanelPrincipal pp;
    private ControleFornecedor controleFornecedor;
    private GestaoFornecedor gFornecedor;
    private NovoFornecedor telaFornecedor;
    private Connection conexao;

    public ControlePrincipal() {
        this.conexao= Conexao.doConexao();
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
           controleSetor =  new ControleSetor(telaPrincipal,this, this.conexao);
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
             controleFornecedor =  new ControleFornecedor(telaPrincipal, this);
             telaPrincipal.setContentPane(controleFornecedor.getGfornecedor());
             telaPrincipal.repaint();
             telaPrincipal.validate();
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
