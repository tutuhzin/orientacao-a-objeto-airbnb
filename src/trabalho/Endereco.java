package trabalho;

public class Endereco {
	// Atributos
    private String pais;
    private String cidade;
    private String estado;
    private String cep;
    
    // Construtor
    public Endereco(String pais, String cidade, String estado, String cep) {
        this.pais = pais;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    //Getters and setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco [pais=" + pais + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
    }
    
}