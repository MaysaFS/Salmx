/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fornecedor.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NovoFornecedor extends javax.swing.JDialog {

    
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
                || jTextFieldTelefone1.getText().isEmpty()||jTextFieldTelefoneII.getText().isEmpty()|| jTextFieldEmail.getText().isEmpty()|| 
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
       jTextFieldTelefone1.setText("");
       jTextFieldTelefoneII.setText("");
       jTextFieldComplemento.setText("");
       jTextFieldUf.setText("");
       jTextFieldCep.setText("");
    }
    public void habilitaCampos(){
          getjTextFieldRazaoSocial().enable();
          getjTextFieldInscriçãoEstadual().enable();
          getjTextFieldCnpj().enable();
          getjTextFieldTelefone1().enable();
          getjTextFieldTelefoneII().enable();
          getjTextFieldEmail().enable();
          getjTextFieldRua().enable();
          getjTextFieldNumEnd().enable();
          getjTextFieldBairro().enable();
          getjTextFieldComplemento().enable();
          getjTextFieldCidade().enable();
          getjTextFieldCep().enable();
          getjTextFieldUf().enable();
   }
    public void desabilitaCampos(){
       getjTextFieldRazaoSocial().enable(false);
       getjTextFieldInscriçãoEstadual().enable(false);
       getjTextFieldCnpj().enable(false);
       getjTextFieldTelefone1().enable(false);
       getjTextFieldTelefoneII().enable(false);
       getjTextFieldEmail().enable(false);
       getjTextFieldRua().enable(false);
       getjTextFieldNumEnd().enable(false);
       getjTextFieldBairro().enable(false);
       getjTextFieldComplemento().enable(false);
       getjTextFieldCidade().enable(false);
       getjTextFieldCep().enable(false);
       getjTextFieldUf().enable(false);
    }
    public void abilitaBotConfirmExc(){
            getjLabelSalvarFornecedor().setVisible(false);       
            getjLabelExcluirFornecedor().setVisible(true); 
    }
    public void mudaEstadoBotton(){
     getjLabelSalvarFornecedor().setVisible(true);       
     getjLabelExcluirFornecedor().setVisible(false);
 }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabelBairro() {
        return jLabelBairro;
    }

    public void setjLabelBairro(JLabel jLabelBairro) {
        this.jLabelBairro = jLabelBairro;
    }

    public JLabel getjLabelCep() {
        return jLabelCep;
    }

    public void setjLabelCep(JLabel jLabelCep) {
        this.jLabelCep = jLabelCep;
    }

    public JLabel getjLabelCidade() {
        return jLabelCidade;
    }

    public void setjLabelCidade(JLabel jLabelCidade) {
        this.jLabelCidade = jLabelCidade;
    }

    public JLabel getjLabelCnpj() {
        return jLabelCnpj;
    }

    public void setjLabelCnpj(JLabel jLabelCnpj) {
        this.jLabelCnpj = jLabelCnpj;
    }

    public JLabel getjLabelComplemento() {
        return jLabelComplemento;
    }

    public void setjLabelComplemento(JLabel jLabelComplemento) {
        this.jLabelComplemento = jLabelComplemento;
    }

    public JLabel getjLabelEmail() {
        return jLabelEmail;
    }

    public void setjLabelEmail(JLabel jLabelEmail) {
        this.jLabelEmail = jLabelEmail;
    }

    public JLabel getjLabelExcluirFornecedor() {
        return jLabelExcluirFornecedor;
    }

    public void setjLabelExcluirFornecedor(JLabel jLabelExcluirFornecedor) {
        this.jLabelExcluirFornecedor = jLabelExcluirFornecedor;
    }

    public JLabel getjLabelInscriçãoEstadual() {
        return jLabelInscriçãoEstadual;
    }

    public void setjLabelInscriçãoEstadual(JLabel jLabelInscriçãoEstadual) {
        this.jLabelInscriçãoEstadual = jLabelInscriçãoEstadual;
    }

    public JLabel getjLabelNumeroEnd() {
        return jLabelNumeroEnd;
    }

    public void setjLabelNumeroEnd(JLabel jLabelNumeroEnd) {
        this.jLabelNumeroEnd = jLabelNumeroEnd;
    }

    public JLabel getjLabelRazaoSocial() {
        return jLabelRazaoSocial;
    }

    public void setjLabelRazaoSocial(JLabel jLabelRazaoSocial) {
        this.jLabelRazaoSocial = jLabelRazaoSocial;
    }

    public JLabel getjLabelRua() {
        return jLabelRua;
    }

    public void setjLabelRua(JLabel jLabelRua) {
        this.jLabelRua = jLabelRua;
    }

    public JLabel getjLabelSalvarFornecedor() {
        return jLabelSalvarFornecedor;
    }

    public void setjLabelSalvarFornecedor(JLabel jLabelSalvarFornecedor) {
        this.jLabelSalvarFornecedor = jLabelSalvarFornecedor;
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

    public JLabel getjLabelUf() {
        return jLabelUf;
    }

    public void setjLabelUf(JLabel jLabelUf) {
        this.jLabelUf = jLabelUf;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanelTop() {
        return jPanelTop;
    }

    public void setjPanelTop(JPanel jPanelTop) {
        this.jPanelTop = jPanelTop;
    }

    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public void setjTextFieldBairro(JTextField jTextFieldBairro) {
        this.jTextFieldBairro = jTextFieldBairro;
    }

    public JTextField getjTextFieldCep() {
        return jTextFieldCep;
    }

    public void setjTextFieldCep(JTextField jTextFieldCep) {
        this.jTextFieldCep = jTextFieldCep;
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

    public JTextField getjTextFieldComplemento() {
        return jTextFieldComplemento;
    }

    public void setjTextFieldComplemento(JTextField jTextFieldComplemento) {
        this.jTextFieldComplemento = jTextFieldComplemento;
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

    public JTextField getjTextFieldTelefoneII() {
        return jTextFieldTelefoneII;
    }

    public void setjTextFieldTelefoneII(JTextField jTextFieldTelefoneII) {
        this.jTextFieldTelefoneII = jTextFieldTelefoneII;
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

        jPanel1 = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelCnpj = new javax.swing.JLabel();
        jTextFieldCnpj = new javax.swing.JTextField();
        jLabelInscriçãoEstadual = new javax.swing.JLabel();
        jTextFieldInscriçãoEstadual = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTelefoneI = new javax.swing.JLabel();
        jTextFieldTelefone1 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tel = new javax.swing.text.MaskFormatter("(##) #####-####");

            jTextFieldTelefone1 = new javax.swing.JFormattedTextField(tel);
        }catch(Exception e){
        }
        jLabelTelefoneII = new javax.swing.JLabel();
        jTextFieldTelefoneII = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tel = new javax.swing.text.MaskFormatter("(##) #####-####");

            jTextFieldTelefoneII = new javax.swing.JFormattedTextField(tel);
        }catch(Exception e){
        }
        jLabelRua = new javax.swing.JLabel();
        jLabelNumeroEnd = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldNumEnd = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldUf = new javax.swing.JTextField();
        jLabelUf = new javax.swing.JLabel();
        jLabelSalvarFornecedor = new javax.swing.JLabel();
        jLabelExcluirFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelTop.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalmxLogoPequeno.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jLabelRazaoSocial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRazaoSocial.setForeground(new java.awt.Color(255, 102, 102));
        jLabelRazaoSocial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRazaoSocial.setText("Razão Social");

        jTextFieldRazaoSocial.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRazaoSocial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRazaoSocial.setText(" ");
        jTextFieldRazaoSocial.setToolTipText("");
        jTextFieldRazaoSocial.setAutoscrolls(false);
        jTextFieldRazaoSocial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldRazaoSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCnpj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCnpj.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCnpj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCnpj.setText("CNPJ");

        jTextFieldCnpj.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCnpj.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCnpj.setToolTipText("");
        jTextFieldCnpj.setAutoscrolls(false);
        jTextFieldCnpj.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCnpj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCnpjActionPerformed(evt);
            }
        });

        jLabelInscriçãoEstadual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelInscriçãoEstadual.setForeground(new java.awt.Color(255, 102, 102));
        jLabelInscriçãoEstadual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInscriçãoEstadual.setText("Inscrição Estadual");

        jTextFieldInscriçãoEstadual.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldInscriçãoEstadual.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldInscriçãoEstadual.setText(" ");
        jTextFieldInscriçãoEstadual.setToolTipText("");
        jTextFieldInscriçãoEstadual.setAutoscrolls(false);
        jTextFieldInscriçãoEstadual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldInscriçãoEstadual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 102, 102));
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEmail.setText("Email");

        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEmail.setText(" ");
        jTextFieldEmail.setToolTipText("");
        jTextFieldEmail.setAutoscrolls(false);
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTelefoneI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefoneI.setForeground(new java.awt.Color(255, 102, 102));
        jLabelTelefoneI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTelefoneI.setText("Telefone I");

        jTextFieldTelefone1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTelefone1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTelefone1.setText(" ");
        jTextFieldTelefone1.setToolTipText("");
        jTextFieldTelefone1.setAutoscrolls(false);
        jTextFieldTelefone1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTelefone1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefone1ActionPerformed(evt);
            }
        });

        jLabelTelefoneII.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefoneII.setForeground(new java.awt.Color(255, 102, 102));
        jLabelTelefoneII.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTelefoneII.setText("Telefone II");

        jTextFieldTelefoneII.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTelefoneII.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTelefoneII.setText(" ");
        jTextFieldTelefoneII.setToolTipText("");
        jTextFieldTelefoneII.setAutoscrolls(false);
        jTextFieldTelefoneII.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTelefoneII.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldTelefoneII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneIIActionPerformed(evt);
            }
        });

        jLabelRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRua.setForeground(new java.awt.Color(255, 102, 102));
        jLabelRua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRua.setText("Rua");

        jLabelNumeroEnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNumeroEnd.setForeground(new java.awt.Color(255, 102, 102));
        jLabelNumeroEnd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumeroEnd.setText("Numero");

        jTextFieldRua.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRua.setText(" ");
        jTextFieldRua.setToolTipText("");
        jTextFieldRua.setAutoscrolls(false);
        jTextFieldRua.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldRua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldNumEnd.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNumEnd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNumEnd.setText(" ");
        jTextFieldNumEnd.setToolTipText("");
        jTextFieldNumEnd.setAutoscrolls(false);
        jTextFieldNumEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldNumEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldNumEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumEndActionPerformed(evt);
            }
        });

        jLabelBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 102, 102));
        jLabelBairro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelBairro.setText("Bairro");

        jTextFieldBairro.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldBairro.setText(" ");
        jTextFieldBairro.setToolTipText("");
        jTextFieldBairro.setAutoscrolls(false);
        jTextFieldBairro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelComplemento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(255, 102, 102));
        jLabelComplemento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelComplemento.setText("Complemento");

        jTextFieldComplemento.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldComplemento.setText(" ");
        jTextFieldComplemento.setToolTipText("");
        jTextFieldComplemento.setAutoscrolls(false);
        jTextFieldComplemento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldComplemento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplementoActionPerformed(evt);
            }
        });

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
        jTextFieldCep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCidade.setText("Cidade");

        jTextFieldCidade.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCidade.setText(" ");
        jTextFieldCidade.setToolTipText("");
        jTextFieldCidade.setAutoscrolls(false);
        jTextFieldCidade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldUf.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUf.setText(" ");
        jTextFieldUf.setToolTipText("");
        jTextFieldUf.setAutoscrolls(false);
        jTextFieldUf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUfActionPerformed(evt);
            }
        });

        jLabelUf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUf.setForeground(new java.awt.Color(255, 102, 102));
        jLabelUf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUf.setText("UF");

        jLabelSalvarFornecedor.setBackground(new java.awt.Color(255, 102, 102));
        jLabelSalvarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSalvarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalvarFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalvarFornecedor.setText("SALVAR");
        jLabelSalvarFornecedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabelSalvarFornecedor.setOpaque(true);

        jLabelExcluirFornecedor.setBackground(new java.awt.Color(255, 102, 102));
        jLabelExcluirFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelExcluirFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExcluirFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExcluirFornecedor.setText("CONFIRMAR EXCLUSÃO");
        jLabelExcluirFornecedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabelExcluirFornecedor.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTelefoneI, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jTextFieldTelefone1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefoneII))
                    .addComponent(jLabelExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldRazaoSocial)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCnpj)
                            .addComponent(jLabelCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelInscriçãoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldInscriçãoEstadual))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelRua, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNumeroEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRua)
                            .addComponent(jLabelNumeroEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCnpj)
                            .addComponent(jLabelInscriçãoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInscriçãoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefoneI, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefoneII, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, Short.MAX_VALUE)
                .addGap(6, 6, 6))
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

    private void jTextFieldCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCnpjActionPerformed

    private void jTextFieldTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefone1ActionPerformed

    private void jTextFieldTelefoneIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneIIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneIIActionPerformed

    private void jTextFieldNumEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumEndActionPerformed

    private void jTextFieldUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUfActionPerformed

    private void jTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComplementoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelExcluirFornecedor;
    private javax.swing.JLabel jLabelInscriçãoEstadual;
    private javax.swing.JLabel jLabelNumeroEnd;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSalvarFornecedor;
    private javax.swing.JLabel jLabelTelefoneI;
    private javax.swing.JLabel jLabelTelefoneII;
    private javax.swing.JLabel jLabelUf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTop;
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
    private javax.swing.JTextField jTextFieldTelefone1;
    private javax.swing.JTextField jTextFieldTelefoneII;
    private javax.swing.JTextField jTextFieldUf;
    // End of variables declaration//GEN-END:variables
}
