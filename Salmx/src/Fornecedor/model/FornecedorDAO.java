
package Fornecedor.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Fornecedor.model.Fornecedor;
import com.mysql.jdbc.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FornecedorDAO {
     private Connection conexao;
     private List<Fornecedor> fornecedor;
     private int id=0;
    
    public FornecedorDAO(Connection conexao) {
        this.conexao=conexao;
    }
    public  int  salvarEndereco(Endereco e){
         String str="insert into endereco(rua,numero,bairro,cidade,cep,uf,complemento)"
                 +"values (?,?,?,?,?,?,?)";
         try{
             PreparedStatement pst= conexao.prepareStatement(str,Statement.RETURN_GENERATED_KEYS);
             pst.setString(1,e.getRua());
             pst.setString(2,e.getNumero());
             pst.setString(3,e.getBairro());
             pst.setString(4,e.getCidade());
             pst.setString(5,e.getCep());
             pst.setString(6,e.getUf());
             pst.setString(7,e.getComplemento());
             pst.execute();
             ResultSet rsID = pst.getGeneratedKeys();
             
             if (rsID.next()) {
                   id = rsID.getInt(1);            
                    System.out.println("Id gerado pelo insert foi " + id);	                  
              }
             pst.close();
             return id;
         }
         catch(SQLException s){
             System.out.println("Não foi possivel inserir!"+ s);
             throw new RuntimeException(s);
         }
    }
    
    
    public  void salvarFornecedor(Fornecedor f){
         String str="insert into fornecedor(razaosocial,cnpj,inscr_estad,telefoneI,telefoneII,email,endereco)"
                 +"values (?,?,?,?,?,?,?)";
         //String str2= "select max(id) from endereco";
         try{
            id=salvarEndereco(f.getEndereço());
             System.out.println("\n DAO telefone i"+ f.getTelefone1());
             //ja peguei o ultimo endereco cadastrado
             PreparedStatement pst= conexao.prepareStatement(str);
             pst.setString(1,f.getRazaosocial());
             pst.setString(2,f.getCnpj());
             pst.setString(3,f.getInscricaoestadual());
             pst.setString(4,f.getTelefone1());
             pst.setString(5,f.getTelefoneII());
             pst.setString(6,f.getEmail());
             pst.setInt(7,id);
             pst.execute();
             pst.close();
         }catch(SQLException e){
             System.out.println("Não foi possivel inserir!"+ e);
             throw new RuntimeException(e);
         }
    }
    
    public Fornecedor buscarFornecedor(int codigo)throws SQLException{
        Fornecedor f= new Fornecedor();
        String sql="select * from fornecedor where codigo= ?";
        PreparedStatement pst=conexao.prepareStatement(sql);
        pst.setInt(1,codigo);
        ResultSet rst= pst.executeQuery();
        
        while(rst.next()){
            f.setCodigo(rst.getInt("codigo"));
            f.setRazaosocial(rst.getString("razaosocial"));
            f.setCnpj(rst.getString("cnpj"));
            f.setInscricaoestadual(rst.getString("inscr_estad"));
            f.setTelefone1(rst.getString("telefoneI"));
            f.setTelefoneII(rst.getString("telefoneII"));
            f.getEndereço().setId(rst.getInt("endereco"));
            f.setEndereço(buscarEndereco(f.getEndereço().getId()));
            
        }
         rst.close();
         pst.close();
         return f;
        
    } 
    public Endereco buscarEndereco(int codigo)throws SQLException{
        Endereco e= new Endereco();
        
        String sql="select * from endereco where id= ?";
        PreparedStatement pst=conexao.prepareStatement(sql);
        pst.setInt(1,codigo);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            e.setId(rst.getInt("id"));
            e.setRua(rst.getString("rua"));
            e.setNumero(rst.getString("numero"));
            e.setBairro(rst.getString("bairro"));
            e.setCidade(rst.getString("cidade"));
            e.setCep(rst.getString("cep"));
            e.setUf(rst.getString("uf"));
            e.setComplemento(rst.getString("complemento"));    
            
        }         
         System.out.println("buscar end: "+e.getId());
         rst.close();
         pst.close();
         return e;
         
        
    } 
    public int buscarFornecedorIndex(int id) throws SQLException{
        int index=-1;
        listarFornecedor();
        for (int i = 0; i < fornecedor.size(); i++) {
            if(fornecedor.get(i).getCodigo()==id){                
              index=i;  
            }
            
        }
        return index;
        
    }
    public void editarEndereco(Endereco e){
        String str="update endereco set rua=?,numero=?,bairro=?,cidade=?,cep=?,uf=?,complemento=?";
        try{
            Endereco end = buscarEndereco(e.getId());
            System.out.println("editar end: "+end.getId());
            if(end.getId()>0){
                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1,e.getRua());
                pst.setString(2,e.getNumero());
                pst.setString(3,e.getBairro());
                pst.setString(4,e.getCidade());
                pst.setString(5,e.getCep());
                pst.setString(6,e.getUf());
                pst.setString(7,e.getComplemento());               
                pst.execute();
                pst.close();
                
            }else{
                System.out.println("\n Endereco: Lamento! Não foi possivel realizar a alteração");
            }
        }catch(SQLException x){
            System.out.println("Lamento! Não foi possivel realizar a alteração"+ x);
            throw new RuntimeException(x);
        }
    }
    
    public void editarFornecedor(Fornecedor f){
        String str="update fornecedor set razaosocial= ?,cnpj=?,inscr_estad=?,telefoneI=?,telefoneII=?,email=?";
        try{
            Fornecedor fornecedor= buscarFornecedor(f.getCodigo());
            
            if(fornecedor.getCodigo()>0){
                
                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1,f.getRazaosocial());
                pst.setString(2,f.getCnpj());
                pst.setString(3,f.getInscricaoestadual());
                pst.setString(4,f.getTelefone1());
                pst.setString(5,f.getTelefoneII());
                pst.setString(6,f.getEmail());
                editarEndereco(f.getEndereço());
                pst.execute();
                
                pst.close();
                
            }else{
                System.out.println("Fornecedor: Lamento!\n Não foi possivel realizar a alteração");
            }
        }catch(SQLException e){
            System.out.println("Lamento! Não foi possivel realizar a alteração"+ e);
            throw new RuntimeException(e);
        }
    }
    public List<Fornecedor> listarFornecedor(){
        String str = "select * from fornecedor as f inner join endereco as e where f.endereco = e.id order by razaosocial";
        fornecedor=new ArrayList <Fornecedor>();
        try{
            PreparedStatement pst= conexao.prepareStatement(str);
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                Fornecedor f=new Fornecedor();
                f.setCodigo(rst.getInt("f.codigo"));
                f.setRazaosocial(rst.getString("f.razaosocial"));
                f.setCnpj(rst.getString("f.cnpj"));
                f.setInscricaoestadual(rst.getString("f.inscr_estad"));
                f.setTelefone1(rst.getString("f.telefoneI"));
                f.setTelefoneII(rst.getString("f.telefoneII"));
                f.setEmail(rst.getString("f.email"));
                f.getEndereço().setId(rst.getInt("e.id"));
                f.getEndereço().setRua(rst.getString("e.rua"));
                f.getEndereço().setNumero(rst.getString("e.numero"));
                f.getEndereço().setBairro(rst.getString("e.bairro"));
                f.getEndereço().setCidade(rst.getString("e.cidade"));
                f.getEndereço().setCep(rst.getString("e.cep"));
                f.getEndereço().setUf(rst.getString("e.uf"));
                f.getEndereço().setComplemento(rst.getString("e.complemento"));
                fornecedor.add(f);
                
            }
            rst.close();
            pst.close();
            return fornecedor;
        }catch(Exception e){
            System.out.println("erro ao buscar!\n"+e);
            throw new RuntimeException(e);
        }
    }
    public boolean excluiFornecedor(int codigo){
        boolean result= false;
        String sql="delete from fornecedor where codigo = ?";
        try{
           Fornecedor forn = buscarFornecedor(codigo);
           if(forn.getCodigo()>0){
               PreparedStatement pst= conexao.prepareStatement(sql);
               pst.setInt(1,codigo);
               result=pst.execute();
               excluiEndereco(forn.getEndereço().getId());
               pst.close();
           }else{
               System.out.println("não foi possivel excluir");
           }
        return result;
        }catch(Exception e){
            System.out.println("não foi possivel excluir\n"+e);
            throw new RuntimeException (e);
        }
    } 
    public boolean excluiEndereco(int codigo){
        boolean result= false;
        String sql="delete from endereco where id = ?";
        try{
           Endereco e = buscarEndereco(codigo);
           if(e.getId()>0){
               PreparedStatement pst= conexao.prepareStatement(sql);
               pst.setInt(1,codigo);
               result=pst.execute();
               pst.close();
           }else{
               System.out.println("não foi possivel excluir");
           }
        return result;
        }catch(Exception e){
            System.out.println("não foi possivel excluir\n"+e);
            throw new RuntimeException (e);
        }
    } 
}
