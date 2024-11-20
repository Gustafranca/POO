public class Estoque{

    private ItemDeProduto[] estoque;

    public Estoque(){
        this.estoque = new ItemDeProduto[7];
    }

    public boolean inserirProduto(ItemDeProduto item){
        for(int i = 0; i<estoque.length; i++){
            if(estoque[i]==null){
                estoque[i] = item;
                return true;
            }
        }
        return false;
    }

    public Estoque(ItemDeProduto[] estoque){
        this.estoque = estoque;
    }
    public void setEstoque(ItemDeProduto[] estoque) {
        this.estoque = estoque;
    }public ItemDeProduto[] getEstoque() {
        return estoque;
    }

}