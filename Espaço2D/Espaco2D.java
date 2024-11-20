import java.util.ArrayList;

public class Espaco2D{

    private ArrayList<Forma> formas;

    public Espaco2D(){
        this.formas = new ArrayList<>();
    }
     
    public void adicionaForma(Forma forma) {
        if (forma != null) {
            formas.add(forma);
        } else {
            System.out.println("Forma inválida!");
        }
    }
    public double calcularAreaTotal(){
        double soma = 0;
        for(Forma forma : formas){
            soma += forma.calcularArea();
        }
        return soma;
    }
    public double calcularPerimetroTotal(){
        double soma = 0;
        for(Forma forma : formas){
            soma += forma.calcularPerimentro();
        }
        return soma;
    }
    public String mostraTipoTriangulo() {
        StringBuilder tipos = new StringBuilder("Tipos de Triângulos:\n");
        for (Forma forma : formas) {
            if (forma instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) forma;
                tipos.append("Triângulo: ").append(triangulo.tipoTriangulo()).append("\n");
            }
        }
        return tipos.toString();
    }
    
}