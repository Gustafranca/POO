
import java.util.ArrayList;

public class Delegacao {
    private ArrayList<Modalidade> modalidades;
    private ArrayList<MembroComite> delegacao;

    public Delegacao(){
        this.modalidades = new ArrayList<>();
        this.delegacao = new ArrayList<>();
    }

    public boolean adcionarMembro(MembroComite membro){
        return delegacao.add(membro);
    }
    public boolean adcionarModalidade(Modalidade modalidade){
        return modalidades.add(modalidade);
    }
    public int contaAtletas(){
        int count = 0;
        for(MembroComite membro: delegacao){
            if(membro instanceof Atleta){
                count++;
            }
        }
        return count;
    }
    public int contaTecnicos(){
        int count = 0;

        for(MembroComite membro : delegacao){
            if(membro instanceof Tecnico){
                count++;
            }
        }
        return count;
    }
    public ArrayList<MembroComite> getDelegacao() {
        return delegacao;
    }public void setDelegacao(ArrayList<MembroComite> delegacao) {
        this.delegacao = delegacao;
    }public ArrayList<Modalidade> getModalidades() {
        return modalidades;
    }public void setModalidades(ArrayList<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }
}
