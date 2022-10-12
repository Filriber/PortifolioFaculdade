package exercicios.faculdade;

import java.util.Scanner;

public class Exercicio2 {
 public static void main(String[] args) {
	System.out.println("Digite um numero para somar de 1 até o Seu numero");
	Scanner input = new Scanner(System.in);
	
	int n;
	int inicio = 1 ;
	int soma = 0;
	
	
	n = input.nextInt();
	while (inicio<=n) {
		soma = soma+inicio;
		inicio=inicio+1;
		
		
	}
	System.out.println("o seu resultado é: "+soma);
	}

}

