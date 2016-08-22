
package Fornecedor.model;


public class Fornecedores {
    
    private String razaosocial;
    private String inscricaoestadual;
    private String cnpj;
    private String telefoneI;
    private String telefoneII;
    private String email;
    private Endereço endereço =new Endereço();
    private String uf;
    private int codigo;

    public String getRazaosocial() {
        return razaosocial;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
     
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefoneI() {
        return telefoneI;
    }

    public void setTelefoneI(String telefone) {
        this.telefoneI= telefoneI;
    }

    public String getTelefoneII() {
        return telefoneII;
    }

    public void setTelefoneII(String telefoneII) {
        this.telefoneII = telefoneII;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public Fornecedores() {
    }
    
    
    
}
