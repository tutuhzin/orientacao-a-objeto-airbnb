package Main;

import java.util.*;
import dados.*;
import trabalho.*;

public class Main {
	private static Dados d = new Dados();
	private static Scanner in = new Scanner(System.in);
	    public static void main(String[] args) {
	        int op = -1;
			int aux = 0;
			d.preencherDados();
			
			while(op != 0) {
				System.out.print(imprimirMenu());
				op = in.nextInt();
				 switch (op) {
				 	case 0:
				 		System.out.println("Obrigado por utilizar o sistema. Ate logo!");
				 		break;
					case 1:
						cadastrarImovel ();
						break;
					case 2:
						d.listarImoveis();
						break;
					case 3: 
						System.out.println("Escolha um dos imoveis a seguir para editar as informacoes:\n");
						d.listarImoveis();
						aux = in.nextInt();
						Imovel a = lerDadosImovel();
						editarImovel(aux, a);
						break;
					case 4:
						removerImovel();
						break;
					case 5:
						cadastrarProprietario();
						break;
					case 6:
						listarProprietarios();
						break;
					case 7: 
						System.out.println("Escolha um dos proprietarios a seguir para editar as informacoes:\n");
						listarProprietarios();
						aux = in.nextInt();
						break;
					case 8: 
						removerProprietario();
						break;
					case 9:
						cadastrarHospede();
						break;
					case 10:
						removerHospede();
						break;
					case 11: 
						System.out.println("Escolha um dos hospedes a seguir para editar as informacoes:\n");
						listarHospedes();
						aux = in.nextInt();
						break;
					case 12: 
						listarHospedes();
						break;
	                default:
						System.out.println("\nOpcao Invalida!\n");
						break;
				 }
			}
			in.close();
		}

	        public static String imprimirMenu() {
	            String saida = new String("Escolha uma das opcoes a seguir:\n");
	            saida = saida + "00 - Sair da aplicacao\n";
	            saida = saida + "01 - Cadastrar novo imovel\n";
	            saida = saida + "02 - Listar Imoveis\n";
	            saida = saida + "03 - Editar imovel existente\n";
	            saida = saida + "04 - Remover imovel existente\n";
	            saida = saida + "05 - Cadastrar novo proprietario\n";
	            saida = saida + "06 - Listar Proprietarios \n";
	            saida = saida + "07 - Editar proprietario existente\n";
	            saida = saida + "08 - Remover proprietario existente\n";
	            saida = saida + "09 - Cadastrar novo hospede\n";
	            saida = saida + "10 - Remover hospede existente\n";
	            saida = saida + "11 - Editar hospede existente\n";
	            saida = saida + "12 - Listar hospedes\n";
	            return saida;
	        }
	        
	        public static boolean cadastrarImovel() {
	            if(d.getnImoveis() < 100) {
	            	d.adicionarImovel(lerDadosImovel());
	                System.out.println("Imovel cadastrado com sucesso!\n");
	                return true;
	            } else {
	                System.out.println("Nao foi possivel cadastrar o imovel!\n");
	                return false;
	            }
	        }

	        public static Imovel lerDadosImovel() {
	            String descricao;
	            String tipoImovel;
	            int qntQuartos;
	            int qntCamas;
	            int qntBanheiros;
	            in.nextLine(); //esvazia dados do teclado

	            System.out.println("Digite a descricao do imovel: ");
	            descricao = in.nextLine();
	            System.out.println("Digite o tipo de imovel:");
	            tipoImovel = in.nextLine();
	            System.out.println("Digite a quantidade de quartos:");
	            qntQuartos = Integer.parseInt(in.nextLine());
	            System.out.println("Digite a quantidade de camas:");
	            qntCamas = Integer.parseInt(in.nextLine());
	            System.out.println("Digite a quantidade de banheiros:");
	            qntBanheiros = Integer.parseInt(in.nextLine());

	            Imovel imovel = new Imovel(descricao, tipoImovel, qntQuartos, qntCamas, qntBanheiros);
	            return imovel;	
	        }
			
