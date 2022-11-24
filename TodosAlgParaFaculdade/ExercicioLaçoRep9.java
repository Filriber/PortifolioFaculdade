package exercicios.faculdade;

import java.util.Scanner;

public class ExercicioLaçoRep9 {
public static void main(String[] args) {
	//Escreva um programa para ler a quantidade de alunos existentes em uma turma. 
	//Depois disso, o programa deve ler as notas de cada um destes alunos, 
	//calcular e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE
	
	Scanner inpQntAln = new Scanner (System.in);
	Scanner notas = new Scanner (System.in);
	System.out.println("Qual a quantidade de alunos que tem em sua sala: ");
	int qntAln = inpQntAln.nextInt();
	
   int x = 0;
   float soma = 0 , res;
		   


	while (x < qntAln) {
		System.out.println("Qual a nota final do aluno: "+ (x+1));
		float notaF = notas.nextFloat();
		soma += notaF;
		x++;		
	}
	res = soma/2;   
	System.out.println("Média de todas as notas "+res);
}
}
