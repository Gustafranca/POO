
package vivocallcenter;

import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> palavrasChave;
    
    public Interpretadora(){
        palavrasChave = new HashSet<>();
    }
    
    private void adicionarPalavra(String palavra){
        palavrasChave.add(palavra);
    }
    
    
    public void separarFrase(String frase){
        String[] palavras = frase.split(" ");
        for(String token: palavras){
            adicionarPalavra(token);
        }
    }
    public HashSet<String> getPalavrasChave() {
        return palavrasChave;
    }
    
    
}
