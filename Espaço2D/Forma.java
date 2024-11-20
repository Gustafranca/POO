public abstract class Forma {
    public abstract double calcularArea();
    public abstract double calcularPerimentro();
    public static Forma geraForma(Ponto2D [] pontos){
        if(pontos.length == 4){
            if(pontos[0].calcularDistancia(pontos[1]) == pontos[2].calcularDistancia(pontos[3])){
                Quadrado quadrado = new Quadrado(pontos[0].calcularDistancia(pontos[1]));
                return quadrado;
            }
        }else{
            if(pontos.length==3){
                Triangulo triangulo = new Triangulo(pontos[0].calcularDistancia(pontos[1]), 
                                                    pontos[1].calcularDistancia(pontos[2]), 
                                                    pontos[0].calcularDistancia(pontos[2]));
                if(triangulo.condicaoDeExistencia()){
                    return triangulo;
                }else{
                    System.out.println("Não existe");
                }
            }else{
                if(pontos.length==2){
                    Circulo circulo = new Circulo(pontos[0].calcularDistancia(pontos[1]));
                    return circulo;
                }
            }
        }
        return null;
    }


}
