package Endereco;

public class EnderecoTest {
    public static void main(String[] args) {
        Endereco Gustavo = new Endereco("Calunga", "Belo Horizonte", "Ouro preto", 264, 31320110);
        System.out.printf("Endereço de Gustavo%n%s%n%s%n%s%n%d%n%d%n", Gustavo.getLogadouro(),Gustavo.getMunicipio(),Gustavo.getBairro(),Gustavo.getNumero(),Gustavo.getCep());
    }
    


}
