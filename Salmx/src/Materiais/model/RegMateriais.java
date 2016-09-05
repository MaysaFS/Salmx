
package Materiais.model;

import Fornecedor.model.Fornecedor;
import java.util.Date;
        
public class RegMateriais {
    private int codigoEnt;
    private Materiais material;
    private Fornecedor fornecedor;
    private String notaFisc;
    private String numEmpenho;
    private Date dtCompra;
    private Date dtValidade;
    private double precUnit;
    private int quantidade;
    private double valor_total;
    private String observacao;

    public int getCodigoEnt() {
        return codigoEnt;
    }

    public void setCodigoEnt(int codigoEnt) {
        this.codigoEnt = codigoEnt;
    }

    public Materiais getMaterial() {
        return material;
    }

    public void setMaterial(Materiais material) {
        this.material = material;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNotaFisc() {
        return notaFisc;
    }

    public void setNotaFisc(String notaFisc) {
        this.notaFisc = notaFisc;
    }

    public String getNumEmpenho() {
        return numEmpenho;
    }

    public void setNumEmpenho(String numEmpenho) {
        this.numEmpenho = numEmpenho;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public double getPrecUnit() {
        return precUnit;
    }

    public void setPrecUnit(double precUnit) {
        this.precUnit = precUnit;
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

    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
    
}
