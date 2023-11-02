package trabalho;

public class Imovel {

  //  private List<Imovel> imoveis;
    private java.lang.String descricao;
    private java.lang.String tipoImovel;
    private int qntQuartos;
    private int qntCamas;
    private int qntBanheiros;

    public Imovel(java.lang.String string, java.lang.String string2, int qntQuartos, int qntCamas, int qntBanheiros) {
        this.descricao = string;
        this.tipoImovel = string2;
        this.qntQuartos = qntQuartos;
        this.qntCamas = qntCamas;
        this.qntBanheiros = qntBanheiros;
      //  this.imoveis = new ArrayList<>();
    }

  
 	@Override
	public java.lang.String toString() {
		return "Imovel [descricao=" + descricao + ", tipoImovel=" + tipoImovel + ", qntQuartos=" + qntQuartos
				+ ", qntCamas=" + qntCamas + ", qntBanheiros=" + qntBanheiros + "]";
	}


	public java.lang.String getDescricao() {
		return descricao;
	}


	public void setDescricao(java.lang.String descricao) {
		this.descricao = descricao;
	}


	public java.lang.String getTipoImovel() {
		return tipoImovel;
	}


	public void setTipoImovel(java.lang.String tipoImovel) {
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


	public void adicionarImovel(Imovel imovel) {
		// TODO Auto-generated method stub
		
	}



 	
}