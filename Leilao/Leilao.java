import java.util.ArrayList;

public class Leilao {
    private ArrayList<Lote> lote;

    public Leilao(){
        this.lote = new ArrayList<>();
    }
    public void setLote(ArrayList<Lote> lote) {
        this.lote = lote;
    }public ArrayList<Lote> getLote() {
        return lote;
    }

    public void inserirLote(){
        Lote novoLote = new Lote();
        lote.add(novoLote);
    }
    public void recerberLance(int numLote, String descricaoProduto, Lance lance){
        Lote loteAtual = lote.get(numLote);
        for(Produto produto: loteAtual.getProdutos()){
            if(produto.getDescricao().equals(descricaoProduto)){
                if(produto.verificarMaiorLance(lance)){
                produto.setMaiorLance(lance);
                System.out.println("Lance aceito");
                }else{
                    System.out.println("Lance menor que o atual");
                }
                return;
            }
        }
    }

    public void encerrarLeilao(){
        if(!lote.isEmpty()){
            lote.clear();
            System.out.println("Leião encerrado");
        }else{
            System.out.println("Leilao encerrado com produtos em estoque");
        }
    }
    public void listarProdutos(){
        for(int i = 0; i < lote.size(); i++){
            Lote loteAtual = lote.get(i);

            System.out.println("Lote" + i + ": ");
        }
        for(Produto produto : loteAtual.getProdutos()){
            Lance maiorLance = produto.getMaiorLance();
            System.out.println("Produto" + produto.getDescricao());
        }
    }
}
