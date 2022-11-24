package Funções;

import java.util.Scanner;

public class Exercicio2Fun {
	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}

	public static int somatoria(int n) {
		int res = 0;
		int x = 1;
		while (x <= n) {
			res = res + x;
			x = x + 1;

		}
		return res;
	}

	public static void imprimirTexto(int r) {
		System.out.println("A somatória é: " + r);
	}

	public static void main(String[] args) {
		int n = entradaDados();
		imprimirTexto(somatoria(n));
	}
}
