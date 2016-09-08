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
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class ControleEntrada implements MouseListener,ActionListener{
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
    int x =0, y=0;
  
    private DefaultTableModel modelo;
    private DefaultComboBoxModel comboFornecedor;
    private DefaultComboBoxModel comboItem;
    private DefaultComboBoxModel comboCategoria;
     List<ItemMaterial> itens= new ArrayList <ItemMaterial>();
     List<Entrada> entradas= new ArrayList <Entrada>();

    public ControleEntrada(TelaPrincipal principal,Connection conexao) {
        
        tela = new EntradaItem(principal,true);
        
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
        
        listaCategorias();
        tela.setVisible(true);
    }

    public EntradaItem getTela() {
        return tela;
    }

    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) tela.getjTableEntradas().getModel();
    }   
    

    private void adicionaEventos() {
        tela.getJLabelSalvar().addMouseListener(this);
        tela.getJLabelAdd().addMouseListener(this);
        tela.getJLabelEdit().addMouseListener(this);
        tela.getJLabelDel().addMouseListener(this);
        tela.getJLabelSalvar().addMouseListener(this);
        tela.getjComboCategoria().addActionListener(this);
        tela.getjComboItem().addActionListener(this);
    }
@Override
    public void mouseClicked(MouseEvent e) {
         if(e.getSource() == tela.getJLabelAdd()){
            try {
                gravaDados();
            } catch (SQLException ex) {
                Logger.getLogger(ControleEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                              
        }        
        if(e.getSource() == tela.getJLabelEdit()){
           
            listaCategorias();
            tela.habilitaCampos();
            edit=true;
            try {
                editaDados();
            } catch (SQLException ex) {
                Logger.getLogger(ControleItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        if(e.getSource() == tela.getJLabelDel()){
             excluirItem();
             listaCategorias();
        } 
        if(e.getSource() == tela.getJLabelSalvar()){
            tela.dispose();
        }
          
    }

    private void gravaDados() throws SQLException {
        int itemC= tela.itemCategoriaSelecionado();
        int itemF= tela.itemFornecedorSelecionado();
        int itemI= tela.itemMaterialSelecionado();
        if(itemC > 0 && itemI > 0 && itemF > 0){
            Entrada entrada= new Entrada();
            entrada.setCodigo(tela.getJTextFieldcodigo().getText());
            entrada.setEmpenho(tela.getJTextFieldEmpenho().getText());
            entrada.setNotaFiscal(tela.getJTextFieldNotaFiscal1().getText());
            entrada.setQuantidade(Integer.parseInt(tela.getJTextFieldQuantid().getText()));
            entrada.setObservacao(tela.getjObservacao().getText());
            // transforma de String para Date
            SimpleDateFormat df = new SimpleDateFormat("DD/mm/yyyy");
            try {
                 entrada.setDt_compra(df.parse(tela.getJTextFieldDt_compra().getText()));
                 entrada.setDt_validade(df.parse(tela.getJTextFieldDt_Validade().getText()));
            } catch (ParseException ex) {
                ex.printStackTrace();            
            }
            entrada.setPr_unit(Double.parseDouble(tela.getJTextFieldPrec_Unit().getText()));
            double subtotal= Double.parseDouble(tela.getJTextFieldPrec_Unit().getText())* Integer.parseInt(tela.getJTextFieldQuantid().getText());
            entrada.setSubtotal(subtotal);
            entrada.setSaldo_atual(subtotal);
            entrada.setEstoque(Integer.parseInt(tela.getJTextFieldQuantid().getText()));
            entrada.getItem().setId(itens.get(itemI-1).getId());
            entrada.getFornecedor().setCodigo(forn.listarFornecedor().get(itemF-1).getCodigo());
            
            if(edit!=true){
              dao.salvarEntrada(entrada); 
              String d=it.buscarItem(entrada.getItem().getId()).getDescricao();
              entrada.getItem().setDescricao(d);             
              entradas.add(entrada);
              
            }else{
                entrada.setId(id);
                dao.editarEntrada(entrada);
                entradas.set(tela.itemMaterialSelecionado(),entrada);
            }            
            listaDados();
            tela.limpaTela();
            edit=false; 
        } 
    }

    public void editaDados() throws SQLException{             
            
        
        int item = tela.itemSelecionado();
        if(item >=0){
           int id_cat= it.buscarItem(entradas.get(item).getItem().getId()).getCategoria().getId();
            int id_forn= entradas.get(item).getFornecedor().getCodigo();
            int id_item= entradas.get(item).getId();
            
            int indexC = cat.buscarCategoriaIndex(id_cat);
            int indexF = forn.buscarFornecedorIndex(id_forn);
            int indexI=it.buscarItemIndex(id_item);
            
            tela.getjComboCategoria().setSelectedIndex(indexC+1); 
            tela.getjComboFornecedor().setSelectedIndex(indexF+1);  
            
            
           
            tela.getJTextFieldcodigo().setText(entradas.get(item).getCodigo());
            tela.getJTextFieldEmpenho().setText(entradas.get(item).getEmpenho());
            tela.getJTextFieldNotaFiscal1().setText(entradas.get(item).getNotaFiscal());
            tela.getJTextFieldQuantid().setText(String.valueOf(entradas.get(item).getQuantidade()));
            tela.getjObservacao().setText(entradas.get(item).getObservacao());
            //transforma data de date para string
            SimpleDateFormat iso = new SimpleDateFormat("DD/mm/yyyy");  
            
            tela.getJTextFieldDt_compra().setText(iso.format(entradas.get(item).getDt_compra()));
            tela.getJTextFieldDt_Validade().setText(iso.format(entradas.get(item).getDt_validade()));
            tela.getJTextFieldPrec_Unit().setText(String.valueOf(entradas.get(item).getPr_unit()));
            
            tela.getjComboCategoria().setSelectedIndex(indexC+1);
            tela.getjComboFornecedor().setSelectedIndex(indexF+1);
            tela.getjComboItem().setSelectedIndex(indexI+1);
            
                    
          id=entradas.get(item).getId();
          
        } 
    } 
    
    private void excluirItem(){
        int item = tela.itemSelecionado();
        if(item >= 0){
              id=entradas.get(item).getId();
              dao.excluirEntrada(id);
              entradas.remove(tela.itemMaterialSelecionado());
              tela.limpaTela();       
              
        }
            
    }
   
  
 public final void addTabela(Object... objects) {
        modelo.addRow(objects);
  }

   private void listaDados() {

        limpaTabela(); 
        SimpleDateFormat iso = new SimpleDateFormat("DD/mm/yyyy");  
     
        for(int i=0;i<entradas.size();i++){
            addTabela(
                    entradas.get(i).getItem().getDescricao(),
                    entradas.get(i).getEmpenho(),
                    entradas.get(i).getNotaFiscal(),
                    iso.format(entradas.get(i).getDt_compra()),
                    entradas.get(i).getQuantidade(),
                    entradas.get(i).getPr_unit(),
                    entradas.get(i).getSubtotal()
                    );
        }
        
    }
   private void listaCategorias() {

        limpaComboBox();   
        comboCategoria.insertElementAt("", 0);
        comboFornecedor.insertElementAt("", 0);
        
        for(int i=1;i<cat.listarCategorias().size()+1;i++){
            comboCategoria.insertElementAt(cat.listarCategorias().get(i-1).getNome(), i);            
        }
        for(int i=1;i<forn.listarFornecedor().size()+1;i++){
            comboFornecedor.insertElementAt(forn.listarFornecedor().get(i-1).getRazaosocial(), i);
            
        }
        
    }
    
private void limpaTabela(){
       int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
 } 

private void limpaComboBox(){
        comboCategoria.removeAllElements();
        comboFornecedor.removeAllElements();
        comboItem.removeAllElements();
        
} 

private void carregaItens(int item){
    
                    int j=0;
                    if(item > 0){
                        comboItem.insertElementAt("", j);
                        int id_cat=cat.listarCategorias().get(item-1).getId();
                        itens=it.buscaPorCategoria(id_cat);
                         for(int i=0;i<itens.size();i++){
                             j++;
                           comboItem.insertElementAt(itens.get(i).getDescricao(), j);            
                          }                        
                    } 
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
         if(e.getSource()==tela.getjComboCategoria()){ 
             comboItem.removeAllElements();
                   carregaItens( tela.itemCategoriaSelecionado());              
            }
         if(e.getSource()==tela.getjComboItem()){ 
                   int id_item;
                   int item= tela.itemMaterialSelecionado();                   
                    if(item > 0){
                        try {
                            id_item=dao.buscarUltimoIdEntrada(itens.get(item-1).getCodigo());
                            String codEntrada= itens.get(item-1).getCodigo()+"-"+String.valueOf(id_item+1);
                            tela.getJTextFieldcodigo().setText(codEntrada);
                        } catch (SQLException ex) {
                            Logger.getLogger(ControleEntrada.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }              
            }
    }

  
}
