/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.testes;

import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NovoUsuario extends javax.swing.JFrame {

    public NovoUsuario() {
        initComponents();
        ocultaErro();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
   

    public JTextField getJTextFieldLogin() {
        return JTextFieldLogin;
    }
   
    public JTextField getJTextFieldNome() {
        return JTextFieldNome;
    }

    public JPasswordField getjPasswordFieldConfirmaSenha() {
        return jPasswordFieldConfirmaSenha;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public JLabel getJLabelSalvar() {
        return JLabelSalvar;
    }
    
    public void exibeErro(String erro){
        jLabelErroOK.setVisible(true);
        jLabelErro.setText(erro);
        
    }
    public void ocultaErro(){
        jLabelErro.setText("    ");
        jLabelErroOK.setVisible(false);  
    }
    public boolean validaCampos(){
        if(Arrays.toString(jPasswordFieldConfirmaSenha.getPassword()).isEmpty()|| 
                Arrays.toString(jPasswordFieldSenha.getPassword()).isEmpty() ||
                JTextFieldLogin.getText().isEmpty() ||
                JTextFieldNome.getText().isEmpty()){
                
                exibeErro("Preencha todos os campos");
                //JOptionPane.showMessageDialog(this, "Preencha todos os campos");
                return false;
            } else{
                return true;
            }
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupUsuarioTIpo = new javax.swing.ButtonGroup();
        jPanelBack = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelSalmxLogo = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        JLabelNome = new javax.swing.JLabel();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelLogin = new javax.swing.JLabel();
        JTextFieldLogin = new javax.swing.JTextField();
        JLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        JLabelConfirmaSenha = new javax.swing.JLabel();
        jPasswordFieldConfirmaSenha = new javax.swing.JPasswordField();
        JLabelSalvar = new javax.swing.JLabel();
        jLabelErro = new javax.swing.JLabel();
        jLabelErroOK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 418));
        setName("Cadastrar Usuario"); // NOI18N
        setResizable(false);

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

        JLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelNome.setForeground(new java.awt.Color(255, 102, 102));
        JLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelNome.setText("Nome *");

        JTextFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldNome.setText(" ");
        JTextFieldNome.setToolTipText("");
        JTextFieldNome.setAutoscrolls(false);
        JTextFieldNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNomeActionPerformed(evt);
            }
        });

        JLabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelLogin.setForeground(new java.awt.Color(255, 102, 102));
        JLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelLogin.setText("Login *");

        JTextFieldLogin.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldLogin.setText(" ");
        JTextFieldLogin.setToolTipText("");
        JTextFieldLogin.setAutoscrolls(false);
        JTextFieldLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextFieldLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLoginActionPerformed(evt);
            }
        });

        JLabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelSenha.setForeground(new java.awt.Color(255, 102, 102));
        JLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelSenha.setText("Senha  *");

        jPasswordFieldSenha.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        JLabelConfirmaSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelConfirmaSenha.setForeground(new java.awt.Color(255, 102, 102));
        JLabelConfirmaSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelConfirmaSenha.setText("Confirmar Senha *");

        jPasswordFieldConfirmaSenha.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldConfirmaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldConfirmaSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordFieldConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfirmaSenhaActionPerformed(evt);
            }
        });

        JLabelSalvar.setBackground(new java.awt.Color(255, 102, 102));
        JLabelSalvar.setForeground(new java.awt.Color(255, 255, 255));
        JLabelSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelSalvar.setText("SALVAR");
        JLabelSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLabelSalvar.setOpaque(true);

        jLabelErro.setBackground(new java.awt.Color(255, 102, 102));
        jLabelErro.setForeground(new java.awt.Color(255, 102, 102));
        jLabelErro.setText("CAIXA DE ERRO");

        jLabelErroOK.setBackground(new java.awt.Color(255, 102, 102));
        jLabelErroOK.setForeground(new java.awt.Color(255, 255, 255));
        jLabelErroOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErroOK.setText("OK");
        jLabelErroOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelErroOK.setOpaque(true);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTextFieldLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldConfirmaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelConfirmaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                            .addComponent(jLabelErro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelErroOK, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JLabelSalvar, JTextFieldLogin, JTextFieldNome, jPasswordFieldConfirmaSenha, jPasswordFieldSenha});

        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelErro)
                    .addComponent(jLabelErroOK, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelConfirmaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JLabelSalvar, JTextFieldLogin, JTextFieldNome, jPasswordFieldConfirmaSenha, jPasswordFieldSenha});

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelErro, jLabelErroOK});

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JLabelConfirmaSenha, JLabelLogin, JLabelNome, JLabelSenha});

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void JTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNomeActionPerformed

    private void JTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLoginActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jPasswordFieldConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfirmaSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelConfirmaSenha;
    private javax.swing.JLabel JLabelLogin;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelSalvar;
    private javax.swing.JLabel JLabelSenha;
    private javax.swing.JTextField JTextFieldLogin;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.ButtonGroup buttonGroupUsuarioTIpo;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelErroOK;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPasswordField jPasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    // End of variables declaration//GEN-END:variables
}
