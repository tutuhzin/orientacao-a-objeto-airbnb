package trabalho;

public class Imovel {
	// Atributos
    private String descricao;
    private String tipoImovel;
    private int qntQuartos;
    private int qntCamas;
    private int qntBanheiros;
    
    // Construtor
    public Imovel(String descricao, String tipoImovel, int qntQuartos, int qntCamas, int qntBanheiros) {
        this.descricao = descricao;
        this.tipoImovel = tipoImovel;
        this.qntQuartos = qntQuartos;
        this.qntCamas = qntCamas;
        this.qntBanheiros = qntBanheiros;
    }

    // Getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public int getQntQuartos() {
        return qntQuartos;
    }

    public void setQntQuartos(int qntQuartos) {
        this.qntQuartos = qntQuartos;
    }

    public int getQntCamas() {
        return qntCamas;
    }

    public void setQntCamas(int qntCamas) {
        this.qntCamas = qntCamas;
    }

    public int getQntBanheiros() {
        return qntBanheiros;
    }

    public void setQntBanheiros(int qntBanheiros) {
        this.qntBanheiros = qntBanheiros;
    }
    
    // toString
    @Override
    public String toString() {
        return "Imovel [descricao=" + descricao + ", tipoImovel=" + tipoImovel + ", qntQuartos=" + qntQuartos
                + ", qntCamas=" + qntCamas + ", qntBanheiros=" + qntBanheiros + "]";
    }
}

