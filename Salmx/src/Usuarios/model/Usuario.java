/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.model;

/**
 *
 * @author jimmy
 */
public class Usuario {
    private String nome;
    private String login;
    private String tipo;
    private String senha;
    private String confirmaSenha;
    private int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
    
    
    
}
