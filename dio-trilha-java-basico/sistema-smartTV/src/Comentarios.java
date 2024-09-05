 public class Comentarios {
    public static void main(String[] args) {
        
        //Olá,sou um comentário em uma única linha

        /*Olá
        *eu sou um comentario
        *que posso ser um pouco mais 
        *detalhado se necessário.
        */

    }
    
    /**Essas duas estrelinhas
     * mostra que deseja fazer
     * um comentário a nível 
     * de documentação
    */

    public int somaMultiplica(int n,int x,String m){
        int r = 0;
        if(m == "M"){
            r = n * x;
        } else{
            r = n + x;
        }
        return r;
    }

}
