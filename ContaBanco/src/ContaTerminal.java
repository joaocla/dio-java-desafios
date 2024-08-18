import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da conta:");
        int NumeroConta = scanner.nextInt();

        System.out.println("Agora digite o numero da agencia:");
        String NumeroAgencia = scanner.next();
        
        System.out.println("Qual o saldo disponivel para o saque?");
        double SaldoDisponivel = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Digite o nome do cliente");
        String NomeCliente = scanner.nextLine();



        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + NumeroAgencia + ", conta " + NumeroConta + " e seu saldo " + SaldoDisponivel + " já está disponível para saque!");

    }
}
