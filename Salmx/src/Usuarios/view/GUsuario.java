/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jimmy
 */
public class GUsuario extends javax.swing.JPanel {

    /**
     * Creates new form GUsuario
     */
    public GUsuario() {
        initComponents();
    }

    public JTable getjTableUsersList() {
        return jTableUsersList;
    }

    public void setjTableUsersList(JTable jTableUsersList) {
        this.jTableUsersList = jTableUsersList;
    }
    
    public JTextField getCaixaBuscar() {
        return CaixaBuscar;
    }

    public void setCaixaBuscar(JTextField CaixaBuscar) {
        this.CaixaBuscar = CaixaBuscar;
    }

    public JLabel getEditarUsuario() {
        return editarUsuario;
    }

    public void setEditarUsuario(JLabel EditarUsuario) {
        this.editarUsuario = EditarUsuario;
    }

    public JLabel getExcluirUsuario() {
        return excluirUsuario;
    }

    public void setExcluirUsuario(JLabel ExcluirUsuario) {
        this.excluirUsuario = ExcluirUsuario;
    }

    public JLabel getNovoUsuario() {
        return novoUsuario;
    }

    public void setNovoUsuario(JLabel NovoUsuario) {
        this.novoUsuario = NovoUsuario;
    }

    public JLabel getPesquisarUsuario() {
        return PesquisarUsuario;
    }

    public void setPesquisarUsuario(JLabel PesquisarUsuario) {
        this.PesquisarUsuario = PesquisarUsuario;
    }

    public JLabel getVoltar() {
        return voltar;
    }

    public void setVoltar(JLabel voltar) {
        this.voltar = voltar;
    }
    public int itemSelecionado(){
        if(jTableUsersList.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Selecione um item");
        } 
        return jTableUsersList.getSelectedRow();
    }

    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        TituloGestaoDeUsuario = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsersList = new javax.swing.JTable();
        CaixaBuscar = new javax.swing.JTextField();
        PesquisarUsuario = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        novoUsuario = new javax.swing.JLabel();
        editarUsuario = new javax.swing.JLabel();
        excluirUsuario = new javax.swing.JLabel();

        Background.setBackground(new java.awt.Color(242, 242, 242));

        Top.setBackground(new java.awt.Color(255, 102, 102));

        TituloGestaoDeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloGestaoDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TituloGestaoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloGestaoDeUsuario.setText("GESTÃO DE USUÁRIO");

        voltar.setBackground(new java.awt.Color(255, 0, 0));
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Voltar.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addComponent(voltar)
                .addGap(88, 88, 88)
                .addComponent(TituloGestaoDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloGestaoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jTableUsersList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableUsersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsersList.setGridColor(new java.awt.Color(153, 153, 153));
        jTableUsersList.setName("Usuarios Cadastrados"); // NOI18N
        jTableUsersList.setRowMargin(0);
        jTableUsersList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTableUsersList);
        if (jTableUsersList.getColumnModel().getColumnCount() > 0) {
            jTableUsersList.getColumnModel().getColumn(0).setMinWidth(60);
            jTableUsersList.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTableUsersList.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        CaixaBuscar.setForeground(new java.awt.Color(153, 153, 153));
        CaixaBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CaixaBuscar.setToolTipText("");
        CaixaBuscar.setAutoscrolls(false);
        CaixaBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CaixaBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CaixaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaBuscarActionPerformed(evt);
            }
        });

        PesquisarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        PesquisarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        PesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Search_Small.png"))); // NOI18N
        PesquisarUsuario.setText("BUSCAR");
        PesquisarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        PesquisarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Menu.setBackground(new java.awt.Color(51, 51, 51));

        novoUsuario.setBackground(new java.awt.Color(63, 63, 63));
        novoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        novoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_New_Small.png"))); // NOI18N
        novoUsuario.setText("ADICIONAR");
        novoUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        novoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novoUsuario.setOpaque(true);
        novoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoUsuarioMouseClicked(evt);
            }
        });

        editarUsuario.setBackground(new java.awt.Color(63, 63, 63));
        editarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Edit_Small.png"))); // NOI18N
        editarUsuario.setText("EDITAR");
        editarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        editarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editarUsuario.setOpaque(true);
        editarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarUsuarioMouseClicked(evt);
            }
        });

        excluirUsuario.setBackground(new java.awt.Color(63, 63, 63));
        excluirUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        excluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Delet_Small.png"))); // NOI18N
        excluirUsuario.setText("EXCLUIR ");
        excluirUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        excluirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excluirUsuario.setOpaque(true);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addComponent(editarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(excluirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(novoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(editarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(excluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CaixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PesquisarUsuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(238, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        PesquisarUsuario.getAccessibleContext().setAccessibleDescription("Buscar por Login ou Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void CaixaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaBuscarActionPerformed

    private void novoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoUsuarioMouseClicked
      
    }//GEN-LAST:event_novoUsuarioMouseClicked

    private void editarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarUsuarioMouseClicked
 
    }//GEN-LAST:event_editarUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField CaixaBuscar;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel PesquisarUsuario;
    private javax.swing.JLabel TituloGestaoDeUsuario;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel editarUsuario;
    private javax.swing.JLabel excluirUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsersList;
    private javax.swing.JLabel novoUsuario;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
