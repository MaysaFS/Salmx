/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.model;

import Principal.view.TelaPrincipal;
import Setor.controle.ControleSetor;
import Setor.view.GSetor;
import Setor.view.TelaSetor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maysa
 */
public class RnSetor  {
    private List<Setor> setores;    
    
      public RnSetor() {
        setores= new ArrayList();
    }    
      
    public  void salvarSetor(Setor s){
               setores.add(s);
         System.out.println("SALVO"+s.getNome());
               
    }
    public void editarSetor(Setor s,int i ){
        setores.get(i).setNome(s.getNome());
        setores.get(i).setRamal(s.getRamal());
        setores.get(i).setObservacao(s.getObservacao());
    }
    public List<Setor> listarSetor(){
        for (int i = 0; i < setores.size(); i++) {
            System.out.println(setores.get(i).getNome());            
        }
        return setores;
    }
    public void excluirSetor(Setor s){
        setores.remove(s);
    }
    
    
    
}
