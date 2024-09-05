public class OperadoresJava {
    public static void main(String[] args) {

        String nome1 = "Jessica";
        String nome2 = new String("Jessica");

        System.out.println(nome1.equals(nome2)); // o equals compara objetos

        // String nomeCompleto = "LINGUAGEM " + "JAVA";
        // System.out.println(nomeCompleto);

        //testar em debug 

        // String concatenacao = 1+1+1+"1";
        // System.out.print(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.print(concatenacao);

        // concatenacao = 1+"1"+1+"1";
        // System.out.print(concatenacao);
        
        // concatenacao = "1"+1+1+1;
        // System.out.print(concatenacao);
        
        // concatenacao = "1"+(1+1+1);
        // System.out.print(concatenacao);

        //incremento de decrescimento

        // int numero =5;
        // numero = numero + 2;
        //numero ++;

        // System.out.println(numero++); //está incrementando depois de printar
        // System.out.println(++numero); //será incrementado antes de printar
        // System.out.println(--numero);

        // boolean variavel = true;
        // System.out.println(!variavel); //imprimie o contrário do valor da variável

        int a, b;

        a = 5;
        b = 5;

        //operador ternário

        String resultado = a == b ? "verdadeiro" : "falso";

        // if (a == b){
        //     resultado = "verdadeiro";
        // }
        // else
        //     resultado = "false";



        System.out.println(resultado);

        int numero1 = 2;
        int numero2 = 3;

        boolean simNao = numero1 == numero2;

        System.out.println("Numéro 1 é igual a núemro 2? " +simNao);

        boolean simNao2 = numero1 != numero2;

        System.out.println("Numéro 1 é diferente que número 2? " +simNao2);

    }

}
