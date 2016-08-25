
package Categoria.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JDTelaCat extends javax.swing.JDialog {

    public JDTelaCat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciar();
    }
    
    private void iniciar() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {        
            
        });
        this.setLocationRelativeTo(null);
    }
    
    public boolean validaCampos(){
        if(NomeCat.getText().isEmpty() || jTextCodCat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
            return false;
        } else{
            return true;
        }  
    }
    
    public void limpaTela(){
        NomeCat.setText(""); 
        jTextCodCat.setText("");
    }

    public JTextField getNomeCat() {
        return NomeCat;
    }

    public void setNomeCat(JTextField NomeCat) {
        this.NomeCat = NomeCat;
    }

    public JLabel getjLabelCodCat() {
        return jLabelCodCat;
    }

    public void setjLabelCodCat(JLabel jLabelCodCat) {
        this.jLabelCodCat = jLabelCodCat;
    }

    public JLabel getjLabelNomeCat() {
        return jLabelNomeCat;
    }

    public void setjLabelNomeCat(JLabel jLabelNomeCat) {
        this.jLabelNomeCat = jLabelNomeCat;
    }

    public JTextField getjTextCodCat() {
        return jTextCodCat;
    }

    public void setjTextCodCat(JTextField jTextCodCat) {
        this.jTextCodCat = jTextCodCat;
    }
    
   
    
    
    
    public JLabel getjLabelSalvar() {
        return jLabelSalvar;
    }

    public void setjLabelSalvar(JLabel jLabelSalvar) {
        this.jLabelSalvar = jLabelSalvar;
    }
    public JTextField getTxtNomeCat() {
        return NomeCat;
    }

    public JLabel getjLabelExcluir() {
        return jLabelExcluir;
    }

    public void setjLabelExcluir(JLabel jLabelExcluir) {
        this.jLabelExcluir = jLabelExcluir;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelNomeCat = new javax.swing.JLabel();
        NomeCat = new javax.swing.JTextField();
        jLabelCodCat = new javax.swing.JLabel();
        jLabelSalvar = new javax.swing.JLabel();
        jTextCodCat = new javax.swing.JTextField();
        jLabelExcluir = new javax.swing.JLabel();
        jPanelTop = new javax.swing.JPanel();
        jLabelSalmxLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));

        jLabelNomeCat.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNomeCat.setForeground(new java.awt.Color(255, 102, 102));
        jLabelNomeCat.setText("Nome da categoria: ");

        NomeCat.setForeground(new java.awt.Color(102, 102, 102));
        NomeCat.setBorder(null);
        NomeCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCatActionPerformed(evt);
            }
        });

        jLabelCodCat.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCodCat.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCodCat.setText("Código-categoria:");

        jLabelSalvar.setBackground(new java.awt.Color(255, 102, 102));
        jLabelSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalvar.setText("SALVAR");
        jLabelSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalvar.setOpaque(true);

        jTextCodCat.setForeground(new java.awt.Color(102, 102, 102));
        jTextCodCat.setBorder(null);
        jTextCodCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodCatActionPerformed(evt);
            }
        });

        jLabelExcluir.setBackground(new java.awt.Color(255, 102, 102));
        jLabelExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExcluir.setText("CONFIRMAR EXCLUSÃO");
        jLabelExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExcluir.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelCodCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextCodCat)
                        .addComponent(NomeCat)
                        .addComponent(jLabelNomeCat, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCodCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelExcluir, jLabelSalvar});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NomeCat, jTextCodCat});

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCatActionPerformed

    private void jTextCodCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodCatActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeCat;
    private javax.swing.JLabel jLabelCodCat;
    private javax.swing.JLabel jLabelExcluir;
    private javax.swing.JLabel jLabelNomeCat;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JLabel jLabelSalvar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JTextField jTextCodCat;
    // End of variables declaration//GEN-END:variables
}
