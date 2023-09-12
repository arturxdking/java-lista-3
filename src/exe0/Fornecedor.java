package exe0;

public class Fornecedor {
    private int id;
    private String nome, razaoSocial, cnpj;
    private Endereco endereco;
    
    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String razaoSocial, String cnpj, Endereco endereco) {
        this.setId(id);
        this.setNome(nome);
        this.setRazaoSocial(razaoSocial);
        this.setCnpj(cnpj);
        this.setEndereco(endereco);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Fornecedor [id=" + id + ", nome=" + nome + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj
                + ", endereco=" + endereco + "]";
    }    
}
