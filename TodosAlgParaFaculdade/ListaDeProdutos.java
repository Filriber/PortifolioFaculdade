package exercicios.faculdade;

import java.util.Scanner;


public class ListaDeProdutos {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        
        int Per= 1;
        int nPer= 2;
        int Limp=3;
        int Vest=4;
        
        System.out.println("Digite o código do produto");
        int produto= input.nextInt(); 
        
        switch (produto) {
            case 1:         
                System.out.println("Perecivel");
                break;
            case 2:
                System.out.println("Não Perecivel");
                break;
            case 3: 
                System.out.println("Limpeza");
                break;
            case 4:
                System.out.println("Vestuarios");
                break;
                
                
           
        }        
        
    }
}
