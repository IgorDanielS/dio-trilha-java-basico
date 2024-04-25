import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite o nome da Agência:");
        agencia = input.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        numero = input.nextInt();
        System.out.print("Digite o seu nome: ");
        nomeCliente = input.next();
        System.out.print("Digite o saldo da conta: ");
        saldo = input.nextInt();

        System.out.println("Olá " + nomeCliente
                + ", obrigado obrigado por criar uma conta em nosso banco, sua agência é " + agencia  
                + ", conta "+ numero +" e seu saldo " + saldo +" já está disponível para saque");
    }
}
