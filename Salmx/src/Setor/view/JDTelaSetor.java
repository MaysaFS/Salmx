/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Setor.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Maysa
 */
public class JDTelaSetor extends javax.swing.JDialog {

    /**
     * Creates new form JDTelaSetor
     */
    public JDTelaSetor(java.awt.Frame parent, boolean modal) {
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
        if(txtNomeSetor.getText().isEmpty() || txtRamalSetor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha os campos nome e ramal");
            return false;
        } else{
            return true;
        }
    }
  public void limpaTela(){
        txtNomeSetor.setText("");
        txtRamalSetor.setText("");
        txtObservSetor.setText("");
    }
public JLabel getjLabelSalvar() {
        return jLabelSalvar;
    }

    public void setjLabelSalvar(JLabel jLabelSalvar) {
        this.jLabelSalvar = jLabelSalvar;
    }


    public JTextField getTxtNomeSetor() {
        return txtNomeSetor;
    }

    public void setTxtNomeSetor(JTextField txtNomeSetor) {
        this.txtNomeSetor = txtNomeSetor;
    }

    public JTextArea getTxtObservSetor() {
        return txtObservSetor;
    }

    public void setTxtObservSetor(JTextArea txtObservSetor) {
        this.txtObservSetor = txtObservSetor;
    }

    public JTextField getTxtRamalSetor() {
        return txtRamalSetor;
    }

    public void setTxtRamalSetor(JTextField txtRamalSetor) {
        this.txtRamalSetor = txtRamalSetor;
    }

    public JLabel getjLabelExcluir() {
        return jLabelExcluir;
    }
    
    public void setjLabelExcluir(JLabel jLabelExcluir) {
        this.jLabelExcluir = jLabelExcluir;
    }
       

    public JLabel getjLabelSalmxLogo() {
        return jLabelSalmxLogo;
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
        jLabel2 = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        txtRamalSetor = new javax.swing.JTextField();
        jLabelRamalSetor = new javax.swing.JLabel();
        jLabelObservSetor = new javax.swing.JLabel();
        txtNomeSetor = new javax.swing.JTextField();
        jLabelnomeSetor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservSetor = new javax.swing.JTextArea();
        jLabelSalvar = new javax.swing.JLabel();
        jLabelExcluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBack.setBackground(new java.awt.Color(247, 247, 247));

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabelSalmxLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSalmxLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogoPequeno.png"))); // NOI18N
        jLabelSalmxLogo.setText(" ");
        jLabelSalmxLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SETOR");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBody.setBackground(new java.awt.Color(242, 242, 242));

        txtRamalSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRamalSetor.setForeground(new java.awt.Color(153, 153, 153));
        txtRamalSetor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRamalSetor.setText(" ");
        txtRamalSetor.setToolTipText("");
        txtRamalSetor.setAutoscrolls(false);
        txtRamalSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtRamalSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRamalSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRamalSetorActionPerformed(evt);
            }
        });

        jLabelRamalSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRamalSetor.setForeground(new java.awt.Color(255, 102, 102));
        jLabelRamalSetor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRamalSetor.setText("Ramal: ");

        jLabelObservSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelObservSetor.setForeground(new java.awt.Color(255, 102, 102));
        jLabelObservSetor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelObservSetor.setText("Observação:  ");

        txtNomeSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNomeSetor.setForeground(new java.awt.Color(153, 153, 153));
        txtNomeSetor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeSetor.setText(" ");
        txtNomeSetor.setToolTipText("");
        txtNomeSetor.setAutoscrolls(false);
        txtNomeSetor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNomeSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNomeSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSetorActionPerformed(evt);
            }
        });

        jLabelnomeSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelnomeSetor.setForeground(new java.awt.Color(255, 102, 102));
        jLabelnomeSetor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelnomeSetor.setText("Nome  do Setor: ");

        txtObservSetor.setColumns(20);
        txtObservSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtObservSetor.setRows(5);
        txtObservSetor.setBorder(null);
        jScrollPane1.setViewportView(txtObservSetor);

        jLabelSalvar.setBackground(new java.awt.Color(255, 102, 102));
        jLabelSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalvar.setText("SALVAR");
        jLabelSalvar.setOpaque(true);

        jLabelExcluir.setBackground(new java.awt.Color(255, 102, 102));
        jLabelExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExcluir.setText("CONFIRMAR EXCLUSÃO");
        jLabelExcluir.setOpaque(true);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeSetor)
                            .addComponent(jLabelnomeSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRamalSetor)
                            .addComponent(jLabelRamalSetor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelObservSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                    .addComponent(jLabelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelnomeSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRamalSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRamalSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelObservSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelExcluir, jLabelSalvar});

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRamalSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRamalSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRamalSetorActionPerformed

    private void txtNomeSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeSetorActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelExcluir;
    private javax.swing.JLabel jLabelObservSetor;
    private javax.swing.JLabel jLabelRamalSetor;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JLabel jLabelSalvar;
    private javax.swing.JLabel jLabelnomeSetor;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNomeSetor;
    private javax.swing.JTextArea txtObservSetor;
    private javax.swing.JTextField txtRamalSetor;
    // End of variables declaration//GEN-END:variables

}
