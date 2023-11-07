
package trabalho;

import java.util.Arrays;

public class Hospede extends Usuario {
	// Atributos
    private String listaReserva [];
    private String infoPagamento;
    
    
    
    public Hospede (String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    // Getters and setters
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
    
    // toString
	@Override
	public String toString() {
		return "Hospede [listaReserva=" + Arrays.toString(listaReserva) + ", infoPagamento=" + infoPagamento + "]";
	}

	 public void criarReserva(String reserva) {
	        for(int i = 0; i < listaReserva.length;) {
	        	if(listaReserva[i] == null);
	        	listaReserva[i] = reserva; // armazena a reserva no primeiro array
	        	break;
	        }
	    }

	    public boolean cancelarReserva(){
	        return false;
	    }

    
    
    
    
    
    
}