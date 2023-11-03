package trabalho;

public class Reserva {
    private String dataInicio;
    private String dataFim;
    private int qntHospedes;
    private double custo;
    
    public Reserva(String dataInicio, String dataFim, int qntHospedes, double custo) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.qntHospedes = qntHospedes;
        this.custo = custo;
    }


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

    @Override
    public java.lang.String toString() {
        return "Reserva [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", qntHospedes=" + qntHospedes
                + ", custo=" + custo + "]";
    }

    
}
