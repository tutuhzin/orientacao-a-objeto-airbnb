package Main;

import dados.Dados;
import trabalho.*;

public class Main {
    public static void main(String[] args) {
        Dados d = new Dados();
        
        d.preencherDados();

        Imovel novoImovel = new Imovel("Casa em Brasilia", "Brasilia", 2, 1, 3);
        d.adicionarImovel(novoImovel);

        Imovel imovelParaBusca = new Imovel("Casa em Brasilia", "Brasilia", 2, 1, 3);

        int indiceEncontrado = d.buscarImovel(imovelParaBusca);

        if (indiceEncontrado != -1) {
            System.out.println("Imovel encontrado no indice " + indiceEncontrado);
        } else {
            System.out.println("Imovel nao encontrado.");
        }
        
        
        Imovel imovelParaRemover = new Imovel("Casa em Brasilia", "Brasilia", 2, 1, 3);
        d.removerImovel(imovelParaRemover);
        
        
        
        // código da reserva
        Reserva r = new Reserva("02/11/2023", "10/11/2023", 5, 500.0);
        
        String dataInicio = r.getDataInicio();
        String dataFim = r.getDataFim();
        int qtdHospede = r.getQntHospedes();
        double custo = r.getCusto();
        
        System.out.println("Data de inicio:"  + r.getDataInicio());
        System.out.println("Data do fim: " + r.getDataFim());
        System.out.println("Quantidade de Hospede: " + r.getQntHospedes());
        System.out.println("Custo: " + r.getCusto());
        
        
        
        
    }
    
}