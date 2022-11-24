package Funções;

import java.util.Scanner;

public class Exercicio14Fun {

	public static void texto() {
		System.out.println(
				"Digite 1 numero para termos como inicial, e a quantidade de numeros que vai ser somado sucessivamente após ele: ");
	}

	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}

	public static int operacao(int a, int n) {
		Scanner imput = new Scanner(System.in);
		int cont = 0;
		int controleAux = 0;
		int controle = 1;
		int i = 0;
		controleAux = a;
		cont = a;
		while (controle != n) {
			cont = cont + 1;
			controleAux += cont;
			controle++;
		}
		return controleAux;

	}

	public static void imprimirRes(int r) {
		System.out.println("o resultado da operação é: " + r);
	}

	public static void main(String[] args) {
		texto();
		int a = entradaDados();
		int n = entradaDados();
		int result = operacao(a, n);
		imprimirRes(result);
	}
}
