package exercicios.faculdade;

import java.util.Scanner;


public class Vogal {
    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
         System.out.println("Escolha a letra que você pensou: ");
         String letra = input.next();
         System.out.println("a Sua letra é "+letra);
         char vogais = 'C';
         
         if ((vogais =='a')&&(vogais=='e')&& (vogais== 'i') && (vogais=='o') && (vogais=='u')){
             vogais=1;
             }           
        
         switch (vogais){
             case 1 :
                 System.out.println("Sua letra é vogal");
                 break;
             default:
                 System.out.println("Sua letra é consoante");
             
         }
    }
    
}
