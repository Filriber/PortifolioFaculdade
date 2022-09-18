
package com.mycompany.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Agora iremos descobrir se a divisão é exata ou não");
        System.out.println("Escolha o primeiro numero: ");
        int n1 = input.nextInt();
        System.out.println("Agora escolha o segundo numero: ");
        int n2 = input.nextInt();
        float res = (n1%n2);
        
        if (res==0){
            System.out.println("Os seus numeros tem uma divisão exata, bobo");
            
        }else{ System.out.println("O seu numero não tem divisão exata");
        }
    }
    
}
