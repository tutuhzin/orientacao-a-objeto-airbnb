package trabalho;

public class Imovel {
	
	private Imovel[] imovel;
    public String descricao;
    public String tipoImovel;
    public int qntQuartos;
    public int qntCamas;
    public int qntBanheiros;
    
    public Imovel(String descricao, String tipoImovel, int qntQuartos, int qntCamas, int qntBanheiros) {
        this.descricao = descricao;
        this.tipoImovel = tipoImovel;
        this.qntQuartos = qntQuartos;
        this.qntCamas = qntCamas;
        this.qntBanheiros = qntBanheiros;
    }

    
    
    //para adicionar um imovel
    public void adicionarImovel(Imovel imovel) {
    	this.imovel[this.imovel.length] = imovel;
    }
    
    
    // para removel imovel
    
    public void removerImovel(int indice) {
    	for(int i = indice; i < this.imovel.length - 1; i++) {
    		this.imovel[i] = this.imovel[i+1];
    	}
    	this.imovel[this.imovel.length - 1] = null;
    }
    
    
    
    // código imovel para adicionar e remover;
    
    public int buscarImovel(String descricao, String tipoImovel, int qntQuartos, int qntCamas, int qntBanheiros) {
    	
    // inicializa o índice do imóvel encontrando com -1
    	
    	int indiceImovelEncontrado = -1;
    	
    	for(int i = 0; i < imovel.length; i++) {
    		
    		//verificando se o imovel atual atende aos criterios da busca
    		if (imovel[i].descricao.equals(descricao) && imovel[i].tipoImovel.equals(tipoImovel) && imovel[i].qntQuartos == qntQuartos 
    				&& imovel[i].qntBanheiros == qntBanheiros && imovel[i].qntCamas == qntCamas){
    			
    			indiceImovelEncontrado = i;
    			break;
    					
    				}
    	} // fim do for
    	
    	return indiceImovelEncontrado;
    	
    }
    
    
    
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
 
    
}
