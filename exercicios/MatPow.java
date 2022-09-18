
package com.mycompany.exercicio;

import java.util.Scanner;

public class MatPow {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Escolha a sua base: ");
        int n1 = input.nextInt();
        System.out.println("Escolha o expoente: ");
        int n2 = input.nextInt();
        System.out.println("o Resultado dessa operação é: "+Math.pow(n1, n2));
        
    }
}
