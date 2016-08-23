/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.controle;

import Principal.view.PanelPrincipal;
import Principal.view.TelaPrincipal;
import Usuarios.model.Usuario;
import Usuarios.model.UsuarioDAO;
import Usuarios.view.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControleLogin implements ActionListener, MouseListener {

    private TelaPrincipal principal;
    private PanelPrincipal pp;
    private LoginFrame login;
    private UsuarioDAO usuarioDAO;
    private String erro = " ";
    private boolean tipo = true;

    public ControleLogin(TelaPrincipal principal, PanelPrincipal pp, LoginFrame login, Connection conexao) {
        this.principal = principal;
        this.pp = pp;
        this.login = login;
        adicionaEventos();
        this.login.setVisible(true);
        usuarioDAO = new UsuarioDAO(conexao);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void adicionaEventos() {
        login.getjLabelLogin().addMouseListener(this);
        login.getjLabelErroOK().addMouseListener(this);
        login.getjPasswordFieldUserPass().addKeyListener(e);

    }

    public boolean getTipo() {
        return tipo;
    }

    //TESTE DE LOGIN COM O BANCO (FUNCIONANDO)
    private void validaLogin() {
        Usuario usuario = new Usuario();
        boolean valida = login.validaCampos();
        try {
            usuario = usuarioDAO.buscarUsuario(login.getjTextFieldUser().getText());
            if (valida) {
                if (usuario.getCodigo() > 0) {
                    if (usuario.getSenha().equals(login.getjPasswordFieldUserPass().getText())) {
                        login.dispose();
                        if (!usuario.getTipo()) {
                            System.out.println("usuario padrao");
                            pp.getUsuarios_Icone().setVisible(false);
                            pp.getUsuarios_Label().setVisible(false);
                        }
                        principal.setVisible(true);

                    } else {
                        erro = "Senha incorreta";
                    }

                } else {
                    erro = "Usuario não encontrado";
                }

            } else {
                erro = "Preencha todos os campos";
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControleLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        login.exibeErro(erro);
    }

    private void validaAcesso() {
        if (login.validaCampos() == true) {
            if (login.getjTextFieldUser().getText().equalsIgnoreCase("admin")
                    && login.getjPasswordFieldUserPass().getText().equalsIgnoreCase("admin")) {
                login.dispose();
                principal.setVisible(true);

            } else {
                erro = "Acesso negado";
            }
        } else {
            erro = "Preencha todos os campos";
        }
        login.exibeErro(erro);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login.getjLabelLogin()) {
            validaAcesso();
            //login();

        }
        if (e.getSource() == login.getjLabelErroOK()) {
            login.ocultaErro();
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
            if (e.getKeyCode() == e.VK_ENTER) {
                //System.out.println("ENTER PRESSIONADO");

                validaAcesso();
                validaLogin();
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
