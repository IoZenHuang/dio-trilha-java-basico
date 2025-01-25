import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = sc.nextLine();

        
        System.out.println("Digite o numero da agencia: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroAgencia = sc.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    
        sc.close();
    }
}
