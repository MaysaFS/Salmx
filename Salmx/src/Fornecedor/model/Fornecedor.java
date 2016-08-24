
package Fornecedor.model;


public class Fornecedor {
    
    private String razaosocial;
    private String inscricaoestadual;
    private String cnpj;
    private String telefone1;
    private String telefoneII;
    private String email;
    private Endereco endereço =new Endereco();
    private String uf;
    private int codigo;

    public String getRazaosocial() {
        return razaosocial;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
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

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone) {
        this.telefone1= telefone;
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
    
    

    public Fornecedor() {
    }
    
    
    
}
