public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"JOÃO","FELIPE","MARCOS","JULIA"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " +aluno);
        }

        // for(int x = 0; x < alunos.length; x++){
        //     System.out.println("O aluno do indice x = " + x + " é: " +alunos[x]);
        // }
    }

}
