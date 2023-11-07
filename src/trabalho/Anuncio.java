package trabalho;

public class Anuncio {
	// Atributos
    private String titulo;
    private String descricao;
    private double diaria;
    private String propriedade;
    private int qntReservas;
    private String datasLivres;
    
    // Construtor
    public Anuncio(String titulo, String descricao, double diaria, String propriedade, int qntReservas,
            String datasLivres) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diaria = diaria;
        this.propriedade = propriedade;
        this.qntReservas = qntReservas;
        this.datasLivres = datasLivres;
    }

    // Getters and setters
	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }

    public int getQntReservas() {
        return qntReservas;
    }

    public void setQntReservas(int qntReservas) {
        this.qntReservas = qntReservas;
    }

    public String getDatasLivres() {
        return datasLivres;
    }

    public void setDatasLivres(String datasLivres) {
        this.datasLivres = datasLivres;
    }
    
    // toString
    @Override
    public java.lang.String toString() {
        return "Anuncio [titulo=" + titulo + ", descricao=" + descricao + ", diaria=" + diaria + ", propriedade="
                + propriedade + ", qntReservas=" + qntReservas + ", datasLivres=" + datasLivres + "]";
    }

    public void excluirImovel(){
    	

    }
    

    public java.lang.String exibirReserva(){
    	return "";
   }


}
