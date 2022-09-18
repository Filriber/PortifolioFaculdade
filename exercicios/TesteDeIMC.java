package com.mycompany.exercicios;

import java.util.Scanner;

public class TesteDeIMC {

    public static void main(String[] args) {
        System.out.println("Vamos Descobrir como está seu IMC?");
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu peso: ");
        float peso = input.nextFloat();
        System.out.print("Qual a sua altura: ");
        float altura = input.nextFloat();
        float imc = (peso / (altura * altura));
        System.out.println("o Seu imc é igual a: "+imc);
        System.out.println("Menor que 26 é normal\n26 a 29 é obeso\n30 pra cima é obeso mórbido");
        if (imc < 26) {
            System.out.println("Você está no peso ideal");
        } else if ((imc >= 26)&& (imc<30)) {
              System.out.println("Você está obeso");
        }else if (imc>=30){
            System.out.println("Você está com obesidade mórbida, procure tratamento");
        }
    }

}


