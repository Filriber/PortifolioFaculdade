package Funções;

import java.util.Scanner;

public class Exercicio10Fun {
	public static String nadador(int idade) {
		String result = "";

		if ((idade >= 5) && (idade <= 7)) {
			result = "Infantil A";
		} else if ((idade >= 8) && (idade <= 10)) {
			result = "Infantil B";
		} else if ((idade >= 11) && (idade <= 13)) {
			result = "Juvenil A";
		} else if ((idade >= 14) && (idade <= 17)) {
			result = "Juvenil B";
		} else if (idade >= 18) {
			result = "Adulto";
		} else if ((idade >= 0) && (idade <= 4)) {
			result = "Você ainda não tem idade para participar da equipe";
		}
		return result;
	}

	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}

	public static void instrucaoIdade() {
		System.out.println("Digite a Sua idade");;
	}
	public static void resultado(String r) {
		System.out.println("Resposta: "+ r);;
	}
	public static void main(String[] args) {
		instrucaoIdade();
		int idade = entradaDados();
		String res = nadador(idade);
		resultado(res);
		
	}
}
