package exercicios.faculdade;

public class ExercicioLa�oRep8 {
public static void main(String[] args) {
	
	//Calcular e mostrar a m�dia aritm�tica dos n�meros pares 
	//compreendidos entre 13 e 73. Utilize o la�o que lhe for mais conveniente.
	System.out.println("fazer a m�dia aritim�tica de todos numeros entre 13 e 73 ");
	int controle = 13;
	int soma = 0;
	while (controle<73) {
		if (controle%2==0) {
			soma = soma+controle;
			System.out.println(soma);
		}
		controle++;
	 
	}
	soma = soma/2;
	System.out.println(soma);
	
	
}
}
