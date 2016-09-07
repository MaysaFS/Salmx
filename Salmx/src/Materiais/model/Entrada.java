/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.model;

import Categoria.model.Categoria;
import Fornecedor.model.Fornecedor;
import java.util.Date;

/**
 *
 * @author Maysa
 */
public class Entrada {
    private int id;
    private String codigo;
    private String notaFiscal;
    private String empenho;
    private Date dt_compra;
    private Date dt_validade;
    private double pr_unit;
    private int quantidade;
    private double valor_total;
    private String observacao;
    private int estoque;
    private double saldo_atual;    
    private Fornecedor fornecedor= new Fornecedor();
    private ItemMaterial item= new ItemMaterial();

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(double saldo_atual) {
        this.saldo_atual = saldo_atual;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDt_compra() {
        return dt_compra;
    }

    public void setDt_compra(Date dt_compra) {
        this.dt_compra = dt_compra;
    }

    public Date getDt_validade() {
        return dt_validade;
    }

    public void setDt_validade(Date dt_validade) {
        this.dt_validade = dt_validade;
    }

    public String getEmpenho() {
        return empenho;
    }

    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemMaterial getItem() {
        return item;
    }

    public void setItem(ItemMaterial item) {
        this.item = item;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getPr_unit() {
        return pr_unit;
    }

    public void setPr_unit(double pr_unit) {
        this.pr_unit = pr_unit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
    
    
    
    
}
