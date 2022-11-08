package Funções;

import java.util.Scanner;

public class Exercicio8Fun {
	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}

	public static boolean testePrimo() {
		int num = entradaDados();
		boolean r = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				r = false;
				return r;
			}
		}
		return r;

	}public static void imprimirResultado(boolean r) {
		System.out.println("o numero é primo? " + r);
		
	}
	public static void imprimirTexto() {
		System.out.println("Escolha um numero inteiro para saber se é um numero primo");
	}
 public static void main(String[] args) {
	 imprimirTexto();
	 boolean r = testePrimo();
	 imprimirResultado(r);
	 
}
}
