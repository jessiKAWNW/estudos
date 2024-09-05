import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Olá,seja bem-vindo ao sistema do Banco. Insira os dados abaixo para se cadastrar no aplicativo:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta de 4 dígitos: ");
        int numero = scanner.nextInt();

        System.err.println("Digite o núemero da angência: ex: 000-0");
        String agencia = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo: ex: 500.00 ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " +sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero + ",e seu saldo " + saldo + " já está disponível para saque");






    }
}
