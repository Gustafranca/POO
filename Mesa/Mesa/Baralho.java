package Mesa;

import java.util.Random;

public class Baralho {
    private String[] auxNaipe = {"Copas", "Paus", "Espadas", "Ouros"};   
    private Carta[] baralho;
    public Random gerador;

    public Baralho(){
        int contador=0;
        baralho = new Carta[52];
        for(String naipe: auxNaipe){
            for(int j = 1; j<=13; j++){
                baralho[contador++] = new Carta(naipe, j);
            }
        }
    }

    public void embaralhar(){
        gerador = new Random();
        for(int i = 0; i<baralho.length;i++){
            int num = gerador.nextInt(baralho.length);
            Carta aux = baralho[i];
            baralho[i] = baralho[num];
            baralho[num] = aux;
        }
    }

    public Carta[] distribuiCarta(int num){
        Carta[] retorno = new Carta[num];
        int contador = 0;
        int i_retorno = 0;
        int i = 0;
        while(contador < num){
            if(baralho[i] != null){
                retorno[i_retorno++] = baralho[i];
                baralho[i] = null;
                contador++;
            }
            i++;
        }
        return retorno;
    }
}
