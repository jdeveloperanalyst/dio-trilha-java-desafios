import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Informe a Agência!");
        String agencia = scanner.next();

        System.out.println("Informe o Nome do Cliente!");
        String nomeCliente = scanner.next();

        System.out.println("Informe o Saldo!");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
