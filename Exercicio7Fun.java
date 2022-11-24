package Funções;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio7Fun {
	public static double entradaDados() {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		return n;
	}

	public static double raioEsf(double r) {
		double v = ((4 / 3) * Math.PI * (Math.pow(r, 3)));
		return v;

	}

	public static void texto() {
		System.out.println("Escolha um numero para ser o parametro do Raio");
	}

	public static void resultado(double r) {
		System.out.println("o Resultado do volume da esfera é: " + r);
	}

	public static void main(String[] args) {
		texto();
		double r = entradaDados();
		resultado(raioEsf(r));

	}
}
