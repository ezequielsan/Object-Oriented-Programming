package lapiseiragrafites;

import java.util.HashMap;

public class Grafite {
    private float calibre;
    private String dureza;
    private int tamanho;
    
    static HashMap<String, Integer> tiposDurezas = new HashMap<>();
    
    static {
    	tiposDurezas.put("HB", 1);	
    	tiposDurezas.put("2B", 2);	
    	tiposDurezas.put("4B", 4);	
    	tiposDurezas.put("6B", 6);	
    }
    
    Grafite(float calibre, String dureza, int tamanho) {
    	if(calibre < 0 || tamanho < 0) {
    		throw new RuntimeException("fail: nao e permitido valores negativos");
    	}
    	else if(!tiposDurezas.containsKey(dureza)) {
    		throw new RuntimeException("fail: dureza inválida");
    	}
    	else {
    		this.calibre = calibre;
    		this.dureza = dureza;
    		this.tamanho = tamanho;
    	}
    }
    
    public float getCalibre() {
    	return this.calibre;
    }
    
    public int getTamanho() {
    	return this.tamanho;
    }
    
    public void setTamanho(int tamanho) {
    	this.tamanho = tamanho;
    }
    
    public int desgastePorFolha() {
    	return tiposDurezas.get(this.dureza);
    }
 
    public String toString() {
    	return String.format("[%.2f:%s:%d]", calibre, dureza, tamanho);
    }
}


