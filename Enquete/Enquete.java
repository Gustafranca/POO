public class Enquete{

    private int notas[];

    public Enquete(int num_alunos){
        notas = new int[num_alunos];
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    public int[] getNotas() {
        return notas;
    }

    public void frequencia(int notas[], int num_alunos){
        int[] frequencia = new int[11];

        for(int nota:notas){
            frequencia[nota]++;
        }
        for(int i = 0; i<=10;i++){
            System.out.println("A nota " + i + " foi votada " + frequencia[i]+"x");
        }
    }

    public double media(int aluno[], int num_aluno){
        int count = 0;
        for(int i = 0; i<num_aluno;i++){
            count += aluno[i];
        }
        return (double) count/num_aluno;

    }

    public int contaCliente(){
        return notas.length;
    }
}