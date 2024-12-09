public abstract class MembroComite{
    protected String nome;
    protected String genero;
    protected int idade;

    public MembroComite(String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public abstract String exibirDados();

    
    public String getGenero() {
        return genero;
    }public void setGenero(String genero) {
        this.genero = genero;
    }public int getIdade() {
        return idade;
    }public void setIdade(int idade) {
        this.idade = idade;
    }public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }
}