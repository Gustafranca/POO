package Cassino;
public class Carta{

    private String nipe;
    private int numero;
    
    public Carta(String nipe, int numero){
        this.nipe = nipe;
        this.numero = numero;
    }
    public String getNipe() {
        return nipe;
    }public int getNumero() {
        return numero;
    }public void setNipe(String nipe) {
        this.nipe = nipe;
    }public void setNumero(int numero) {
        this.numero = numero;
    }

    public int ehMaior(Carta carta){
        if(this.numero > carta.getNumero()){
            return 1;
        }else if(this.numero < carta.getNumero()){
                return -1;
        }
        return 0;
    }
}