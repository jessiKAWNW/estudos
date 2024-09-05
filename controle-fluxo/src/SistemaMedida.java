import java.util.Scanner;
import java.util.Locale;

public class SistemaMedida {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Seja bem vindo a Claro! Escolha um dos planos e assine para mais benefícios:");
        System.out.println("1 - BASIC   2 - MIDIA  3 - TURBO");
        System.out.println("Digite o número do plano que deseja: ");
        int planoEscolhido = scanner.nextInt(); 

        switch (planoEscolhido) {
            case 1:{
                System.out.println("Parabéns! Com com plano BASIC você terá direito a 100 minutos de ligação.");
                break;
            }
            case 2:{
                System.out.println("Parabéns! Com com plano MIDIA você terá direito a 100 minutos de ligação + Whats e Instagram grátis.");
                break;
            }
            case 3:{
                System.out.println("Parabéns! Com com plano MIDIA você terá direito a 100 minutos de ligação + Whats e Instagram grátis + 5GB de Youtube.");
                break;
            }
            default:
                System.out.println("Por favor, escolha uma opção válida entre os 3 planos.");
                break;
        }
    }

}
