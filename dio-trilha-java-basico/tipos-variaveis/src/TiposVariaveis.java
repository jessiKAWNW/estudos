public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // (se começar com 0 o java pode não armazenar)
        float pi = 3.14F;
        long cpf = 98765432109L; // (se começar com 0 o java pode não armazenar)
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; //esse metódo de converter a variável se cha,a casting
        final double VALOR_DE_PI = 3.14; //usamos a palavra final e também o nome da variável em capslock pra que seu valor não seja alterado 
    }
}
