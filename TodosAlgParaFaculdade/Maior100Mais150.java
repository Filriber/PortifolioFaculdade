package exercicios.faculdade;

import java.util.Scanner;

public class Maior100Mais150 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos fazer uma operação");
        System.out.println("escolha dois numeros");
        System.out.println("Qual será o primeiro? ");
        int n1 = input.nextInt();
        System.out.println("Agora escolha o segundo numero");
        int n2 = input.nextInt();
        System.out.println("Certo agora vamos a uma conta basica");
        System.out.println("se ele for maior que 100, somaremos com 150");
        System.out.println("E se for menor, multiplicaremos por 3");
        int Res = (n1+n2);
         if (Res>100){
             System.out.println("Res é maior do que 100, logo o resultado da sua conta é: "+(Res+150));
        //adcionei um else aqui só pra dar uma incrementada no exercicio professor    
         }else{System.out.println("Res é menor do que 100, logo o resultado da sua conta é: "+(Res*3));
         }
        
    }
}
