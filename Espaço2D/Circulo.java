public class Circulo extends Forma {
    
    private double raio;

    public Circulo(double raio){
        super();
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI*raio*raio;
    }
    public double calcularPerimentro(){
        return Math.PI*raio*2;
    }
}
