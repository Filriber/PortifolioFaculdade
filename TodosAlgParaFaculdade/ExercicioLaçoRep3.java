package exercicios.faculdade;

import java.util.Scanner;

public class ExercicioLaçoRep3 {
	public static void main(String[] args) {
		// Escreva um programa que leia um conjunto de 10 números inteiros positivos."
		// Seu programa deve determinar e imprimir o maior deles. Use o laço FOR

		Scanner input = new Scanner(System.in);
		int maiorNum = 0;
		int dig;
		for (int inic = 1; inic <= 10; inic++) {

			System.out.println("Digite um numero: ");
			dig = input.nextInt();

			if (dig > maiorNum) {
				maiorNum = dig;

			}

		}
		System.out.println("o seu maior numero é: " + maiorNum);

	}
}
