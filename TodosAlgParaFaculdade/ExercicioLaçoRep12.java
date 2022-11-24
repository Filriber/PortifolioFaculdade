package exercicios.faculdade;

import java.util.Scanner;

public class ExercicioLaçoRep12 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um número natural N e calcule a soma abaixo
		 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
		 * Utilize o laço que lhe for mais conveniente.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero para realizarmos uma operação: ");
		double num = input.nextInt();
		double soma = 0, y = 0, res = 0, resF = 0;
		for (int x = 1; x < 4; x++) {
			soma = soma + (x / (num - y));
			y++;

		}

		res = soma;
		soma = 0;
		y = 2;

		for (int a = 3; a > 0; a--) {
			soma = soma + ((num - y) / a);
			y--;

		}
		resF = soma + res;

		System.out.println("O resultado da sua conta é: " + resF);
    
		
		
		
		// Prova Real do resultado da Conta
	/* double abobra = 0;	 
	abobra = (1/num)+(2/(num-1))+(3/(num-2))+((num-2)/3)+((num-1)/2)+(num/1);
	
	System.out.println(abobra); */
	}
}
