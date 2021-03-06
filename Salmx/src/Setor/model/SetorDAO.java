/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Maysa
 */
public class SetorDAO {
    private Connection conexao;
    private List<Setor> setores;
    private String str;
    public SetorDAO(Connection conexao) {
       this.conexao=conexao;      
    }
    
    public  void salvarSetor(Setor s){
        str= "insert into setor(nome,ramal,observacao)" 
                + "values(?,?,?)";        
        try{
           PreparedStatement pst= conexao.prepareStatement(str);
           pst.setString(1,s.getNome());
           pst.setString(2,s.getRamal());
           pst.setString(3,s.getObservacao());
           pst.execute();
           pst.close();
           
        }catch(SQLException e){
           System.out.println("Nao foi possivel inserir!"+ e);
           JOptionPane.showMessageDialog(null, "Nao foi possivel inserir! Por favor preencha os campos obrigatório");
           throw new RuntimeException(e); 
        }
         
    }
    public Setor buscarSetor(int cod) throws SQLException{
        Setor s = new Setor();
        String sql= "select * from setor where codigo= ?";
        PreparedStatement pst= conexao.prepareStatement(sql);
        pst.setInt(1,cod);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            s.setCodigo(rst.getInt("codigo"));
            s.setNome(rst.getString("nome"));
            s.setRamal(rst.getString("ramal"));
            s.setObservacao(rst.getString("observacao"));
        }
        rst.close();
        pst.close();
        return s;
    }
    
    public List<Setor> buscarSetor(String nome){
        String concatena1='%'+nome+'%';
        
        setores=new ArrayList<Setor>();
        
        String sql= "select * from setor where nome like ? ";
        try{   
            PreparedStatement pst= conexao.prepareStatement(sql);
            pst.setString(1,concatena1);              
            ResultSet rst= pst.executeQuery();
            
            while(rst.next()){
                Setor s= new Setor();// essa linha tava ausente
                s.setCodigo(rst.getInt("codigo"));
                s.setNome(rst.getString("nome"));
                s.setRamal(rst.getString("ramal"));
                s.setObservacao(rst.getString("observacao"));                
                setores.add(s);               
            }
            rst.close();
            pst.close();
         return setores;
        }catch(SQLException e){
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e); 
        }
    }
    public void editarSetor(Setor s){
       String str= "update setor set nome = ?,ramal = ?, observacao = ? where codigo = ? ";
       try{
            Setor setor = buscarSetor(s.getCodigo());
            
            if(setor.getCodigo()>0){
                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1, s.getNome());
                pst.setString(2, s.getRamal());
                pst.setString(3, s.getObservacao());
                pst.setInt(4, s.getCodigo());
                pst.execute();
                pst.close();
                
            }else{
                System.out.println("lamento! não foi possivel realizar a alteração");
                JOptionPane.showMessageDialog(null, "lamento! não foi Possivel realizar a alteração"+"Setor \"" + s.getNome()
                    + "\" não encontrado");
            }
        }catch(SQLException e){
            System.out.println("lamento! não foi ossivel realizar a alteração" + e);
            JOptionPane.showMessageDialog(null, "lamento! não foi Possivel realizar a alteração"+"Setor \"" + s.getNome()
                    + "\" não encontrado");
            throw new RuntimeException(e);  
            
        }
    }
    public List<Setor> listarSetor(){
        String str= "select * from setor order by nome";
        setores = new ArrayList <Setor>();
        try {
           PreparedStatement pst= conexao.prepareStatement(str);
           ResultSet rst= pst.executeQuery();
           while(rst.next()){
               Setor s= new Setor();
               s.setCodigo(rst.getInt("codigo"));
               s.setNome(rst.getString("nome"));
               s.setRamal(rst.getString("ramal"));
               s.setObservacao(rst.getString("observacao"));
               setores.add(s);
           }           
           rst.close();
           pst.close();
        return setores;
        } catch (Exception e) {
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
        
    }
    public boolean excluirSetor(int cod){
        boolean result= false;
         String sql= "delete from setor where codigo = ?";        
        try {
            Setor setor= buscarSetor(cod);
            if(setor.getCodigo()>0){
                PreparedStatement pst= conexao.prepareStatement(sql);
                 pst.setInt(1, cod);
                 result= pst.execute();
                pst.close();
                
            }else{
                JOptionPane.showMessageDialog(null, "Setor não encontrado!");
                System.out.println("nao foi possivel excluir");
            }
        return result;
        } catch (Exception e) {
            System.out.println("nao foi possivel excluir\n"+e);
            JOptionPane.showMessageDialog(null, "Impossível realizar exclusão!"
                    + " Existem vínculos com o setor selecionado!");
            throw new RuntimeException(e);
        }
       
        
        
        
    }
}
