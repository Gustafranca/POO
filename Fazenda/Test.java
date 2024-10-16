package Fazenda;

public class Test {
    public static void main(String[] args) {
        Vaca Daise = new Vaca("Daise", "Branco", 4.500);
        Vaca Adeline = new Vaca("Adeline", "Preta", 3.500);
        Vaca Godofreda = new Vaca("Godofreda", "Bege", 5.0);

        Cavalo Burro = new Cavalo("Burro", "Cinza", 2.500);
        Cavalo Alazao = new Cavalo("Alazao", "Branco", 4.0);

        Galinha Chiquita = new Galinha("Chiquinha", "Preta", 0.500);
        Galinha Karen = new Galinha("Karen", "Bege", 0.420);
        Galinha Branca = new Galinha("Branca", "Branca", 0.300);
    
    
        double consumoVaca = Daise.getConsumo() + Adeline.getConsumo() + Godofreda.getConsumo();
        double consumoCavalo = Burro.getConsumo() + Alazao.getConsumo();
        double consumoGalinha = Chiquita.getConsumo() + Karen.getConsumo() + Branca.getConsumo();

        
        System.out.println("Bom dia Sr. Mc Donald \nAqui está o relatório de hoje: ");
        Chiquita.cocorico();
        Karen.bota();
        Branca.bota();
        System.out.printf("As galinha comeram hoje: %.4f kg. Mensalmente irão consumir: %.4f kg\n", consumoGalinha, consumoGalinha*30);
        Alazao.Adestramento();
        Burro.Correr();
        System.out.printf("Os cavalos comeram hoje %.4f kg. Mensalmente irão consumir: %.4f kg\n", consumoCavalo, consumoCavalo*30);
        Daise.Ordenhar();
        Adeline.Ordenhar();
        Godofreda.Pastar();
        Daise.Pastar();
        Adeline.Pastar();
        System.out.printf("As vacas comeram hoje %.4f kg. Mensalmente irão consumir: %.4f kg\n", consumoVaca, consumoVaca*30);
    }
}
