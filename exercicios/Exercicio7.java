package exercicios.faculdade;

public class Exercicio7 {
public static void main(String[] args) {
	//Escreva um programa que imprima todos os m�ltiplos de 7 menores que 200. Use o la�o WHILE
		System.out.println("Imprimiremos todos os multiplos de 7, at� chegar ao 200");
		int controle=1;
		while (controle<200) {
			if (controle%7==0) {
				System.out.println("O numero: "+controle+" um multiplo de 7");
				
			}
			controle++;
		}
}
}
