package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scan.next();

        System.out.println("Saldo a depositar: ");
        double saldoConta = scan.nextDouble();

        System.out.println("Olá, " + nomeCliente +", agradecemos por criar uma conta em nosso banco! Sua agência é "
                + agencia + " conta " + numeroConta + ". Seu saldo de: " +saldoConta + " está disponível!");

    }
}