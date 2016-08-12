
package Fornecedor.model;

import Fornecedor.model.Fornecedores;
import java.util.ArrayList;
import java.util.List;


public class RnFornecedor {
     private List<Fornecedores> fornecedor;    
    
      public RnFornecedor() {
        fornecedor= new ArrayList();
    }    
      
    public  void salvarFornecedor(Fornecedores f){
               fornecedor.add(f);
         System.out.println("SALVO NOVO FORNECEDOR"+f.getRazaosocial());               
    }
    public void editarFornecedor(Fornecedores f,int i ){
        fornecedor.get(i).setRazaosocial(f.getRazaosocial());
        fornecedor.get(i).setInscricaoestadual(f.getInscricaoestadual());
        fornecedor.get(i).setCnpj(f.getCnpj());
        fornecedor.get(i).setTelefone1(f.getTelefone1());
        fornecedor.get(i).setTelefone2(f.getTelefone2());
        fornecedor.get(i).setEmail(f.getEmail());
        fornecedor.get(i).setRua(f.getRua());
        fornecedor.get(i).setNumero(f.getNumero());
        fornecedor.get(i).setBairro(f.getBairro());
        fornecedor.get(i).setCidade(f.getCidade());
        fornecedor.get(i).setUf(f.getUf());
        System.out.println("SALVO ALTERAÇÃO"+f.getRazaosocial());
    }
    public List<Fornecedores> listarFornecedor(){ 
        for (int i = 0; i < fornecedor.size(); i++) {
                       
        }
        
        return fornecedor;
    }
    public void excluiFornecedor(Fornecedores f){
        fornecedor.remove(f); 
    }   
}
