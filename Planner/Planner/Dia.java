package Planner;

import java.util.HashMap;

public class Dia {
    private HashMap<Integer,Compromisso> compromissos;

    public Dia(){
        this.compromissos = new HashMap<>();
    }
    public boolean inserirCompromisso(int hora ,Compromisso compromisso){
        if(hora < 9 || hora > 17 || compromissos.containsKey(hora)){
            System.out.println("Horario ja ocupado");
            return false;
        }
        for(int i = 0; i < compromisso.getDuracao(); i++){
            compromissos.put(hora + i, compromisso);
        }
        return true;
        
    }
    public Compromisso consultarCompromisso(int hora){
        return compromissos.get(hora);
    }
    public void listarCompromissos() {
        System.out.println("Horário - Compromisso");
        for (int i = 9; i <= 17; i++) {
            if (compromissos.containsKey(i)) {
                System.out.println(i + ":00 - " + compromissos.get(i).getDescricao());
            } else {
                System.out.println(i + ":00 - Livre");
            }
        }
    }


}
