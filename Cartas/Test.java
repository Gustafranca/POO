public class Test {

     public static void main(String[] args) {
        Carta queen = new Carta();
        Carta king = new Carta();
        

        queen.setLetra("Q");
        queen.setNaipe("Copas");
        queen.setNumero(12);

        king.setLetra("K");
        king.setNaipe("Copas");
        king.setNumero(13);

        System.out.printf("%s %s %d%n",queen.getLetra(), queen.getNaipe(), queen.getNumero());
        System.out.printf("%s %s %d%n",king.getLetra(), king.getNaipe(), king.getNumero());


        Carta zap = new Carta("Paus", "4", 4);

        System.out.printf("%s %s %d %n",zap.getLetra(), zap.getNaipe(), zap.getNumero());


        System.out.println("Maior carta "+ queen.comparaNumero(king).getNumero());
     }
}