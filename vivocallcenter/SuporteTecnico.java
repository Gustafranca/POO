package vivocallcenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SuporteTecnico {

    private HashMap<String, String> bancoSolucoes;
    private ArrayList<String> respostaPadrao;
    private Random gerador;

    public SuporteTecnico() {
        bancoSolucoes = new HashMap<>();
        respostaPadrao = new ArrayList<>();
        gerador = new Random();
        preencheBancoSolucoes();
        preencheRespostaPadrao();
    }

    private void preencheBancoSolucoes() {
        bancoSolucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
        bancoSolucoes.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
        bancoSolucoes.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
    }

    private void preencheRespostaPadrao() {
        respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
    }
    
    public String buscaSolucao(String palavra){
        if (bancoSolucoes.get(palavra) != null){
            return bancoSolucoes.get(palavra);
        }
        return buscaSolucaoPadrao();
    }
    
    private String buscaSolucaoPadrao(){
        /*int tamanho = respostaPadrao.size();
        int indice = gerador.nextInt(tamanho);
        return respostaPadrao.get(indice);
        */
        return respostaPadrao.get(gerador.nextInt(respostaPadrao.size()));
    }

}
