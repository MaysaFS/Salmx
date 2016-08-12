
package Fornecedor.model;

import Fornecedor.model.Fornecedores;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
     private List<Fornecedores> fornecedor;
    
    public FornecedorDAO() {
        fornecedor= new ArrayList<Fornecedores>();
    }
    
    public  void salvarFornecedor(Fornecedores f){
         
    }
    public void editarFornecedor(Fornecedores f){
        
    }
    public List<Fornecedores> listarFornecedor(){
        return fornecedor;
    }
    public void excluiFornecedor(Fornecedores f){
        
    } 
}
