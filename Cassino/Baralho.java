
package Cassino;
import java.util.Random;

public class Baralho {
    private String[] auxNaipe = {"Copas", "Paus", "Espadas", "Ouros"};   
    private Carta[] baralho;
    public Random gerador;

    public Baralho(){
        int contador=0;
        baralho = new Carta[52];
        gerador = new Random();
        for(String naipe: auxNaipe){
            for(int j = 1; j<=13; j++){
                baralho[contador++] = new Carta(naipe, j);
            }
        }
    }

    public void embaralhar(){
        for(int i = 0; i<baralho.length;i++){
            int num = gerador.nextInt(baralho.length);
            Carta aux = baralho[i];
            baralho[i] = baralho[num];
            baralho[num] = aux;
        }
    }

    public Carta[] distribuiCarta(int numero){
        Carta[] retorno = new Carta[numero];
        int contador= 0;
        while(contador<numero){
            if(baralho[contador]!=null){
            retorno[contador] = baralho[contador];
            baralho[contador]=null;
            contador++;
            }
        }
        return retorno;
    }
}
