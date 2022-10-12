package exercicios.faculdade;

public class Exercicio4 {
public static void main(String[] args) {
	//Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR
	
	System.out.println("Iremos escrever os numeros de 10 a 1000, somando de 10 em 10");
	for (int Cont = 10; Cont <= 1000; Cont = Cont+10) {
		System.out.print(Cont+", ");
	}
}
}
