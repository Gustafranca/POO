package Fazenda;

public class Cavalo {
    private String nome;
    private String corPelo;
    private double consumo;

    public Cavalo(String nome, String corPelo, double consumo){
        this.nome = nome;
        this.corPelo = corPelo;
        this.consumo = consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }public void setNome(String nome) {
        this.nome = nome;
    }public double getConsumo() {
        return consumo;
    }public String getCorPelo() {
        return corPelo;
    }public String getNome() {
        return nome;
    }
    
    public void Correr(){
        System.out.printf("O cavalo %s foi no campo. Se quiser o procurar sua cor é %s%n", getNome(), getCorPelo());
    }
    public void Adestramento(){
        System.out.printf("O cavalo %s vai ao adestramento%n", getNome());
    }
}
