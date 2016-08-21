/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.model;

import Usuarios.controle.ControleUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jimmy
 */
public class RnUsuario {
    ControleUsuario controleUsuario = new ControleUsuario();
   
    public boolean salvarUsuario(Usuario u){

       for (int i = 0; i<controleUsuario.getDAO().listarUsuarios().size();i++){
            if(controleUsuario.getDAO().listarUsuarios().get(i).getLogin().equals(u.getLogin())){
                controleUsuario.getTelaUsuario().exibeErro("Loguin já existe");
                return false;
            }

        }
        if(u.getSenha().equals(u.getConfirmaSenha())){
            return true;
            
            }else{
                controleUsuario.getTelaUsuario().exibeErro("Senhas diferentes");
                return false;
            }

       }

    }
    
  
