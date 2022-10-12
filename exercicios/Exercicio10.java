package exercicios.faculdade;

public class Exercicio10 {
	public static void main(String[] args) {
		  
		float x=2, i = 1, res  , div = 0;
		while (i < 20) {
			div += (1 / x);
			i++;
			x++;
		}
		res = 1 + div;
 System.out.println(res);
	}
}
