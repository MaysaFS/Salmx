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
import java.util.Arrays;
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

    public ControleUsuario() {
    }

    public ControleUsuario(TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        //Instancia de objetos
        this.gUsuario = new GUsuario();
        this.usuarioDAO = new UsuarioDAO(conexao);
        this.cp = cp;
        this.principal = principal;
        //Instancia a tela gestão de usuario e Tela de usuarios
        carregaTela();
        escutaEventoGUsuario();
        //Instancia Tabela para a tela de gestão
        modelo = (DefaultTableModel) gUsuario.getjTableUsersList().getModel();
        //Limpa a tabela e exibe dados
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

    //Retorna tela de gestão (Usado no controle principal)
    public GUsuario getTela() {
        return gUsuario;
    }

    public void salvarDados() {
        //Variavel "a" verifica se o objeto foi salvo no banco (Regra de negocio incluida na classe UsuarioDAO)
        boolean salvo = false;
        //Cria usuario á partir dos dados digitados na tela de usuarios
        Usuario usuario = new Usuario();
        usuario.setNome(telaUsuario.getJTextFieldNome().getText());
        usuario.setLogin(telaUsuario.getJTextFieldLogin().getText());
        usuario.setSenha(telaUsuario.getjPasswordFieldSenha().getText());
        usuario.setConfirmaSenha(telaUsuario.getjPasswordFieldConfirmaSenha().getText());
        usuario.setTipo(telaUsuario.getjRadioButtonUsrAdm().isSelected());
        //Edit é false quando o botão criar é assionado, se não for false, ele segue para a edição utilizando o código do objeto selecionado na tabela
        if (edit == false) {
            System.out.println("EDIT FALSE");
            salvo = usuarioDAO.salvarUsuario(usuario);
            telaUsuario.exibeErro(usuarioDAO.getErro());
      
        } else {
            System.out.println("EDIT TRUE");
            System.out.println("codigo: "+codigo);
            usuario.setCodigo(codigo);
            salvo = usuarioDAO.editarUsuario(usuario);
            telaUsuario.exibeErro(usuarioDAO.getErro());
        }

        //se "a" for true, os erros da tela são ocultados, é exibida uma menssagem e a tela de usuarios é feixada
        if (salvo) {
            telaUsuario.ocultaErro();

            JOptionPane.showMessageDialog(null, "Usuario " + usuario.getNome()
                    + " salvo com sucesso");

            listaDados();
            telaUsuario.limpaTela();
            telaUsuario.dispose();
        }
    }

    //Quando o botão editar é assionado, editaDados() preenche os campos nome e login na Tela de Usuarios
    public void editaDados() {
        int item = gUsuario.itemSelecionado();
        System.out.println("Item: "+item);
        if (item >= 0) {
            telaUsuario.getJTextFieldNome().setText(usuarioDAO.listarUsuarios().get(item).getNome());
            telaUsuario.getJTextFieldLogin().setText(usuarioDAO.listarUsuarios().get(item).getLogin());
            telaUsuario.setVisible(true);
            codigo = usuarioDAO.listarUsuarios().get(item).getCodigo();
            System.out.println("metodo edita codigo: "+codigo);
            
        }
    }
    public void pesquisaUsuario(){
        limpaTabela();
        for(int i = 0; i < usuarioDAO.listarUsuarios().size(); i++){
            if(gUsuario.getCaixaBuscar().getText().equalsIgnoreCase(usuarioDAO.listarUsuarios().get(i).getLogin()) ||
                    gUsuario.getCaixaBuscar().getText().equalsIgnoreCase(usuarioDAO.listarUsuarios().get(i).getNome())){
                        System.out.println("Usuário encontrado");
                        addTabela(
                            usuarioDAO.listarUsuarios().get(i).getCodigo(),
                            usuarioDAO.listarUsuarios().get(i).getNome(),
                            usuarioDAO.listarUsuarios().get(i).getLogin(),
                            usrTipo(i)    
                        );
            }else{
                System.out.println("Usuario não encontrado, verifiqar sintatse");
            }
        
        }
        
    }
    //adiciona elementos na tabela
    public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }
    //verifica tipo de usuario para busca e listagm
    private String usrTipo(int i){
        String tipo;
        if(usuarioDAO.listarUsuarios().get(i).getTipo()){
            tipo = "Administrador";
        }else{
            tipo = "Padrão";
        }
        return tipo;
    }
    
    //Lista elementos 
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

    //limpa dados da tabela para que a mesma seja atualizada
    private void limpaTabela() {
        int linhas = modelo.getRowCount();
        for (int i = 0; i < linhas; i++) {
            modelo.removeRow(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //Botão voltar (Tela de Gestão)
        //Função: "chama" a tela principal
        if (e.getSource() == gUsuario.getVoltar()) {
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();

        }
        
        if (e.getSource() == gUsuario.getPesquisarUsuario()) {
            pesquisaUsuario();
        }
        //Botao adicionar (Tela de Gestão)
        if (e.getSource() == gUsuario.getNovoUsuario()) {
            telaUsuario.limpaCampos();
            edit = false;
            telaUsuario.setVisible(true);
        }
        //Botão editar (Tela de gestão)
        if (e.getSource() == gUsuario.getEditarUsuario()) {
            telaUsuario.limpaCampos();
            edit = true;
            editaDados();
        }
        //Botão excluir
        //NÃO IMPLEMENTADO
        if (e.getSource() == gUsuario.getExcluirUsuario()) {
            JOptionPane.showMessageDialog(null, "Exclusão não implementada");
        }
        //Botão salvar (Tela de Usuarios)
        //Função: Salva dados do usuario (Novo ou Editado)
        if (e.getSource() == telaUsuario.getJLabelSalvar()) {
            if (telaUsuario.validaCampos()) {
                salvarDados();
            }

        }

        //Botão de ocultação de erros (Tela de Usuarios)
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
