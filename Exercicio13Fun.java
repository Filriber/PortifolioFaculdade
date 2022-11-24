package Funções;

import java.util.Scanner;

public class Exercicio13Fun {
	public static int divisores(int n1) {
		int div = 0;
		while (n1 > 0) {
			if (n1 % 2 == 0) {
				div++;
				n1--;
			} else {
				n1--;
			}
		}
		return div;
	}

	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}

	public static void texto() {
		System.out.println("Digite o seu numero, para saber qnts divisores tem: ");
	}

	public static void main(String[] args) {
		texto();
		int num = entradaDados();
		int result = divisores(num);
		System.out.println(result);

	}
}
