package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	// Atributos
    private Hospede hospede;
    private Imovel imovel;
    private String dataInicio;
    private String dataFim;
    private int qntHospedes;
    private double custo;

    // Lista de reservas
    private static List<Reserva> listaReservas = new ArrayList<>();
    
    // Construtor
    public Reserva(Hospede hospede, Imovel imovel, String dataInicio, String dataFim, int qntHospedes, double custo) {
        this.hospede = hospede;
        this.imovel = imovel;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.qntHospedes = qntHospedes;
        this.custo = custo;

        listaReservas.add(this);
    }

    public static void adicionarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }


    // Getters and setters
	public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getQntHospedes() {
        return qntHospedes;
    }

    public void setQntHospedes(int qntHospedes) {
        this.qntHospedes = qntHospedes;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public static List<Reserva> getListaReservas() {
        return listaReservas;
    }    

    // toString
    @Override
    public String toString() {
        return "Reserva [hospede=" + hospede + ", imovel=" + imovel + ", dataInicio=" + dataInicio + ", dataFim="
                + dataFim + ", qntHospedes=" + qntHospedes + ", custo=" + custo + "]";
    }

}