			public static void removerImovel() {
				System.out.println("Escolha um dos imoveis a seguir para ser removido:\n");
				d.listarImoveis();
				int i = in.nextInt();
				if(i < d.getnImoveis() && i > 0) {
					swapListaImoveis(i);
					d.setImovel(d.getnImoveis(), null);
					d.setnImoveis(d.getnImoveis() - 1);
					System.out.println("Imovel removido com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
				
			}
			
			public static void swapListaImoveis(int a) {
				for(int i = a; i < d.getnImoveis() - 1; i++) 
					d.setImovel(i, d.getImovel(i+1));
			}
			
			public static void editarImovel(int i, Imovel a) {
				if(i < d.getnImoveis() && i >= 0) {
					d.setImovel(i, a);
					System.out.println("Dados editados com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}
	        
	        // Cadastrando um novo proprietario - 05
	        
	        
	        public static boolean cadastrarProprietario() {

	            Proprietario proprietario = lerDadosProprietario();

	            if (d.getnProprietarios() < 100) {

	                d.adicionarProprietario(proprietario);
	                System.out.println("Proprietario cadastrado com sucesso!\n");
	                return true;
	            } else {

	                System.out.println("Nao foi possível cadastrar o proprietario!\n");
	                return false;
	            }
	        }
	       
	        
	        public static Proprietario lerDadosProprietario() {
	            in.nextLine();
	            
	            System.out.println("Nome do Proprietario");
	            String nome = in.nextLine();
	            System.out.println("Digite o seu email: ");
	            String email = in.nextLine();
	            System.out.println("Numero de telefone: ");
	            String telefone = in.nextLine();
	            Proprietario proprietario = new Proprietario(nome, email, telefone);

	            return proprietario;
	        }
 
	        // Removendo Proprietario - 06
	        
	        public static void removerProprietario() {

	            // Apresentar a lista de proprietários
	            System.out.println("Escolha um dos proprietarios a seguir para ser removido:\n");
	            listarProprietarios();

	            // Ler o índice do proprietário a ser removido
	            int i = in.nextInt();

	            // Verificar se o proprietário existe
	            boolean proprietarioExiste = false;
	            for (int j = 0; j < d.getnProprietarios(); j++) {
	                if (i == j) {
	                    proprietarioExiste = true;
	                    break;
	                }
	            }

	            // Verificar se o índice é válido
	            if (proprietarioExiste && i < d.getnProprietarios() && i > 0) {

	                // Remover o proprietário da lista
	                Proprietario proprietarioRemovido = d.getProprietarios()[i];
	                swapListaProprietarios(i);
	                d.setnProprietarios(d.getnProprietarios() - 1);

	                // Exibir uma mensagem de confirmação
	                System.out.println("Proprietario removido com sucesso: " + proprietarioRemovido.getNome());
	            } else {

	                // Exibir uma mensagem de erro
	                if (!proprietarioExiste) {
	                    System.out.println("O proprietario selecionado não existe!");
	                } else {
	                    System.out.println("Você escolheu um número invalido!");
	                }
	            }
	        }
	        
	    	public static void swapListaProprietarios(int p) {
	    		for(int i = p; i < d.getnProprietarios() - 1; i++) 
	    			d.setnProprietarios(i);
	    	}

	    	
	    	
	    	public static void listarProprietarios() {
	    	    if (d.getnProprietarios() == 0) {
	    	        System.out.println("Não há proprietários para listar.");
	    	    }

	    	    // Cria um array temporário para armazenar os proprietários
	    	    Proprietario[] proprietariosTemporarios = new Proprietario[d.getnProprietarios()];

	    	    for (int i = 0; i < d.getnProprietarios(); i++) {
	    	        proprietariosTemporarios[i] = d.getProprietarios()[i];
	    	    }

	    	    // Imprime os proprietários
	    	    for (Proprietario proprietario : proprietariosTemporarios) {
	    	        System.out.println(proprietario.getNome() + " = Email:" + proprietario.getEmail() + ","
	    	                + " Telefone:" + proprietario.getTelefone());
	    	    }
	    	}
	        
			// Hospede
			public static boolean cadastrarHospede() {
				Hospede h = lerDadosHospede();
				if(d.getnHospedes() < 100) {
					d.setHospede(d.getnHospedes(), h);
					d.setnHospedes(d.getnHospedes() + 1);
					System.out.println("Professor cadastrado com sucesso!\n");
					return true;
				} else {
					System.out.println("Não foi possivel cadastrar o Professor!\n");
					return false;
				}
			}
			
			public static Hospede lerDadosHospede() {
				String nome;
				String email;  
				String telefone; 
				in.nextLine(); //esvazia dados do teclado

				System.out.println("Digite o nome do hospede: ");
				nome = in.nextLine();
				System.out.println("Digite o email do hospede:");
				email = in.nextLine();
				System.out.println("Digite o telefone do hospede:");
				telefone = in.nextLine();

				Hospede h = new Hospede(nome, email, telefone);
				return h;	
			}
			
			public static void removerHospede() {
				System.out.println("Escolha um dos professores a seguir para ser removido:\n");
				listarHospedes();
				int i = in.nextInt();
				if(i < d.getnHospedes() && i > 0) {
					swapListaHospede(i);
					d.setHospede(d.getnHospedes(), null);
					d.setnHospedes(d.getnHospedes() - 1);
					System.out.println("Professor removido com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}
			
			public static void swapListaHospede(int p) {
				for(int i = p; i < d.getnHospedes() - 1; i++) 
					d.setHospede(i, d.getHospede(i+1));
			}
			
			public static void editarHospede(int i, Hospede p) {
				if(i < d.getnHospedes() && i >= 0) {
					d.setHospede(i, p);
					System.out.println("Dados editados com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}
			
			public static void listarHospedes() {
				if (d.getnHospedes() == 0) {
	    	        System.out.println("Não há hospedes para listar.");
	    	    }
				
	    	    // Cria um array temporário para armazenar os proprietários
	    	    Hospede[] hospedesTemporarios = new Hospede[d.getnHospedes()];

	    	    for (int i = 0; i < d.getnHospedes(); i++) {
	    	        hospedesTemporarios[i] = d.getHospedes()[i];
	    	    }

	    	    // Imprime os proprietários
	    	    for (Hospede hospede : hospedesTemporarios) {
	    	        System.out.println(hospede.getNome() + " = Email:" + hospede.getEmail() + ","
	    	                + " Telefone:" + hospede.getTelefone());
	    	    }
			}
	        
} // FIM DA MAIN

	        
	        
	

