package Funções;

import java.util.Scanner;

public class Exercicio3Fun {
	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}

	public static int fatorial(int n) {
		int res = 1;
		int x = 2;
		while (x <= n) {
			res = res * x;
			x = x + 1;

		}
		return res;
	}
	public static void imprimirTexto(int r) {
		System.out.println("o Fatorial é: "+r);
	}

	public static void main(String[] args) {
		int n = entradaDados();
		imprimirTexto(fatorial(n));
	}
}
