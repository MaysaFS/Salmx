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
    private Categoria categoria;
    private int qtd_estoque;
    private double subtotal;
    private double valor_total;
    private int estoq_min;

    public ItemMaterial() {
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

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getEstoq_min() {
        return estoq_min;
    }

    public void setEstoq_min(int estoq_min) {
        this.estoq_min = estoq_min;
    }
    
    
            
    
}
