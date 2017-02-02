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
import java.sql.Connection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControleUsuario implements MouseListener {

    GUsuario gUsuario;
    TelaPrincipal principal;
    ControlePrincipal cp;
    private JDTelaUsuario telaUsuario;
    private UsuarioDAO usuarioDAO;
    private DefaultTableModel modelo;
    private List<Usuario> usrLista;

    private int codigo;
    private boolean edit;

    public ControleUsuario(TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        this.usuarioDAO = new UsuarioDAO(conexao);
        this.cp = cp;
        this.principal = principal;

        carregaTela();
        escutaEventoGUsuario();

        modelo = (DefaultTableModel) gUsuario.getjTableUsersList().getModel();

        limpaTabela();
        listaDados(usuarioDAO.listarUsuarios());
    }

    private void carregaTela() {

        this.gUsuario = new GUsuario();

        this.telaUsuario = new JDTelaUsuario(principal, true);
    }

    private void escutaEventoGUsuario() {
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

    private void salvarDados() {
        boolean uSalvo = false;
        String strPass = new String(telaUsuario.getjPasswordFieldSenha().getPassword()).trim();
        String strComfirmaPass = new String(telaUsuario.getjPasswordFieldConfirmaSenha().getPassword()).trim();

        if (strPass.equals(strComfirmaPass)) {
            Usuario u = new Usuario();

            u.setNome(telaUsuario.getJTextFieldNome().getText());
            u.setLogin(telaUsuario.getJTextFieldLogin().getText());
            u.setTipo(telaUsuario.getjCheckBoxUsrAdm().isSelected());
            u.setSenha(strPass);

            if (edit == false) {
                uSalvo = usuarioDAO.salvarUsuario(u);

            } else {
                u.setCodigo(codigo);
                uSalvo = usuarioDAO.editarUsuario(u);
            }
        } else {
            telaUsuario.exibeErro("Senhas diferentes");
            System.err.println("\n ** Senhas diferentes");
        }
        if (uSalvo) {
            System.out.println(" \n\n** Usuario editado/salvo!");
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
            telaUsuario.ocultaErro();
            telaUsuario.limpaCampos();
            telaUsuario.dispose();
            limpaTabela();
            listaDados(usuarioDAO.listarUsuarios());

        }
    }

    private void editaDados() {
        int item = gUsuario.itemSelecionado();
        String usrSenha;
        if (item >= 0) {
            codigo = usrLista.get(item).getCodigo();
            usrSenha = usuarioDAO.buscarLogin(usrLista.get(item).getLogin()).getSenha();

            telaUsuario.getJTextFieldNome().setText(usrLista.get(item).getNome());
            telaUsuario.getJTextFieldLogin().setText(usrLista.get(item).getLogin());
            telaUsuario.getjPasswordFieldSenha().setText(usrSenha);
            telaUsuario.getjPasswordFieldConfirmaSenha().setText(usrSenha);

            if (usrLista.get(item).getTipo() == true) {;
                telaUsuario.getjCheckBoxUsrAdm().setSelected(true);
            }
            //OPÇÃO 2: EDICAÇÃO USUARIO
            telaUsuario.setVisible(true);
        }
    }

    private void exluiUsuario() {
        int confirma = -1;
        int item = gUsuario.itemSelecionado();

        if (item >= 0) {
            if (usrLista.get(item).getTipo() == true) {
                JOptionPane.showMessageDialog(null, "Acesso negado!\nA Exclusão do administrador pode provocar erros no sistema!");
                System.err.println("\n ** O burro ta tentando exluir o usuário administrador");
            } else {
                confirma = JOptionPane.showConfirmDialog(null,
                        "\nDESEJA CONFIRMAR A EXCLUSÃO?\n"
                        + "\nNome: " + usrLista.get(item).getNome()
                        + "\nLogin: " + usrLista.get(item).getLogin());
            }

            if (confirma == 0) {
                System.out.println(" \n\n** Usuário excluido! ");
                usuarioDAO.excluirUsuario(usrLista.get(item).getLogin(),
                        usrLista.get(item).getCodigo());
                limpaTabela();
                listaDados(usuarioDAO.listarUsuarios());
            }
        }
    }

    private void pesquisaUsuario() {
        limpaTabela();

        List<Usuario> usuarios = usuarioDAO.buscarUsuario(gUsuario.getCaixaBuscar().getText());

        if (usuarios.size() > 0) {
            listaDados(usuarios);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado");
            listaDados(usuarioDAO.listarUsuarios());
        }

    }

    //Só é permitido um usuário administrador
    private void verificaUsrAdm() {
        for (int i = 0; i < usuarioDAO.listarUsuarios().size(); i++) {
            if (usuarioDAO.listarUsuarios().get(i).getTipo() == true) {
                telaUsuario.getjCheckBoxUsrAdm().setEnabled(false);
                telaUsuario.getjCheckBoxUsrAdm().setSelected(false);
                break;
            }
        }
    }

    private void addTabela(Object... objects) {
        modelo.addRow(objects);
    }

    private void limpaTabela() {
        int linhas = modelo.getRowCount();
        for (int i = 0; i < linhas; i++) {
            modelo.removeRow(0);
        }
    }

    private void listaDados(List<Usuario> lista) {
        limpaTabela();
        for (int i = 0; i < lista.size(); i++) {
            addTabela(
                    lista.get(i).getCodigo(),
                    lista.get(i).getNome(),
                    lista.get(i).getLogin(),
                    usrTipo(lista.get(i).getTipo())
            );
        }
        usrLista = lista;
    }

    private String usrTipo(boolean tipo) {
        String strTipo;
        if (tipo == true) {
            strTipo = "Administrador";
        } else {
            strTipo = "Padrão";
        }
        return strTipo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //BOTÃO VOLTAR
        if (e.getSource() == gUsuario.getVoltar()) {
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();

        }
        //BOTÃO PESQUISAR
        if (e.getSource() == gUsuario.getPesquisarUsuario()) {
            if (gUsuario.getCaixaBuscar().getText().isEmpty() != true) {
                pesquisaUsuario();
            } else {
                listaDados(usuarioDAO.listarUsuarios());
            }
        }
        //BOTÃO NOVO
        if (e.getSource() == gUsuario.getNovoUsuario()) {
            telaUsuario.limpaCampos();
            telaUsuario.ocultaErro();
            edit = false;

            verificaUsrAdm();
            telaUsuario.setVisible(true);
        }
        //BOTÃO EDITAR
        if (e.getSource() == gUsuario.getEditarUsuario()) {
            telaUsuario.limpaCampos();
            telaUsuario.ocultaErro();
            edit = true;

            verificaUsrAdm();
            editaDados();
        }
        //BOTÃO EXCUIR
        if (e.getSource() == gUsuario.getExcluirUsuario()) {
            exluiUsuario();

        }
        //BOTÃO SALVAR
        if (e.getSource() == telaUsuario.getJLabelSalvar()) {
            if (telaUsuario.validaCampos()) {
                salvarDados();
            }

        }
        //BOTÃO OK (OCULTA ERROS)
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
