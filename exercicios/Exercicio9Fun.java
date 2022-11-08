package Funções;

import java.util.Scanner;

public class Exercicio9Fun {
	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}
	public static void texto() {
		System.out.println("Digite sua idade com Anos, meses e dias para retornar quantos dias ja viveu! ");
	}
	public static int idade(int a, int m, int d) {
		a= a*365;
		m = m*30;
		int resultado = m+a+d;		
		return resultado;
	}
	public static void imprimirResultado(int r) {
		System.out.println("*- Imprimir Resultado -*");
		System.out.println("Resultado " + r);
	}
	public static void main(String[] args) {
		texto();
		int a = entradaDados();
		int m = entradaDados();
		int d = entradaDados();
		int resultado = idade(a, m, d);
		imprimirResultado(resultado);
	}
}
