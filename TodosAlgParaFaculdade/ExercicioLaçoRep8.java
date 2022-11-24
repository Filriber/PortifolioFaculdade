package exercicios.faculdade;

public class ExercicioLaçoRep8 {
public static void main(String[] args) {
	
	//Calcular e mostrar a média aritmética dos números pares 
	//compreendidos entre 13 e 73. Utilize o laço que lhe for mais conveniente.
	System.out.println("fazer a média aritimética de todos numeros entre 13 e 73 ");
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
