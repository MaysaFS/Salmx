/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.controle;

import Categoria.model.CategoriaDAO;
import Materiais.model.ItemDAO;
import Materiais.model.ItemMaterial;
import Materiais.view.GestaoItem;
import Materiais.view.criar.TelaItem;
import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maysa
 */
public class ControleItem implements MouseListener, ActionListener {
     GestaoItem gItem;
    TelaPrincipal principal;    
    ItemDAO rn;
    CategoriaDAO cat;
    ControlePrincipal cp;
    TelaItem telaItem;
    private DefaultTableModel modelo;
    private DefaultComboBoxModel combo;
    private DefaultComboBoxModel letra;
    private int id;
    private  boolean edit;
    private  boolean delete;
    

      public ControleItem( TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
          
        this.principal= principal;        
        this.cp=cp;        
        carregaTela();        
        modelo = (DefaultTableModel)gItem.getjTableMaterialList().getModel();  
        combo=(DefaultComboBoxModel)telaItem.getjBoxCategoria().getModel();
        letra=(DefaultComboBoxModel)telaItem.getjBoxLetra().getModel();
        rn= new ItemDAO(conexao);
        cat=new CategoriaDAO(conexao);
        escutaEventos();          
        edit=false;
        delete=false;
        limpaTabela();
        limpaComboBox();
        listaDados();
        listaCategorias();
    }
      
      public void carregaTela(){        
          this.gItem = new  GestaoItem();          
          this.telaItem= new TelaItem(principal,true);
          telaItem.getExcluir().setVisible(false);
      }
      
    public void escutaEventos(){
        gItem.getNovoMaterial().addMouseListener(this);
        gItem.getEditarMaterial().addMouseListener(this);
        gItem.getRetirarMaterial().addMouseListener(this);  
        gItem.getLabelPesquisarMaterial().addMouseListener(this);
        gItem.getjLabelVoltar().addMouseListener(this);
        telaItem.getSalvar().addMouseListener(this);
        telaItem.getExcluir().addMouseListener(this);
        telaItem.getjBoxLetra().addActionListener(this);
       
    }
    
