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
import Usuarios.model.RnUsuario;
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
    private RnUsuario rn;
    private UsuarioDAO usuarioDAO;
    private DefaultTableModel modelo;
    private int codigo;
    private boolean edit;
    
    public ControleUsuario(){
    }
    
    public ControleUsuario(TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        this.gUsuario = new GUsuario();
        this.rn = new RnUsuario();
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
        gUsuario.getNovoUsuario().addMouseListener(this);
        gUsuario.getEditarUsuario().addMouseListener(this);
        gUsuario.getExcluirUsuario().addMouseListener(this);
        gUsuario.getPesquisarUsuario().addMouseListener(this);
        gUsuario.getVoltar().addMouseListener(this);

        telaUsuario.getJLabelSalvar().addMouseListener(this);

    }

    public GUsuario getTela() {
        return gUsuario;
    }

    public JDTelaUsuario getTelaUsuario() {
        return telaUsuario;
    }

    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) gUsuario.getjTableUsersList().getModel();
    }
    
    public UsuarioDAO getDAO(){
        return usuarioDAO;
    }

   

    public void salvarDados() {
        boolean a = false;
        Usuario usuario = new Usuario();
        usuario.setNome(telaUsuario.getJTextFieldNome().getText());
        usuario.setLogin(telaUsuario.getJTextFieldLogin().getText());
        usuario.setSenha(telaUsuario.getjPasswordFieldSenha().getText());
        usuario.setConfirmaSenha(telaUsuario.getjPasswordFieldConfirmaSenha().getText());

            if(edit == false){
                System.out.println("EDIT FALSE");
                a = usuarioDAO.salvarUsuario(usuario);
                telaUsuario.exibeErro(usuarioDAO.getErro());
            }else{
                System.out.println("EDIT TRUE");
                usuario.setCodigo(codigo);
                a = usuarioDAO.editarUsuario(usuario);
                telaUsuario.exibeErro(usuarioDAO.getErro());
            }
            
            if (a){
                telaUsuario.ocultaErro();
                listaDados();
                telaUsuario.limpaTela();
                telaUsuario.dispose(); 
                edit=false;
                
            }
        }
     public void editaDados(){
        int item = gUsuario.itemSelecionado();
        if(item >= 0){
            telaUsuario.getJTextFieldNome().setText(usuarioDAO.listarUsuarios().get(item).getNome());
            telaUsuario.getJTextFieldLogin().setText(usuarioDAO.listarUsuarios().get(item).getLogin());
            codigo = usuarioDAO.listarUsuarios().get(item).getCodigo();
        } 
    }
    public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }
    private void listaDados() {

        limpaTabela();        
        for(int i=0;i<usuarioDAO.listarUsuarios().size();i++){
            addTabela(
                    usuarioDAO.listarUsuarios().get(i).getNome(),
                    usuarioDAO.listarUsuarios().get(i).getLogin(),
                    usuarioDAO.listarUsuarios().get(i).getCodigo()
                    
                    );
        }
    }
    
    private void limpaTabela(){
       int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
    }  


    @Override
    public void mouseClicked(MouseEvent e) {
       

        if (e.getSource() == gUsuario.getVoltar()) {
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();

        }
        if (e.getSource() == gUsuario.getNovoUsuario()) {
            telaUsuario.setVisible(true);

        }
        if (e.getSource() == gUsuario.getEditarUsuario()) {
            edit = true;
            editaDados();
            telaUsuario.setVisible(true);
           
            }
        if (e.getSource() == telaUsuario.getJLabelSalvar()) {
            System.out.println("CLCIADO SALVAR");
            
            if (telaUsuario.validaCampos()) {
                    System.out.println("CHAMA SALVAR");
                    salvarDados();
            }

        }
        if(e.getSource() == telaUsuario.getjLabelErroOK()){
            telaUsuario.ocultaErro();
            System.out.println("OK CLIkCADO");
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
