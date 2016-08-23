/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author jimmy
 */
public class RnUsuario {
    UsuarioDAO udao;
    
    public RnUsuario(Connection conexao) {
        udao = new UsuarioDAO(conexao);
    }
    
    
    String erro = "  ";
    
    
    public void salvaUsuario(Usuario u){
        
        try {
            Usuario uTeste = new Usuario();
            
            udao.buscarUsuario(u.getLogin());
            if(uTeste.getCodigo()>0){
                erro = "LOGIN já existe";
                        
            }else{
                if(u.getSenha().equals(u.getConfirmaSenha())){
                   udao.salvarUsuario(u);
                }else{
                    erro = "Senhas diferentes";
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RnUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void editarUsuario(Usuario u){
        
    }
    public void excluirUsuario(Usuario u){
        
    }
}
