
package exercicios.faculdade;

import java.util.Scanner;

public class SomaDeQuadrados {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Vamos saber a soma do Quadrado de dois numero: ");
        System.out.println("Escolha o primeiro numero: ");
        int n1 = input.nextInt();
        n1 = (n1*n1);
        System.out.println("A raiz Quadrada de n1 é: "+n1);
        System.out.println("Escolha o segundo numero ");
        int n2 = input.nextInt();
        n2 = (n2*n2);
        System.out.println("A raiz Quadrada de n2 é: "+n2);
        int res = n2+n1;
        System.out.println("a soma de "+n1+" e "+n2+" é: "+ res);
              
    }
    
}
