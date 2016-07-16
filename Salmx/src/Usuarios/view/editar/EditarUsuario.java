/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.view.editar;

import Usuarios.view.novo.*;

public class EditarUsuario extends javax.swing.JFrame {

    public EditarUsuario() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        JLabelCancelar = new javax.swing.JLabel();
        JLabelSalvar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(242, 242, 242));

        JLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelNome.setForeground(new java.awt.Color(255, 102, 102));
        JLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelNome.setText("Nome Completo: *");

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
        JLabelLogin.setText("Login: *");

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
        JLabelSenha.setText("Senha:  *");

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
        JLabelConfirmaSenha.setText("Confirmar Senha: *");

        jPasswordFieldConfirmaSenha.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldConfirmaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldConfirmaSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordFieldConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfirmaSenhaActionPerformed(evt);
            }
        });

        JLabelCancelar.setBackground(new java.awt.Color(102, 102, 102));
        JLabelCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCancelar.setText("CANCELAR");
        JLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelCancelar.setOpaque(true);

        JLabelSalvar.setBackground(new java.awt.Color(255, 102, 102));
        JLabelSalvar.setForeground(new java.awt.Color(255, 255, 255));
        JLabelSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelSalvar.setText("SALVAR");
        JLabelSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelSalvar.setOpaque(true);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTextFieldNome)
                            .addComponent(JLabelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTextFieldLogin)
                            .addComponent(JLabelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldSenha)
                            .addComponent(JLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldConfirmaSenha)
                            .addComponent(JLabelConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(JLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(JLabelSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JLabelCancelar, JLabelSalvar});

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
    private javax.swing.JLabel JLabelCancelar;
    private javax.swing.JLabel JLabelConfirmaSenha;
    private javax.swing.JLabel JLabelLogin;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelSalvar;
    private javax.swing.JLabel JLabelSenha;
    private javax.swing.JTextField JTextFieldLogin;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPasswordField jPasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    // End of variables declaration//GEN-END:variables
}
