/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fornecedor.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class NovoFornecedor extends javax.swing.JDialog {

    /**
     * Creates new form AddFornecedor
     */
    public NovoFornecedor(java.awt.Frame parent, boolean modal) {
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
        if(jTextFieldRazaoSocial.getText().isEmpty() ||jTextFieldInscriçãoEstadual.getText().isEmpty() || jTextFieldCnpj.getText().isEmpty()|| jTextFieldTelefone1.getText().isEmpty()
                || jTextFieldTelefone2.getText().isEmpty()|| jTextFieldEmail.getText().isEmpty()|| jTextFieldRua.getText().isEmpty()||jTextFieldNumEnd.getText().isEmpty()||
                jTextFieldBairro.getText().isEmpty()||jTextFieldCidade.getText().isEmpty()||jTextFieldUf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos  os campos.");
            return false;
        } else{
            return true;
        }
    }
    
    public void limpaTela(){
       jTextFieldRazaoSocial.setText("");
       jTextFieldBairro.setText("");
       jTextFieldCidade.setText("");
       jTextFieldCnpj.setText("");
       jTextFieldEmail.setText("");
       jTextFieldInscriçãoEstadual.setText("");
       jTextFieldNumEnd.setText("");
       jTextFieldRua.setText("");
       jTextFieldTelefone1.setText("");
       jTextFieldTelefone2.setText("");
       jTextFieldUf.setText("");
    }

    public JLabel getjLabelCancelarAddFornecedor() {
        return jLabelCancelarAddFornecedor;
    }

    public void setjLabelCancelarAddFornecedor(JLabel jLabelCancelarAddFornecedor) {
        this.jLabelCancelarAddFornecedor = jLabelCancelarAddFornecedor;
    }

    public JLabel getjLabelSalvarFornecedor() {
        return jLabelSalvarFornecedor;
    }

    public void setjLabelSalvarFornecedor(JLabel jLabelSalvarFornecedor) {
        this.jLabelSalvarFornecedor = jLabelSalvarFornecedor;
    }

    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public void setjTextFieldBairro(JTextField jTextFieldBairro) {
        this.jTextFieldBairro = jTextFieldBairro;
    }

    public JTextField getjTextFieldCidade() {
        return jTextFieldCidade;
    }

    public void setjTextFieldCidade(JTextField jTextFieldCidade) {
        this.jTextFieldCidade = jTextFieldCidade;
    }

    public JTextField getjTextFieldCnpj() {
        return jTextFieldCnpj;
    }

    public void setjTextFieldCnpj(JTextField jTextFieldCnpj) {
        this.jTextFieldCnpj = jTextFieldCnpj;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldInscriçãoEstadual() {
        return jTextFieldInscriçãoEstadual;
    }

    public void setjTextFieldInscriçãoEstadual(JTextField jTextFieldInscriçãoEstadual) {
        this.jTextFieldInscriçãoEstadual = jTextFieldInscriçãoEstadual;
    }

    public JTextField getjTextFieldNumEnd() {
        return jTextFieldNumEnd;
    }

    public void setjTextFieldNumEnd(JTextField jTextFieldNumEnd) {
        this.jTextFieldNumEnd = jTextFieldNumEnd;
    }

    public JTextField getjTextFieldRazaoSocial() {
        return jTextFieldRazaoSocial;
    }

    public void setjTextFieldRazaoSocial(JTextField jTextFieldRazaoSocial) {
        this.jTextFieldRazaoSocial = jTextFieldRazaoSocial;
    }

    public JTextField getjTextFieldRua() {
        return jTextFieldRua;
    }

    public void setjTextFieldRua(JTextField jTextFieldRua) {
        this.jTextFieldRua = jTextFieldRua;
    }

    public JTextField getjTextFieldTelefone1() {
        return jTextFieldTelefone1;
    }

    public void setjTextFieldTelefone1(JTextField jTextFieldTelefone1) {
        this.jTextFieldTelefone1 = jTextFieldTelefone1;
    }

    public JTextField getjTextFieldTelefone2() {
        return jTextFieldTelefone2;
    }

    public void setjTextFieldTelefone2(JTextField jTextFieldTelefone2) {
        this.jTextFieldTelefone2 = jTextFieldTelefone2;
    }

    public JTextField getjTextFieldUf() {
        return jTextFieldUf;
    }

    public void setjTextFieldUf(JTextField jTextFieldUf) {
        this.jTextFieldUf = jTextFieldUf;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBody = new javax.swing.JPanel();
        jLabelTelefone1 = new javax.swing.JLabel();
        jLabelInscriçãoEstadual = new javax.swing.JLabel();
        jLabelSalvarFornecedor = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelNumeroEnd = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldInscriçãoEstadual = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldTelefone1 = new javax.swing.JTextField();
        jTextFieldNumEnd = new javax.swing.JTextField();
        jTextFieldUf = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelUf = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldCnpj = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldTelefone2 = new javax.swing.JTextField();
        jLabelTelefone2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jComboBoxStatusForn = new javax.swing.JComboBox();
        jLabelCancelarAddFornecedor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBody.setBackground(new java.awt.Color(242, 242, 242));

        jLabelTelefone1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefone1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelTelefone1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTelefone1.setText("Telefone 1");

        jLabelInscriçãoEstadual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelInscriçãoEstadual.setForeground(new java.awt.Color(255, 102, 102));
        jLabelInscriçãoEstadual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInscriçãoEstadual.setText("Inscrição Estadual");

        jLabelSalvarFornecedor.setBackground(new java.awt.Color(255, 102, 102));
        jLabelSalvarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSalvarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalvarFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalvarFornecedor.setText("SALVAR");
        jLabelSalvarFornecedor.setOpaque(true);

        jLabelCnpj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCnpj.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCnpj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCnpj.setText("CNPJ");

        jLabelRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRua.setForeground(new java.awt.Color(255, 102, 102));
        jLabelRua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRua.setText("Rua");

        jTextFieldRazaoSocial.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRazaoSocial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRazaoSocial.setText(" ");
        jTextFieldRazaoSocial.setToolTipText("");
        jTextFieldRazaoSocial.setAutoscrolls(false);
        jTextFieldRazaoSocial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldRazaoSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelNumeroEnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNumeroEnd.setForeground(new java.awt.Color(255, 102, 102));
        jLabelNumeroEnd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumeroEnd.setText("Numero");

        jLabelBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 102, 102));
        jLabelBairro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelBairro.setText("Bairro");

        jTextFieldInscriçãoEstadual.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldInscriçãoEstadual.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldInscriçãoEstadual.setText(" ");
        jTextFieldInscriçãoEstadual.setToolTipText("");
        jTextFieldInscriçãoEstadual.setAutoscrolls(false);
        jTextFieldInscriçãoEstadual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldInscriçãoEstadual.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldRua.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRua.setText(" ");
        jTextFieldRua.setToolTipText("");
        jTextFieldRua.setAutoscrolls(false);
        jTextFieldRua.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldRua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldTelefone1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTelefone1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTelefone1.setText(" ");
        jTextFieldTelefone1.setToolTipText("");
        jTextFieldTelefone1.setAutoscrolls(false);
        jTextFieldTelefone1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTelefone1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldNumEnd.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNumEnd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNumEnd.setText(" ");
        jTextFieldNumEnd.setToolTipText("");
        jTextFieldNumEnd.setAutoscrolls(false);
        jTextFieldNumEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldNumEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldUf.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUf.setText(" ");
        jTextFieldUf.setToolTipText("");
        jTextFieldUf.setAutoscrolls(false);
        jTextFieldUf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUfActionPerformed(evt);
            }
        });

        jLabelCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCidade.setText("Cidade");

        jTextFieldBairro.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldBairro.setText(" ");
        jTextFieldBairro.setToolTipText("");
        jTextFieldBairro.setAutoscrolls(false);
        jTextFieldBairro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelUf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUf.setForeground(new java.awt.Color(255, 102, 102));
        jLabelUf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUf.setText("UF");

        jTextFieldCidade.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCidade.setText(" ");
        jTextFieldCidade.setToolTipText("");
        jTextFieldCidade.setAutoscrolls(false);
        jTextFieldCidade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelRazaoSocial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRazaoSocial.setForeground(new java.awt.Color(255, 102, 102));
        jLabelRazaoSocial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRazaoSocial.setText("Razão Social");

        jTextFieldCnpj.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCnpj.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCnpj.setText(" ");
        jTextFieldCnpj.setToolTipText("");
        jTextFieldCnpj.setAutoscrolls(false);
        jTextFieldCnpj.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCnpj.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 102, 102));
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEmail.setText("Email");

        jTextFieldTelefone2.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTelefone2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTelefone2.setText(" ");
        jTextFieldTelefone2.setToolTipText("");
        jTextFieldTelefone2.setAutoscrolls(false);
        jTextFieldTelefone2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTelefone2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelTelefone2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefone2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelTelefone2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTelefone2.setText("Telefone 2");

        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEmail.setText(" ");
        jTextFieldEmail.setToolTipText("");
        jTextFieldEmail.setAutoscrolls(false);
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 102, 102));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelStatus.setText("Status");

        jComboBoxStatusForn.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jComboBoxStatusForn.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxStatusForn.setBorder(null);

        jLabelCancelarAddFornecedor.setBackground(new java.awt.Color(255, 102, 102));
        jLabelCancelarAddFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCancelarAddFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCancelarAddFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelarAddFornecedor.setText("CANCELAR");
        jLabelCancelarAddFornecedor.setOpaque(true);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jTextFieldCnpj))
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTextFieldInscriçãoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInscriçãoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1165, 1165, 1165))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRua, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStatusForn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCancelarAddFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelNumeroEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabelUf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelTelefone2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                            .addComponent(jTextFieldTelefone2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTextFieldEmail))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jLabelCnpj)
                    .addComponent(jLabelInscriçãoEstadual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInscriçãoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jLabelNumeroEnd)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelUf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxStatusForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCancelarAddFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogoPequeno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUfActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxStatusForn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCancelarAddFornecedor;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelInscriçãoEstadual;
    private javax.swing.JLabel jLabelNumeroEnd;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSalvarFornecedor;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JLabel jLabelUf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldInscriçãoEstadual;
    private javax.swing.JTextField jTextFieldNumEnd;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone1;
    private javax.swing.JTextField jTextFieldTelefone2;
    private javax.swing.JTextField jTextFieldUf;
    // End of variables declaration//GEN-END:variables
}
