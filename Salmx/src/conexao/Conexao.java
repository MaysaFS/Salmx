/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Maysa
 */
public class Conexao {
    public static Connection doConexao(){
        try{
         return DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/salmx","root","12345");   
        }catch(SQLException s){
            throw new RuntimeException(s);
        }
}
    
}
