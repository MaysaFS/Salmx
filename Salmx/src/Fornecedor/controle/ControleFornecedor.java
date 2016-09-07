
package Fornecedor.controle;

import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import Fornecedor.model.Fornecedor;
import Fornecedor.model.FornecedorDAO;
import Fornecedor.view.GestaoFornecedor;
import Fornecedor.view.NovoFornecedor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;




public class ControleFornecedor implements MouseListener {
   
    GestaoFornecedor gfornecedor;
    TelaPrincipal principal;    
    FornecedorDAO rn;
    ControlePrincipal cp;
    NovoFornecedor nfornecedor;
    private DefaultTableModel modelo;
    private  boolean edit;
    private  boolean delete;
    private int codigo;
    private int codE;
      public ControleFornecedor( TelaPrincipal principal, ControlePrincipal cp, Connection conexao) {
          
        this.principal= principal;
        this.cp=cp;
        carregaTela();
        modelo = (DefaultTableModel)gfornecedor.getjTableFornecedor().getModel();
        rn= new FornecedorDAO(conexao);
        escutaEventos();  
        edit=false;
        delete=false;
        limpaTabela();
        listaDados();
    }
      
      
      public void carregaTela(){
        
          this.gfornecedor = new  GestaoFornecedor();
          this.nfornecedor= new NovoFornecedor(principal,true);
      }
    public void escutaEventos(){
        gfornecedor.getBtAddForn().addMouseListener(this);
        gfornecedor.getBtEditForn().addMouseListener(this);
        gfornecedor.getBtExcForn().addMouseListener(this);
        gfornecedor.getBtPesquisa().addMouseListener(this);
        gfornecedor.getjLabelVoltar().addMouseListener(this);
        nfornecedor.getjLabelSalvarFornecedor().addMouseListener(this);
        nfornecedor.getjLabelExcluirFornecedor().addMouseListener(this);
    }
    
