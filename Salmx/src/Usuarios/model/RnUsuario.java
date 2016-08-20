/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.model;

import Usuarios.view.EditarUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jimmy
 */
public class RnUsuario {
    private List<Usuario> usuarios;
    
    public void RnUsuario(){
       usuarios = new ArrayList();
    }
    public void novoUsuario(Usuario u){
        if(u.getSenha().equals(u.getConfirmaSenha())){
           for(int i=0; i < usuarios.size(); i++){
                if(u.getLogin().equals(usuarios.get(i).getLogin())){
                     System.err.println("LOGUIN JA EXISTE!");
                     break;
                }else{
                    usuarios.add(u);
                    System.out.println("USUARIO ADICIONADO!");
                    }
            }
        }else{
            System.err.println("SENHAS DIFERENTES");
        }
    }
    public void removeUsuario(Usuario u){
        usuarios.remove(u);
    
    }
}
