package Funções;

import java.util.Scanner;

public class Exercicio12Fun {
	public static double altura(double alt, double genero) {
		double peso = 0;
		if (genero == 1) {
			peso = ((72.7 * alt) - 58);
			return peso;
		} else if (genero == 2) {
			peso = ((62.1 * alt) - 44.7);
			return peso;
		}
		return peso;
	}

	public static void texto() {
		System.out.println(
				"Digite qual a sua altura, para saber seu peso ideal. digite 1 para sexo masculino e 2 para sexo feminino ");
	}

	public static double entradaDados() {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		return n;
	}

	public static void imprimirResul(double n) {
		System.out.println("O seu peso ideal é: " + n);
	}

	public static void main(String[] args) {
		texto();
		double altura = entradaDados();
		double genero = entradaDados();
		double resultado = altura(altura, genero);
		imprimirResul(resultado);

	}
}
