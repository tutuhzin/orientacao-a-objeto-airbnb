package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Hospede extends Usuario {
    // Atributos
    private List<Reserva> reservas;
    private String infoPagamento;

    public Hospede(String nome, String email, String telefone, String pagamento) {
        super(nome, email, telefone);
        this.infoPagamento = pagamento;
        this.reservas = new ArrayList<>();
    }

    // Getters and setters
    public String getInfoPagamento() {
        return infoPagamento;
    }

    public void setInfoPagamento(String infoPagamento) {
        this.infoPagamento = infoPagamento;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    // Método para adicionar uma reserva à lista
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // toString
    @Override
    public String toString() {
        return "Nome=" + getNome() + ", Email=" + getEmail() + ", Telefone=" + getTelefone() + ", infoPagamento=" + infoPagamento;
    }

    // Adicione um novo método para converter as reservas em String
    public String reservasToString() {
        if (reservas == null || reservas.isEmpty()) {
            return "Sem reservas.";
        }

        StringBuilder sb = new StringBuilder("Reservas: ");
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                sb.append(reserva.toString()).append(", ");
            }
        }
        return sb.toString();
    }
}
