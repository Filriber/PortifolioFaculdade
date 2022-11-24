package exercicios.faculdade;

public class ExercicioLaçoRep5 {
public static void main(String[] args) {
	
 //. Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente, ou seja, o laço
	//deve iniciar em 100 e encerrar em 1. Use o laço FOR.
	
	System.out.println("Decrescente de 100 a 1: ");
	
	for(int inic = 100; inic >= 1 ; inic --) {
		if (inic %2==0) {
			System.out.println("Numero par: "+inic);
			
		//}else if (inic%2!=0) {
			//System.out.println("Numero impar: "+inic);
		}
	}
}
}
