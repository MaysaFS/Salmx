
package Fornecedor.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Fornecedor.model.Fornecedores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FornecedorDAO {
     private Connection conexao;
     private List<Fornecedores> fornecedor;
     private String str;
    
    public FornecedorDAO(Connection conexao) {
        this.conexao=conexao;
    }
    
    public  void salvarFornecedor(Fornecedores f){
         str="insert into fornecedor(razaoSocial,cnpj,incricaoEstad,tel1,tel2,email,rua,numero,bairro,complemento,cep,cidade,uf)"
                 +"values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
         try{
             PreparedStatement pst= conexao.prepareStatement(str);
             pst.setString(1,f.getRazaosocial());
             pst.setString(2,f.getCnpj());
             pst.setString(3,f.getInscricaoestadual());
             pst.setString(4,f.getTelefoneI());
             pst.setString(5,f.getTelefoneII());
             pst.setString(6,f.getEmail());
             pst.setString(7,f.getEndereço().getRua());
             pst.setString(8,f.getEndereço().getNumero());
             pst.setString(9,f.getEndereço().getBairro());
             pst.setString(10,f.getEndereço().getComplemento());
             pst.setString(11,f.getEndereço().getCep());
             pst.setString(12,f.getEndereço().getCidade());
             pst.setString(13,f.getEndereço().getUf());
         }catch(SQLException e){
             System.out.println("Não foi possivel inserir!"+ e);
             throw new RuntimeException(e);
         }
    }
    
    public Fornecedores buscarFornecedor(String razaoSocial)throws SQLException{
        Fornecedores f= new Fornecedores();
        String sql="select * from fornecedor where razaoSocial= ?";
        PreparedStatement pst=conexao.prepareStatement(sql);
        pst.setString(1,razaoSocial);
        ResultSet rst= pst.executeQuery();
        while(rst.next()){
            f.setCodigo(rst.getInt("codigo"));
            f.setRazaosocial(rst.getString("razaoSocial"));
            f.setCnpj(rst.getString("cnpj"));
            f.setInscricaoestadual(rst.getString("incricaoEstad"));
            f.setTelefoneI(rst.getString("tel1"));
            f.setTelefoneII(rst.getString("tel2"));
            f.setEmail(rst.getString("email"));
            f.getEndereço().setRua(rst.getString("rua"));
            f.getEndereço().setNumero(rst.getString("numero"));
            f.getEndereço().setBairro(rst.getString("bairro"));
            f.getEndereço().setComplemento(rst.getString("complemento"));
            f.getEndereço().setCep(rst.getString("cep"));
            f.getEndereço().setCidade(rst.getString("cidade"));
            f.getEndereço().setUf(rst.getString("uf"));
        }
         rst.close();
         pst.close();
         return f;
        
    } 
    
    public void editarFornecedor(Fornecedores f){
        String str="update fornecedor set razaoSocial= ?,cnpj=?,incricaoEstad=?,tel1=?,"
                + "tel2=?,email=?,rua=?,numero=?,bairro=?,complemento=?,cep=?,cidade=?,uf=?";
        try{
            Fornecedores fornecedor= buscarFornecedor(f.getRazaosocial());
            
            if(fornecedor.getCodigo()>0){
                PreparedStatement pst = conexao.prepareStatement(str);
                pst.setString(1,f.getRazaosocial());
                pst.setString(2,f.getCnpj());
                pst.setString(3,f.getInscricaoestadual());
                pst.setString(4,f.getTelefoneI());
                pst.setString(5,f.getTelefoneII());
                pst.setString(6,f.getEmail());
                pst.setString(7,f.getEndereço().getRua());
                pst.setString(8,f.getEndereço().getNumero());
                pst.setString(9,f.getEndereço().getBairro());
                pst.setString(10,f.getEndereço().getComplemento());
                pst.setString(11,f.getEndereço().getCep());
                pst.setString(12,f.getEndereço().getCidade());
                pst.setString(13,f.getEndereço().getUf());
                pst.execute();
                pst.close();
                
            }else{
                System.out.println("Lamento! Não foi possivel realizar a alteração");
            }
        }catch(SQLException e){
            System.out.println("Lamento! Não foi possivel realizar a alteração"+ e);
            throw new RuntimeException(e);
        }
    }
    public List<Fornecedores> listarFornecedor(){
        String str = "select * from fornecedor order by razaoSocial";
        fornecedor=new ArrayList <Fornecedores>();
        try{
            PreparedStatement pst= conexao.prepareStatement(str);
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                Fornecedores f=new Fornecedores();
                f.setCodigo(rst.getInt("codigo"));
                f.setRazaosocial(rst.getString("razaoSocial"));
                f.setCnpj(rst.getString("cnpj"));
                f.setInscricaoestadual(rst.getString("incricaoEstad"));
                f.setTelefoneI(rst.getString("tel1"));
                f.setTelefoneII(rst.getString("tel2"));
                f.setEmail(rst.getString("email"));
                f.getEndereço().setRua(rst.getString("rua"));
                f.getEndereço().setNumero(rst.getString("numero"));
                f.getEndereço().setBairro(rst.getString("bairro"));
                f.getEndereço().setComplemento(rst.getString("complemento"));
                f.getEndereço().setCep(rst.getString("cep"));
                f.getEndereço().setCidade(rst.getString("cidade"));
                f.getEndereço().setUf(rst.getString("uf"));
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
    public boolean excluiFornecedor(String razaoSocial){
        boolean result= false;
        String sql="delete from fornecedor where razaoSocial = ?";
        try{
           Fornecedores forn = buscarFornecedor(razaoSocial);
           if(forn.getCodigo()>0){
               PreparedStatement pst= conexao.prepareStatement(sql);
               pst.setString(1,razaoSocial);
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
