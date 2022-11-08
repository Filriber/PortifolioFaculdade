package Funções;

import java.util.Scanner;

public class Exercicio1Fun {
	public static int entradaDados(){
		   System.out.println("*- Entrada de Dados -*");
		   Scanner input = new Scanner(System.in);
		   System.out.println("Numero: ");
		   int n = input.nextInt();
		   return n;
}
	public static int teste(int a, int b, int c) {
		int menor= 0;
		if (a<=b && a<=c) {
			menor = a;
		}else if (b<=c && b<=a) {
			menor = b;
		}else {
			menor = c;
		}
		return menor;
		
	}
	public static void imprimirTexto(int r) {
		System.out.println("O menor numero é: "+r);
		
	}
	public static void main(String[] args) {
		int d = entradaDados();
		int f = entradaDados();
		int g = entradaDados();
		int menor = teste( d, f, g);
		imprimirTexto(menor);
				
	}
}