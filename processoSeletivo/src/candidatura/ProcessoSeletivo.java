package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Jessica", "Maria","Eduarda","Nicole","João"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else
                System.out.println("Contato realizado com sucesso!");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos entrar em contato com o(a) candidato(a) " + candidato + " na " +tentativasRealizadas + " tentativa.");
        }else
            System.out.println("Não conseguimos entrar em contato com o(a) candidato(a) " + candidato + ",numéro máximo de tentativas " +tentativasRealizadas + " realizadas.");

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Jessica", "Maria","Eduarda","Nicole","João"};
        System.out.println("Imprimindo a lista de candidatos pelo indice do elemento: ");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Jessica", "Maria","Eduarda","Nicole","João","Marcos","Julia","Felipe","André","Natalia"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + ", solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        
        double salarioBase = 2000.00;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o usuário com contra proposta.");
        } else {
            System.out.println("Aguardando demais candidatos.");
        }

    }
}
