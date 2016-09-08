/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.controle;

import Materiais.model.Entrada;
import Materiais.model.EntradaDAO;
import Materiais.model.MateriaisDAO;
import Materiais.view.EntradaItem;
import Materiais.view.GestaoItem;
import Materiais.view.GestaoMateriais;
import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import Setor.model.Setor;
import Setor.model.SetorDAO;
import Setor.view.GSetor;
import Setor.view.JDTelaSetor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maysa
 */
public class ControleTelaEstoque implements MouseListener{
    GestaoMateriais gmat;
    TelaPrincipal principal;    
    MateriaisDAO dao;
    ControlePrincipal cp;
    GestaoItem gItem;
    EntradaItem telaEntrada;
    private DefaultTableModel modelo;
     private Connection conexao;
    private int codigo;
    private  boolean edit;
    private  boolean delete;


    public ControleTelaEstoque(TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
        this.conexao = conexao;  
        this.principal= principal;        
        this.cp=cp;        
        carregaTela();        
        modelo = (DefaultTableModel)gmat.getjTableEstoqueList().getModel();       
        dao= new MateriaisDAO(conexao);        
        escutaEventos();          
        edit=false;
        delete=false;
        limpaTabela();
        listaDados();
                
    }
      public void carregaTela(){        
          this.gmat = new  GestaoMateriais();   
          gItem= new GestaoItem();
          telaEntrada= new EntradaItem(principal, true);
          
      }
    public void escutaEventos(){
        gmat.getjLabelCadEntrada().addMouseListener(this);
        gmat.getJlabelSaida().addMouseListener(this);
        gmat.getJlabelItens().addMouseListener(this);  
        gmat.getjLabelVoltar().addMouseListener(this);
        gmat.getLabelPesquisarMaterial().addMouseListener(this);
    }
    public GestaoMateriais getTela(){       
        return gmat;
    }
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel) gmat.getjTableEstoqueList().getModel();
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == gmat.getjLabelCadEntrada()){
            ControleEntrada ce= new ControleEntrada(principal, this.conexao); 
             
                    //  eventosNovoSetor();          
        }        
        if(e.getSource() == gmat.getJlabelSaida()){
            
        }        
        if(e.getSource() == gmat.getJlabelItens()){
            ControleItem ci = new ControleItem(principal, cp, conexao);
            principal.setContentPane(ci.getTela());
            principal.repaint();
            principal.validate();   
            
        }
        if(e.getSource() == gmat.getLabelPesquisarMaterial()){
            this.pesquisa();
        }
        if(e.getSource() == gmat.getjLabelVoltar()){
            gmat.show();
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();            
        }    
    }
    private void pesquisa(){
      boolean buscar=false;
      limpaTabela(); 
      if(gmat.getjTextBuscaMaterial().getText().equals("")==false){
                List<Entrada> itens= new ArrayList <Entrada>();
                if(dao.buscaPorDescricao(gmat.getjTextBuscaMaterial().getText())!=null){
                        itens=dao.buscaPorDescricao(gmat.getjTextBuscaMaterial().getText());
                        for(int i=0;i<itens.size();i++){            
                                addTabela(
                                        itens.get(i).getItem().getCodigo(),
                                        itens.get(i).getItem().getDescricao(),
                                        itens.get(i).getEstoque(),
                                        itens.get(i).getSaldo_atual(),
                                        itens.get(i).getItem().getCategoria().getNome()                         
                                        );
                        buscar=true;
                    }
                }else{
                    if(dao.buscaPorCategoria(gmat.getjTextBuscaMaterial().getText())!=null){
                        itens=dao.buscaPorCategoria(gmat.getjTextBuscaMaterial().getText());
                        for(int i=0;i<itens.size();i++){            
                                addTabela(
                                        itens.get(i).getItem().getCodigo(),
                                        itens.get(i).getItem().getDescricao(),
                                        itens.get(i).getEstoque(),
                                        itens.get(i).getSaldo_atual(),
                                        itens.get(i).getItem().getCategoria().getNome()                         
                                        );
                                buscar=true;
                        }
                    }else{          
                            if(buscar==false){
                                JOptionPane.showMessageDialog(gmat,"Setor não encontrado!"); 
                                listaDados();
                            }
                        }
                }
      }else{
          listaDados();
      }
  }
  
 public final void addTabela(Object... objects) {
        modelo.addRow(objects);
    }

   private void listaDados() {
        limpaTabela();        
        for(int i=0;i<dao.listarItensEstoque().size();i++){            
            addTabela(
                      dao.listarItensEstoque().get(i).getItem().getCodigo(),
                      dao.listarItensEstoque().get(i).getItem().getDescricao(),
                      dao.listarItensEstoque().get(i).getEstoque(),
                      dao.listarItensEstoque().get(i).getSaldo_atual(),
                      dao.listarItensEstoque().get(i).getItem().getCategoria().getNome()                         
            );
                                
          }
        
    }
    
private void limpaTabela(){
       int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
 }  


    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
