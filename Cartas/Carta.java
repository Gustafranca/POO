
public class Carta{
    private String naipe;
    private String letra;
    private int numero;

    public Carta(String naipe, String letra, int numero){
        this.naipe = naipe;
        this.letra = letra;
        this.numero = numero;
    }

    public Carta(){
        this.naipe = " ";
        this.letra = " ";
        this.numero = 0;
    }

    public String getNaipe() {
        return naipe;
    }
    public String getLetra() {
        return letra;
    }
    public int getNumero() {
        return numero;
    }
    public void setNaipe(String naipe) {
        this.naipe = naipe.toUpperCase();
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Carta comparaNumero(Carta carta){
        if(this.numero > carta.getNumero()){
            return this;
        }
        return carta;
    }
}