/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maysa
 */
public class EntradaDAO {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
     private Connection conexao;
    private List<Entrada> entradas;
   
    
    public EntradaDAO(Connection conexao) {
       this.conexao=conexao;      
    }
    
    public  int salvarEntrada(Entrada ent){
        int id=0;
            String str= "insert into entrada(id,codigo,nota_fiscal,num_empenho,preco_unit,quantidade,"
                    + "valor_total,estoque,saldo_atual,dt_compra,dt_validade,item,fornecedor,observacao)" 
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";        
        try{
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setInt(1,ent.getId());
           pst.setString(2,ent.getCodigo());
           pst.setString(3,ent.getNotaFiscal());
           pst.setString(4,ent.getEmpenho());
           pst.setDouble(5,ent.getPr_unit());
           pst.setInt(6,ent.getQuantidade());
           pst.setDouble(7,ent.getSubtotal());
           pst.setInt(8,ent.getEstoque());
           pst.setDouble(9,ent.getSaldo_atual());
           SimpleDateFormat iso = new SimpleDateFormat("yyyy-mm-DD");
           System.out.println(iso.format(ent.getDt_compra()));
           pst.setString(10,iso.format(ent.getDt_compra()));
           pst.setString(11,iso.format(ent.getDt_validade()));
           pst.setInt(12,ent.getItem().getId());
           pst.setInt(13,ent.getFornecedor().getCodigo());
           pst.setString(14,ent.getObservacao());
           pst.execute();
           ResultSet rsID = pst.getGeneratedKeys();
             
             if (rsID.next()) {
                   id = rsID.getInt(1);            
                    System.out.println("Id gerado pelo insert foi " + id);	                  
              }
           
           pst.close();
           return id;
        }catch(SQLException e){
           System.out.println("Nao foi possivel inserir!"+ e);
           throw new RuntimeException(e); 
        }
         
    }
    
     public  void editarEntrada(Entrada ent){
            String str= "update entrada set codigo = ?,nota_fiscal=?,num_empenho=?,preco_unit=?,quantidade=?,"
                    + "valor_total=?,estoque=?,saldo_atual=?,dt_compra=?,dt_validade=?,item=?,fornecedor=?,observacao=? where id = ? " ;
                           
        try{
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,ent.getCodigo());
           pst.setString(2,ent.getNotaFiscal());
           pst.setString(3,ent.getEmpenho());
           pst.setDouble(4,ent.getPr_unit());
           pst.setInt(5,ent.getQuantidade());
           pst.setDouble(6,ent.getSubtotal());
           pst.setInt(7,ent.getEstoque());
           pst.setDouble(8,ent.getSaldo_atual());
           SimpleDateFormat iso = new SimpleDateFormat("yyyy-mm-DD");
           pst.setString(9, iso.format(ent.getDt_compra()));
           pst.setString(10,iso.format(ent.getDt_validade()));
           pst.setInt(11,ent.getItem().getId());
           pst.setInt(12,ent.getFornecedor().getCodigo());
           pst.setString(13,ent.getObservacao());
           pst.setInt(14,ent.getId());
           pst.execute();
           pst.close();
        }catch(SQLException e){
           System.out.println("Nao foi possivel editar!"+ e);
           throw new RuntimeException(e); 
        }
         
    }
    
     public int  buscarUltimoIdEntrada(String codItem) throws SQLException{
        int ultimoid = 0;
        System.out.println("codigo item"+codItem);
        String sql= "select max(e.id) from entrada as e inner join item as i on e.item=i.id where i.codigo=?";
        PreparedStatement pst= conexao.prepareStatement(sql);
        pst.setString(1,codItem);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            ultimoid=rst.getInt("max(e.id)");
            
        }
        rst.close();
        pst.close();
        return ultimoid;
    }
    
    public Entrada buscarEntrada(int cod) throws SQLException, ParseException{
        Entrada ent=new Entrada();
            
        String sql= "select * from entrada where id= ?";
        PreparedStatement pst= conexao.prepareStatement(sql);
        pst.setInt(1,cod);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            ent.setId(rst.getInt("id"));
            ent.setCodigo(rst.getString("codigo"));
            ent.setNotaFiscal(rst.getString("nota_fiscal"));
            ent.setEmpenho(rst.getString("num_empenho"));
            ent.setPr_unit(rst.getDouble("preco_unit"));
            ent.setQuantidade(rst.getInt("quantidade"));
            ent.setSubtotal(rst.getDouble("valor_total"));
            ent.setEstoque(rst.getInt("estoque"));
            ent.setSaldo_atual(rst.getDouble("saldo_atual"));
            SimpleDateFormat iso = new SimpleDateFormat("yyyy-mm-DD");
            ent.setDt_compra(iso.parse(rst.getString("dt_compra")));
            ent.setDt_validade(iso.parse(rst.getString("dt_validade")));
            ent.getItem().setId(rst.getInt("item"));
            ent.getFornecedor().setCodigo(rst.getInt("fornecedor"));
            ent.setObservacao(rst.getString("observacao"));
            
        }
        rst.close();
        pst.close();
        return ent;
    }
    public List<Entrada> listarEntradas(){
        String str= "select * from entrada  as e inner join item as i inner join fornecedor as f on e.item = i.id and e.fornecedor=f.codigo order by e.id";
        entradas = new ArrayList <Entrada>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               Entrada ent= new Entrada();
               ent.setId(rst.getInt("e.id"));
               ent.setCodigo(rst.getString("e.codigo"));
               ent.setNotaFiscal(rst.getString("e.nota_fiscal"));
               ent.setEmpenho(rst.getString("e.num_empenho"));
               ent.setPr_unit(rst.getDouble("e.preco_unit"));
               ent.setQuantidade(rst.getInt("e.quantidade"));
               ent.setSubtotal(rst.getDouble("e.valor_total"));
               ent.setEstoque(rst.getInt("e.estoque"));
               ent.setSaldo_atual(rst.getDouble("e.saldo_atual"));
               ent.setObservacao(rst.getString("e.observacao"));
               ent.getItem().setId(rst.getInt("e.item"));
               ent.getItem().setDescricao(rst.getString("i.descricao"));
               ent.getFornecedor().setCodigo(rst.getInt("e.fornecedor"));  
               ent.getFornecedor().setRazaosocial(rst.getString("f.razaosocial"));
               ent.getFornecedor().setCnpj(rst.getString("f.cnpj"));
               
               
               entradas.add(ent);
           }           
           rst.close();
           pst.close();
        return entradas;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
        
    }
     public boolean excluirEntrada(int cod){
        boolean result= false;
         String sql= "delete from entrada where id = ?";        
        try {
            Entrada entrada= buscarEntrada(cod);
            if(entrada.getId()>0){
                PreparedStatement pst= conexao.prepareStatement(sql);
                 pst.setInt(1,cod);
                 result= pst.execute();
                pst.close();
            }else{
                System.out.println("nao foi possivel excluir");
            }
        return result;
        } catch (Exception e) {
            System.out.println("nao foi possivel excluir\n"+e);
            throw new RuntimeException(e);
        }
     }
    
    
}

