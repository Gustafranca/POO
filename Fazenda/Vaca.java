package Fazenda;

public class Vaca {
    private String nome;
    private String corPelo;
    private double consumo;

    public Vaca(String nome, String corPelo, double consumo){
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

    public void Ordenhar(){
        System.out.printf("Vaca %s é ordenhada.%n", getNome());
    }
    public void Pastar(){
        System.out.printf("Vacas foram pastar.%n", getNome());
    }
}
