
package Categoria.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;



public class GestaoCat extends javax.swing.JPanel {
      private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


    public GestaoCat() {
        initComponents();
    }

    
    public JLabel getBotBuscar(){
       return BotaoBuscar; 
    }
    public void getBotBuscar(JLabel BotaoBuscar){
       this.BotaoBuscar= BotaoBuscar;
    }
    
    public JLabel getEditCategoria(){
       return EditarCategoria;
    }
    public void setEditCategoria(JLabel EditarCategoria){
      this.EditarCategoria= EditarCategoria;
    }
    
     public JLabel getjLabelVoltar() {
        return jLabelVoltar;
    }
     public void setjLabelVoltar(JLabel jLabelVoltar) {
        this.jLabelVoltar = jLabelVoltar;
    }
     
     public JLabel getRemoCategoria() {
        return RemoverCategoria;
    }

    public void setRemoCategoria(JLabel RemoverCategoria) {
        this.RemoverCategoria = RemoverCategoria;
    }
    
    public JTable getjTablecatList() {
        return jTablecatList;
    }

    public void setjTablecatList(JTable jTablecatList) {
        this.jTablecatList = jTablecatList;
    }
    
    public JTextField getCxBuscar(){
        return CaixaBuscar;
    }
    public void setCxBuscar(JTextField CaixaBuscar){
      this.CaixaBuscar= CaixaBuscar;
    }
    
    public JLabel getCadCategoria(){
      return CadastrarCategoria;
    }
    public void setCadCategoria(JLabel CadastrarCategoria){
      this.CadastrarCategoria= CadastrarCategoria;
    }
    
    public int itemSelecionado(){
        if(jTablecatList.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Selecione um item");
        } 
        return jTablecatList.getSelectedRow();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Top = new javax.swing.JPanel();
        TituloGestaoDeUsuario = new javax.swing.JLabel();
        jLabelVoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecatList = new javax.swing.JTable();
        CaixaBuscar = new javax.swing.JTextField();
        BotaoBuscar = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        CadastrarCategoria = new javax.swing.JLabel();
        EditarCategoria = new javax.swing.JLabel();
        RemoverCategoria = new javax.swing.JLabel();

        Top.setBackground(new java.awt.Color(255, 102, 102));

        TituloGestaoDeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloGestaoDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TituloGestaoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloGestaoDeUsuario.setText("GESTÃO DE CATEGORIA");

        jLabelVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Voltar.png"))); // NOI18N
        jLabelVoltar.setText("Voltar");

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVoltar)
                .addGap(18, 18, 18)
                .addComponent(TituloGestaoDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloGestaoDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabelVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        CadastrarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small.png"))); // NOI18N
        CadastrarCategoria.setText("ADICIONAR");
        CadastrarCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        CadastrarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CadastrarCategoria.setOpaque(true);

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
        RemoverCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Delet_Small.png"))); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CaixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoBuscar)
                            .addComponent(CaixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CaixaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotaoBuscar;
    private javax.swing.JLabel CadastrarCategoria;
    private javax.swing.JTextField CaixaBuscar;
    private javax.swing.JLabel EditarCategoria;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel RemoverCategoria;
    private javax.swing.JLabel TituloGestaoDeUsuario;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecatList;
    // End of variables declaration//GEN-END:variables
}
