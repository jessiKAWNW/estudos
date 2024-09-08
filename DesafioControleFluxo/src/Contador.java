import java.util.Locale;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt(); 
        System.out.println("Digite o segundo valor: ");
        int segundoValor = scanner.nextInt(); 
        
        contar(primeiroValor, segundoValor);

        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int primeiroValor,int segundoValor) throws ParametrosInvalidosException{

        if(primeiroValor > segundoValor){
            throw new ParametrosInvalidosException();
        }
        int contagem = segundoValor - primeiroValor;
    
        for(int numeroImpresso = 0;numeroImpresso < contagem; numeroImpresso++){
            System.out.println("Imprimindo o número " +numeroImpresso);
        }
    }
}
