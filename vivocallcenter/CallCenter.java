package vivocallcenter;

import java.util.Scanner;

public class CallCenter {

    public static void main(String[] args) {
        SuporteTecnico suporte = new SuporteTecnico();
        Interpretadora interpretadora = new Interpretadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de Suporte Técnico");

        while(true){
            System.out.println("Precione enter para continuar ou digite 0 para sair");
            String input = scanner.nextLine().trim();
            if(input.equals("0")){
                break;
            }
            System.out.println("Escreva seu problema");
            String problema = scanner.nextLine();
            interpretadora.separarFrase(problema);

            String resposta = null;

            for(String palavra : interpretadora.getPalavrasChave()){
                resposta = suporte.buscaSolucao(palavra);
            }
            System.out.println(resposta != null ? resposta : suporte.buscaSolucao(resposta));
        }
        System.out.println("Obrigado por utilizar nosso serviços!");
        scanner.close();
    }
        
}
