package Main;

import dados.Dados;
import trabalho.*;

public class Main {
    public static void main(String[] args) {
        Dados d = new Dados();

        System.out.println(d.getnImoveis());
        
        // código da reserva
        Reserva r = new Reserva("02/11/2023", "10/11/2023", 5, 500.0);
        System.out.println (r.toString());
    }
}
  