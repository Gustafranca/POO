package Flor;

public class Flor {
    private String cor;
    private String tipo;
    private double preco;
    
    public Flor(String cor, String tipo, double preco){
        this.cor = cor;
        this.tipo = tipo;
        this.preco = preco;
    }
    
    public String getCor() {
        return cor;
    }
    public double getPreco() {
        return preco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
