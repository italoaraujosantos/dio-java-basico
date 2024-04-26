import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();
        System.out.println("---------------- CONTA BANCÁRIA ----------------------------");
        System.out.println("Informe o número da conta (1243): ");
        contaTerminal.setNumero(scanner.nextInt());
        System.out.println("\n");
        System.out.println("Agora digite o número da Agência: (123-8)");
        contaTerminal.setAgencia(scanner.next());
        System.out.println("\n");

        System.out.println("Me informe seu nome: ");
        contaTerminal.setNomeCliente(scanner.next());
        scanner.nextLine();
        System.out.println("\n");

        System.out.println("Informe valor deposito abertura conta: ");
        contaTerminal.depositar(scanner.nextDouble());

        System.out.println("\n");

        System.err.println("------- DADOS CONTA ABERTA ----------");
        contaTerminal.exibirDados();

        scanner.close();

    }
}
