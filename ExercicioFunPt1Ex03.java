package Fun��es;

import java.util.Scanner;

public class ExercicioFunPt1Ex03 {

	

	public static float entradaDados() {
		System.out.println("*- Entrada de Dados -*");
		Scanner input = new Scanner(System.in);
		System.out.println("Numero: ");
		float n = input.nextFloat();
		return n;
	}
	public static void teste(float n1) {
		if (n1%2== 0) {
			System.out.println("Seu numero � PAR");
		} else if (n1!=0) {
			System.out.println("Seu numero � IMPAR");
		}
}
	public static void main(String[] args) {

		float n1 = entradaDados();
		teste(n1);
	}
}
