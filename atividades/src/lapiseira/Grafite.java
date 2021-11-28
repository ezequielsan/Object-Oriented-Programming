package lapiseira;

import java.util.*;

class Grafite {
	
    private float calibre;
    private String dureza;
    private int tamanho;
    
    /**
     * HashMap � uma estrutura que armazena valores chave/valor
     * No caso, para testes resolvi us�-lo para armzenas os tipos de durezas
     * e suas respectivas durabilidades - (tipo, durabilidade)
     */
    static HashMap<String, Integer> tiposDurezas = new HashMap<String, Integer>();
    
	/**
	 * static {} � um bloco de codigo que ser� executado quando a classe � carregada 
	 * OBS: ele s� � executado uma vez e n�o pode ser excutado por outros metodos
	 * OBS2: ele serve para setar valores default, e claro, ele so pode acessar
	 * atributos estaticos
	 */    
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
    		throw new RuntimeException("fail: dureza inv�lida");
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



