/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class RnCategoria {
    private List<Categoria> categorias;
    
    public RnCategoria(){
      categorias= new ArrayList();
    }
    
    public void salvarcat(Categoria c){
      categorias.add(c);
      System.out.println("SALVO"+c.getNome());
    }
    
    public void editarCat(Categoria c,int i){
     categorias.get(i).setNome(c.getNome());
    System.out.println("SALVO"+c.getNome());
    }
    public List<Categoria> listarCat(){
     System.out.println(categorias.size());
     for(int i=0;i<categorias.size();i++){
     }
     return categorias;
    }
    public void excluirCat(Categoria c){
        categorias.remove(c);
    }
}   

