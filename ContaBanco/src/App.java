import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();
        System.out.println("---------------- CONTA BANCÁRIA ----------------------------");
        System.out.println("Informe o número da conta (1243): ");
        contaTerminal.setNumero(scanner.nextInt());
        
        System.out.println("Agora digite o número da Agência: (123-8)\n");
        contaTerminal.setAgencia(scanner.next());
     
        System.out.println("Me informe seu nome: \n");
        contaTerminal.setNomeCliente(scanner.next());
        scanner.nextLine();
        
        System.out.println("Informe valor deposito abertura conta: \n");
        contaTerminal.setSaldo(scanner.nextFloat());

        System.err.println("------- DADOS CONTA ABERTA ----------\n");
        contaTerminal.exibirDados();

        scanner.close();

    }
}
