
import java.util.Arrays;

public class Triangulo extends Forma {

    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    public Triangulo(double cateto1, double cateto2, double hipotenusa){
        double[] vec = {cateto1,cateto2,hipotenusa};
        Arrays.sort(vec);
        this.cateto1 = vec[0];
        this.cateto2 = vec[1];
        this.hipotenusa = vec[2];

    }

    public boolean condicaoDeExistencia(){
        return cateto1+cateto2 > hipotenusa? true : false;
    }
    public double calcularArea(){
        return (cateto1 * cateto2) / 2;        
    }
    public double calcularPerimentro(){
        return cateto1+cateto2+hipotenusa;
    }
    public String tipoTriangulo(){
        if(cateto1 == cateto2 && cateto1 == hipotenusa){
            return "Equilatero";
        }
        else if(cateto1 == cateto2 || cateto1 == hipotenusa || cateto2 == hipotenusa){
            return "Isoceles";
        }else{
            return "Escaleno";
        }
    }

}
