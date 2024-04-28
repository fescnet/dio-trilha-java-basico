import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        // declaracao de variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta !");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.nextDouble();
        scanner.close();

        // criacao e exibicao da mensagem usando String.concat
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo ").concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");
        System.out.println(mensagem);
    }
}
