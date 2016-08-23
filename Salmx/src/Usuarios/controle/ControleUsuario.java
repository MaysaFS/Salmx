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

import Usuarios.model.Usuario;
import Usuarios.model.UsuarioDAO;
import Usuarios.view.GUsuario;
import Usuarios.view.JDTelaUsuario;
import Usuarios.view.LoginFrame;
import java.sql.Connection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControleUsuario implements MouseListener {

    GUsuario gUsuario;
    TelaPrincipal principal;
    ControlePrincipal cp;
    JDTelaUsuario telaUsuario;
    private UsuarioDAO usuarioDAO;
    private DefaultTableModel modelo;
    private int codigo;
    private boolean edit;
    private String erro;

    public ControleUsuario() {
    }

    public ControleUsuario(TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        this.gUsuario = new GUsuario();
        this.usuarioDAO = new UsuarioDAO(conexao);
        this.cp = cp;
        this.principal = principal;
        carregaTela();
        escutaEventoGUsuario();
        modelo = (DefaultTableModel) gUsuario.getjTableUsersList().getModel();
        limpaTabela();
        listaDados();
    }

    public void carregaTela() {

        this.gUsuario = new GUsuario();

        this.telaUsuario = new JDTelaUsuario(principal, true);
    }

    public void escutaEventoGUsuario() {
        //Botoes da tela de Gestão de usuários
        gUsuario.getNovoUsuario().addMouseListener(this);
        gUsuario.getEditarUsuario().addMouseListener(this);
        gUsuario.getExcluirUsuario().addMouseListener(this);
        gUsuario.getPesquisarUsuario().addMouseListener(this);
        gUsuario.getVoltar().addMouseListener(this);

        //Botões da tela de Usuario
        telaUsuario.getJLabelSalvar().addMouseListener(this);
        telaUsuario.getjLabelErroOK().addMouseListener(this);

    }

    public GUsuario getTela() {
        return gUsuario;
    }

    public void salvarDados() {
        boolean uSalvo = false;

        Usuario u = new Usuario();

        u.setNome(telaUsuario.getJTextFieldNome().getText());
        u.setLogin(telaUsuario.getJTextFieldLogin().getText());
        u.setSenha(telaUsuario.getjPasswordFieldSenha().getText());
        u.setConfirmaSenha(telaUsuario.getjPasswordFieldConfirmaSenha().getText());
        u.setTipo(telaUsuario.getjRadioButtonUsrAdm().isSelected());

        if (u.getSenha().equals(u.getConfirmaSenha())) {
            if (!edit) {
                uSalvo = usuarioDAO.salvarUsuario(u);

            }else{
                u.setCodigo(codigo);
                uSalvo = usuarioDAO.editarUsuario(u);
                telaUsuario.exibeErro(erro);
            }
        } else {
            erro = "Senhas diferentes";
            System.out.println("Senhas diferentes");
            telaUsuario.exibeErro(erro);
        }
        if (uSalvo) {
            telaUsuario.ocultaErro();
            telaUsuario.limpaCampos();
            telaUsuario.dispose();           
            listaDados();
            telaUsuario.limpaTela();
            JOptionPane.showMessageDialog(null, "Usuario \"" + u.getNome()
                    + "\" salvo com sucesso");
           
        }
    }

    public void editaDados() {
        int item = gUsuario.itemSelecionado();
        
        System.out.println("Item: " + item);
       
        if (item >= 0) {
        
            telaUsuario.getJTextFieldNome().setText(usuarioDAO.listarUsuarios().get(item).getNome());
            telaUsuario.getJTextFieldLogin().setText(usuarioDAO.listarUsuarios().get(item).getLogin());
            codigo = usuarioDAO.listarUsuarios().get(item).getCodigo();
            System.out.println("metodo edita codigo: " + codigo);
            telaUsuario.setVisible(true);
        }
    }
     public void exluiUsuario() {
        int item = gUsuario.itemSelecionado();
        
        System.out.println("Item selecionado: " + item);
       
        if (item >= 0) {
            int confirma;
            confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que dejeja excluir o usuario \""
                    + usuarioDAO.listarUsuarios().get(item).getNome()+"\"?");
            
            if(confirma == 0){
                usuarioDAO.excluirUsuario(usuarioDAO.listarUsuarios().get(item).getLogin(),
                        usuarioDAO.listarUsuarios().get(item).getCodigo());
                limpaTabela();
                listaDados();
            }
        }
    }
    
    
    public void pesquisaUsuario() {
        limpaTabela();
        boolean busca = false;
        for (int i = 0; i < usuarioDAO.listarUsuarios().size(); i++) {
            if (gUsuario.getCaixaBuscar().getText().equalsIgnoreCase(usuarioDAO.listarUsuarios().get(i).getLogin())
                    || gUsuario.getCaixaBuscar().getText().equalsIgnoreCase(usuarioDAO.listarUsuarios().get(i).getNome())) {
                System.out.println("Usuário encontrado");
                addTabela(
                        usuarioDAO.listarUsuarios().get(i).getCodigo(),
                        usuarioDAO.listarUsuarios().get(i).getNome(),
                        usuarioDAO.listarUsuarios().get(i).getLogin(),
                        usrTipo(i)
                );
                busca = true;
            }
        }
        if (busca == false){
            JOptionPane.showMessageDialog(null,"Usuario não encontrado!");
            listaDados();
        }

    }
    

    public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }

    private void limpaTabela() {
        int linhas = modelo.getRowCount();
        for (int i = 0; i < linhas; i++) {
            modelo.removeRow(0);
        }
    }

    private String usrTipo(int i) {
        String tipo;
        if (usuarioDAO.listarUsuarios().get(i).getTipo()) {
            tipo = "Administrador";
        } else {
            tipo = "Padrão";
        }
        return tipo;
    }

    private void listaDados() {
        limpaTabela();

        for (int i = 0; i < usuarioDAO.listarUsuarios().size(); i++) {

            addTabela(
                    usuarioDAO.listarUsuarios().get(i).getCodigo(),
                    usuarioDAO.listarUsuarios().get(i).getNome(),
                    usuarioDAO.listarUsuarios().get(i).getLogin(),
                    usrTipo(i)
            );
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == gUsuario.getVoltar()) {
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();

        }

        if (e.getSource() == gUsuario.getPesquisarUsuario()) {
            pesquisaUsuario();
        }

        if (e.getSource() == gUsuario.getNovoUsuario()) {
            telaUsuario.limpaCampos();
            telaUsuario.ocultaErro();
            edit = false;
            telaUsuario.setVisible(true);
        }

        if (e.getSource() == gUsuario.getEditarUsuario()) {
            telaUsuario.limpaCampos();
            telaUsuario.ocultaErro();
            edit = true;
            editaDados();
        }

        if (e.getSource() == gUsuario.getExcluirUsuario()) {
            exluiUsuario();
             
        }

        if (e.getSource() == telaUsuario.getJLabelSalvar()) {
            if (telaUsuario.validaCampos()) {
                salvarDados();
            }

        }

        if (e.getSource() == telaUsuario.getjLabelErroOK()) {
            telaUsuario.ocultaErro();

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
