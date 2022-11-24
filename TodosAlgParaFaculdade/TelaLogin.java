package exercicios.faculdade;
import java.util.Scanner;

public class TelaLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha, senhaConf, login, user;
        System.out.println("Escolha o Seu nome de usuario: ");
        login = input.nextLine();
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
        System.out.print("Nome de usuario: ");
        user = input.nextLine();
        while (!user.equals(login)) {
            System.out.println("Nome de usuario incorreto");
            System.out.println("Digite novamente");
            System.out.print("Nome de usuario: ");
            user = input.nextLine();

        }
        System.out.print("Olá " + user + "!\n");
        System.out.print("Senha: ");
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
                if (i == 1) {
                    System.out.println("Acesso negado!");
                }
            }
        }
    }

}