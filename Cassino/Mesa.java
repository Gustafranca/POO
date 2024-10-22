package Cassino;

import Cassino.Baralho;
import Cassino.Jogador;

public class Mesa{
    public static void main(String[] args) {
        Baralho copag = new Baralho();

        copag.embaralhar();

        int numeroCartas = 5;
        Jogador jogador1 = new Jogador(numeroCartas);
        Jogador jogador2 = new Jogador(numeroCartas);

        Carta cartaEscolhida1 = jogador1.escolheMelhor();
        System.out.printf("Jogador 1 joga a carta de nipe %s e de valor %d%n",cartaEscolhida1.getNipe(),cartaEscolhida1.getNumero());
        Carta cartaEscolhida2 = jogador2.escolheMelhor();
        System.out.printf("Jogador 2 joga a carta de naipe %s e de valor %d%n", cartaEscolhida2.getNipe(), cartaEscolhida2.getNumero());
        
        int retorno = 1;
        if(cartaEscolhida1.ehMaior(cartaEscolhida2)==1){
            System.out.println("O jogador1 venceu a partida.");
        }else if(cartaEscolhida1.ehMaior(cartaEscolhida2)==-1){
            System.out.println("O jogador2 venceu a partida.");
        }else{
            System.out.println("O jogo ficou empatado...");
            jogoEmpatado(jogador1,jogador2);
        }
    }

    public void jogoEmpatado(Jogador jogador1, Jogador jogador2){
        Carta cartaEscolhida1 = jogador1.escolheMelhor();
        System.out.printf("Jogador 1 joga a carta de nipe %s e de valor %d%n",cartaEscolhida1.getNipe(),cartaEscolhida1.getNumero());
        Carta cartaEscolhida2 = jogador2.escolheMelhor();
        System.out.printf("Jogador 2 joga a carta de naipe %s e de valor %d%n", cartaEscolhida2.getNipe(), cartaEscolhida2.getNumero());
        
    }
}