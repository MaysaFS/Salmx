package Usuarios.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection conexao;
    private List<Usuario> usuarios;
    private String str;
    private boolean LoginEncontrado = false;
    String erro = "   ";
    boolean verifica;

    public UsuarioDAO(Connection conexao) {
        erro = "   ";
        this.conexao = conexao;
    }

    public String getErro() {
        return erro;
    }

    public boolean salvarUsuario(Usuario u) {
        str = "insert into usuario(nome,login,senha,tipo)"
                + "values(?,?,?,?)";
        try {
            PreparedStatement pst = conexao.prepareStatement(str);
            pst.setString(1, u.getNome());
            pst.setString(2, u.getLogin());
            pst.setString(3, u.getSenha());
            pst.setBoolean(4, u.getTipo());
            pst.execute();
            pst.close();
            verifica = true;

        } catch (SQLException e) {
            verifica = false;
            JOptionPane.showMessageDialog(null, "Erro ao salvar!\nVerifique se o LOGIN já pertence a outro usuário.");
            System.out.println("Nao foi possivel inserir!\n" + e);

            throw new RuntimeException(e);
        }
        return verifica;
    }

    public List<Usuario> buscarUsuario(String login) {
        login = '%'+login+'%';
        List<Usuario> usuario = new ArrayList<Usuario>();
        String sql = "select * from usuario where nome like ?";
        
        try {
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, login);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Usuario u = new Usuario();
                u.setCodigo(rst.getInt("codigo"));
                u.setNome(rst.getString("nome"));
                u.setLogin(rst.getString("login"));
                u.setSenha(rst.getString("senha"));
                u.setTipo(rst.getBoolean("tipo"));
                usuario.add(u);
            }
            rst.close();
            pst.close();
            return usuario;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Usuario buscarLogin(String login) {

        Usuario u = new Usuario();

        String sql = "select * from usuario where login = ?";
        try {
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, login);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                u.setCodigo(rst.getInt("codigo"));
                u.setNome(rst.getString("nome"));
                u.setLogin(rst.getString("login"));
                u.setSenha(rst.getString("senha"));
                u.setTipo(rst.getBoolean("tipo"));
            }
            rst.close();
            pst.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return u;
    }

    public boolean editarUsuario(Usuario u) {
        String str = "update usuario set login = ?,nome = ?,senha = ?,tipo = ? where codigo = ? ";
        try {
            Usuario usuario = buscarLogin(u.getLogin());

            if (u.getCodigo() > 0) {

                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1, u.getLogin());
                pst.setString(2, u.getNome());
                pst.setString(3, u.getSenha());
                pst.setBoolean(4, u.getTipo());
                pst.setInt(5, u.getCodigo());
                pst.execute();
                pst.close();
                return true;
            } else {
                System.out.println("código < que 0 Não foi possivel realizar a alteração");
                return false;
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar!\nVerifique se o LOGIN já pertence a outro usuário.");
            throw new RuntimeException(e);

        }

    }

    public List<Usuario> listarUsuarios() {
        String str = "select * from usuario order by nome";
        usuarios = new ArrayList<Usuario>();
        try {
            PreparedStatement pst = conexao.prepareStatement(str);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Usuario u = new Usuario();
                u.setCodigo(rst.getInt("codigo"));
                u.setNome(rst.getString("nome"));
                u.setLogin(rst.getString("login"));
                u.setTipo(rst.getBoolean("tipo"));
                usuarios.add(u);
            }
            rst.close();
            pst.close();
            return usuarios;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n" + e);
            throw new RuntimeException(e);
        }
    }

    public boolean excluirUsuario(String login, int codigo) {
        boolean result = false;
        String sql = "delete from usuario where codigo = ?";
        try {
            Usuario usuario = buscarLogin(login);
            if (usuario.getCodigo() > 0) {
                PreparedStatement pst = conexao.prepareStatement(sql);
                pst.setInt(1, codigo);
                result = pst.execute();
                pst.close();
            } else {
                System.out.println("nao foi possivel excluir");
            }
            return result;
        } catch (Exception e) {
            System.out.println("nao foi possivel excluir\n" + e);
            throw new RuntimeException(e);
        }

    }
}
