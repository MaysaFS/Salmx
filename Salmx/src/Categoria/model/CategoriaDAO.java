
package Categoria.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDAO {
    private Connection conexao;
    private List<Categoria> categorias;
    private String str;
    public CategoriaDAO(Connection conexao) {
       this.conexao=conexao;      
    }
    
    public  void salvarCategoria(Categoria c){
        str= "insert into categoria(codigo,nome)" 
                + "values(?,?)";        
        try{
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,c.getCodigo());
           pst.setString(2,c.getNome());
           pst.execute();
           pst.close();
        }catch(SQLException e){
           System.out.println("Nao foi possivel inserir!"+ e);
           throw new RuntimeException(e); 
        }
         
    }
    public Categoria buscarCategoria(int id) throws SQLException{
        Categoria s = new Categoria();
        String sql= "select * from categoria where id=?";
        PreparedStatement pst= conexao.prepareStatement(sql);
        pst.setInt(1,id);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            s.setId(rst.getInt("id"));
            s.setCodigo(rst.getString("codigo"));
            s.setNome(rst.getString("nome"));
        }
        rst.close();
        pst.close();
        return s;
    }
    public int buscarCategoriaIndex(int id) throws SQLException{
        int index=-1;
        listarCategorias();
        for (int i = 0; i < categorias.size(); i++) {
            if(categorias.get(i).getId()==id){                
              index=i;  
            }
            
        }
        return index;
        
    }
    public void editarCategoria(Categoria c){
       String str= "update categoria set nome = ?, codigo=? where id = ?";
       try{
            Categoria cat = buscarCategoria(c.getId());            
            if(cat.getId()>0){
                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1,c.getNome());
                pst.setString(2,c.getCodigo());
                pst.setInt(3,c.getId());
                pst.execute();
                pst.close();                
            }else{
                System.out.println("lamento! não foi possivel realizar a alteração"+cat.getCodigo());
            }
        }catch(SQLException e){
            System.out.println("lamento! não foi ossivel realizar a alteração" + e);
            throw new RuntimeException(e);          
        }
    }
    public List<Categoria> listarCategorias(){
        String str= "select * from categoria order by nome";
        categorias = new ArrayList <Categoria>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               Categoria c= new Categoria();
               c.setId(rst.getInt("id"));
               c.setCodigo(rst.getString("codigo"));
               c.setNome(rst.getString("nome"));               
               categorias.add(c);
           }           
           rst.close();
           pst.close();
        return categorias;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }        
    }
    public boolean excluirCategoria(int cod){
        boolean result= false;
        String sql= "delete from categoria where id = ?";        
        try {
            Categoria c= buscarCategoria(cod);
            if(c.getId()>0){
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

