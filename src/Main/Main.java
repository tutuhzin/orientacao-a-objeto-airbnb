package main;

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
						listarImoveis();
						break;
					case 3: 
						System.out.println("Escolha um dos imóveis a seguir para editar as informações:\n");
						listarImoveis();
						aux = in.nextInt();
						Imovel imovelParaEditar = lerDadosImovel();
						boolean imovelPossuiProprietario = encontrarProprietarioDoImovel(d.getImoveis()[aux]) != null;
						editarImovel(aux, imovelParaEditar, imovelPossuiProprietario);
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
						Proprietario proprietarioParaEditar = lerDadosProprietario();
						editarProprietario(aux, proprietarioParaEditar);
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
						Hospede hospedeParaEditar = lerDadosHospede();
						editarHospede(aux, hospedeParaEditar);
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
	            String saida = new String("\nEscolha uma das opcoes a seguir:\n");
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
				listarImoveis();
				int i = in.nextInt();
				if(i < d.getnImoveis() && i >= 0) {
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
			
			public static void editarImovel(int i, Imovel novoImovel, boolean imovelPossuiProprietario) {
				if (i >= 0 && i < d.getnImoveis()) {
					Imovel imovelAtual = d.getImoveis()[i];
			
					// Preserve o proprietário atual do imóvel
					Proprietario proprietarioAtual = imovelAtual.getProprietario();
			
					// Atribua os novos valores ao imóvel
					imovelAtual.setDescricao(novoImovel.getDescricao());
					imovelAtual.setTipoImovel(novoImovel.getTipoImovel());
					imovelAtual.setQntQuartos(novoImovel.getQntQuartos());
					imovelAtual.setQntCamas(novoImovel.getQntCamas());
					imovelAtual.setQntBanheiros(novoImovel.getQntBanheiros());
			
					// Se o imóvel original tinha um proprietário, mantenha esse proprietário no novo imóvel
					if (imovelPossuiProprietario && proprietarioAtual != null) {
						// Adicione o imóvel atualizado à lista de imóveis do proprietário
						proprietarioAtual.addImovel(imovelAtual);
					} else {
						// Se o imóvel original não tinha um proprietário, defina o novo imóvel como sem proprietário
						imovelAtual.setProprietario(null);
					}
			
					System.out.println("Imóvel editado com sucesso!");
				} else {
					System.out.println("Você escolheu um número de imóvel inválido!");
				}
			}	
	        
			public static void listarImoveis() {
			    if (d.getnImoveis() == 0) {
			        System.out.println("Não há imóveis para listar.");
			        return;
			    }
			
			    // Imprime os imóveis com informações do proprietário
			    for (int i = 0; i < d.getnImoveis(); i++) {
			        Imovel imovelAtual = d.getImoveis()[i];
			        Proprietario proprietarioDoImovel = encontrarProprietarioDoImovel(imovelAtual);
				
			        if (proprietarioDoImovel != null) {
			            System.out.println("[" + i + "] " + imovelAtual.getDescricao() + " = Tipo: " + imovelAtual.getTipoImovel() + ","
			                    + " Quartos: " + imovelAtual.getQntQuartos() + ","
			                    + " Camas: " + imovelAtual.getQntCamas() + ","
			                    + " Banheiros: " + imovelAtual.getQntBanheiros() + ","
			                    + " Proprietário:" + proprietarioDoImovel.getNome());
			        } else {
			            System.out.println("[" + i + "] " + imovelAtual.getDescricao() + " = Tipo: " + imovelAtual.getTipoImovel() + ","
			                    + " Quartos: " + imovelAtual.getQntQuartos() + ","
			                    + " Camas: " + imovelAtual.getQntCamas() + ","
			                    + " Banheiros: " + imovelAtual.getQntBanheiros() + ","
			                    + " Proprietário: Não atribuído");
			        }
			    }
			}

			// Método para encontrar o proprietário de um imóvel
			public static Proprietario encontrarProprietarioDoImovel(Imovel imovel) {
			    for (Proprietario proprietario : d.getProprietarios()) {
			        if (proprietario != null && proprietario.getImoveis().contains(imovel)) {
			            return proprietario;
			        }
			    }
			    return null;
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

			public static void removerProprietario() {
				System.out.println("Escolha um dos proprietarios a seguir para ser removido:\n");
				listarProprietarios();
				int i = in.nextInt();
				if(i < d.getnProprietarios() && i >= 0) {
					swapListaProprietarios(i);
					d.setProprietario(d.getnProprietarios(), null);
					d.setnProprietarios(d.getnProprietarios() - 1);
					System.out.println("Proprietário removido com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}
			
			public static void swapListaProprietarios(int a) {
				for(int i = a; i < d.getnProprietarios() - 1; i++) 
					d.setProprietario(i, d.getProprietario(i+1));
			}

			public static void editarProprietario(int i, Proprietario p) {
				if(i < d.getnProprietarios() && i >= 0) {
					d.setProprietario(i, p);
					System.out.println("Dados editados com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}

			public static void listarProprietarios() {
			    if (d.getnProprietarios() == 0) {
			        System.out.println("Não há proprietários para listar.");
			    } else {
			        // Imprime os proprietários com seus índices no array
			        for (int i = 0; i < d.getnProprietarios(); i++) {
			            System.out.print("["+ i +"] ");
			            System.out.println(d.getProprietarios()[i].getNome() + ", Email: " + d.getProprietarios()[i].getEmail() + ", Telefone: " + d.getProprietarios()[i].getTelefone());
			        }
			    }
			}

	        
			// Hospedes
			public static boolean cadastrarHospede() {
				if(d.getnHospedes() < 100) {
					d.adicionarHospede(lerDadosHospede());
					System.out.println("Hospede cadastrado com sucesso!\n");
					return true;
				} else {
					System.out.println("Não foi possivel cadastrar o hospede!\n");
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
				System.out.println("\nEscolha um dos hospedes a seguir para ser removido:\n");
				listarHospedes();
				int i = in.nextInt();
				if(i < d.getnHospedes() && i >= 0) {
					swapListaHospede(i);
					d.setHospede(d.getnHospedes(), null);
					d.setnHospedes(d.getnHospedes() - 1);
					System.out.println("Hospede removido com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}
			
			public static void swapListaHospede(int p) {
				for(int i = p; i < d.getnHospedes() - 1; i++) 
					d.setHospede(i, d.getHospede(i+1));
			}
			
			public static void editarHospede(int i, Hospede h) {
				if(i < d.getnHospedes() && i >= 0) {
					d.setHospede(i, h);
					System.out.println("Dados editados com sucesso");
				} else {
					System.out.println("Voce escolheu um numero invalido!");
				}
			}
			
			// Listar os hóspedes mostrando o índice no array hospedes em Dados
			public static void listarHospedes() {
    			if (d.getnHospedes() == 0) {
    			    System.out.println("Não há hóspedes para listar.");
    			} else {
    			    // Imprime os hóspedes com seus índices no array
    			    for (int i = 0; i < d.getnHospedes(); i++) {
    			        System.out.print("[" + i + "] ");
    			        System.out.println(d.getHospedes()[i].getNome() + ", Email: " + d.getHospedes()[i].getEmail() + ", Telefone: " + d.getHospedes()[i].getTelefone());
    			    }
    			}
}

	        
}

	        
	        
	

