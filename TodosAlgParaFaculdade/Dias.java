package exercicios.faculdade;

import java.util.Scanner;

public class Dias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um mês de 1 a 12: ");
        int mes = input.nextInt();
       
        switch (mes) {
            case 1:
                System.out.println("esse mes tem 31 dias");
                break;
            case 2:
                System.out.println("esse mes tem 28 dias");
                break;
            case 3:
                System.out.println("esse mes tem 31 dias");
                break;
            case 4:
                System.out.println("esse mes tem 30 dias");
                break;
            case 5:
                System.out.println("esse mes tem 31 dias");
                break;
            case 6:
                System.out.println("esse mes tem 30 dias");
                break;
            case 7:
                System.out.println("esse mes tem 31 dias");
                break;
            case 8:
                System.out.println("esse mes tem 31 dias");
                break;
            case 9:
                System.out.println("esse mes tem 30 dias");
                break;
            case 10:
                System.out.println("esse mes tem 31 dias");
                break;
            case 11:
                System.out.println("esse mes tem 30 dias");
                break;
            case 12:
                System.out.println("esse mes tem 31 dias");
                break;
          }
        }

    }
