/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.view.novo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Maysa
 */
public class GSetor extends javax.swing.JPanel {
private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * Creates new form GSetor
     */
    public GSetor() {
        initComponents();
    }

    public JLabel getBtPesquisarSetor() {
        return btPesquisarSetor;
    }

    public void setBtPesquisarSetor(JLabel btPesquisarSetor) {
        this.btPesquisarSetor = btPesquisarSetor;
    }

    public JLabel getEditarSetor() {
        return editarSetor;
    }

    public void setEditarSetor(JLabel editarSetor) {
        this.editarSetor = editarSetor;
    }

    public JLabel getExcluirSetor() {
        return excluirSetor;
    }

    public void setExcluirSetor(JLabel excluirSetor) {
        this.excluirSetor = excluirSetor;
    }

    public JTable getjTableSetorList() {
        return jTableSetorList;
    }

    public void setjTableSetorList(JTable jTableSetorList) {
        this.jTableSetorList = jTableSetorList;
    }

    public JTextField getjTextBuscaSetor() {
        return jTextBuscaSetor;
    }

    public void setjTextBuscaSetor(JTextField jTextBuscaSetor) {
        this.jTextBuscaSetor = jTextBuscaSetor;
    }

    public JLabel getNovoSetor() {
        return novoSetor;
    }

    public void setNovoSetor(JLabel novoSetor) {
        this.novoSetor = novoSetor;
    }

    public JLabel getRetornarPrincip() {
        return retornarPrincip;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelSalmxLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSetorList = new javax.swing.JTable();
        jTextBuscaSetor = new javax.swing.JTextField();
        btPesquisarSetor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        excluirSetor = new javax.swing.JLabel();
        editarSetor = new javax.swing.JLabel();
        novoSetor = new javax.swing.JLabel();
        retornarPrincip = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabelSalmxLogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSalmxLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalmxLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSalmxLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogoPequeno.png"))); // NOI18N
        jLabelSalmxLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestão de Setor");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableSetorList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableSetorList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Ramal", "Observacao"
            }
        ));
        jTableSetorList.setGridColor(new java.awt.Color(153, 153, 153));
        jTableSetorList.setRowMargin(0);
        jTableSetorList.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTableSetorList);

        jTextBuscaSetor.setForeground(new java.awt.Color(153, 153, 153));
        jTextBuscaSetor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextBuscaSetor.setText(" insira nome do setor aqui ");
        jTextBuscaSetor.setToolTipText("");
        jTextBuscaSetor.setAutoscrolls(false);
        jTextBuscaSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextBuscaSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextBuscaSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaSetorActionPerformed(evt);
            }
        });

        btPesquisarSetor.setBackground(new java.awt.Color(51, 51, 51));
        btPesquisarSetor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btPesquisarSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Search_Small.png"))); // NOI18N
        btPesquisarSetor.setText("BUSCAR");
        btPesquisarSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btPesquisarSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        excluirSetor.setBackground(new java.awt.Color(63, 63, 63));
        excluirSetor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirSetor.setForeground(new java.awt.Color(255, 255, 255));
        excluirSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Delet_Small..png"))); // NOI18N
        excluirSetor.setText("EXCLUIR");
        excluirSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        excluirSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excluirSetor.setOpaque(true);

        editarSetor.setBackground(new java.awt.Color(63, 63, 63));
        editarSetor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarSetor.setForeground(new java.awt.Color(255, 255, 255));
        editarSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Edit_Small.png"))); // NOI18N
        editarSetor.setText("EDITAR");
        editarSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        editarSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editarSetor.setOpaque(true);

        novoSetor.setBackground(new java.awt.Color(63, 63, 63));
        novoSetor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoSetor.setForeground(new java.awt.Color(255, 255, 255));
        novoSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small..png"))); // NOI18N
        novoSetor.setText("ADICIONAR");
        novoSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        novoSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novoSetor.setOpaque(true);
        novoSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoSetorMouseClicked(evt);
            }
        });

        retornarPrincip.setBackground(new java.awt.Color(63, 63, 63));
        retornarPrincip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        retornarPrincip.setForeground(new java.awt.Color(255, 255, 255));
        retornarPrincip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/voltar2.png"))); // NOI18N
        retornarPrincip.setText("VOLTAR");
        retornarPrincip.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        retornarPrincip.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        retornarPrincip.setOpaque(true);
        retornarPrincip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retornarPrincipMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoSetor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addComponent(editarSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(excluirSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(retornarPrincip, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(novoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluirSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(retornarPrincip, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextBuscaSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btPesquisarSetor)
                            .addComponent(jTextBuscaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaSetorActionPerformed

    private void novoSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoSetorMouseClicked

    }//GEN-LAST:event_novoSetorMouseClicked

    private void retornarPrincipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retornarPrincipMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_retornarPrincipMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btPesquisarSetor;
    private javax.swing.JLabel editarSetor;
    private javax.swing.JLabel excluirSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSetorList;
    private javax.swing.JTextField jTextBuscaSetor;
    private javax.swing.JLabel novoSetor;
    private javax.swing.JLabel retornarPrincip;
    // End of variables declaration//GEN-END:variables
}
