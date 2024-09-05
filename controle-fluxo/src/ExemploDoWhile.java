import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        } while(tocando());

        System.out.println("Alô!!");

    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; //entre os valores de 1 a 3 se for 1 ele terá atendido
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        
        return ! atendeu;
    }

}
