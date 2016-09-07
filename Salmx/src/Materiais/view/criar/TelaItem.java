/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiais.view.criar;

import Categoria.model.Categoria;
import javax.swing.*;

/**
 *
 * @author Maysa
 */
public class TelaItem extends javax.swing.JDialog {

    /**
     * Creates new form TelaItem
     */
    public TelaItem(java.awt.Frame parent, boolean modal) {
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
        if(jTextDescr.getText().isEmpty() || jTextCod.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha os campos codigo e descricao");
            return false;
        } else{
            return true;
        }
    }
  public void limpaTela(){
        jTextCod.setText("");
        jTextDescr.setText("");
        jUltimoCodigo.setText("");
    }
  public void habilitaCampos(){
      getjTextDescr().enable();
      getjTextCod().enable();
      getjBoxCategoria().enable();
  }
  public void desabilitaCampos(){
      getjTextDescr().enable(false);
      getjTextCod().enable(false);
      getjBoxCategoria().enable(false);  
  }
  public void abilitaBotConfExc(){
      getSalvar().setVisible(false);       
      getExcluir().setVisible(true); 
  }
 public void mudaEstadoBotton(){
     getSalvar().setVisible(true);       
     getExcluir().setVisible(false);
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
        jTextDescr = new javax.swing.JTextField();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        excluir = new javax.swing.JLabel();
        jLabelPass1 = new javax.swing.JLabel();
        jBoxCategoria = new javax.swing.JComboBox();
        jLabelUserName1 = new javax.swing.JLabel();
        jLabelUserName2 = new javax.swing.JLabel();
        jBoxLetra = new javax.swing.JComboBox();
        jTextCod = new javax.swing.JTextField();
        salvar = new javax.swing.JLabel();
        jUltimoCodigo = new javax.swing.JTextField();

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

        jTextDescr.setForeground(new java.awt.Color(153, 153, 153));
        jTextDescr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextDescr.setText(" ");
        jTextDescr.setToolTipText("");
        jTextDescr.setAutoscrolls(false);
        jTextDescr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextDescr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextDescr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescrActionPerformed(evt);
            }
        });

        jLabelUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(255, 102, 102));
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUserName.setText("Descrição *");

        jLabelPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(255, 102, 102));
        jLabelPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPass.setText("codigo *");

        excluir.setBackground(new java.awt.Color(255, 102, 102));
        excluir.setForeground(new java.awt.Color(255, 255, 255));
        excluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        excluir.setText("CONFIRMAR EXCLUSÃO");
        excluir.setOpaque(true);

        jLabelPass1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPass1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelPass1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPass1.setText("categoria *");

        jBoxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBoxCategoria.setForeground(new java.awt.Color(102, 102, 102));
        jBoxCategoria.setBorder(null);

        jLabelUserName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUserName1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelUserName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUserName1.setText("Ultimo Código *");

        jLabelUserName2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUserName2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelUserName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUserName2.setText("Letra Inicial *");

        jBoxLetra.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBoxLetra.setForeground(new java.awt.Color(102, 102, 102));
        jBoxLetra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        jTextCod.setForeground(new java.awt.Color(153, 153, 153));
        jTextCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCod.setText(" ");
        jTextCod.setToolTipText("");
        jTextCod.setAutoscrolls(false);
        jTextCod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodActionPerformed(evt);
            }
        });

        salvar.setBackground(new java.awt.Color(255, 102, 102));
        salvar.setForeground(new java.awt.Color(255, 255, 255));
        salvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salvar.setText("SALVAR");
        salvar.setOpaque(true);

        jUltimoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUltimoCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabelUserName))
                                    .addComponent(jBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelUserName2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jBoxLetra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelUserName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jUltimoCodigo))
                                .addGap(16, 16, 16))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextDescr))))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPass1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUserName2)
                            .addComponent(jLabelUserName1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBoxLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jUltimoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBoxCategoria))
                .addGap(37, 37, 37)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass)
                    .addComponent(jLabelUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDescr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBoxLetra, jUltimoCodigo});

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
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
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescrActionPerformed

    private void jTextCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodActionPerformed
        // TODO add your handling code here:
    }
public int itemSelecionado(){
        if(jBoxCategoria.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, "Selecione um item");
        } 
        return jBoxCategoria.getSelectedIndex();
    }
    public JLabel getExcluir() {
        return excluir;
    }

    public void setExcluir(JLabel excluir) {
        this.excluir = excluir;
    }

    public JComboBox getjBoxCategoria() {
        return jBoxCategoria;
    }

    public void setjBoxCategoria(JComboBox jBoxCategoria) {
        this.jBoxCategoria = jBoxCategoria;
    }

    public JComboBox getjBoxLetra() {
        return jBoxLetra;
    }

    public void setjBoxLetra(JComboBox jBoxLetra) {
        this.jBoxLetra = jBoxLetra;
    }
  
   
    public JTextField getjTextCod() {
        return jTextCod;
    }

    public void setjTextCod(JTextField jTextCod) {
        this.jTextCod = jTextCod;
    }

    public JTextField getjTextDescr() {
        return jTextDescr;
    }

    public void setjTextDescr(JTextField jTextDescr) {
        this.jTextDescr = jTextDescr;
    }

    public JTextField getjUltimoCodigo() {
        return jUltimoCodigo;
    }

    public void setjUltimoCodigo(JTextField jUltimoCodigo) {
        this.jUltimoCodigo = jUltimoCodigo;
    }

    public JLabel getSalvar() {
        return salvar;
    }

    public void setSalvar(JLabel salvar) {
        this.salvar = salvar;
    }//GEN-LAST:event_jTextCodActionPerformed

    private void jUltimoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUltimoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUltimoCodigoActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel excluir;
    private javax.swing.JComboBox jBoxCategoria;
    private javax.swing.JComboBox jBoxLetra;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPass1;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserName1;
    private javax.swing.JLabel jLabelUserName2;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JTextField jTextCod;
    private javax.swing.JTextField jTextDescr;
    private javax.swing.JTextField jUltimoCodigo;
    private javax.swing.JLabel salvar;
    // End of variables declaration//GEN-END:variables
}
