package Mesa;


public class Mesa{
    public static void main(String[] args) {
        Baralho copag = new Baralho();
        
        copag.embaralhar();
        
        int num_cartas = 5;
        Jogador jogador1 = new Jogador(num_cartas);
        Jogador jogador2 = new Jogador(num_cartas);
        
        jogador1.setMao(copag.distribuiCarta(num_cartas));
        jogador2.setMao(copag.distribuiCarta(num_cartas));
        
        // for(Carta aux:jogador1.getMao()){
        //     System.out.print("Mao do jogador 1: " + aux.getNipe()+aux.getNumero()+"\n");
        // }for(Carta aux:jogador2.getMao()){
        //     System.out.print("Mao do jogador 2: " + aux.getNipe()+aux.getNumero()+"\n");
        // }
        while(num_cartas!=0){

            Carta cartaEscolhida1 = jogador1.escolheMelhor();
            System.out.printf("Jogador 1 joga a carta de nipe %s e de valor %d%n",cartaEscolhida1.getNipe(),cartaEscolhida1.getNumero());
            Carta cartaEscolhida2 = jogador2.escolheMelhor();
            System.out.printf("Jogador 2 joga a carta de naipe %s e de valor %d%n", cartaEscolhida2.getNipe(), cartaEscolhida2.getNumero());


            if(cartaEscolhida1.ehMaior(cartaEscolhida2)==1){
                System.out.println("Jogador 1 venceu");
                break;
            }else if(cartaEscolhida2.ehMaior(cartaEscolhida1)==1){
                System.out.println("Jogador 2 venceu.");
                break;
            }else if(cartaEscolhida1.getNipe()=="Ouros" || cartaEscolhida2.getNipe()=="Ouros"){
                if(cartaEscolhida1.getNipe()=="Ouros"){
                    System.out.println("Joagor 1 venceu");
                    break;
                }else{
                    System.out.println("Jogador 2 venceu.");
                    break;
                }
            }else{
                System.out.println("Como o valores das cartas sao iguais e nenhum jogador tem carta de Ouros, o jogo ficou empatado");
            }
            jogador1.jogouCarta(cartaEscolhida1);
            jogador2.jogouCarta(cartaEscolhida2);
            // for(Carta aux:jogador1.getMao()){
            //     System.out.print("Mao do jogador 1: " + aux.getNipe()+aux.getNumero()+"\n");
            // }for(Carta aux:jogador2.getMao()){
            //     System.out.print("Mao do jogador 2: " + aux.getNipe()+aux.getNumero()+"\n");
            // }
            num_cartas--;
        }
    }
}