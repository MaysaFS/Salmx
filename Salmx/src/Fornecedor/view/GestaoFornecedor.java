/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fornecedor.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class GestaoFornecedor extends javax.swing.JPanel {

    /**
     * Creates new form GestaoFornecedor
     */
    public GestaoFornecedor() {
        initComponents();
       
    }
    
    public JLabel getBtEditForn(){
        return btEditForn;
    }
    
    public void setBtEditForn(JLabel btEditForn) {
        this.btEditForn = btEditForn;
    }
    
    public JLabel getBtExcForn(){
        return btExcForn;
    }
    
    public void setBtExcForn(JLabel btExcForn) {
        this.btExcForn = btExcForn;
    }
     
    public JLabel getBtAddForn(){
        return btAddForn;
    }
    
    public void setBtAddForn(JLabel btAddForn) {
        this.btAddForn = btAddForn;
    }
    
    public JLabel getBtPesquisa(){
        return btPesquisa;
    }

    public void setBtPesquisa(JLabel btPesquisa) {
        this.btPesquisa = btPesquisa;
    }
    
    public JLabel getjLabelVoltar(){
        return jLabelVoltar;
    }
                   
    public void setjLabelVoltar(JLabel jLabelVoltar) {
        this.jLabelVoltar = jLabelVoltar;
    }

    public JTable getjTableFornecedor() {
        return jTableFornecedor;
    }

    public void setjTableFornecedor(JTable jTableFornecedor) {
        this.jTableFornecedor = jTableFornecedor;
    }

    public JTextField getjTextFieldPesquisa() {
        return jTextFieldPesquisa;
    }

    public void setjTextFieldPesquisa(JTextField jTextFieldPesquisa) {
        this.jTextFieldPesquisa = jTextFieldPesquisa;
    }
    
     public int itemSelecionado(){
        if(jTableFornecedor.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Selecione um item");
        } 
        return jTableFornecedor.getSelectedRow();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        btExcForn = new javax.swing.JLabel();
        btEditForn = new javax.swing.JLabel();
        btAddForn = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jPanelTop = new javax.swing.JPanel();
        jLabelFornecedor = new javax.swing.JLabel();
        jLabelVoltar = new javax.swing.JLabel();

        jPanelMenu.setBackground(new java.awt.Color(51, 51, 51));

        btExcForn.setBackground(new java.awt.Color(63, 63, 63));
        btExcForn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcForn.setForeground(new java.awt.Color(255, 255, 255));
        btExcForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Delet_Small.png"))); // NOI18N
        btExcForn.setText("EXCLUIR ");
        btExcForn.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btExcForn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcForn.setOpaque(true);

        btEditForn.setBackground(new java.awt.Color(63, 63, 63));
        btEditForn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEditForn.setForeground(new java.awt.Color(255, 255, 255));
        btEditForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Edit_Small.png"))); // NOI18N
        btEditForn.setText("EDITAR");
        btEditForn.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btEditForn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditForn.setOpaque(true);

        btAddForn.setBackground(new java.awt.Color(63, 63, 63));
        btAddForn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAddForn.setForeground(new java.awt.Color(255, 255, 255));
        btAddForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small.png"))); // NOI18N
        btAddForn.setText("ADICIONAR");
        btAddForn.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btAddForn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddForn.setOpaque(true);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAddForn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btEditForn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btExcForn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddForn, btEditForn, btExcForn});

        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btAddForn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditForn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcForn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jPanelMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAddForn, btEditForn, btExcForn});

        jTextFieldPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPesquisa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldPesquisa.setText("Insira o nome do fornecedor");
        jTextFieldPesquisa.setToolTipText("");
        jTextFieldPesquisa.setAutoscrolls(false);
        jTextFieldPesquisa.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jTextFieldPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPesquisaMouseClicked(evt);
            }
        });
        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        btPesquisa.setBackground(new java.awt.Color(51, 51, 51));
        btPesquisa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Search_Small.png"))); // NOI18N
        btPesquisa.setText("BUSCAR");
        btPesquisa.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableFornecedor.setForeground(new java.awt.Color(153, 153, 153));
        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Razao Social", "CNPJ", "Inscrição Estadual", "Email", "Telefone 1", "Telefone 2"
            }
        ));
        jTableFornecedor.setGridColor(new java.awt.Color(153, 153, 153));
        jTableFornecedor.setRowMargin(0);
        jTableFornecedor.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane.setViewportView(jTableFornecedor);

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabelFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFornecedor.setText("GESTÃO DE FORNECEDOR");

        jLabelVoltar.setBackground(new java.awt.Color(255, 0, 0));
        jLabelVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Voltar.png"))); // NOI18N
        jLabelVoltar.setText("Voltar");
        jLabelVoltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jLabelVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelTopLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelFornecedor, jLabelVoltar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisa)
                        .addGap(188, 188, 188))
                    .addComponent(jScrollPane))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTextFieldPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaMouseClicked
            jTextFieldPesquisa.setText("");
    }//GEN-LAST:event_jTextFieldPesquisaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btAddForn;
    private javax.swing.JLabel btEditForn;
    private javax.swing.JLabel btExcForn;
    private javax.swing.JLabel btPesquisa;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
