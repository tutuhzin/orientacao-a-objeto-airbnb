package dados;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import trabalho.*;

public class Dados {
    // Atributos
    private Imovel[] imoveis;
    private Proprietario [] proprietarios;
    private Hospede[] hospedes;
    private String[] nomes;
    private String[] sobrenomes;
    private String[] tiposImovel;
    private int nImoveis = 0;
    private int nProprietarios=0;
    private int nHospede=0;

    // Construtor
    public Dados() {
        imoveis = new Imovel[100];  
        proprietarios = new Proprietario [100];  
        hospedes = new Hospede[100];  
        
        tiposImovel = new String[] {" Casa", " Apartamento", " Chácara", " Chalé", " Pousada", " Kitnet"};

        nomes = new String [] {
        		" Alan", " Luiza", " Helena", " Beatriz", " Mariana", " Livia", " Ana Clara", " Rafaela", " Yasmin",
        		" Gabriela", " Melissa", " Esther", " Isis", " Maria", " Maria Fernanda", " Catarina", " Alicia", 
        		" Maria Alice", " Amanda", " Alicia", " Valentina", " Ana", " Alana", " Isis", " Clara", " Gabriela", 
        		" Yasmin", " Larissa", " Ester", " Bruna", " Eduarda", " Mariana", " Laila", " Maisa", " Brenda", 
        		" Isabel", " Marina", " Estela", " Lia", " Micaela", " Ariana", " Debora", " Daniela", " Paloma",
        		" Isa", " Karen", " Sabrina", " Ingrid", " Carol", " Clarissa", " Alessandra", " Adriana",
        		" Natalia", " Flor", " Bernardo", " Rafael", " Enzo", " Lorenzo", " Guilherme", " Samuel",
        		" Eduardo", " Joao", " Francisco", " Antonio", " Davi Lucas", " Enrico", " Artur", " Bernardo", 
        		" Miguel", " Enzo", " Lorenzo", " Theo", " Gabriel", " Henrique", " Lucas", " Rafael", " Daniel", 
        		" Eduardo", " Victor", " Andre", " Levi", " Aarao", " Vicente", " Vinicius", " Lourenzo", " Francisco", 
        		" Valentim", " Angelo", " Leandro", " Marcelo", " Alvaro", " Frederico", " Abel", " Santiago", 
        		" Carlos", " Cesar", " Fabio", " Muriel", " Adriano", " Cristiano", " Caetano", " Sophia", 
        		" Maria Luiza", " Mariana", " Lara", " Gabriela", " Isabelly", " Cecilia", " Esther", " Marina", 
        		" Vitoria", " Isis", " Ana", " Laura", " Lara", " Cecilia", " Luisa", " Melissa", " Livia", " Ana", 
        		" Lorena", " Isadora", " Yasmin", " Barbara", " Abigail", " Larissa", " Camila", " Sara", " Vitoria", 
        		" Amanda", " Melinda", " Agnes", " Analice", " Diana", " Emanuela", " Anita", " Karen", " Sabrina", 
        		" Belinda", " Ingrid", " Alessandra", " Raquel", " Miguel", " Davi", " Lucas", " Heitor", " Rafael", 
        		" Enzo", " Nicolas", " Guilherme", " Samuel", " Theo", " Gustavo", " Murilo", " Vitor", " Isaac", 
        		" Caio", " Vicente", " Francisco", " Thomas", " Artur", " Miguel", " Theo", " Guilherme", " Gustavo", 
        		" Caio", " David", " Daniel", " Joaquim", " Eduardo", " Samuel", " Leonardo", " Bruno", " Hugo", 
        		" Igor", " Levi", " Kevin", " Luis", " Diego", " Rodrigo", " Afonso", " Danilo", " Filipe", " Antonio", 
        		" Valentim", " Angelo", " Octavio", " Leandro", " Alvaro", " Frederico", " Ricardo", " Aquiles", 
        		" Paulo", " Carlos", " Wilian", " Ezequiel", " Jonas", " Adriano", " Mauricio", " Caetano"

        };
 
        sobrenomes = new String[] {
        		" Silva", " Santos", " Oliveira", " Souza", " Rodrigues", " Ferreira", " Almeida", 
        		" Pereira", " Lima", " Gomes"," Costa", " Ribeiro", " Martins", " Jesus", " Pinto", " Mendes", " Carvalho",
        		" Ramos", " Teixeira", " Andrade"," Melo", " Barros", " Franco", " Tavares", " Rocha", " Campos", 
        		" Figueiredo", " Barbosa", " Morais", " Cavalcanti"," Dias", " Castro", " Camargo", " Padilha", 
        		" Monteiro", " Senhorinho", " Arruda", " Bueno" ," Vasconcelos", " Bittencourt", " Sampaio"," Miranda", 
        		" Azevedo", " Brito", " Correia", " Batista", " Marques", " Guedes", " Moraes", " Peixoto", " Maia",
        		" Barreto", " Soares", " Pessoa", " Rangel", " Aquino", " Araujo", " Nascimento", " Lemos", " Salazar",
        		" Portela"," Viana", " Macedo", " Borges", " Carneiro", " Cruz", " Brandão", " Pires", " Carmo", " Neves", 
        		" Prado"," Silveira", " Queiroz", " Aguiar", " Siqueira", " Nunes"

        };
    }

