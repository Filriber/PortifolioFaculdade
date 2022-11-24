package exercicios.faculdade;

import java.util.Scanner;

public class ExercicioLaçoRep6 {
	public static void main(String[] args) {
		// Faça um programa para ler e escrever dados de uma turma de 5 alunos. O
		// programa deve pedir dados como
		// nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho.
		// Use o laço DO-WHILE.

		System.out.println("Sistema de informaçôes dos alunos");
		String nome, sexo, usuario = "", sexoMV = "";
		int idade;
		int maiorId = 0, controle = 0;

		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		do {
			System.out.println("Digite seu nome completo: ");
			nome = inputString.nextLine();
			System.out.println("Digite seu Sexo: ");
			sexo = inputString.nextLine();
			System.out.println("Digite a sua idade: ");
			idade = input.nextInt();

			if (idade > maiorId) {
				maiorId = idade;
				usuario = nome;
				sexoMV = sexo;
			}
			controle++;
		} while (controle < 5);
		System.out.println(usuario + "\n" + sexoMV + "\n" + "\n" + maiorId);

	}
}
