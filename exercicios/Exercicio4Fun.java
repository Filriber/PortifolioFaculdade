package Fun��es;

import java.util.Scanner;

public class Exercicio4Fun {
	public static int fatorial(int n) {
		int res = 1;
		int x = 2;
		while (x <= n) {
			res = res * x;
			x = x + 1;

		}
		return res;
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

	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}
	public static void imprimirResultado(int r, int x) {
		System.out.println("o Resultado do fatorial dividido pela somat�ria �: "+(r/x));
	}
	public static void imprimirTexto() {
		System.out.println("Escolha o Seu numero para a opera��o");
	}
	

	public static void main(String[] args) {
		imprimirTexto();
		int n = entradaDados();
		int n1 = somatoria(n);
		int n2 = fatorial(n);
		imprimirResultado(n2,n1);
	}
}
