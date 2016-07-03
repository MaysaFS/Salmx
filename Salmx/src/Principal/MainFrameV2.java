package Principal;

import Usuarios.login.LoginFrame;
import Usuarios.criar.NovoUsuarioV02;
import Usuarios.UserFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jimmy
 */
public class MainFrameV2 extends javax.swing.JFrame {

    /**
     * Creates new form MainFrameV2
     */
    public MainFrameV2() {
        initComponents();
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
        TopoPrincipal2 = new javax.swing.JPanel();
        Salmx_Logo4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Fornecedores_Icone = new javax.swing.JLabel();
        Fornecedores_Label = new javax.swing.JLabel();
        Categorias_Icone = new javax.swing.JLabel();
        Categorias_Label = new javax.swing.JLabel();
        Produtos_Icone = new javax.swing.JLabel();
        Produtos_Label = new javax.swing.JLabel();
        Usuarios_Icone = new javax.swing.JLabel();
        Usuarios_Label = new javax.swing.JLabel();
        Relatorios_Icone = new javax.swing.JLabel();
        Relatorios_Label = new javax.swing.JLabel();
        Setores_Icone = new javax.swing.JLabel();
        Setores_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TopoPrincipal2.setBackground(new java.awt.Color(255, 102, 102));
        TopoPrincipal2.setPreferredSize(new java.awt.Dimension(678, 30));

        Salmx_Logo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salmx_Logo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogo.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserGrey.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        javax.swing.GroupLayout TopoPrincipal2Layout = new javax.swing.GroupLayout(TopoPrincipal2);
        TopoPrincipal2.setLayout(TopoPrincipal2Layout);
        TopoPrincipal2Layout.setHorizontalGroup(
            TopoPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopoPrincipal2Layout.createSequentialGroup()
                .addComponent(Salmx_Logo4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopoPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
        );
        TopoPrincipal2Layout.setVerticalGroup(
            TopoPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salmx_Logo4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
            .addGroup(TopoPrincipal2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Fornecedores_Icone.setBackground(new java.awt.Color(244, 244, 244));
        Fornecedores_Icone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Fornecedores_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fornecedores_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icones/Fornecedor_100.png"))); // NOI18N
        Fornecedores_Icone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Fornecedores_Icone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fornecedores_Icone.setMaximumSize(null);
        Fornecedores_Icone.setMinimumSize(new java.awt.Dimension(120, 120));
        Fornecedores_Icone.setOpaque(true);
        Fornecedores_Icone.setPreferredSize(new java.awt.Dimension(150, 150));

        Fornecedores_Label.setBackground(new java.awt.Color(255, 255, 255));
        Fornecedores_Label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Fornecedores_Label.setForeground(new java.awt.Color(153, 153, 153));
        Fornecedores_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fornecedores_Label.setText("FORNECEDORES");
        Fornecedores_Label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Fornecedores_Label.setMaximumSize(new java.awt.Dimension(300, 300));

        Categorias_Icone.setBackground(new java.awt.Color(244, 244, 244));
        Categorias_Icone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Categorias_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Categorias_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icones/Categorias_100.png"))); // NOI18N
        Categorias_Icone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Categorias_Icone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Categorias_Icone.setMaximumSize(null);
        Categorias_Icone.setMinimumSize(new java.awt.Dimension(120, 120));
        Categorias_Icone.setOpaque(true);
        Categorias_Icone.setPreferredSize(new java.awt.Dimension(150, 150));

        Categorias_Label.setBackground(new java.awt.Color(255, 255, 255));
        Categorias_Label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Categorias_Label.setForeground(new java.awt.Color(153, 153, 153));
        Categorias_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Categorias_Label.setText("CATEGORIAS");
        Categorias_Label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Categorias_Label.setMaximumSize(new java.awt.Dimension(300, 300));

        Produtos_Icone.setBackground(new java.awt.Color(244, 244, 244));
        Produtos_Icone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Produtos_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Produtos_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icones/Produtos_100.png"))); // NOI18N
        Produtos_Icone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Produtos_Icone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Produtos_Icone.setMaximumSize(null);
        Produtos_Icone.setMinimumSize(new java.awt.Dimension(120, 120));
        Produtos_Icone.setOpaque(true);
        Produtos_Icone.setPreferredSize(new java.awt.Dimension(150, 150));

        Produtos_Label.setBackground(new java.awt.Color(255, 255, 255));
        Produtos_Label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Produtos_Label.setForeground(new java.awt.Color(153, 153, 153));
        Produtos_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Produtos_Label.setText("PRODUTOS");
        Produtos_Label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Produtos_Label.setMaximumSize(new java.awt.Dimension(300, 300));

        Usuarios_Icone.setBackground(new java.awt.Color(244, 244, 244));
        Usuarios_Icone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Usuarios_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuarios_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icones/User_100.png"))); // NOI18N
        Usuarios_Icone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Usuarios_Icone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_Icone.setMaximumSize(null);
        Usuarios_Icone.setMinimumSize(new java.awt.Dimension(120, 120));
        Usuarios_Icone.setOpaque(true);
        Usuarios_Icone.setPreferredSize(new java.awt.Dimension(150, 150));
        Usuarios_Icone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuarios_IconeMouseClicked(evt);
            }
        });

        Usuarios_Label.setBackground(new java.awt.Color(255, 255, 255));
        Usuarios_Label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Usuarios_Label.setForeground(new java.awt.Color(153, 153, 153));
        Usuarios_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuarios_Label.setText("USUARIOS");
        Usuarios_Label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Usuarios_Label.setMaximumSize(new java.awt.Dimension(300, 300));

        Relatorios_Icone.setBackground(new java.awt.Color(244, 244, 244));
        Relatorios_Icone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Relatorios_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Relatorios_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icones/Relatorios-02_100.png"))); // NOI18N
        Relatorios_Icone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Relatorios_Icone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Relatorios_Icone.setMaximumSize(null);
        Relatorios_Icone.setMinimumSize(new java.awt.Dimension(120, 120));
        Relatorios_Icone.setOpaque(true);
        Relatorios_Icone.setPreferredSize(new java.awt.Dimension(150, 150));

        Relatorios_Label.setBackground(new java.awt.Color(255, 255, 255));
        Relatorios_Label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Relatorios_Label.setForeground(new java.awt.Color(153, 153, 153));
        Relatorios_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Relatorios_Label.setText("RELATÓRIOS");
        Relatorios_Label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Relatorios_Label.setMaximumSize(new java.awt.Dimension(300, 300));

        Setores_Icone.setBackground(new java.awt.Color(244, 244, 244));
        Setores_Icone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Setores_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Setores_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icones/Setores_100.png"))); // NOI18N
        Setores_Icone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Setores_Icone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Setores_Icone.setMaximumSize(null);
        Setores_Icone.setMinimumSize(new java.awt.Dimension(120, 120));
        Setores_Icone.setOpaque(true);
        Setores_Icone.setPreferredSize(new java.awt.Dimension(150, 150));

        Setores_Label.setBackground(new java.awt.Color(255, 255, 255));
        Setores_Label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Setores_Label.setForeground(new java.awt.Color(153, 153, 153));
        Setores_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Setores_Label.setText("SETORES");
        Setores_Label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Setores_Label.setMaximumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fornecedores_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Fornecedores_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(Setores_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Setores_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Categorias_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Categorias_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Relatorios_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Relatorios_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Produtos_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usuarios_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produtos_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Usuarios_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Categorias_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Fornecedores_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Produtos_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fornecedores_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Categorias_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produtos_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Setores_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Relatorios_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Usuarios_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Relatorios_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usuarios_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Setores_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopoPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TopoPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Usuarios_IconeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuarios_IconeMouseClicked
       new UserFrame().setVisible(true);
    }//GEN-LAST:event_Usuarios_IconeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            new LoginFrame().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categorias_Icone;
    private javax.swing.JLabel Categorias_Label;
    private javax.swing.JLabel Fornecedores_Icone;
    private javax.swing.JLabel Fornecedores_Label;
    private javax.swing.JLabel Produtos_Icone;
    private javax.swing.JLabel Produtos_Label;
    private javax.swing.JLabel Relatorios_Icone;
    private javax.swing.JLabel Relatorios_Label;
    private javax.swing.JLabel Salmx_Logo4;
    private javax.swing.JLabel Setores_Icone;
    private javax.swing.JLabel Setores_Label;
    private javax.swing.JPanel TopoPrincipal2;
    private javax.swing.JLabel Usuarios_Icone;
    private javax.swing.JLabel Usuarios_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
