public class Ponto2D{
    private double x;
    private double y;


    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ponto2D(Ponto2D ponto){
        setX(ponto.x);
        setY(ponto.y);

    }

    public double calcularDistancia(Ponto2D pontoB){
        return Math.sqrt(Math.pow((x - pontoB.getX()),2) + Math.pow((y - pontoB.getY()),2));
    }

    public double getX() {
        return x;
    }public double getY() {
        return y;
    }public void setX(double x) {
        this.x = x;
    }public void setY(double y) {
        this.y = y;
    }
}