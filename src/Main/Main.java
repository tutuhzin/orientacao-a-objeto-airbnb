package Main;

import java.util.*;
import dados.*;
import trabalho.*;


public class Main {
    private static Dados d = new Dados();
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int op = -1;
		int aux;
		d.preencherDados();
		while(op != 0) {
			System.out.print(imprimirMenu());
			op = in.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigado por utilizar o sistema. Ate logo!");
			 		break;
				case 1:
					cadastrarImovel();
					break;
				case 2:
					removerImovel();
					break;
				case 3: 
					System.out.println("Escolha um dos imoveis a seguir para editar as informacoes:\n");
					listarImoveis();
					aux = in.nextInt();
					Imovel a = lerDadosImovel();
					editar(aux, a);
					break;
				case 4: 
					listarImoveis();
					break;
				case 5:
					cadastrarProprietario();
					break;
				case 6:
					removerProprietario();
					break;
				case 7: 
					System.out.println("Escolha um dos proprietarios a seguir para editar as informacoes:\n");
					listarProprietarios();
					aux = in.nextInt();
					Proprietario p = lerDadosProprietario();
					editar(aux, p);
					break;
				case 8: 
					listarHospede();
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
					Imovel a = lerDadosHospede();
					editar(aux, a);
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
            saida = saida + "02 - Remover imovel existente\n";
            saida = saida + "03 - Editar imovel existente\n";
            saida = saida + "04 - Listar imoveis\n";
            saida = saida + "05 - Cadastrar novo proprietario\n";
            saida = saida + "06 - Remover proprietario existente\n";
            saida = saida + "07 - Editar proprietario existente\n";
            saida = saida + "08 - Listar proprietarios\n";
            saida = saida + "09 - Cadastrar novo hospede\n";
            saida = saida + "10 - Remover hospede existente\n";
            saida = saida + "11 - Editar hospede existente\n";
            saida = saida + "12 - Listar hospedes\n";
            return saida;
        }

        public static boolean cadastrarImovel() {
            Imovel a = lerDadosImovel();
            if(d.getnImoveis() < 100) {
                d.setImoveis(d.getnImoveis(), a);
                d.setnImoveis(d.getnImoveis()+1);
                System.out.println("Imovel cadastrado com sucesso!\n");
                return true;
            } else {
                System.out.println("Não foi possivel cadastrar o imovel!\n");
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

            Imovel a = new Imovel(descricao, tipoImovel, qntQuartos, qntCamas, qntBanheiros);
            return a;	
        }
}

  