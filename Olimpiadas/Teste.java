public class Teste {
    public static void main(String[] args) {
        Modalidade natacao = new Modalidade(5, "Natação");
        Modalidade futebol = new Modalidade(22, "Futebol");
        Modalidade corrida = new Modalidade(8, "Corrida");

        Atleta atleta1 = new Atleta("Joao", "Masculino", 25, corrida);
        Atleta atleta2 = new Atleta("Maria", "Feminino", 22, natacao);
        Tecnico tecnico1 = new Tecnico("Carlos", "Masculino", 55, "Treinador", futebol);
        ProfissionalSaude medico1 = new ProfissionalSaude("Gustavo", "Masculino", 23, "Genecologista");
        Delegacao delegacao = new Delegacao();

        delegacao.adcionarMembro(atleta1);
        delegacao.adcionarMembro(atleta2);
        delegacao.adcionarMembro(tecnico1);
        delegacao.adcionarMembro(medico1);

        delegacao.adcionarModalidade(natacao);
        delegacao.adcionarModalidade(corrida);
        delegacao.adcionarModalidade(futebol);

        System.out.println("Total de atletas na delegação: " + delegacao.contaAtletas());

        System.out.println("\n--- Detalhes dos membros da delegação ---");
        for (MembroComite membro : delegacao.getDelegacao()) {
            System.out.println(membro.exibirDados());
        }

        System.out.println("\n--- Modalidades na delegação ---");
        for (Modalidade modalidade : delegacao.getModalidades()) {
            System.out.println("Modalidade: " + modalidade.getDescricao() + ", Limite de Membros: " + modalidade.getLimiteMembros());
        }

    }
}
