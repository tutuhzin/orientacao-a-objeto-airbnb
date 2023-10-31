package dados;

import trabalho.*;

public class Dados {
	private Imovel[] imovel;
	private int nImovel = 0;
	private Hospede[] hospede;
	private int nhospede = 0;
	private Usuario[] usuario;
	private int nUsuario = 0;
	private Anuncio[] anuncio;
	private int nAnuncio = 0;
	private Proprietario[] proprietario;
	private int nproprietario =0; 
	
	
	
	
	public Dados() {
		usuario = new Usuario[100]; // 100 usuario, 50 poderá ser hospode ou 50 proprietário;
		proprietario = new Proprietario[100];
		imovel = new Imovel[50]; // o proprietário poderá anunciar 2 imoveis;
		anuncio = new Anuncio[50]; // 50 anuncio exclusivo apenas para proprietário. (Onde o proprietario vai anunciar sua casa, ap, etc;
		hospede = new Hospede[50]; 
		
	}


}
