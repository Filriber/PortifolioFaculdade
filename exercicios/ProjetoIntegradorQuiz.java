package exercicios.faculdade;

import java.util.Scanner;

public class ProjetoIntegradorQuiz {

	    public static void main(String args[]) {

	        Scanner entrada = new Scanner (System.in);

	        String opcaoMenu;

	        do {

	            montarMenuJogo();

	            opcaoMenu = entrada.next().substring(0,1);

	            switch (opcaoMenu) {
	                case "1":

	                    mostrarInstrucoesJogo();

	                    break;
	                case "2":

	                    executarJogo();

	                    break;
	                case "3":

	                    mostrarCreditosJogo();

	                    break;
	                case "4":

	                    System.out.println("Você selecionou a opção [4], Sair!");

	                    break;
	                default:

	                    System.out.println("Opção invalida! Tente novamente!");

	            }
	        }
	        while (!opcaoMenu.equals("4"));
	   
	    }
	/**
	 *
	 * Método para montar o menu do jogo
	 *
	 */
	    public static void montarMenuJogo() {
	       
	        System.out.println("\n");
	       
	        System.out.println("=============================================");
	        System.out.println(">>>>>>>>>>>>>>>>   M E N U   <<<<<<<<<<<<<<<<");
	        System.out.println("=============================================");
	        System.out.println("=                                           =");
	        System.out.println("=             [1] - Instruções              =");
	        System.out.println("=             [2] - Jogar                   =");
	        System.out.println("=             [3] - Créditos                =");
	        System.out.println("=             [4] - Sair                    =");
	        System.out.println("=                                           =");
	        System.out.println("=============================================");

	        System.out.print("Escolha uma opção do MENU: ");
	    }
	/**
	 *
	 * Método para mostrar as informações de instruções do jogo
	 *
	 */
	    public static void mostrarInstrucoesJogo() {
	       Scanner input = new Scanner(System.in);
	        System.out.println("Você selecionou a opção [1], Instruções!");
	        System.out.println("Tecle <Enter> para voltar ao menu");
	        String teclaEnter = input.next();
	    }
	/**
	 *
	 * Método para mostrar as informações de créditos do jogo
	 *
	 */
	    public static void mostrarCreditosJogo() {
	       
	        System.out.println("\n");
	        System.out.println("Este jogo é um 'Quiz' que foi criado por:");
	        System.out.println("   > Filipe Ribeiro dos Santos");
	        System.out.println("   > Nathalia Robson Aal Silva");
	        System.out.println("   > João Victor de Oliveira Silva");
	        System.out.println("   > Francisco Olivando Araújo Lourenço");
	       
	        System.out.println("\n");
	        System.out.println("Tecle <Enter> para voltar para o Menu do Jogo!");
	       
	        Scanner entrada = new Scanner (System.in);
	       
	        String teclaEnter;
	           
	        teclaEnter = entrada.next();

	    }
	/**
	 *
	 * Método para executar o jogo
	 *
	 */
	    public static void executarJogo() {
	       
	        validarRespostaJogo();
	    }
	/**
	 *
	 * Método para montar o menu do jogo
	 *
	 */
	    public static void validarRespostaJogo() {

	        Scanner resposta = new Scanner (System.in);
	       
	        String opcaoResposta;
	        byte qtdResposta = 0;
	        boolean respostaCerta = false;
	        boolean respostasExcededidas = false;

	        do {
	            montarPerguntaJogo();

	            opcaoResposta = resposta.next().substring(0,1);
	            opcaoResposta= opcaoResposta.toLowerCase();
	               
	            qtdResposta++;

	            switch (opcaoResposta){
	                case "a":

	                    respostaCerta = true;

	                    System.out.println("Resposta correta, na " + qtdResposta + "ª tentativa!");

	                    break;
	                case "b":
	                case "c":
	                case "d":
	                case "e":
	                default:
	       
	                    if(qtdResposta == 3){
	                   
	                        respostasExcededidas = true;

	                        System.out.println("Resposta incorreta nas 3 tentativas!");
	                   
	                    }else{

	                        System.out.println("Resposta incorreta! Tente novamente!");
	                    }
	            }
	        }
	        while((respostaCerta != true) && (respostasExcededidas != true));
	    }
	/**
	 *
	 * Método para montar a pergunta exemplo
	 *
	 */
	    public static void montarPerguntaJogo() {
	       
	        System.out.println("=============================================");
	        System.out.println("=   R E S P O N D A   A   P E R G U N T A   =");
	        System.out.println("=============================================");
	        System.out.println("=                                           =");
	        System.out.println("=    O valor em binário do decimal 42 é?    =");
	        System.out.println("=                                           =");
	        System.out.println("=    a) 101010                              =");
	        System.out.println("=    b) 101011                              =");
	        System.out.println("=    c) 111010                              =");
	        System.out.println("=    d) 101110                              =");
	        System.out.println("=    e) 101111                              =");
	        System.out.println("=                                           =");
	        System.out.println("=============================================");

	        System.out.print("Escolha uma resposta: ");
	    }
	/**
	 *
	 * Método para montar a pergunta 01
	 *
	 */
	    public static void montarPergunta01() {
	       
	        System.out.println("=====================================================");
	        System.out.println("=       R E S P O N D A   A   P E R G U N T A       =");
	        System.out.println("=====================================================");
	        System.out.println("=                                                   =");
	        System.out.println("=    Podemos afirmar que o Power BI é:              =");
	        System.out.println("=                                                   =");
	        System.out.println("=    a) Um editor de texto                          =");
	        System.out.println("=    b) Um banco de dados                           =");
	        System.out.println("=    c) Serviço de análise de negócios e de dados   =");
	        System.out.println("=    d) Um jogo RPG (Role Playing Game)             =");
	        System.out.println("=    e) IDE (Integrated Development Enviroment)     =");
	        System.out.println("=                                                   =");
	        System.out.println("=====================================================");

	        System.out.print("Escolha uma resposta: ");
	    }
	}

