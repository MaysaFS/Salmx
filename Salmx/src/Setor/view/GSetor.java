/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

    public JLabel getjLabelVoltar() {
        return jLabelVoltar;
    }

    public void setjLabelVoltar(JLabel jLabelVoltar) {
        this.jLabelVoltar = jLabelVoltar;
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
   
     public int itemSelecionado(){
        if(jTableSetorList.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Selecione um item");
        } 
        return jTableSetorList.getSelectedRow();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelVoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSetorList = new javax.swing.JTable();
        jTextBuscaSetor = new javax.swing.JTextField();
        btPesquisarSetor = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        excluirSetor = new javax.swing.JLabel();
        editarSetor = new javax.swing.JLabel();
        novoSetor = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Background.setBackground(new java.awt.Color(242, 242, 242));
        Background.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTÃO DE SETOR");

        jLabelVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Voltar.png"))); // NOI18N
        jLabelVoltar.setText("Voltar");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
        jTableSetorList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTableSetorList);

        jTextBuscaSetor.setForeground(new java.awt.Color(153, 153, 153));
        jTextBuscaSetor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        menu.setBackground(new java.awt.Color(51, 51, 51));

        excluirSetor.setBackground(new java.awt.Color(63, 63, 63));
        excluirSetor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirSetor.setForeground(new java.awt.Color(255, 255, 255));
        excluirSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Delet_Small.png"))); // NOI18N
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
        novoSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small.png"))); // NOI18N
        novoSetor.setText("ADICIONAR");
        novoSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        novoSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novoSetor.setOpaque(true);
        novoSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoSetorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoSetor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
            .addComponent(editarSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(excluirSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(novoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluirSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jTextBuscaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarSetor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBuscaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisarSetor))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaSetorActionPerformed

    private void novoSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoSetorMouseClicked
        
    }//GEN-LAST:event_novoSetorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel btPesquisarSetor;
    private javax.swing.JLabel editarSetor;
    private javax.swing.JLabel excluirSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSetorList;
    private javax.swing.JTextField jTextBuscaSetor;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel novoSetor;
    // End of variables declaration//GEN-END:variables
}
