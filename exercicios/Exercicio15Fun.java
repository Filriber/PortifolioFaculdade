package Funções;

import java.util.Scanner;

public class Exercicio15Fun {
public static int xElevadoaZ(int a, int b) {
	int resultAux = 0;
	int result = a * a;
	int controller = b - 2;

	while (controller != 0) {
		result = result * a;
		resultAux =+ result;
		controller--;
	}
	return resultAux;
}
public static int entradaDados() {
	Scanner	input = new Scanner (System.in);
	int n = input.nextInt();
	return n;
}
public static void imprimirResultado(int r) {
	System.out.println("o resultado da sua operação é: "+r);
}
public static void imprimirTexto() {
	System.out.println("Escolha um numero pra termos como base, e outro para fazer potencia dele: ");
}
public static void main(String[] args) {
	imprimirTexto();
	int x = entradaDados();
	int z = entradaDados();
	int res = xElevadoaZ(x, z);
	imprimirResultado(res);
	
	
}
}
