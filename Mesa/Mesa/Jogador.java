package Mesa;
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
            if(maior.ehMaior(aux)!=1||aux!=null){
                maior = aux;
            }
        }
        return maior;
    }
    public void jogouCarta(Carta cartaEscolhida){
        for(int i = 0; i < mao.length; i++){
            if(mao[i]==cartaEscolhida){
                mao[i]=null;
            
                for(int j = i; j < mao.length-1;j++){
                    mao[j] = mao[j+1];
                }
                mao[mao.length-1] = null;
            }
        }

        Carta[] novaMao = new Carta[mao.length-1];
        for(int i = 0; i<mao.length-1;i++){
            novaMao[i] = mao[i];
        }
        setMao(novaMao);

    }
}