    public GestaoItem getTela(){       
        return gItem;
    }
    
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel) gItem.getjTableMaterialList().getModel();
    }
    
    public DefaultComboBoxModel getComboBoxModel(){
        
        return (DefaultComboBoxModel) telaItem.getjBoxCategoria().getModel();
    }
   
    @Override
    public void mouseClicked(MouseEvent e) {
        
       
        
        if(e.getSource() == gItem.getNovoMaterial()){
            telaItem.limpaTela();
            telaItem.mudaEstadoBotton();
            telaItem.habilitaCampos();
            limpaComboBox();
            listaCategorias();
            telaItem.setVisible(true); 
            
                              
        }        
        if(e.getSource() == gItem.getEditarMaterial()){
            limpaComboBox();
            listaCategorias();
            telaItem.habilitaCampos();
            editaDados();            
            edit=true;
            telaItem.mudaEstadoBotton();
            telaItem.setVisible(true);
        }        
        if(e.getSource() == gItem.getRetirarMaterial()){
            limpaComboBox();
            listaCategorias();
            exibeDados();            
            telaItem.setVisible(true);   
            
        }
        if(e.getSource() == gItem.getLabelPesquisarMaterial()){
            this.pesquisa();
        }
        if(e.getSource() == gItem.getjLabelVoltar()){
            gItem.show();
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();            
        }
        if(e.getSource()==telaItem.getSalvar()){
            //System.out.println("funciona o botão salvar");
           if(telaItem.validaCampos()==true){
                 salvarDados();
           }                      
        }
        if(e.getSource()==telaItem.getExcluir()){
             excluirItem();             
        }
        
    }
    
    public void salvarDados(){
        int item = telaItem.itemSelecionado();
        if(item >= 0){
            ItemMaterial itemMat= new ItemMaterial();
            itemMat.setDescricao(telaItem.getjTextDescr().getText());
            itemMat.setCodigo(telaItem.getjTextCod().getText());
            itemMat.getCategoria().setId(cat.listarCategorias().get(item).getId());
            if(edit==false){
              rn.salvarItem(itemMat);                
            }else{
                itemMat.setId(id);
                rn.editarItem(itemMat);
            }            
            listaDados();
            telaItem.limpaTela();
            telaItem.dispose();
            edit=false; 
        } 
    }
    public void editaDados(){
        int item = gItem.itemSelecionado();
        if(item >= 0){
           int i;
            try {
                i = cat.buscarCategoriaIndex(rn.listarItem().get(item).getCategoria().getId());
                telaItem.getjBoxCategoria().setSelectedIndex(i);
               
            } catch (SQLException ex) {
                System.out.println("erro aki no edita");
                Logger.getLogger(ControleItem.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          telaItem.getjTextDescr().setText(rn.listarItem().get(item).getDescricao());
          telaItem.getjTextCod().setText(rn.listarItem().get(item).getCodigo());          
          id=rn.listarItem().get(item).getId();
          
        } 
    }
    
    private void exibeDados(){
        int item = gItem.itemSelecionado();
        int i;
        if(item >= 0){
          telaItem.getjTextDescr().setText(rn.listarItem().get(item).getDescricao());         
          telaItem.getjTextCod().setText(rn.listarItem().get(item).getCodigo());
          
            try {
                i=cat.buscarCategoriaIndex(rn.listarItem().get(item).getCategoria().getId());
                telaItem.getjBoxCategoria().setSelectedIndex(i); 
            } catch (SQLException ex) {
                System.out.println("erro aki no exibe");
                Logger.getLogger(ControleItem.class.getName()).log(Level.SEVERE, null, ex);
            }     
           telaItem.desabilitaCampos();
           telaItem.abilitaBotConfExc();
          id=rn.listarItem().get(item).getId();
        } 
    }
    
    private void excluirItem(){
       rn.excluirItem(id);
       listaDados();
       telaItem.mudaEstadoBotton();
       telaItem.habilitaCampos();
       telaItem.limpaTela();       
       telaItem.dispose();       
       delete=false;       
    }
  private void pesquisa(){
      boolean buscar=false;
      limpaTabela(); 
      if(gItem.getjTextBuscaMaterial().getText().equals("")==false){
         for(int i=0;i<rn.listarItem().size();i++){
            if(rn.listarItem().get(i).getDescricao().equalsIgnoreCase(gItem.getjTextBuscaMaterial().getText())){
                addTabela(
                        rn.listarItem().get(i).getCodigo(),
                        rn.listarItem().get(i).getDescricao(),
                        rn.listarItem().get(i).getCategoria().getNome()
                        );
                buscar=true;
            }       
         }
         if(buscar==false){
             JOptionPane.showMessageDialog(gItem,"item não encontrado!"); 
             listaDados();
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
        for(int i=0;i<rn.listarItem().size();i++){
            addTabela(
                    rn.listarItem().get(i).getCodigo(),
                    rn.listarItem().get(i).getDescricao(),
                    rn.listarItem().get(i).getCategoria().getNome()
                    );
        }
    }
   private void listaCategorias() {

        limpaComboBox();        
        for(int i=0;i<cat.listarCategorias().size();i++){
            combo.addElement(cat.listarCategorias().get(i).getNome());
        }
        
    }
    
private void limpaTabela(){
       int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
 } 

private void limpaComboBox(){
        combo.removeAllElements();
} 



    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==telaItem.getjBoxLetra()){  
            System.out.println("selecionou a letra:  "+ telaItem.getjBoxLetra().getSelectedItem().toString());
                try {
                    int item = telaItem.itemSelecionado();
                    if(item >= 0){
                        int id_cat=cat.listarCategorias().get(item).getId();
                        telaItem.getjUltimoCodigo().setText(rn.buscarUltimoCod(
                                telaItem.getjBoxLetra().getSelectedItem().toString(),
                                id_cat));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControleItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    
    
}

