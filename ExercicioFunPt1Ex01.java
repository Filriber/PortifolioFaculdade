package Fun��es;

public class ExercicioFunPt1Ex01 {

	static String status;

	public static void imprimirNota (double nota){
		if (nota >= 6){
		String status = "Voc� foi Aprovado";
		System.out.println(status);
		
		}
		else {
		String status = "Voc� Foi Reprovado";
		System.out.println(status);
		}
		}

	public static void main(String[] args) {
		imprimirNota(5);
		
	}
}
