package trabalho;

public class Hospede extends Usuario {
    private String listaReserva [];
    private String infoPagamento;
    
    public Hospede(String nome, String email, String telefone, double nota, String[] listaReserva,
            String infoPagamento) {
        super(nome, email, telefone);
        this.listaReserva = listaReserva;
        this.infoPagamento = infoPagamento;
    }

    public String[] getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(String[] listaReserva) {
        this.listaReserva = listaReserva;
    }

    public String getInfoPagamento() {
        return infoPagamento;
    }

    public void setInfoPagamento(String infoPagamento) {
        this.infoPagamento = infoPagamento;
    }

    public void criarReserva(){

    }

    public boolean cancelarReserva(){
        return false;
    }
    
}
