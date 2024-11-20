package Planner;

import java.util.HashMap;

public class Semana{
    private HashMap<String, Dia> semana;

    private String[] nomes = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira"};
    
    public Semana(){
        semana = new HashMap<>();
        for(String nome : nomes){
            semana.put(nome, new Dia());
        }
    }    
    public boolean inserirCompromisso(String dia, int hora, Compromisso compromisso) {
        if (!semana.containsKey(dia)) {
            System.out.println("Dia inválido.");
            return false;
        }
        return semana.get(dia).inserirCompromisso(hora, compromisso);
    }

    public void listarSemana(){
        for(String dia : nomes){
            System.out.println("\n" + dia + ":");
            semana.get(dia).listarCompromissos();
        }
    }

    public String[] getNomes() {
        return nomes;
    }public HashMap<String, Dia> getSemana() {
        return semana;
    }public void setSemana(HashMap<String, Dia> semana) {
        this.semana = semana;
    }
    
}