    // Getter and Setters
    public Imovel[] getImoveis() {
        return imoveis;
    }

    public Imovel getImovel(int i) {
        return imoveis[i];
    }
    
    public void setImoveis(Imovel[] imoveis) {
        this.imoveis = imoveis;
    }

    public void setImovel(int i, Imovel a) {
		imoveis[i] = a;
	}

    public Hospede[] getHospedes() {
        return hospedes;
    }

    public Hospede getHospede(int i) {
        return hospedes[i];
    }

    public void setHospedes(Hospede[] hospedes) {
        this.hospedes = hospedes;
    }

    public void setHospede(int i, Hospede a) {
		hospedes[i] = a;
	}

    public void setnHospedes(int nHospede) {
		this.nHospede = nHospede;
	}

    public int getnHospede() {
		return nHospede;
	}

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public String[] getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String[] sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String[] getTiposImovel() {
        return tiposImovel;
    }

    public void setTiposImovel(String[] tiposImovel) {
        this.tiposImovel = tiposImovel;
    }

    public int getnImoveis() {
        return nImoveis;
    }

    public void setnImoveis(int nImoveis) {
        this.nImoveis = nImoveis;
    }
    
    public Proprietario[] getProprietarios() {
		return proprietarios;
	}

	public void setProprietarios(Proprietario[] proprietarios) {
		this.proprietarios = proprietarios;
	}

	public int getnProprietarios() {
		return nProprietarios;
	}

	public void setnProprietarios(int nProprietarios) {
		this.nProprietarios = nProprietarios;
	}

	// Vai preencher os imoveis e proprietarios
    public void preencherDados() {
    	for (int i = 0; i <10; i++) {
    		gerarProprietario ();
    	}
    }

    // Geradores de Dados Aleatórios
    public String gerarNome() {
        Random random = new Random();
        
        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome1 = sobrenomes[random.nextInt(sobrenomes.length)];
        String sobrenome2 = sobrenomes[random.nextInt(sobrenomes.length)];
        
        while (sobrenome2.equals(sobrenome1)) {
            sobrenome2 = sobrenomes[random.nextInt(sobrenomes.length)];
        }
        
        return nome + " " + sobrenome1 + " " + sobrenome2;
    }

    public String gerarEmail(String nomeCompleto) {
        String[] partesNome = nomeCompleto.split(" ");
        if (partesNome.length >= 3) {
            String nome = partesNome[0].toLowerCase();
            String sobrenome = partesNome[1].toLowerCase();
            return nome + "." + sobrenome + "@email.com";
        }
        return "";
    }

    public String gerarTelefone() {
        Random random = new Random();
        StringBuilder telefone = new StringBuilder("9");

        int segundoDigito = random.nextInt(2) + 8;
        telefone.append(segundoDigito);

        for (int i = 0; i < 7; i++) {
            int digito = random.nextInt(10);
            telefone.append(digito);
        }

        return telefone.toString();
    }


    //adicionar Imovel
    public Imovel gerarImovel() {
        Random random = new Random();
    
        String descricao = "Imovel numero " + nImoveis;
        String tipoImovel = getTiposImovel()[random.nextInt(tiposImovel.length)];
        int qntQuartos = + random.nextInt(5) + 1;
        int qntCamas = random.nextInt(5) + 1;
        int qntBanheiros = random.nextInt(3) + 1;
        
        Imovel novoimovel = new Imovel(descricao, tipoImovel, qntQuartos, qntCamas, qntBanheiros);
        adicionarImovel(novoimovel);
     
        return novoimovel;
    }
    
 
	
