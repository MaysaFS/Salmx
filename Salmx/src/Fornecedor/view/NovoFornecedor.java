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
        if(jTextFieldRazaoSocial.getText().isEmpty() ||jTextFieldInscriçãoEstadual.getText().isEmpty() || jTextFieldCnpj.getText().isEmpty()
                || jTextFieldTelefoneI.getText().isEmpty()||jTextFieldTelefoneII.getText().isEmpty()|| jTextFieldEmail.getText().isEmpty()|| 
                jTextFieldRua.getText().isEmpty()||jTextFieldNumEnd.getText().isEmpty()|| jTextFieldBairro.getText().isEmpty()||jTextFieldCidade.getText().isEmpty()||
                jTextFieldUf.getText().isEmpty()||jTextFieldCep.getText().isEmpty()){
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
       jTextFieldTelefoneI.setText("");
       jTextFieldTelefoneII.setText("");
       jTextFieldComplemento.setText("");
       jTextFieldUf.setText("");
       jTextFieldCep.setText("");
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

    public JTextField getjTextFieldUf() {
        return jTextFieldUf;
    }

    public void setjTextFieldUf(JTextField jTextFieldUf) {
        this.jTextFieldUf = jTextFieldUf;
    }

    public JLabel getjLabelCep() {
        return jLabelCep;
    }

    public void setjLabelCep(JLabel jLabelCep) {
        this.jLabelCep = jLabelCep;
    }

    public JTextField getjTextFieldCep() {
        return jTextFieldCep;
    }

    public void setjTextFieldCep(JTextField jTextFieldCep) {
        this.jTextFieldCep = jTextFieldCep;
    }

    public JLabel getjLabelComplemento() {
        return jLabelComplemento;
    }

    public void setjLabelComplemento(JLabel jLabelComplemento) {
        this.jLabelComplemento = jLabelComplemento;
    }

    public JLabel getjLabelTelefoneI() {
        return jLabelTelefoneI;
    }

    public void setjLabelTelefoneI(JLabel jLabelTelefoneI) {
        this.jLabelTelefoneI = jLabelTelefoneI;
    }

    public JLabel getjLabelTelefoneII() {
        return jLabelTelefoneII;
    }

    public void setjLabelTelefoneII(JLabel jLabelTelefoneII) {
        this.jLabelTelefoneII = jLabelTelefoneII;
    }

    public JTextField getjTextFieldComplemento() {
        return jTextFieldComplemento;
    }

    public void setjTextFieldComplemento(JTextField jTextFieldComplemento) {
        this.jTextFieldComplemento = jTextFieldComplemento;
    }

    public JTextField getjTextFieldTelefoneI() {
        return jTextFieldTelefoneI;
    }

    public void setjTextFieldTelefoneI(JTextField jTextFieldTelefoneI) {
        this.jTextFieldTelefoneI = jTextFieldTelefoneI;
    }

    public JTextField getjTextFieldTelefoneII() {
        return jTextFieldTelefoneII;
    }

    public void setjTextFieldTelefoneII(JTextField jTextFieldTelefoneII) {
        this.jTextFieldTelefoneII = jTextFieldTelefoneII;
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBody = new javax.swing.JPanel();
        jLabelInscriçãoEstadual = new javax.swing.JLabel();
        jLabelSalvarFornecedor = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelNumeroEnd = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldInscriçãoEstadual = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldNumEnd = new javax.swing.JTextField();
        jTextFieldUf = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelUf = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldCnpj = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefoneI = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelTelefoneII = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jTextFieldTelefoneI = new javax.swing.JTextField();
        jTextFieldTelefoneII = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBody.setBackground(new java.awt.Color(242, 242, 242));

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

        jLabelTelefoneI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefoneI.setForeground(new java.awt.Color(255, 102, 102));
        jLabelTelefoneI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTelefoneI.setText("Telefone I");

        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEmail.setText(" ");
        jTextFieldEmail.setToolTipText("");
        jTextFieldEmail.setAutoscrolls(false);
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelComplemento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(255, 102, 102));
        jLabelComplemento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelComplemento.setText("Complemento");

        jLabelTelefoneII.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefoneII.setForeground(new java.awt.Color(255, 102, 102));
        jLabelTelefoneII.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTelefoneII.setText("Telefone II");

        jTextFieldComplemento.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldComplemento.setText(" ");
        jTextFieldComplemento.setToolTipText("");
        jTextFieldComplemento.setAutoscrolls(false);
        jTextFieldComplemento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldComplemento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelCep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCep.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCep.setText("Cep");

        jTextFieldCep.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCep.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCep.setText(" ");
        jTextFieldCep.setToolTipText("");
        jTextFieldCep.setAutoscrolls(false);
        jTextFieldCep.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldTelefoneI.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTelefoneI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTelefoneI.setText(" ");
        jTextFieldTelefoneI.setToolTipText("");
        jTextFieldTelefoneI.setAutoscrolls(false);
        jTextFieldTelefoneI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTelefoneI.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldTelefoneI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneIActionPerformed(evt);
            }
        });

        jTextFieldTelefoneII.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTelefoneII.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTelefoneII.setText(" ");
        jTextFieldTelefoneII.setToolTipText("");
        jTextFieldTelefoneII.setAutoscrolls(false);
        jTextFieldTelefoneII.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTelefoneII.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldTelefoneII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneIIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRua, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCep))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(jLabelTelefoneI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabelNumeroEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabelInscriçãoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1223, 1223, 1223))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                        .addGap(408, 408, 408)
                                        .addComponent(jTextFieldInscriçãoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefoneI, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1203, 1203, 1203))))
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
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefoneI, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefoneI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jLabelNumeroEnd)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelUf)
                    .addComponent(jLabelCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabelSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jTextFieldTelefoneIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneIActionPerformed

    private void jTextFieldTelefoneIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneIIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneIIActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelInscriçãoEstadual;
    private javax.swing.JLabel jLabelNumeroEnd;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSalvarFornecedor;
    private javax.swing.JLabel jLabelTelefoneI;
    private javax.swing.JLabel jLabelTelefoneII;
    private javax.swing.JLabel jLabelUf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldInscriçãoEstadual;
    private javax.swing.JTextField jTextFieldNumEnd;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefoneI;
    private javax.swing.JTextField jTextFieldTelefoneII;
    private javax.swing.JTextField jTextFieldUf;
    // End of variables declaration//GEN-END:variables
}
