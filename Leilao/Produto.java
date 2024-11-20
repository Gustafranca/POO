public class Produto {
    private String descricao;
    private Lance maiorLance;


    public Produto(String descricao, Lance maiorLance){
        this.descricao = " ";
        this.maiorLance = maiorLance;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }public String getDescricao() {
        return descricao;
    }public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }public Lance getMaiorLance() {
        return maiorLance;
    }

    public boolean verificarMaiorLance(Lance lance){
        if(maiorLance.getValor()>lance.getValor()){
            return false;
        }else{
            return true;
        }
    }
}
