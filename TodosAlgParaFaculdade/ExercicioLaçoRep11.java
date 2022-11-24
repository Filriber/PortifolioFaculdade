package exercicios.faculdade;

import java.util.Scanner;

public class ExercicioLaçoRep11 {
 public static void main(String[] args) {
		
	 Scanner inputInt = new Scanner (System.in);
	 System.out.println("Digite até qual numero quer que seja dividido");
	 int rep = inputInt.nextInt();
	 
	 float x=2, i = 1, res  , div = 0;
		while (i < rep) {
			div += (1 / x);
			i++;
			x++;
		}
		res = 1 + div;
System.out.println(res);
	
  }

}
