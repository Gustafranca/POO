package Cassino;
public class Jogador {
    private Carta[] mao;

    public Jogador(int num){
        mao = new Carta[num];

    }
    public Carta[] getMao() {
        return mao;
    }public void setMao(Carta[] mao) {
        this.mao = mao;
    }
    public Carta escolheMelhor(){
        Carta maior = mao[0];
        for(Carta aux : mao){
            if(maior.ehMaior(aux)!=1){
                maior = aux;
            }
        }
        return maior;
    }
}
