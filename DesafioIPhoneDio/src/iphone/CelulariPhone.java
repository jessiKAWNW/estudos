package iphone;

import aparelhoTelefonico.AparelhoEletronico;
import navegadorInternet.NavegadorInternet;
import reprodutoMusical.ReprodutorMusical;

public class CelulariPhone implements AparelhoEletronico,NavegadorInternet,ReprodutorMusical{

    public void ligar(String numero){
        System.out.println("Ligando do Celular iPhone");
    }
    public void atender(){
        System.out.println("Atendendo do celular iPhone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz pelo iPhone");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo página pelo iPhone");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando aba pelo iPhone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página pelo iPhone");
    }
    public void tocarMusica(){
        System.out.println("Tocando música pelo iPhone");
    }
    public void pausarMusica(){
        System.out.println("Pausando música pelo iPhone");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música pelo iPhone");
    }


    
    
}