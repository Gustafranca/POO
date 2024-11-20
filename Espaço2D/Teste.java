public class Teste {

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(0, 0);
        Ponto2D p2 = new Ponto2D(0, 3);
        Ponto2D p3 = new Ponto2D(4, 0);
        Ponto2D p4 = new Ponto2D(4, 3);


        Forma triangulo = Forma.geraForma(new Ponto2D[]{p1, p2, p3});
        Forma quadrado = Forma.geraForma(new Ponto2D[]{p1, p2, p3, p4});
        Forma circulo = Forma.geraForma(new Ponto2D[]{p1, p2});


        Espaco2D espaco2D = new Espaco2D();
        espaco2D.adicionaForma(triangulo);
        espaco2D.adicionaForma(quadrado);
        espaco2D.adicionaForma(circulo);

        System.out.println("Tipo de triangulo"+ espaco2D.mostraTipoTriangulo());
        System.out.println("Área total: " + espaco2D.calcularAreaTotal());
        System.out.println("Perímetro total: " + espaco2D.calcularPerimetroTotal());
    }
}
