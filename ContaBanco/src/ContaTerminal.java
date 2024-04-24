import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor insira o numero da agência: ");
        int numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Por favor insira o nome da agência: ");
        String agencia = teclado.nextLine();

        System.out.println("Por favor insisra o nome do cliente: ");
        String nomeCliente = teclado.nextLine();

        System.out.println("Por favor insira o saldo: ");
        float saldo = teclado.nextFloat();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        teclado.close();

    }
}
