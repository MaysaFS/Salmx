/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria.model;

/**
 *
 * @author Erick
 */
public class Categoria {
    String nome;
    int  codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Categoria(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
}