    // Adicionar um objeto imovel no array de imoveis
    public void adicionarImovel(Imovel novoImovel) {
        if (nImoveis < imoveis.length) {
            imoveis[nImoveis] = novoImovel;
            nImoveis++;
        }
    }
 
    
    // Remover um objeto imovel no array de imoveis
    public void removerImovel(int j, Scanner in) {
    	
        int indiceEncontrado = -1;

        // Procurar o índice do imóvel a ser removido
        for (int i = 0; i < nImoveis; i++) {
            if (imoveis[i] != null && i == j) {
                indiceEncontrado = i;
                break;
            }
        }

        // Verificar se o índice foi encontrado
        if (indiceEncontrado != -1) {
 
            System.out.println("Imovel a ser removido:\n" + imoveis[indiceEncontrado].toString());
            System.out.println("Deseja realmente remover este imovel? (S/N)");
            String resposta = in.next();

            if (resposta.equalsIgnoreCase("S")) {
                // Remover o imóvel da lista
                for (int k = indiceEncontrado; k < nImoveis - 1; k++) {
                    imoveis[k] = imoveis[k + 1];
                }
                imoveis[nImoveis - 1] = null;
                nImoveis--;

                System.out.println("Imovel removido com sucesso.");
            } else {
                System.out.println("Remocao cancelada.");
            }
        } else {
            System.out.println("Imovel nao encontrado na lista. Indice invalido.");
        }
        
    }
   
    
    // Vai printar os imoveis já criados e seus atributos
    public void listarImoveis ()
    {
    	for (int i = 1; i < nImoveis; i++) {
    		
            System.out.println(imoveis[i].getDescricao() + " = Tipo: " + imoveis[i].getTipoImovel() + ","
            		+ " Quartos: " + imoveis[i].getQntQuartos() + ","
            		+ " Camas: " + imoveis[i].getQntCamas() + ","
            		+ " Banheiros: " + imoveis[i].getQntBanheiros() + ",");
        }
    }

    
    	// PARTE PROPRIETARIO
    
    // Adicionar um objeto proprietario no array de proprietarios
    public void adicionarProprietario(Proprietario novoProprietario) {
        if (nProprietarios < proprietarios.length) {
        	proprietarios [nProprietarios] = novoProprietario;
            nProprietarios++;
         
            //System.out.println("Propritario adicionado com sucesso!");
        } else {
            //System.out.println("A capacidade maxima de anuncios foi atingida. Nao eh possivel adicionar mais imoveis.");
        }
    }
    
    public Proprietario gerarProprietario() {
    	  
        String nomeCompleto = gerarNome();
        String email = gerarEmail(nomeCompleto);
        String telefoneAleatorio = gerarTelefone();
        Imovel imovelProprietario = gerarImovel();
        Proprietario novoProprietario = new Proprietario(nomeCompleto, email, telefoneAleatorio);
        novoProprietario.addImovel(imovelProprietario);
        //System.out.println("Proprietario adicionado com sucesso!");
        return novoProprietario;
    }
    
    public void removerProprietario(String nomeCompleto) {
        Proprietario proprietario = findProprietario(nomeCompleto);
        if (proprietario != null) {
            adicionarProprietario(proprietario);
            System.out.println("Proprietario removido com sucesso!");
        } else {
            System.out.println("Proprietario nao encontrado!");
        }
    }

    private Proprietario findProprietario(String nomeCompleto) {
        for (Proprietario proprietario : proprietarios) {
            if (proprietario.getNome().equals(nomeCompleto)) {
                return proprietario;
            }
        }
        return null;
    }

    public void gerarHospede() {
        String nomeCompleto = gerarNome();
        String email = gerarEmail(nomeCompleto);
        String telefoneAleatorio = gerarTelefone();
        Hospede novoHospede = new Hospede(nomeCompleto, email, telefoneAleatorio);
        adicionarHospede(novoHospede);
        //System.out.println("Hospede adicionado com sucesso!");
    }

    public void adicionarHospede(Hospede novoHospede) {
        if (nHospede < hospedes.length) {
        	hospedes [nHospede] = novoHospede;
            nHospede++;
            //System.out.println("Hospede adicionado com sucesso!");
        } else {
            //System.out.println("A capacidade maxima de anuncios foi atingida. Nao eh possivel adicionar mais imoveis.");
        }
    }
    
    @Override
    public String toString() {
        return "Dados [imoveis=" + Arrays.toString(imoveis) + "]";
    }

	
}
