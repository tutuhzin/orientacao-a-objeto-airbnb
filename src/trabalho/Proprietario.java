package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Proprietario extends Usuario{
    private List<Imovel> imoveis;

    public Proprietario(String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.imoveis = new ArrayList<>();
    }
    
    public void addImovel(Imovel imovel) {
        this.imoveis.add(imovel);
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }


}
