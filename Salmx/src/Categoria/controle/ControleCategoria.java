
package Categoria.controle;

import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import Principal.view.PanelPrincipal;
import Categoria.model.Categoria;
import Categoria.model.CategoriaDAO;
import Categoria.view.GestaoCat;
import Categoria.view.JDTelaCat;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


public class  ControleCategoria implements MouseListener {
    TelaPrincipal principal;
    GestaoCat gtCat;
    CategoriaDAO rn;
    ControlePrincipal cp;
    JDTelaCat telacat;
    private DefaultTableModel modelo;
    private boolean edit;
    private String codigo;
    private boolean delete;
    private int id;
    
     public ControleCategoria (TelaPrincipal principal, ControlePrincipal cp, Connection conexao){
      this.principal= principal;
      this.cp=cp;
      carregaTela();
      modelo=(DefaultTableModel)gtCat.getjTablecatList().getModel();
      rn= new CategoriaDAO(conexao);
      escutaEventos();
      edit=false;
      delete=false;
      limpaTabela();
      listaDados();
     }
     
     public void carregaTela(){
        this.gtCat= new GestaoCat();
        this.telacat= new JDTelaCat(principal, true);
        telacat.getjLabelExcluir().setVisible(false);
    }
    
    public void escutaEventos(){
        gtCat.getCadCategoria().addMouseListener(this);
        gtCat.getEditCategoria().addMouseListener(this);
        gtCat.getRemoCategoria().addMouseListener(this);
        gtCat.getBotBuscar().addMouseListener(this);
        gtCat.getjLabelVoltar().addMouseListener(this);
        telacat.getjLabelSalvar().addMouseListener(this);
        telacat.getjLabelExcluir().addMouseListener(this);
        
    }

    public GestaoCat getTela() {
        return gtCat;
    }    
           
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel)gtCat.getjTablecatList().getModel();
    }           
           
    public void eventosNovaCategoria(){
        
            telacat.getjLabelSalvar().addMouseListener(this);
    } 

    @Override
    public void mouseClicked(MouseEvent e){
         
        if(e.getSource()==gtCat.getCadCategoria()){
            telacat.limpaTela();
            telacat.mudaEstadoButton();
            telacat.habilitaCampos();
            telacat.setVisible(true);
        }
               
        if(e.getSource()== gtCat.getEditCategoria()){
            editaDados();
            edit=true;
            telacat.mudaEstadoButton();
            telacat.habilitaCampos();
            telacat.setVisible(true);
        }
               
        if(e.getSource()==gtCat.getRemoCategoria()){
            exibeDados();
            telacat.setVisible(true);  
        }
               
        if(e.getSource()==gtCat.getBotBuscar()){
            this.pesquisa(); 
        }
              
        if(e.getSource()==gtCat.getjLabelVoltar()){
            gtCat.show();
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();
        }
        if(e.getSource()==telacat.getjLabelSalvar()){
            if(telacat.validaCampos()==true){
                salvarDados();
            }
        }
        if(e.getSource()==telacat.getjLabelExcluir()){
             excluirCategoria();             
        }
    }
    
    public void salvarDados(){
        Categoria categoria=new Categoria();
        categoria.setCodigo(telacat.getjTextCodCat().getText());
        categoria.setNome(telacat.getTxtNomeCat().getText());
        
        if(edit==false){
            rn.salvarCategoria(categoria);
        }else{
            categoria.setId(id);
            rn.editarCategoria(categoria);
        }
        listaDados();
        telacat.limpaTela();
        telacat.dispose();
        edit=false;
    }
          
    public void editaDados(){
        int item=gtCat.itemSelecionado();
        if(item >=0){
            telacat.getjTextCodCat().setText(rn.listarCategorias().get(item).getCodigo());
            telacat.getTxtNomeCat().setText(rn.listarCategorias().get(item).getNome());
            id=rn.listarCategorias().get(item).getId();
        }
    }    
    private void exibeDados(){
        int item = gtCat.itemSelecionado();
        if(item >= 0){
          telacat.getjTextCodCat().setText(rn.listarCategorias().get(item).getCodigo());  
          telacat.getTxtNomeCat().setText(rn.listarCategorias().get(item).getNome());           
          telacat.dasabilitaCampos();          
          telacat.abilitaBotConfirExc();           
          id=rn.listarCategorias().get(item).getId();          
        }         
    }    
     private void excluirCategoria(){
       rn.excluirCategoria(id);
       listaDados();
       telacat.mudaEstadoButton();
       telacat.habilitaCampos();
       telacat.limpaTela();       
       telacat.dispose();       
       delete=false;       
    }
     
      private void pesquisa(){
      boolean buscar=false;
      limpaTabela(); 
      if(gtCat.getCxBuscar().getText().equals("")==false){
         for(int i=0;i<rn.listarCategorias().size();i++){
            if(rn.listarCategorias().get(i).getNome().equalsIgnoreCase(gtCat.getCxBuscar().getText())){
                addTabela(
                        rn.listarCategorias().get(i).getCodigo(),
                        rn.listarCategorias().get(i).getNome()
                        );
                buscar=true;
            }       
         }
         if(buscar==false){
             JOptionPane.showMessageDialog(gtCat,"Categoria não encontrada!"); 
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
        for(int i=0;i<rn.listarCategorias().size();i++){
            addTabela(
                    rn.listarCategorias().get(i).getCodigo(),
                    rn.listarCategorias().get(i).getNome());
        }
    }
    
    private void limpaTabela(){
        int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
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
}
