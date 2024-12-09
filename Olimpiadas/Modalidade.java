public class Modalidade {
    private int limiteMembros;
    private String descricao;

    public Modalidade(int limiteMembros, String descricao){
        this.limiteMembros = limiteMembros;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }public void setDescricao(String descricao) {
        this.descricao = descricao;
    }public int getLimiteMembros() {
        return limiteMembros;
    }public void setLimiteMembros(int limiteMembros) {
        this.limiteMembros = limiteMembros;
    }
}
