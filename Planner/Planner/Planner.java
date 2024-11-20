package Planner;

import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Semana semana = new Semana();

        while(true){
            System.out.println("Escolha uma opção");
            System.out.println("1) Inserir compromisso");
            System.out.println("2) Exibir agenda");
            System.out.println("0) sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o dia da semana: ");
                    String dia = scanner.nextLine();
                    System.out.println("Infome o horario");
                    int hora = scanner.nextInt();
                    System.out.println("Informe a duração em horas: ");
                    int duracao = scanner.nextInt();
                    System.out.println("Informe a descrição");
                    String descricao = scanner.nextLine();

                    Compromisso compromisso = new Compromisso(descricao, duracao);

                    if(semana.inserirCompromisso(dia, hora, compromisso)){
                        System.out.println("Compromisso inserido.");
                    }
                    break;
                case 2:
                    semana.listarSemana();
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opcao invalida");
                break;
            }
            scanner.close();
        }
    }
}
