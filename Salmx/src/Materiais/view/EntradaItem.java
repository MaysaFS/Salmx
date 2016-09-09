/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.view;

import javax.swing.*;

/**
 *
 * @author jimmy
 */
public class EntradaItem extends javax.swing.JDialog {

    /**
     * Creates new form EntradaItem
     */
    public EntradaItem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciar();
    }
  private void iniciar() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {        
        
        });
        this.setLocationRelativeTo(null);
        //this.setBounds((screenSize.width-250)/2, (screenSize.height-250)/2, 250, 250);
    }
 public boolean validaCampos(){
        if(JTextFieldEmpenho.getText().isEmpty() || JTextFieldDt_Validade.getText().isEmpty()
                || JTextFieldPrec_Unit.getText().isEmpty()|| JTextFieldQuantid.getText().isEmpty()
                || JTextFieldcodigo.getText().isEmpty()|| JTextFieldDt_Validade.getText().isEmpty()
                || JTextFieldDt_compra.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
            return false;
        } else{
            if((jComboCategoria.getSelectedIndex()== 0) || (jComboFornecedor.getSelectedIndex()==0)
                || jComboItem.getSelectedIndex()== 0){
                 JOptionPane.showMessageDialog(this, "Preencha todos os campos ");
             return false;
            }else{
            return true;
            }
        }
    }
  public void limpaTela(){
        JTextFieldEmpenho.setText("");
        JTextFieldNotaFiscal1.setText("");
        JTextFieldDt_Validade.setText("");
        JTextFieldPrec_Unit.setText("");
        JTextFieldQuantid.setText("");
        JTextFieldcodigo.setText("");
        jTextArea1.setText("");
        JTextFieldDt_Validade.setText("");
        JTextFieldDt_compra.setText("");
        
        getjComboCategoria().setSelectedIndex(0);
        getjComboFornecedor().setSelectedIndex(0);
        
        
    }
  public void habilitaCampos(){
        JTextFieldEmpenho.enable();
        JTextFieldDt_Validade.enable();
        JTextFieldPrec_Unit.enable();
        JTextFieldQuantid.enable();
        JTextFieldcodigo.enable();
        jTextArea1.enable();
        JTextFieldDt_Validade.enable();
        JTextFieldDt_compra.enable();
       
        getjComboCategoria().enable();
        getjComboFornecedor().enable();
        getjComboItem().enable();
      
  }
  public void desabilitaCampos(){
      JTextFieldEmpenho.enable(false);
        JTextFieldDt_Validade.enable(false);
        JTextFieldPrec_Unit.enable(false);
        JTextFieldQuantid.enable(false);
        JTextFieldcodigo.enable(false);
        jTextArea1.enable(false);
        JTextFieldDt_Validade.enable(false);
        JTextFieldDt_compra.enable(false);
        getjComboCategoria().enable(false);
        getjComboFornecedor().enable(false);
        getjComboItem().enable(false);
  }
  public int itemCategoriaSelecionado(){
        if(jComboCategoria.getSelectedIndex()<1){
         //   JOptionPane.showMessageDialog(this, "Selecione um item de categoria");
        } 
        return jComboCategoria.getSelectedIndex();
    }
  public int itemSelecionado(){
        if(jTableEntradas.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Selecione um item na tabela");
        } 
        return jTableEntradas.getSelectedRow();
    }
  public int itemFornecedorSelecionado(){
        if( jComboFornecedor.getSelectedIndex()<1 ){
            JOptionPane.showMessageDialog(this, "Selecione um item de fornecedor");
        } 
        return jComboFornecedor.getSelectedIndex();
    }
  public int itemMaterialSelecionado(){
        if( jComboItem.getSelectedIndex()<1){
          //  JOptionPane.showMessageDialog(this, "Selecione um item de material");
        } 
        return jComboItem.getSelectedIndex();
    }
    public JLabel getJLabelSalvar() {
        return JLabelSalvar;
    }

    public void setJLabelSalvar(JLabel JLabelSalvar) {
        this.JLabelSalvar = JLabelSalvar;
    }

    public JTextField getJTextFieldEmpenho() {
        return JTextFieldEmpenho;
    }

    public void setJTextFieldEmpenho(JTextField JTextFieldEmpenho) {
        this.JTextFieldEmpenho = JTextFieldEmpenho;
    }

    

    public JTextField getJTextFieldPrec_Unit() {
        return JTextFieldPrec_Unit;
    }

    public void setJTextFieldPrec_Unit(JTextField JTextFieldPrec_Unit) {
        this.JTextFieldPrec_Unit = JTextFieldPrec_Unit;
    }

    public JTextField getJTextFieldQuantid() {
        return JTextFieldQuantid;
    }

    public void setJTextFieldQuantid(JTextField JTextFieldQuantid) {
        this.JTextFieldQuantid = JTextFieldQuantid;
    }

    public JTextField getJTextFieldcodigo() {
        return JTextFieldcodigo;
    }

    public void setJTextFieldcodigo(JTextField JTextFieldcodigo) {
        this.JTextFieldcodigo = JTextFieldcodigo;
    }

    public JComboBox getjComboCategoria() {
        return jComboCategoria;
    }

    public void setjComboCategoria(JComboBox jComboCategoria) {
        this.jComboCategoria = jComboCategoria;
    }

    public JComboBox getjComboFornecedor() {
        return jComboFornecedor;
    }

    public void setjComboFornecedor(JComboBox jComboFornecedor) {
        this.jComboFornecedor = jComboFornecedor;
    }

    public JComboBox getjComboItem() {
        return jComboItem;
    }

    public void setjComboItem(JComboBox jComboItem) {
        this.jComboItem = jComboItem;
    }

    public JTextArea getjObservacao() {
        return jTextArea1;
    }

    public void setjObservacao(JTextArea jObservacao) {
        this.jTextArea1 = jObservacao;
    }

    public JTextField getJTextFieldDt_Validade() {
        return JTextFieldDt_Validade;
    }

    public void setJTextFieldDt_Validade(JTextField JTextFieldDt_Validade) {
        this.JTextFieldDt_Validade = JTextFieldDt_Validade;
    }

    public JTextField getJTextFieldDt_compra() {
        return JTextFieldDt_compra;
    }

    public void setJTextFieldDt_compra(JTextField JTextFieldDt_compra) {
        this.JTextFieldDt_compra = JTextFieldDt_compra;
    }

    

    

   

    public JLabel getJLabelAdd() {
        return JLabelAdd;
    }

    public void setJLabelAdd(JLabel JLabelAdd) {
        this.JLabelAdd = JLabelAdd;
    }

    public JLabel getJLabelDel() {
        return JLabelDel;
    }

    public void setJLabelDel(JLabel JLabelDel) {
        this.JLabelDel = JLabelDel;
    }

    public JLabel getJLabelEdit() {
        return JLabelEdit;
    }

    public void setJLabelEdit(JLabel JLabelEdit) {
        this.JLabelEdit = JLabelEdit;
    }

    public JTable getjTableEntradas() {
        return jTableEntradas;
    }

    public void setjTableEntradas(JTable jTableEntradas) {
        this.jTableEntradas = jTableEntradas;
    }

    public JTextField getJTextFieldNotaFiscal1() {
        return JTextFieldNotaFiscal1;
    }

    public void setJTextFieldNotaFiscal1(JTextField JTextFieldNotaFiscal1) {
        this.JTextFieldNotaFiscal1 = JTextFieldNotaFiscal1;
    }
    
 public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
     
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EntradaItem dialog = new EntradaItem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelSalmxLogo = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jComboCategoria = new javax.swing.JComboBox();
        jComboItem = new javax.swing.JComboBox();
        jComboFornecedor = new javax.swing.JComboBox();
        JTextFieldDt_Validade = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

            JTextFieldDt_Validade = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        JLabelEmpenho = new javax.swing.JLabel();
        JLabelFornecedor = new javax.swing.JLabel();
        JLabelCategoria = new javax.swing.JLabel();
        JLabelItem = new javax.swing.JLabel();
        JLabelSalvar = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        JTextFieldPrec_Unit = new javax.swing.JTextField();
        JLabel2 = new javax.swing.JLabel();
        JTextFieldcodigo = new javax.swing.JTextField();
        JLabel5 = new javax.swing.JLabel();
        JLabelNF = new javax.swing.JLabel();
        JTextFieldEmpenho = new javax.swing.JTextField();
        JLabel6 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        JTextFieldQuantid = new javax.swing.JTextField();
        JLabel7 = new javax.swing.JLabel();
        jObservacao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEntradas = new javax.swing.JTable();
        JLabelEdit = new javax.swing.JLabel();
        JLabelAdd = new javax.swing.JLabel();
        JLabelDel = new javax.swing.JLabel();
        JTextFieldNotaFiscal1 = new javax.swing.JTextField();
        JTextFieldDt_compra = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

            JTextFieldDt_compra = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBack.setBackground(new java.awt.Color(247, 247, 247));

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabelSalmxLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSalmxLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogoPequeno.png"))); // NOI18N
        jLabelSalmxLogo.setText(" ");
        jLabelSalmxLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(242, 242, 242));

        jComboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCategoria.setOpaque(false);
        jComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoriaActionPerformed(evt);
            }
        });

        jComboItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboItem.setOpaque(false);
        jComboItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboItemActionPerformed(evt);
            }
        });

        jComboFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboFornecedor.setOpaque(false);
        jComboFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFornecedorActionPerformed(evt);
            }
        });

        JTextFieldDt_Validade.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldDt_Validade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldDt_Validade.setToolTipText("");
        JTextFieldDt_Validade.setAutoscrolls(false);
        JTextFieldDt_Validade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldDt_Validade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldDt_Validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldDt_ValidadeActionPerformed(evt);
            }
        });

        JLabelEmpenho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelEmpenho.setForeground(new java.awt.Color(255, 102, 102));
        JLabelEmpenho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelEmpenho.setText("Nº do Empenho *");

        JLabelFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelFornecedor.setForeground(new java.awt.Color(255, 102, 102));
        JLabelFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelFornecedor.setText("Fornecedor*");

        JLabelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelCategoria.setForeground(new java.awt.Color(255, 102, 102));
        JLabelCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelCategoria.setText("Categoria*");

        JLabelItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelItem.setForeground(new java.awt.Color(255, 102, 102));
        JLabelItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelItem.setText("Item*");

        JLabelSalvar.setBackground(new java.awt.Color(255, 102, 102));
        JLabelSalvar.setForeground(new java.awt.Color(255, 255, 255));
        JLabelSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelSalvar.setText("FECHAR");
        JLabelSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLabelSalvar.setOpaque(true);

        JLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(255, 102, 102));
        JLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel1.setText("Preço Unt.*");

        JTextFieldPrec_Unit.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldPrec_Unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldPrec_Unit.setToolTipText("");
        JTextFieldPrec_Unit.setAutoscrolls(false);
        JTextFieldPrec_Unit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldPrec_Unit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldPrec_Unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldPrec_UnitActionPerformed(evt);
            }
        });

        JLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(255, 102, 102));
        JLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel2.setText("Quantidade");

        JTextFieldcodigo.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldcodigo.setToolTipText("");
        JTextFieldcodigo.setAutoscrolls(false);
        JTextFieldcodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldcodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldcodigo.setEnabled(false);
        JTextFieldcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldcodigoActionPerformed(evt);
            }
        });

        JLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(255, 102, 102));
        JLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel5.setText("Data de compra *");

        JLabelNF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelNF.setForeground(new java.awt.Color(255, 102, 102));
        JLabelNF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelNF.setText("Nº da Nota Fiscal*");

        JTextFieldEmpenho.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldEmpenho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldEmpenho.setToolTipText("");
        JTextFieldEmpenho.setAutoscrolls(false);
        JTextFieldEmpenho.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldEmpenho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldEmpenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldEmpenhoActionPerformed(evt);
            }
        });

        JLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel6.setForeground(new java.awt.Color(255, 102, 102));
        JLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel6.setText("Data de validade *");

        JLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(255, 102, 102));
        JLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel4.setText("codigo-entrada");

        JTextFieldQuantid.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldQuantid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldQuantid.setToolTipText("");
        JTextFieldQuantid.setAutoscrolls(false);
        JTextFieldQuantid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldQuantid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldQuantid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextFieldQuantidMouseClicked(evt);
            }
        });
        JTextFieldQuantid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldQuantidActionPerformed(evt);
            }
        });

        JLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel7.setForeground(new java.awt.Color(255, 102, 102));
        JLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel7.setText("Observacao");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jObservacao.setViewportView(jTextArea1);

        jTableEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "descricao", "Nota Fiscal", "empenho", "data de compra", "quantidade", "preco_unitario", "subtotal"
            }
        ));
        jScrollPane1.setViewportView(jTableEntradas);

        JLabelEdit.setBackground(new java.awt.Color(255, 102, 102));
        JLabelEdit.setForeground(new java.awt.Color(255, 255, 255));
        JLabelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEdit.setText("Editar");
        JLabelEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLabelEdit.setOpaque(true);

        JLabelAdd.setBackground(new java.awt.Color(255, 102, 102));
        JLabelAdd.setForeground(new java.awt.Color(255, 255, 255));
        JLabelAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelAdd.setText("Adicionar");
        JLabelAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLabelAdd.setOpaque(true);

        JLabelDel.setBackground(new java.awt.Color(255, 102, 102));
        JLabelDel.setForeground(new java.awt.Color(255, 255, 255));
        JLabelDel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelDel.setText("Remover");
        JLabelDel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLabelDel.setOpaque(true);

        JTextFieldNotaFiscal1.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldNotaFiscal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldNotaFiscal1.setToolTipText("");
        JTextFieldNotaFiscal1.setAutoscrolls(false);
        JTextFieldNotaFiscal1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldNotaFiscal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldNotaFiscal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNotaFiscal1ActionPerformed(evt);
            }
        });

        JTextFieldDt_compra.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldDt_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldDt_compra.setToolTipText("");
        JTextFieldDt_compra.setAutoscrolls(false);
        JTextFieldDt_compra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldDt_compra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JLabelEmpenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                                    .addComponent(JTextFieldPrec_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(JTextFieldQuantid))
                                                .addComponent(JLabelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                                    .addComponent(JLabel1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(JLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                                .addComponent(JTextFieldEmpenho, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(JTextFieldNotaFiscal1))
                                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                            .addGap(20, 20, 20)
                                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jComboItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(JLabelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(JLabelNF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(JTextFieldDt_Validade, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(JLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(JLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                                    .addComponent(JLabelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(71, 71, 71)
                                                    .addComponent(JLabelDel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(30, 30, 30))
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addComponent(jObservacao)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLabelFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTextFieldcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTextFieldDt_compra)))))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelItem)
                    .addComponent(JLabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelEmpenho)
                    .addComponent(JLabelNF)
                    .addComponent(JLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFieldEmpenho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldNotaFiscal1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldDt_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel1)
                    .addComponent(JLabel2)
                    .addComponent(JLabel6)
                    .addComponent(JLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFieldPrec_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldQuantid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldDt_Validade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(JLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelDel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(JLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JTextFieldDt_Validade, JTextFieldPrec_Unit, JTextFieldcodigo, jComboCategoria, jComboFornecedor, jComboItem});

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCategoriaActionPerformed

    private void jComboItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboItemActionPerformed

    private void jComboFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFornecedorActionPerformed

    private void JTextFieldDt_ValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldDt_ValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldDt_ValidadeActionPerformed

    private void JTextFieldPrec_UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldPrec_UnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldPrec_UnitActionPerformed

    private void JTextFieldcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldcodigoActionPerformed

    private void JTextFieldEmpenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEmpenhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEmpenhoActionPerformed

    private void JTextFieldQuantidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldQuantidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldQuantidActionPerformed

    private void JTextFieldQuantidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextFieldQuantidMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_JTextFieldQuantidMouseClicked

    private void JTextFieldNotaFiscal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNotaFiscal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNotaFiscal1ActionPerformed
   
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JLabel JLabelAdd;
    private javax.swing.JLabel JLabelCategoria;
    private javax.swing.JLabel JLabelDel;
    private javax.swing.JLabel JLabelEdit;
    private javax.swing.JLabel JLabelEmpenho;
    private javax.swing.JLabel JLabelFornecedor;
    private javax.swing.JLabel JLabelItem;
    private javax.swing.JLabel JLabelNF;
    private javax.swing.JLabel JLabelSalvar;
    private javax.swing.JTextField JTextFieldDt_Validade;
    private javax.swing.JTextField JTextFieldDt_compra;
    private javax.swing.JTextField JTextFieldEmpenho;
    private javax.swing.JTextField JTextFieldNotaFiscal1;
    private javax.swing.JTextField JTextFieldPrec_Unit;
    private javax.swing.JTextField JTextFieldQuantid;
    private javax.swing.JTextField JTextFieldcodigo;
    private javax.swing.JComboBox jComboCategoria;
    private javax.swing.JComboBox jComboFornecedor;
    private javax.swing.JComboBox jComboItem;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JScrollPane jObservacao;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEntradas;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
