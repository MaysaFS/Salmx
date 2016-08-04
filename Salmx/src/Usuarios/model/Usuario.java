/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.model;

import javax.swing.JOptionPane;

/**
 *
 * @author jimmy
 */
public class Usuario {
    
   private String nome;
   private String login;
   private String senha;
   private String comfirmaSenha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setComfirmaSenha(String comfirmaSenha) {
        this.comfirmaSenha = comfirmaSenha;
    }
          
  
}
