/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maysa
 */
public class MateriaisDAO {
     private Connection conexao;
    private List<Entrada> itens;
   
    
    public MateriaisDAO(Connection conexao) {
       this.conexao=conexao;      
    }
    
       
   
    public List<Entrada> listarItensEstoque(){
        String str= "select i.id, i.codigo,i.descricao,sum(e.estoque),sum(e.saldo_atual),i.categoria, c.nome from entrada as e inner join categoria as c inner join item as i on e.item = i.id and  i.categoria = c.id group by item";
        itens = new ArrayList <Entrada>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               Entrada entrada= new Entrada();
               entrada.getItem().setId(rst.getInt("i.id"));
               entrada.getItem().setCodigo(rst.getString("i.codigo"));
               entrada.getItem().setDescricao(rst.getString("i.descricao"));
               entrada.setEstoque(rst.getInt("sum(e.estoque)"));
               entrada.setSaldo_atual(rst.getDouble("sum(e.saldo_atual)"));
               entrada.getItem().getCategoria().setId(rst.getInt("i.categoria"));
               entrada.getItem().getCategoria().setNome(rst.getString("c.nome"));
               
               
               itens.add(entrada);
           }           
           rst.close();
           pst.close();
        return itens;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
        
    }
   
    public List<Entrada> buscaPorCategoria(String nome){
        String str= "select i.id, i.codigo,i.descricao,sum(e.estoque),sum(e.saldo_atual),i.categoria, c.nome from entrada as e inner join categoria as c inner join item as i on e.item = i.id and i.categoria = c.id  where c.nome like ?  group by item";
        String concatenada= '%'+ nome +'%';
        itens = new ArrayList <Entrada>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,concatenada);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               Entrada entrada= new Entrada();
               entrada.getItem().setId(rst.getInt("i.id"));
               entrada.getItem().setCodigo(rst.getString("i.codigo"));
               entrada.getItem().setDescricao(rst.getString("i.descricao"));
               entrada.setEstoque(rst.getInt("sum(e.estoque)"));
               entrada.setSaldo_atual(rst.getDouble("sum(e.saldo_atual)"));
               entrada.getItem().getCategoria().setId(rst.getInt("i.categoria"));
               entrada.getItem().getCategoria().setNome(rst.getString("c.nome"));
               
               
               itens.add(entrada);
           }           
           rst.close();
           pst.close();
        return itens;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
    }
    public List<Entrada> buscaPorDescricao(String nome){
        String concatenada= '%'+ nome +'%';
        String str= "select i.id, i.codigo,i.descricao,sum(e.estoque),sum(e.saldo_atual),i.categoria, c.nome from entrada as e inner join categoria as c inner join item as i on e.item = i.id and i.categoria = c.id  where i.descricao like ? group by item";
        itens = new ArrayList <Entrada>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,concatenada);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               Entrada entrada= new Entrada();
               entrada.getItem().setId(rst.getInt("i.id"));
               entrada.getItem().setCodigo(rst.getString("i.codigo"));
               entrada.getItem().setDescricao(rst.getString("i.descricao"));
               entrada.setEstoque(rst.getInt("sum(e.estoque)"));
               entrada.setSaldo_atual(rst.getDouble("sum(e.saldo_atual)"));
               entrada.getItem().getCategoria().setId(rst.getInt("i.categoria"));
               entrada.getItem().getCategoria().setNome(rst.getString("c.nome"));               
               
               itens.add(entrada);
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
