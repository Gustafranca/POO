public class Produto{

    private int codigo;
    private String descricao;
    private double preco_unitario;

    public Produto(int codigo, String decricao, double preco_unitario){
        this.codigo = codigo;
        this.descricao = " ";
        this.preco_unitario = preco_unitario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }public int getCodigo() {
        return codigo;
    }public void setDescricao(String descricao) {
        this.descricao = descricao;
    }public String getDescricao() {
        return descricao;
    }public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }public double getPreco_unitario() {
        return preco_unitario;
    }

}