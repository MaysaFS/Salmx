/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            JOptionPane.showMessageDialog(null,"Nao foi possivel inserir!"+ e);
           throw new RuntimeException(e); 
        }
         
    }
    public void editarSetor(Setor s){
        str= "update setor set nome = ?,ramal = ?, observacao = ? where codigo = ? ";
        /*try{
            
            if(){
                
            }else{
                
            }
        }catch(SQLException e){
            
        }*/
    }
    public List<Setor> listarSetor(){
        return setores;
    }
    public void excluirSetor(Setor s){
        
    }
}
