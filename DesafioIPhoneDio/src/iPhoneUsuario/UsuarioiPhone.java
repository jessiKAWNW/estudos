package iPhoneUsuario;
import aparelhoTelefonico.AparelhoEletronico;
import iphone.CelulariPhone;
import navegadorInternet.NavegadorInternet;
import reprodutoMusical.ReprodutorMusical;
import java.util.Scanner;
import java.util.Locale;

public class UsuarioiPhone {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        boolean ligado = true;

        while (ligado) {
            System.out.println("Seja bem-vindo(a) ao sistema do iPhone.");
            System.out.println("Escolha uma das 3 principais funções do iPhone: 1 - Telefone 2 - Navega2dor de internet 3 - Reprodutor musical");
            
            int escolha = scanner.nextInt();

            executarEscolha(escolha);

            System.out.println("Deseja sair? 'Sim' ou 'Não'");
            String desligar = scanner.next();

            if(desligar.equalsIgnoreCase("Sim")){
                ligado = !ligado;
                System.out.println("Aparelho desligado");
            }
        }
    }
    public static void executarEscolha(int escolha){
        CelulariPhone iphone = new CelulariPhone();

        AparelhoEletronico aparelhoEletronico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;

        Scanner scanner = new Scanner(System.in);

        switch (escolha) {
            case 1:{

                System.out.println("Digite o número para ligar:");
                String numero = scanner.next();

                aparelhoEletronico.ligar(numero);
                aparelhoEletronico.atender();
                aparelhoEletronico.iniciarCorreioVoz();

                break;
            }
            case 2:{

                System.out.println("Digite a URL do site que deseja acessar:");
                String url = scanner.next();

                navegadorInternet.adicionarNovaAba();
                navegadorInternet.exibirPagina(url);
                navegadorInternet.atualizarPagina();
                
                break;
            }
            case 3:{
                reprodutorMusical.selecionarMusica();
                reprodutorMusical.tocarMusica();
                reprodutorMusical.pausarMusica();

                break;
            }
            default:
                System.out.println("Por favor, escolha uma opção válida entre os 3 planos.");
                break;
            }
            
        }

    } 
    

