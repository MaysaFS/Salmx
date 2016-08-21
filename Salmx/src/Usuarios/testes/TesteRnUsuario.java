/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.testes;

import Usuarios.model.RnUsuario;
import Usuarios.model.Usuario;
import Usuarios.model.UsuarioDAO;

public class TesteRnUsuario {

   

    
    public static void main(String[] args) {
        RnUsuario rn = new  RnUsuario();

       Usuario usuario = new Usuario();
       usuario.setLogin("testeBanco");
       usuario.setNome("TEstandoBanco");
       usuario.setSenha("12345");
       usuario.setConfirmaSenha("12345");
      
       rn.salvarUsuario(usuario);
    }
    
}
