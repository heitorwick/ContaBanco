import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo:");
        String nomeCliente = scanner.nextLine(); // Usamos nextLine() para ler o nome completo

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();


        System.out.println("\n--- Conta Criada com Sucesso ---\n");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}