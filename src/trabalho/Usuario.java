package trabalho;

public class Usuario {
	// Atributos
    protected String nome;
    protected String email;
    protected String telefone;
    
    //Construtor
    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    // toString
    @Override
    public java.lang.String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }
    
}

