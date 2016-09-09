/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.model;

import Setor.model.Setor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maysa
 */
public class ItemDAO {
     private Connection conexao;
    private List<ItemMaterial> itens;
   private List<ItemMaterial> itens_cat;
    
    public ItemDAO(Connection conexao) {
       this.conexao=conexao; 
       
       itens_cat= new ArrayList<ItemMaterial>();

    }
    
    public  void salvarItem(ItemMaterial i){
        String str= "insert into item(codigo,descricao,categoria)" 
                + "values(?,?,?)";        
        try{
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,i.getCodigo());
           pst.setString(2,i.getDescricao());
           pst.setInt(3,i.getCategoria().getId());
           pst.execute();
           pst.close();
        }catch(SQLException e){
           System.out.println("Nao foi possivel inserir!"+ e);
           throw new RuntimeException(e); 
        }
         
    }
    public ItemMaterial buscarItem(int cod) throws SQLException{
        ItemMaterial item = new ItemMaterial();
        String sql= "select * from item where id= ?";
        PreparedStatement pst= conexao.prepareStatement(sql);
        pst.setInt(1,cod);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            item.setId(rst.getInt("id"));
            item.setCodigo(rst.getString("codigo"));
            item.setDescricao(rst.getString("descricao"));
            item.getCategoria().setId(rst.getInt("categoria"));
            
        }
        rst.close();
        pst.close();
        return item;
    }  
   
    public String buscarUltimoCod(String letra, int id_cat) throws SQLException{
        System.out.println("letra no DAO"+letra);
        String ultimo="";
        String concatenada= letra+'%';
        String sql= "select max(codigo) from item where codigo like ? and categoria = ? ";
        PreparedStatement pst= conexao.prepareStatement(sql);
        pst.setString(1,concatenada);
        pst.setInt(2,id_cat);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            ultimo= rst.getString("max(codigo)");
            
        }
        rst.close();
        pst.close();
        return ultimo;
    }
    
    public List<ItemMaterial> buscaPorDescricao(String nome){
        String concatenada= '%'+ nome +'%';
        String str= "select * from item  as i inner join categoria as c on i.categoria=c.id where i.descricao like ?";
        itens = new ArrayList <ItemMaterial>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,concatenada);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               ItemMaterial item= new ItemMaterial();
               item.setId(rst.getInt("i.id"));
               item.setCodigo(rst.getString("i.codigo"));
               item.setDescricao(rst.getString("i.descricao"));
               item.getCategoria().setId(rst.getInt("i.categoria"));
               item.getCategoria().setCodigo(rst.getString("c.codigo"));
               item.getCategoria().setNome(rst.getString("c.nome")); 
               itens.add(item);
           }           
           rst.close();
           pst.close();
        return itens;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
    }
    
    public void editarItem(ItemMaterial item){
       String str= "update item set codigo = ?, descricao = ?, categoria = ? where id = ? ";
       try{
            ItemMaterial it = buscarItem(item.getId());
            
            if(it.getCodigo()!=null){
                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1, item.getCodigo());
                pst.setString(2, item.getDescricao());
                pst.setInt(3, item.getCategoria().getId());
                pst.setInt(4, item.getId());
                
                pst.execute();
                pst.close();
                
            }else{
                System.out.println("lamento! não foi possivel realizar a alteração");
            }
        }catch(SQLException e){
            System.out.println("lamento! não foi ossivel realizar a alteração" + e);
            throw new RuntimeException(e);  
            
        }
    }
    public List<ItemMaterial> listarItem(){
        String str= "select * from item  as i inner join categoria as c on i.categoria = c.id order by descricao";
        itens = new ArrayList <ItemMaterial>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               ItemMaterial item= new ItemMaterial();
               item.setId(rst.getInt("i.id"));
               item.setCodigo(rst.getString("i.codigo"));
               item.setDescricao(rst.getString("i.descricao"));
               item.getCategoria().setId(rst.getInt("i.categoria"));
               item.getCategoria().setCodigo(rst.getString("c.codigo"));
               item.getCategoria().setNome(rst.getString("c.nome"));
               itens.add(item);
           }           
           rst.close();
           pst.close();
        return itens;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
        
    }
    public boolean excluirItem(int cod){
        boolean result= false;
         String sql= "delete from item where id = ?";        
        try {
            ItemMaterial item= buscarItem(cod);
            if(item.getCodigo()!=null){
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
    public List<ItemMaterial> buscaPorCategoria(String nome){
        String concatena='%'+nome+'%';
        
        String str= "select * from item  as i inner join categoria as c on i.categoria = c.id where c.nome like ?";
        itens_cat.clear();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
            pst.setString(1,concatena);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               ItemMaterial item= new ItemMaterial();
               item.setId(rst.getInt("i.id"));
               item.setCodigo(rst.getString("i.codigo"));
               item.setDescricao(rst.getString("i.descricao"));
               item.getCategoria().setId(rst.getInt("i.categoria"));
               item.getCategoria().setCodigo(rst.getString("c.codigo"));
               item.getCategoria().setNome(rst.getString("c.nome"));
               itens_cat.add(item);
           }           
           rst.close();
           pst.close();
        return itens_cat;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
    }
    
    
    public List<ItemMaterial> buscaPorCategoria(int id_cat){
        
        String str= "select * from item  as i inner join categoria as c on i.categoria = c.id where c.id= ?";
        itens = new ArrayList <ItemMaterial>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
            pst.setInt(1,id_cat);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               ItemMaterial item= new ItemMaterial();
               item.setId(rst.getInt("i.id"));
               item.setCodigo(rst.getString("i.codigo"));
               item.setDescricao(rst.getString("i.descricao"));
               item.getCategoria().setId(rst.getInt("i.categoria"));
               item.getCategoria().setCodigo(rst.getString("c.codigo"));
               item.getCategoria().setNome(rst.getString("c.nome"));
               itens.add(item);
           }           
           rst.close();
           pst.close();
        return itens;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
    }
    
  
  }

