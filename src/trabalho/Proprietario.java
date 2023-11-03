package trabalho;

public class Proprietario extends Usuario{
    private Imovel listaImoveis[];
    private int numImoveis;

    public Proprietario(String nome, String email, String telefone, double nota) {
        super(nome, email, telefone);
        listaImoveis = new Imovel[100];
        numImoveis = 0;
    }
   
    
    public void addImovel(Imovel i) {
    	listaImoveis[numImoveis] = i;
    	numImoveis++;
    }
    
    public void preencherDadosAleatoriosImoveis() {
    	
    }
}
