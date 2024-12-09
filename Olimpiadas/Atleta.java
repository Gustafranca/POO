public class Atleta extends MembroComite{
    private Modalidade modalidade;

    public Atleta(String nome, String genero, int idade, Modalidade modalidade){
        super(nome, genero, idade);
        this.modalidade = modalidade;
    }
    @Override
    public String exibirDados() {
        String retorno = "Nome: " + nome +"\n"+
                        "Genero: " + genero+"\n" + 
                        "Idade: "  + idade+"\n" + 
                        "Modalidade: " + modalidade.getDescricao()+"\n";
        return retorno;
    }
    public Modalidade getModalidade() {
        return modalidade;
    }public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
