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

	                    System.out.println("Voc� selecionou a op��o [4], Sair!");

	                    break;
	                default:

	                    System.out.println("Op��o invalida! Tente novamente!");

	            }
	        }
	        while (!opcaoMenu.equals("4"));
	   
	    }
	/**
	 *
	 * M�todo para montar o menu do jogo
	 *
	 */
	    public static void montarMenuJogo() {
	       
	        System.out.println("\n");
	       
	        System.out.println("=============================================");
	        System.out.println(">>>>>>>>>>>>>>>>   M E N U   <<<<<<<<<<<<<<<<");
	        System.out.println("=============================================");
	        System.out.println("=                                           =");
	        System.out.println("=             [1] - Instru��es              =");
	        System.out.println("=             [2] - Jogar                   =");
	        System.out.println("=             [3] - Cr�ditos                =");
	        System.out.println("=             [4] - Sair                    =");
	        System.out.println("=                                           =");
	        System.out.println("=============================================");

	        System.out.print("Escolha uma op��o do MENU: ");
	    }
	/**
	 *
	 * M�todo para mostrar as informa��es de instru��es do jogo
	 *
	 */
	    public static void mostrarInstrucoesJogo() {
	       Scanner input = new Scanner(System.in);
	        System.out.println("Voc� selecionou a op��o [1], Instru��es!");
	        System.out.println("Tecle <Enter> para voltar ao menu");
	        String teclaEnter = input.next();
	    }
	/**
	 *
	 * M�todo para mostrar as informa��es de cr�ditos do jogo
	 *
	 */
	    public static void mostrarCreditosJogo() {
	       
	        System.out.println("\n");
	        System.out.println("Este jogo � um 'Quiz' que foi criado por:");
	        System.out.println("   > Filipe Ribeiro dos Santos");
	        System.out.println("   > Nathalia Robson Aal Silva");
	        System.out.println("   > Jo�o Victor de Oliveira Silva");
	        System.out.println("   > Francisco Olivando Ara�jo Louren�o");
	       
	        System.out.println("\n");
	        System.out.println("Tecle <Enter> para voltar para o Menu do Jogo!");
	       
	        Scanner entrada = new Scanner (System.in);
	       
	        String teclaEnter;
	           
	        teclaEnter = entrada.next();

	    }
	/**
	 *
	 * M�todo para executar o jogo
	 *
	 */
	    public static void executarJogo() {
	       
	        validarRespostaJogo();
	    }
	/**
	 *
	 * M�todo para montar o menu do jogo
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

	                    System.out.println("Resposta correta, na " + qtdResposta + "� tentativa!");

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
	 * M�todo para montar a pergunta exemplo
	 *
	 */
	    public static void montarPerguntaJogo() {
	       
	        System.out.println("=============================================");
	        System.out.println("=   R E S P O N D A   A   P E R G U N T A   =");
	        System.out.println("=============================================");
	        System.out.println("=                                           =");
	        System.out.println("=    O valor em bin�rio do decimal 42 �?    =");
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
	 * M�todo para montar a pergunta 01
	 *
	 */
	    public static void montarPergunta01() {
	       
	        System.out.println("=====================================================");
	        System.out.println("=       R E S P O N D A   A   P E R G U N T A       =");
	        System.out.println("=====================================================");
	        System.out.println("=                                                   =");
	        System.out.println("=    Podemos afirmar que o Power BI �:              =");
	        System.out.println("=                                                   =");
	        System.out.println("=    a) Um editor de texto                          =");
	        System.out.println("=    b) Um banco de dados                           =");
	        System.out.println("=    c) Servi�o de an�lise de neg�cios e de dados   =");
	        System.out.println("=    d) Um jogo RPG (Role Playing Game)             =");
	        System.out.println("=    e) IDE (Integrated Development Enviroment)     =");
	        System.out.println("=                                                   =");
	        System.out.println("=====================================================");

	        System.out.print("Escolha uma resposta: ");
	    }
	}

