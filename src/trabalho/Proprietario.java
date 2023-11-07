package trabalho;

import java.util.Arrays;
import java.util.Random;

public class Proprietario extends Usuario{
	// Atributos
    private Imovel listaImoveis[];
    private int numImoveis;
    
    //Construtor
    public Proprietario(String nome, String email, String telefone, double nota) {
        super(nome, email, telefone);
        listaImoveis = new Imovel[100];
        numImoveis = 0;
    }
    
    // Getters and setters
    public Imovel[] getListaImoveis() {
        return listaImoveis;
    }

    public void setListaImoveis(Imovel[] listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    public int getNumImoveis() {
        return numImoveis;
    }

    public void setNumImoveis(int numImoveis) {
        this.numImoveis = numImoveis;
    }

    public void addImovel(Imovel i) {
    	listaImoveis[numImoveis] = i;
    	numImoveis++;
    }
    
    // toString
    @Override
    public String toString() {
        return "Proprietario [listaImoveis=" + Arrays.toString(listaImoveis) + ", numImoveis=" + numImoveis + "]";
    }
    
    public void preencherDadosAleatoriosImoveis(int quantidade) {
        Random random = new Random();
        String[] tiposImovel = {"Casa", "Apartamento", "Chácara", "Chalé", "Pousada"};
    
        for (int i = 0; i < quantidade; i++) {
            String descricao = "Imóvel " + i;
            String tipoImovel = tiposImovel[random.nextInt(tiposImovel.length)];
            int qntQuartos = random.nextInt(5) + 1;
            int qntCamas = random.nextInt(5) + 1;
            int qntBanheiros = random.nextInt(3) + 1;
            Imovel novoImovel = new Imovel(descricao, tipoImovel, qntQuartos, qntCamas, qntBanheiros);
            addImovel(novoImovel);
        }
    }
    

}
