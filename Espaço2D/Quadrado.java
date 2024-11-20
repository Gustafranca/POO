public class Quadrado extends Forma {
    private double aresta;
  
    public Quadrado(double aresta){
        super();
        this.aresta = aresta;
    }

    public double calcularArea(){
        return Math.pow(aresta,2);
    }
    public double calcularPerimentro(){
        return 4*aresta;
    }
}
