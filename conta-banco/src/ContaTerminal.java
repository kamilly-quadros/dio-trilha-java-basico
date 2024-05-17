import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        double saldo;
        String agencia;
        String nomeCliente;

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
