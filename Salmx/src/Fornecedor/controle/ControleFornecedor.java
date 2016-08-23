
package Fornecedor.controle;

import Principal.controle.ControlePrincipal;
import Principal.view.TelaPrincipal;
import Fornecedor.model.Fornecedores;
import Fornecedor.model.RnFornecedor;
import Fornecedor.view.GestaoFornecedor;
import Fornecedor.view.NovoFornecedor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;




public class ControleFornecedor implements MouseListener {
   
    GestaoFornecedor gfornecedor;
    TelaPrincipal principal;    
    RnFornecedor rn;
    ControlePrincipal cp;
    NovoFornecedor nfornecedor;
    private DefaultTableModel modelo;
    private  boolean edit;

      public ControleFornecedor( TelaPrincipal principal, ControlePrincipal cp) {
          
        this.principal= principal;
        this.cp=cp;
        carregaTela();
        modelo = (DefaultTableModel)gfornecedor.getjTableFornecedor().getModel();
        rn= new RnFornecedor();
        escutaEventos();  
        edit=false;
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
    }
    
    public GestaoFornecedor getGfornecedor(){
       return gfornecedor ;
    }
    
    
    public DefaultTableModel getTableModel(){
        
        return (DefaultTableModel) gfornecedor.getjTableFornecedor().getModel();
    }
    
    
    public void eventosNovoFornecedor(){
        
        nfornecedor.getjLabelSalvarFornecedor().addMouseListener(this);
       // nfornecedor.getjLabelCancelarAddFornecedor().addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == gfornecedor.getBtAddForn()){
            nfornecedor.setVisible(true);
                       
        }
        
        if(e.getSource() == gfornecedor.getBtEditForn()){
            
            editaDados();
            edit=true;
            nfornecedor.setVisible(true);
            
        }
        
        if(e.getSource() == gfornecedor.getBtExcForn()){
            
        }
        
        if(e.getSource() == gfornecedor.getBtPesquisa()){
            
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
    }
    public void salvarDados(){
        Fornecedores forn= new Fornecedores();
        
            forn.setRazaosocial(nfornecedor.getjTextFieldRazaoSocial().getText());
            forn.setCnpj(nfornecedor.getjTextFieldCnpj().getText());
            forn.setInscricaoestadual(nfornecedor.getjTextFieldInscriçãoEstadual().getText());
            forn.setTelefoneI(nfornecedor.getjTextFieldTelefoneI().getText());
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
                rn.editarFornecedor(forn, gfornecedor.itemSelecionado());
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
          nfornecedor.getjTextFieldTelefoneI().setText(rn.listarFornecedor().get(item).getTelefoneI());
          nfornecedor.getjTextFieldTelefoneII().setText(rn.listarFornecedor().get(item).getTelefoneII());
          nfornecedor.getjTextFieldEmail().setText(rn.listarFornecedor().get(item).getEmail());
          nfornecedor.getjTextFieldRua().setText(rn.listarFornecedor().get(item).getEndereço().getRua());
          nfornecedor.getjTextFieldNumEnd().setText(rn.listarFornecedor().get(item).getEndereço().getRua());
          nfornecedor.getjTextFieldBairro().setText(rn.listarFornecedor().get(item).getEndereço().getBairro());
          nfornecedor.getjTextFieldComplemento().setText(rn.listarFornecedor().get(item).getEndereço().getComplemento());
          nfornecedor.getjTextFieldCidade().setText(rn.listarFornecedor().get(item).getEndereço().getCidade());
          nfornecedor.getjTextFieldCep().setText(rn.listarFornecedor().get(item).getEndereço().getCep());
          nfornecedor.getjTextFieldUf().setText(rn.listarFornecedor().get(item).getEndereço().getUf());
          
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
                    rn.listarFornecedor().get(i).getTelefoneI(),
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


