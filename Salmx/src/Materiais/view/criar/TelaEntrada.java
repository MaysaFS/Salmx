
package Materiais.view.criar;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TelaEntrada extends javax.swing.JPanel {

 
    public TelaEntrada() {
        initComponents();
    }

    public JLabel getjLabelCadEntrada() {
        return jLabelCadEntrada;
    }

    public void setjLabelCadEntrada(JLabel jLabelCadEntrada) {
        this.jLabelCadEntrada = jLabelCadEntrada;
    }

    public JLabel getjLabelMostraValorTotalEstoque() {
        return jLabelMostraValorTotalEstoque;
    }

    public void setjLabelMostraValorTotalEstoque(JLabel jLabelMostraValorTotalEstoque) {
        this.jLabelMostraValorTotalEstoque = jLabelMostraValorTotalEstoque;
    }

    public JLabel getjLabelVoltar() {
        return jLabelVoltar;
    }

    public void setjLabelVoltar(JLabel jLabelVoltar) {
        this.jLabelVoltar = jLabelVoltar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTableEstoqueList() {
        return jTableEstoqueList;
    }

    public void setjTableEstoqueList(JTable jTableEstoqueList) {
        this.jTableEstoqueList = jTableEstoqueList;
    }

    public JTextField getjTextBuscaMaterial() {
        return jTextBuscaMaterial;
    }

    public void setjTextBuscaMaterial(JTextField jTextBuscaMaterial) {
        this.jTextBuscaMaterial = jTextBuscaMaterial;
    }

    public JLabel getJlabelItens() {
        return jlabelItens;
    }

    public void setJlabelItens(JLabel jlabelItens) {
        this.jlabelItens = jlabelItens;
    }

    public JLabel getJlabelSaida() {
        return jlabelSaida;
    }

    public void setJlabelSaida(JLabel jlabelSaida) {
        this.jlabelSaida = jlabelSaida;
    }

    public JLabel getLabelPesquisarMaterial() {
        return labelPesquisarMaterial;
    }

    public void setLabelPesquisarMaterial(JLabel labelPesquisarMaterial) {
        this.labelPesquisarMaterial = labelPesquisarMaterial;
    }

   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelVoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoqueList = new javax.swing.JTable();
        jTextBuscaMaterial = new javax.swing.JTextField();
        labelPesquisarMaterial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlabelItens = new javax.swing.JLabel();
        jLabelCadEntrada = new javax.swing.JLabel();
        jlabelSaida = new javax.swing.JLabel();
        JLabelTextValor = new javax.swing.JLabel();
        jLabelMostraValorTotalEstoque = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setPreferredSize(new java.awt.Dimension(799, 366));

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROLE ESTOQUE");

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
                .addComponent(jLabelVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
            .addComponent(jLabelVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableEstoqueList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableEstoqueList.setForeground(new java.awt.Color(153, 153, 153));
        jTableEstoqueList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descrição", "Quantidade", "Subtotal"
            }
        ));
        jTableEstoqueList.setGridColor(new java.awt.Color(153, 153, 153));
        jTableEstoqueList.setRowMargin(0);
        jTableEstoqueList.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTableEstoqueList);

        jTextBuscaMaterial.setForeground(new java.awt.Color(153, 153, 153));
        jTextBuscaMaterial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextBuscaMaterial.setText("insira nome do material");
        jTextBuscaMaterial.setToolTipText("");
        jTextBuscaMaterial.setAutoscrolls(false);
        jTextBuscaMaterial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextBuscaMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextBuscaMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextBuscaMaterialMouseClicked(evt);
            }
        });
        jTextBuscaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaMaterialActionPerformed(evt);
            }
        });

        labelPesquisarMaterial.setBackground(new java.awt.Color(51, 51, 51));
        labelPesquisarMaterial.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelPesquisarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Search_Small.png"))); // NOI18N
        labelPesquisarMaterial.setText("BUSCAR");
        labelPesquisarMaterial.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        labelPesquisarMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jlabelItens.setBackground(new java.awt.Color(63, 63, 63));
        jlabelItens.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabelItens.setForeground(new java.awt.Color(255, 255, 255));
        jlabelItens.setText("ITENS");
        jlabelItens.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jlabelItens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlabelItens.setOpaque(true);

        jLabelCadEntrada.setBackground(new java.awt.Color(63, 63, 63));
        jLabelCadEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCadEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small.png"))); // NOI18N
        jLabelCadEntrada.setText("ENTRADA");
        jLabelCadEntrada.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jLabelCadEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelCadEntrada.setOpaque(true);
        jLabelCadEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadEntradaMouseClicked(evt);
            }
        });

        jlabelSaida.setBackground(new java.awt.Color(63, 63, 63));
        jlabelSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabelSaida.setForeground(new java.awt.Color(255, 255, 255));
        jlabelSaida.setText("SAIDA");
        jlabelSaida.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jlabelSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlabelSaida.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCadEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addComponent(jlabelItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlabelSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jlabelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabelItens, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        JLabelTextValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelTextValor.setForeground(new java.awt.Color(255, 102, 102));
        JLabelTextValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelTextValor.setText("Valor em estoque:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextBuscaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPesquisarMaterial)
                        .addGap(0, 237, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelTextValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMostraValorTotalEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBuscaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPesquisarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelTextValor)
                            .addComponent(jLabelMostraValorTotalEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextBuscaMaterialMouseClicked

        jTextBuscaMaterial.setText("");
    }//GEN-LAST:event_jTextBuscaMaterialMouseClicked

    private void jTextBuscaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaMaterialActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextBuscaMaterialActionPerformed

    private void jLabelCadEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadEntradaMouseClicked

    }//GEN-LAST:event_jLabelCadEntradaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelTextValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadEntrada;
    private javax.swing.JLabel jLabelMostraValorTotalEstoque;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoqueList;
    private javax.swing.JTextField jTextBuscaMaterial;
    private javax.swing.JLabel jlabelItens;
    private javax.swing.JLabel jlabelSaida;
    private javax.swing.JLabel labelPesquisarMaterial;
    // End of variables declaration//GEN-END:variables
}
