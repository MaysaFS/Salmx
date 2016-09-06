/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.model;
 import Categoria.model.Categoria;
/**
 *
 * @author Maysa
 */
public class ItemMaterial {
    
    private String codigo;
    private String descricao;
    private Categoria categoria= new Categoria();    
    private int estoq_min;
    private String localizacao;
     
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
     
    public ItemMaterial() {
        
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    public int getEstoq_min() {
        return estoq_min;
    }

    public void setEstoq_min(int estoq_min) {
        this.estoq_min = estoq_min;
    }
    
    
            
    
}
