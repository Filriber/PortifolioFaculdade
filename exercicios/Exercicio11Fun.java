package Funções;

import java.util.Scanner;

public class Exercicio11Fun {
	public static String conceito(double media) {
		String result = "";

		if ((media >= 0) && (media <= 4.9)) {
			result = "D";
		} else if ((media >= 5) && (media <= 6.9)) {
			result = "C";
		} else if ((media >= 7) && (media <= 8.9)) {
			result = "B";
		} else if ((media >= 9) && (media <= 10)) {
			result = "A";
		} else if ((media < 0) || (media > 10)) {
			result = "Favor imputar uma nota valida, tente novamente";
		}

		return result;
	}
	public static void texto() {
		System.out.println("Digite qual foi a sua nota: ");
	}
	
	public static double entradaDados() {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		return n;
}
	public static void resultado(String r) {
		System.out.println("Resposta: "+ r);
	}
	public static void main(String[] args) {
		texto();
		double nota = entradaDados();
		String notaFin = conceito(nota);
		resultado(notaFin);
	}
}
