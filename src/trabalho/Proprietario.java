package trabalho;

public class Proprietario extends Usuario{
    private String listaImoveis [];

    public Proprietario(String nome, String email, String telefone, double nota, String[] listaImoveis) {
        super(nome, email, telefone);
        this.listaImoveis = listaImoveis;
    }

    public String getListaImoveis() {
        return listaImoveis[0];
    }

    public void setListaImoveis(String[] listaImoveis) {
        this.listaImoveis = listaImoveis;
    }
    
}
