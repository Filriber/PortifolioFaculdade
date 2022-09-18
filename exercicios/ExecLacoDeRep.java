package com.mycompany.execlacoderep;

import java.util.Scanner;

public class ExecLacoDeRep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ent = 0;
        do {
            System.out.println("Escolha a opção Desejada");
            System.out.println("0 - Sair: ");
            System.out.println("1 - Conversão de Temperatura Cº para Fº: ");
            ent = input.nextInt();
            if (ent == 1) {
                System.out.println("Escolha uma temperatura para conversão");
                float temp = input.nextFloat();
                float conv;
                conv = ((temp * 9 / 5) + 32);
                System.out.println("Você escolheu " + temp + "Cº e a Conversão para fahrenheit fica: " + conv + "Fº");
            continue;
            } else if (ent == 0) {
                System.out.println("Encerrando processo");
            continue;   
            }
            System.out.println("\nOpção inválida, tente novamente\n");
        } while (ent >= 2);
        
    
    
        
          
        

    }

}
