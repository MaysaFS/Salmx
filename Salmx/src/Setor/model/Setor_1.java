/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.model;

import java.io.Serializable;



/**
 *
 * @author Maysa
 */
public class Setor_1{
  
 
    
    private String nome;
    private String ramal;
    private String observacao;
 
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
    
    
    
}
