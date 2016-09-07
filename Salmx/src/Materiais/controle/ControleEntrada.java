/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.controle;

import Categoria.model.CategoriaDAO;
import Fornecedor.model.FornecedorDAO;
import Materiais.model.Entrada;
import Materiais.model.EntradaDAO;
import Materiais.model.ItemDAO;
import Materiais.model.ItemMaterial;
import Materiais.view.EntradaItem;
import Materiais.view.TelaItem;
import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.peer.MouseInfoPeer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


    
/**
 *
 * @author Maysa
 */
public class ControleEntrada implements MouseListener{
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
     private EntradaItem tela;    
    private TelaPrincipal principal;    
    private EntradaDAO dao;    
    private boolean edit;    
    private Connection conexao;    
    private int id;
    CategoriaDAO cat;
    FornecedorDAO forn;
    ItemDAO it;
    ControlePrincipal cp;
  
    private DefaultTableModel modelo;
    private DefaultComboBoxModel comboFornecedor;
    private DefaultComboBoxModel comboItem;
    private DefaultComboBoxModel comboCategoria;
    

    public ControleEntrada(TelaPrincipal principal,Connection conexao) {
        
        tela = new EntradaItem(principal, true);
        
        this.principal = principal;
        
        this.conexao = conexao;
        
        dao = new EntradaDAO(this.conexao);
        cat= new CategoriaDAO(conexao);
        forn= new FornecedorDAO(conexao);
        it= new ItemDAO(conexao);
        
        modelo = (DefaultTableModel)tela.getjTableEntradas().getModel();
        comboCategoria= (DefaultComboBoxModel)tela.getjComboCategoria().getModel();
        comboFornecedor= (DefaultComboBoxModel)tela.getjComboFornecedor().getModel();
        comboItem= (DefaultComboBoxModel)tela.getjComboItem().getModel();
        
        adicionaEventos();
        
        edit = false;
        
        id = 0;
        
        listaDados();
        
    }

    public EntradaItem getTela() {
        return tela;
    }

    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) tela.getjTableEntradas().getModel();
    }   
    

    private void adicionaEventos() {
        tela.getJLabelSalvar().addMouseListener(this);
        tela.getJLabelEdit().addMouseListener(this);
        tela.getJLabelDel().addMouseListener(this);
        tela.getJLabelSalvar().addMouseListener(this);
    }
@Override
    public void mouseClicked(MouseEvent e) {
         if(e.getSource() == tela.getJLabelAdd1()){
            if(tela.validaCampos()== true){
                gravaDados();
            }
        }
        
        if(e.getSource() == tela.getJLabelDel()){
            removeDados();
        }
        
        if(e.getSource() == tela.getJLabelEdit()){
            edit = true;
            editaDados();
        }
        
        if(e.getSource() == tela.getJLabelSalvar()){
            tela.dispose();   
        }
    }

    private void gravaDados() {
        int itemC= tela.itemCategoriaSelecionado();
        int itemF= tela.itemFornecedorSelecionado();
        int itemI= tela.itemMaterialSelecionado();
        if(itemC > 0 && itemI > 0 && itemF > 0){
            Entrada entrada= new Entrada();
            entrada.setCodigo(tela.getJTextFieldcodigo().getText());
            entrada.setEmpenho(tela.getJTextFieldEmpenho().getText());
            entrada.setNotaFiscal(tela.getJTextFieldNotaFiscal().getText());
            entrada.setQuantidade(Integer.parseInt(tela.getJTextFieldQuantid().getText()));
            entrada.setObservacao(tela.getjObservacao().getText());
            entrada.setDt_compra(tela.getJTextFieldcodigo().getText());
            entrada.setDt_validade(tela.getJTextFieldcodigo().getText());
            entrada.setPr_unit(Double.parseDouble(tela.getJTextFieldcodigo().getText()));
            double subtotal= Double.parseDouble(tela.getJTextFieldPrec_Unit().getText())* Integer.parseInt(tela.getJTextFieldQuantid().getText());
            entrada.setSubtotal(subtotal);
            entrada.setSaldo_atual(subtotal);
            entrada.setEstoque(Integer.parseInt(tela.getJTextFieldQuantid().getText()));
            entrada.getItem().setId(it.listarItem().get(itemI-1).getId());
            entrada.getFornecedor().setCodigo(forn.listarFornecedor().get(itemF-1).getCodigo());
            
            if(edit==false){
              dao.salvarEntrada(entrada);                
            }else{
                entrada.setId(id);
                dao.editarEntrada(entrada);
            }            
            listaDados();
            tela.limpaTela();
            tela.dispose();
            edit=false; 
        } 
    }

    public void editaDados() throws SQLException{
        
                   
            
        
        int item = tela.itemSelecionado();
        if(item >=0){
           int id_cat= it.buscarItem(dao.listarEntradas().get(item).getItem().getId()).getCategoria().getId();
            int id_forn= dao.listarEntradas().get(item).getFornecedor().getCodigo();
            int id_item= dao.listarEntradas().get(item).getItem().getId();
            
            int indexC = cat.buscarCategoriaIndex(id_cat);
            int indexF = forn.buscarFornecedorIndex(id_forn);
            int indexI=it.buscarItemIndex(id_item);
            
            tela.getjComboCategoria().setSelectedIndex(indexC+1); 
            tela.getjComboFornecedor().setSelectedIndex(indexF+1);  
            tela.getjComboItem().setSelectedIndex(indexI+1);  
           
           
           
          telaItem.getjTextDescr().setText(rn.listarItem().get(item).getDescricao());
          telaItem.getjTextCod().setText(rn.listarItem().get(item).getCodigo());          
          id=rn.listarItem().get(item).getId();
          
        } 
    }
    
    private void exibeDados()throws SQLException{
        int item = gItem.itemSelecionado();
        int i,id_cat;
        if(item >= 0){
          telaItem.getjTextDescr().setText(rn.listarItem().get(item).getDescricao());         
          telaItem.getjTextCod().setText(rn.listarItem().get(item).getCodigo());
          id_cat=rn.listarItem().get(item).getCategoria().getId();
          i=cat.buscarCategoriaIndex(id_cat);    
          
          //telaItem.getjUltimoCodigo().setText(rn.buscarUltimoCod(
          //                      telaItem.getjBoxLetra().getSelectedItem().toString(),id_cat));
          
          telaItem.getjBoxCategoria().setSelectedIndex(i+1); 
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
        combo.insertElementAt("", 0);
        for(int i=1;i<cat.listarCategorias().size()+1;i++){
            combo.insertElementAt(cat.listarCategorias().get(i-1).getNome(), i);
            
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
                    if(item > 0){
                        int id_cat=cat.listarCategorias().get(item-1).getId();
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
