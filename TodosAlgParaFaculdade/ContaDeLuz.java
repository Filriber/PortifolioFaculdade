package exercicios.faculdade;

import java.util.Scanner;

public class ContaDeLuz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos calcular a sua conta de luz :D ");
        System.out.println("Digite a sua quantidade de kW usados por hora: ");
        int kWh = input.nextInt();
        double vlrCon;
        if (kWh < 150) {
            vlrCon = kWh * 0.20;
            if (vlrCon < 11.9) {
                System.out.println("Sua conta não atingiu o valor minimo e será cobrada a taxa de R$11,90");
            }else {
            System.out.println("Você utlizou " + kWh + " kWh então a sua conta ficou no valor de R$ " + vlrCon + " Reais");
            }
        } else if ((kWh >= 150) && (kWh < 500)) {
            vlrCon = kWh * 0.25;
            System.out.println("Você utlizou " + kWh + " kWh então a sua conta ficou no valor de R$ " + vlrCon + " Reais");
        } else if (kWh >= 500) {
            vlrCon = kWh * 0.30;
            System.out.println("Você utlizou " + kWh + " kWh então a sua conta ficou no valor de R$ " + vlrCon + " Reais");

        }
    }
}
