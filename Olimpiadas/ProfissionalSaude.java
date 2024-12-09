public class ProfissionalSaude extends MembroComite {

    private String especialidade;

    public ProfissionalSaude(String nome, String genero, int idade, String especialidade){
        super(nome, genero, idade);
        this.especialidade = especialidade;
    }
    @Override
    public String exibirDados(){
        String retorno = "Nome: " + nome +"\n"+
                        "Genero: " + genero +"\n"+ 
                        "Idade: "  + idade +"\n"+ 
                        "Especialidade: " + especialidade+"\n";
        return retorno;
    }
    public String getEspecialidade() {
        return especialidade;
    }public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
