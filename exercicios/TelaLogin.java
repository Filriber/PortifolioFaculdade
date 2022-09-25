package com.mycompany.mavenproject1;
import java.util.Scanner;
public class TelaLogin {
	public static void main(String[] args) {
		String senha, senhaConf;
		Scanner input = new Scanner(System.in);
		System.out.println("Defina a sua senha para entrar no sistema");
		senha = input.nextLine();
		System.out.println("Confirme a senha escolhida: ");
		senhaConf = input.nextLine();

		while (!senha.equals(senhaConf)) {

			System.out.println("Senhas inválidas, tente novamente");
			System.out.println("Defina a sua senha para entrar no sistema");
			senha = input.nextLine();
			System.out.println("Confirme a senha escolhida: ");
			senhaConf = input.nextLine();
		}
		System.out.println("Senha Definidas com Sucesso");
        System.out.println("Agora insira sua senha para acessar:");
        String senhaEnt = input.next();

        if (senhaEnt.equals(senha)) {
            System.out.println("Acesso liberado");
        } else {
            for (int i = 3; i > 0; i--) {
                System.out.println("Voce Digitou a senha errada. Tente novamente! [" + i + "]");
                senhaEnt = input.next();
                if (senhaEnt.equals(senhaConf)) {
                    System.out.println("Acesso Liberado!");
                    break;
                }
                if (i == 1) System.out.println("Acesso negado!");
            }
        }
    }
}
