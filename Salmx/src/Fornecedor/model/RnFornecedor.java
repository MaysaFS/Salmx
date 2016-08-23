
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
        fornecedor.get(i).setTelefoneI(f.getTelefoneI());
        fornecedor.get(i).setTelefoneII(f.getTelefoneII());
        fornecedor.get(i).setEmail(f.getEmail());
        fornecedor.get(i).getEndereço().setRua(f.getEndereço().getRua());
        fornecedor.get(i).getEndereço().setNumero(f.getEndereço().getNumero());
        fornecedor.get(i).getEndereço().setBairro(f.getEndereço().getBairro());
        fornecedor.get(i).getEndereço().setComplemento(f.getEndereço().getComplemento());
        fornecedor.get(i).getEndereço().setCidade(f.getEndereço().getCidade());
        fornecedor.get(i).getEndereço().setCep(f.getEndereço().getCep());
        fornecedor.get(i).getEndereço().setUf(f.getEndereço().getUf());
        System.out.println("SALVO ALTERAÇÃO"+f.getRazaosocial());
    }
    public List<Fornecedores> listarFornecedor(){ 
        for (int i = 0; i < fornecedor.size(); i++) {
                       System.out.println("\nnome"+fornecedor.get(i).getRazaosocial()+"telefone 1"+fornecedor.get(i).getTelefoneI()+
                       "telefone2:"+fornecedor.get(i).getTelefoneII());
        }
        
        return fornecedor;
    }
    public void excluiFornecedor(Fornecedores f){
        fornecedor.remove(f); 
    }   
}
