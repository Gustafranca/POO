public class TesteLeilao {
    public static void main(String[] args) {
        // Criação do Leilão
        Leilao leilao = new Leilao();

        // Criação de pessoas para dar lances
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setContato("joao@example.com");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setContato("maria@example.com");

        // Criação de produtos
        Produto produto1 = new Produto("Quadro Van Gogh", null);
        Produto produto2 = new Produto("Relógio Antigo", null);

        // Criação de lotes e inserção de produtos
        Lote lote1 = new Lote();
        lote1.inserirProduto(produto1);
        lote1.inserirProduto(produto2);

        leilao.inserirLote();  // Inserir um lote vazio
        leilao.getLote().get(0).inserirProduto(produto1);  // Inserir produto no lote 1
        leilao.getLote().get(0).inserirProduto(produto2);  // Inserir produto no lote 1

        // Criar lances
        Lance lance1 = new Lance(pessoa1, 1000.00);
        Lance lance2 = new Lance(pessoa2, 1200.00);
        Lance lance3 = new Lance(pessoa1, 1300.00);

        // Receber lances para os produtos no leilão
        leilao.recerberLance(0, "Quadro Van Gogh", lance1); // João oferece 1000
        leilao.recerberLance(0, "Quadro Van Gogh", lance2); // Maria oferece 1200
        leilao.recerberLance(0, "Relógio Antigo", lance3);  // João oferece 1300

        // Listar os produtos e seus maiores lances antes de encerrar o leilão
        System.out.println("\nProdutos leiloados e valores:");
        leilao.listarProdutosLeiloados();

        // Encerrar o leilão
        leilao.encerrarLeilao();

        // Tentar listar produtos após encerrar o leilão
        System.out.println("\nTentativa de listar produtos após encerrar o leilão:");
        leilao.listarProdutosLeiloados();
    }
}