    public GestaoFornecedor getGfornecedor(){
       return gfornecedor ;
    }   
    
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel) gfornecedor.getjTableFornecedor().getModel();
    }
   
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gfornecedor.getBtAddForn()){
            nfornecedor.limpaTela();
            nfornecedor.mudaEstadoBotton();
            nfornecedor.habilitaCampos();
            nfornecedor.setVisible(true);                       
        }        
        if(e.getSource() == gfornecedor.getBtEditForn()){            
            editaDados();
            edit=true;
            nfornecedor.mudaEstadoBotton();
            nfornecedor.habilitaCampos();
            nfornecedor.setVisible(true);
        }        
        if(e.getSource() == gfornecedor.getBtExcForn()){
            exibeDados();
            nfornecedor.setVisible(true);
        }        
        if(e.getSource() == gfornecedor.getBtPesquisa()){
            this.pesquisa();
        }        
        if(e.getSource() == gfornecedor.getjLabelVoltar()){
            gfornecedor.show();
            principal.setContentPane(cp.getTela());
            principal.repaint();
            principal.validate();            
        }
        if(e.getSource()==nfornecedor.getjLabelSalvarFornecedor()){            
           if(nfornecedor.validaCampos()==true){
               salvarDados();
           }            
        }
        if(e.getSource()==nfornecedor.getjLabelExcluirFornecedor()){
             excluiFornecedor();
             nfornecedor.mudaEstadoBotton();
             nfornecedor.habilitaCampos();
        }
    }
    public void salvarDados(){
        Fornecedor forn= new Fornecedor();
       
            forn.setRazaosocial(nfornecedor.getjTextFieldRazaoSocial().getText());
            forn.setCnpj(nfornecedor.getjTextFieldCnpj().getText());
            forn.setInscricaoestadual(nfornecedor.getjTextFieldInscriçãoEstadual().getText());
            forn.setTelefone1(nfornecedor.getjTextFieldTelefone1().getText());           
            forn.setTelefoneII(nfornecedor.getjTextFieldTelefoneII().getText());
            forn.setEmail(nfornecedor.getjTextFieldEmail().getText());
            
            forn.getEndereço().setRua(nfornecedor.getjTextFieldRua().getText());
            forn.getEndereço().setNumero(nfornecedor.getjTextFieldNumEnd().getText());
            forn.getEndereço().setBairro(nfornecedor.getjTextFieldBairro().getText());
            forn.getEndereço().setComplemento(nfornecedor.getjTextFieldComplemento().getText());
            forn.getEndereço().setCidade(nfornecedor.getjTextFieldCidade().getText());
            forn.getEndereço().setCep(nfornecedor.getjTextFieldCep().getText());
            forn.getEndereço().setUf(nfornecedor.getjTextFieldUf().getText());
            
            
            
            if(edit==false){
              rn.salvarFornecedor(forn);  
              
            }else{
                forn.setCodigo(codigo);
                forn.getEndereço().setId(codE);
                rn.editarFornecedor(forn);
            }            
            listaDados();
            nfornecedor.limpaTela();
            nfornecedor.dispose();
            edit=false;
            
    }
    
    
    public void editaDados(){
        int item = gfornecedor.itemSelecionado();
        if(item >= 0){
           nfornecedor.getjTextFieldRazaoSocial().setText(rn.listarFornecedor().get(item).getRazaosocial());
          nfornecedor.getjTextFieldInscriçãoEstadual().setText(rn.listarFornecedor().get(item).getInscricaoestadual());
          nfornecedor.getjTextFieldCnpj().setText(rn.listarFornecedor().get(item).getCnpj());
          nfornecedor.getjTextFieldTelefone1().setText(rn.listarFornecedor().get(item).getTelefone1());
          nfornecedor.getjTextFieldTelefoneII().setText(rn.listarFornecedor().get(item).getTelefoneII());
          nfornecedor.getjTextFieldEmail().setText(rn.listarFornecedor().get(item).getEmail());
          nfornecedor.getjTextFieldRua().setText(rn.listarFornecedor().get(item).getEndereço().getRua());
          nfornecedor.getjTextFieldNumEnd().setText(rn.listarFornecedor().get(item).getEndereço().getNumero());
          nfornecedor.getjTextFieldBairro().setText(rn.listarFornecedor().get(item).getEndereço().getBairro());
          nfornecedor.getjTextFieldComplemento().setText(rn.listarFornecedor().get(item).getEndereço().getComplemento());
          nfornecedor.getjTextFieldCidade().setText(rn.listarFornecedor().get(item).getEndereço().getCidade());
          nfornecedor.getjTextFieldCep().setText(rn.listarFornecedor().get(item).getEndereço().getCep());
          nfornecedor.getjTextFieldUf().setText(rn.listarFornecedor().get(item).getEndereço().getUf());
          codigo=rn.listarFornecedor().get(item).getCodigo();
          codE= rn.listarFornecedor().get(item).getEndereço().getId();
          
        } 
    }
    private void exibeDados(){
        int item = gfornecedor.itemSelecionado();
        if(item >= 0){
          nfornecedor.getjTextFieldRazaoSocial().setText(rn.listarFornecedor().get(item).getRazaosocial());
          nfornecedor.getjTextFieldInscriçãoEstadual().setText(rn.listarFornecedor().get(item).getInscricaoestadual());
          nfornecedor.getjTextFieldCnpj().setText(rn.listarFornecedor().get(item).getCnpj());
          nfornecedor.getjTextFieldTelefone1().setText(rn.listarFornecedor().get(item).getTelefone1());
          nfornecedor.getjTextFieldTelefoneII().setText(rn.listarFornecedor().get(item).getTelefoneII());
          nfornecedor.getjTextFieldEmail().setText(rn.listarFornecedor().get(item).getEmail());
          nfornecedor.getjTextFieldRua().setText(rn.listarFornecedor().get(item).getEndereço().getRua());
          nfornecedor.getjTextFieldNumEnd().setText(rn.listarFornecedor().get(item).getEndereço().getNumero());
          nfornecedor.getjTextFieldBairro().setText(rn.listarFornecedor().get(item).getEndereço().getBairro());
          nfornecedor.getjTextFieldComplemento().setText(rn.listarFornecedor().get(item).getEndereço().getComplemento());
          nfornecedor.getjTextFieldCidade().setText(rn.listarFornecedor().get(item).getEndereço().getCidade());
          nfornecedor.getjTextFieldCep().setText(rn.listarFornecedor().get(item).getEndereço().getCep());
          nfornecedor.getjTextFieldUf().setText(rn.listarFornecedor().get(item).getEndereço().getUf());
           
          nfornecedor.desabilitaCampos();
          nfornecedor.abilitaBotConfirmExc();         
          codigo=rn.listarFornecedor().get(item).getCodigo();
          codE= rn.listarFornecedor().get(item).getEndereço().getId();
        } 
    }
    private void excluiFornecedor(){
          rn.excluiFornecedor(codigo);
          listaDados();
          nfornecedor.mudaEstadoBotton();
          nfornecedor.habilitaCampos();
          nfornecedor.limpaTela();       
          nfornecedor.dispose();       
          delete=false;       
    }
    private void pesquisa(){
      boolean buscar=false;
      limpaTabela(); 
      if(gfornecedor.getjTextFieldPesquisa().getText().equals("")==false){
         for(int i=0;i<rn.listarFornecedor().size();i++){
            if(rn.listarFornecedor().get(i).getRazaosocial().equalsIgnoreCase(gfornecedor.getjTextFieldPesquisa().getText())){
                addTabela(
                    rn.listarFornecedor().get(i).getCodigo(),
                    rn.listarFornecedor().get(i).getRazaosocial(),
                    rn.listarFornecedor().get(i).getCnpj(),
                    rn.listarFornecedor().get(i).getInscricaoestadual(),
                    rn.listarFornecedor().get(i).getEmail(),
                    rn.listarFornecedor().get(i).getTelefone1(),
                    rn.listarFornecedor().get(i).getTelefoneII()
                    
                    );
                buscar=true;
            }       
         }
         if(buscar==false){
             JOptionPane.showMessageDialog(gfornecedor,"Fornecedor não encontrado!"); 
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
        for(int i=0;i<rn.listarFornecedor().size();i++){
            addTabela(
                    rn.listarFornecedor().get(i).getCodigo(),
                    rn.listarFornecedor().get(i).getRazaosocial(),
                    rn.listarFornecedor().get(i).getCnpj(),
                    rn.listarFornecedor().get(i).getInscricaoestadual(),
                    rn.listarFornecedor().get(i).getEmail(),
                    rn.listarFornecedor().get(i).getTelefone1(),
                    rn.listarFornecedor().get(i).getTelefoneII()
                    
                    );
        }
    }
    
    
    
    private void limpaTabela(){
        int linhas = modelo.getRowCount();
        for(int i=0;i<linhas;i++){
            modelo.removeRow(0);
        }
    }  
    
    
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
    
    
}


