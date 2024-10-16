package Fazenda;

public class Galinha{
    private String nome;
    private String corPena;
    private double consumo;

    public Galinha(String nome, String corPena, double consumo){
        this.nome = nome;
        this.corPena = corPena;
        this.consumo = consumo;
    }
    
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }public void setCorPena(String corPena) {
        this.corPena = corPena;
    }public void setNome(String nome) {
        this.nome = nome;
    }public double getConsumo() {
        return consumo;
    }public String getCorPena() {
        return corPena;
    }public String getNome() {
        return nome;
    }

    public void cocorico(){
        System.out.printf("COCORICOOOOOOOOOOO \n%s deu bom dia %n", getNome());
    }
    public void bota(){
        System.out.printf("%s bota ovo. %n", getNome());
    }
}