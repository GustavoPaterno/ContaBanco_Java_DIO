
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da agencia: ");
        numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o codigo da agencia: ");
        agencia = sc.nextLine();


        System.out.println("Digite o nome da agencia: ");
        nomeCliente = sc.nextLine();


        System.out.println("Digite seu saldo: ");
        saldo = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" ja esta disponivel para saque");
        sc.nextLine();
        sc.close();
    }
}
