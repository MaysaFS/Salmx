/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria.view;

import Categoria.view.novo.novacategoria;


/**
 *
 * @author Erick
 */
public class GestaoCatFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainLoginFrame
     */
    public GestaoCatFrame() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        jLabelSalmxLogo = new javax.swing.JLabel();
        TituloGestaoDeUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecatList = new javax.swing.JTable();
        CaixaBuscar = new javax.swing.JTextField();
        BotaoBuscar = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        CadastrarCategoria = new javax.swing.JLabel();
        EditarCategoria = new javax.swing.JLabel();
        RemoverCategoria = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        Background.setBackground(new java.awt.Color(242, 242, 242));

        Top.setBackground(new java.awt.Color(255, 102, 102));

        jLabelSalmxLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSalmxLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogoPequeno.png"))); // NOI18N
        jLabelSalmxLogo.setText(" ");
        jLabelSalmxLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        TituloGestaoDeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloGestaoDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TituloGestaoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloGestaoDeUsuario.setText("GESTÃO DE CATEGORIA");

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloGestaoDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TituloGestaoDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSalmxLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTablecatList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTablecatList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jTablecatList.setGridColor(new java.awt.Color(153, 153, 153));
        jTablecatList.setRowMargin(0);
        jTablecatList.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTablecatList);

        CaixaBuscar.setForeground(new java.awt.Color(153, 153, 153));
        CaixaBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CaixaBuscar.setText(" ");
        CaixaBuscar.setToolTipText("");
        CaixaBuscar.setAutoscrolls(false);
        CaixaBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CaixaBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CaixaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaBuscarActionPerformed(evt);
            }
        });

        BotaoBuscar.setBackground(new java.awt.Color(51, 51, 51));
        BotaoBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Search_Small.png"))); // NOI18N
        BotaoBuscar.setText("BUSCAR");
        BotaoBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        BotaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Menu.setBackground(new java.awt.Color(51, 51, 51));

        CadastrarCategoria.setBackground(new java.awt.Color(63, 63, 63));
        CadastrarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadastrarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small..png"))); // NOI18N
        CadastrarCategoria.setText("ADICIONAR");
        CadastrarCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        CadastrarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CadastrarCategoria.setOpaque(true);
        CadastrarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarCategoriaMouseClicked(evt);
            }
        });

        EditarCategoria.setBackground(new java.awt.Color(63, 63, 63));
        EditarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        EditarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Edit_Small.png"))); // NOI18N
        EditarCategoria.setText("EDITAR");
        EditarCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        EditarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditarCategoria.setOpaque(true);

        RemoverCategoria.setBackground(new java.awt.Color(63, 63, 63));
        RemoverCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RemoverCategoria.setForeground(new java.awt.Color(255, 255, 255));
        RemoverCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Delet_Small..png"))); // NOI18N
        RemoverCategoria.setText("EXCLUIR ");
        RemoverCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        RemoverCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RemoverCategoria.setOpaque(true);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastrarCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addComponent(EditarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RemoverCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoverCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(CaixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(BotaoBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoBuscar))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CaixaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaBuscarActionPerformed

    private void CadastrarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarCategoriaMouseClicked
       new novacategoria().setVisible(true);
    }//GEN-LAST:event_CadastrarCategoriaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BotaoBuscar;
    private javax.swing.JLabel CadastrarCategoria;
    private javax.swing.JTextField CaixaBuscar;
    private javax.swing.JLabel EditarCategoria;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel RemoverCategoria;
    private javax.swing.JLabel TituloGestaoDeUsuario;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSalmxLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecatList;
    // End of variables declaration//GEN-END:variables
}
