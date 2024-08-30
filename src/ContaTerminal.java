import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite  o número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Digite o número da agência: ");
        String numeroDaAgencia = sc.next();
        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine();
        String nomeDaConta = sc.nextLine();
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoDaConta = sc.nextDouble();

        System.out.println("\n---------------------------------------------");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco\n", nomeDaConta);

        System.out.println("\nDados da conta: ");
        System.out.printf("Titular: %s", nomeDaConta);
        System.out.printf("\nAgência: %s     conta: %d.",numeroDaAgencia, numeroDaConta );
        System.out.printf("\nSaldo : R$ %.2f", saldoDaConta);

        System.out.printf("\nSeu saldo de R$ %.2f já está disponível para saque.", saldoDaConta);
        System.out.println("\n---------------------------------------------");

        sc.close();
    }
}
