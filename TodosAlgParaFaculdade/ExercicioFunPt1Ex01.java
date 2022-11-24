package Funções;

public class ExercicioFunPt1Ex01 {

	static String status;

	public static void imprimirNota (double nota){
		if (nota >= 6){
		String status = "Você foi Aprovado";
		System.out.println(status);
		
		}
		else {
		String status = "Você Foi Reprovado";
		System.out.println(status);
		}
		}

	public static void main(String[] args) {
		imprimirNota(5);
		
	}
}
