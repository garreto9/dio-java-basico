import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Solicita e armazena o número da conta
        System.out.println("Por favor, digite o número da conta!: ");
        int numeroConta = scanner.nextInt();

        //Solicita e armazena a agência
        System.out.println("Por favor, digite o número da agência!: ");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        //Solicita e armazena o nome do cliente
        System.out.println("Por favor, digite o nome do cliente!: ");
        String nomeCliente = scanner.nextLine();

        //Solicita e armazena o saldo
        System.out.println("Por favor, digite o saldo a ser depositado pelo cliente para abertura de conta!: ");
        double saldo = scanner.nextDouble();
        
        //Exibe a mensagem formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua conta é " + numeroConta + 
        ", sua agência é " + agencia + " e seu saldo de R$ " + saldo + " reais já está disponível para saque.";
        System.out.println(mensagem);
        
        scanner.close();
    }
}
