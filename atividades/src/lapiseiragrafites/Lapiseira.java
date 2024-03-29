package lapiseiragrafites;

import java.util.ArrayList;

public class Lapiseira {
    private float calibre;
    private Grafite bico;
    private ArrayList<Grafite> tambor;
    
    Lapiseira(float calibre) {
    	if(calibre < 0) { 
    		throw new RuntimeException("fail: nao e permitido valores negativos");
    	}
    	else {
    		this.calibre = calibre;
    		tambor = new ArrayList<>();
    	}
    }
    
    public boolean inserir(Grafite grafite) {
    	if(grafite.getCalibre() == this.calibre) {
    		tambor.add(grafite);
    		return  true;
    	}
    	else {
    		System.out.println("fail: calibre incompat�vel");
    		return false;
    	}
    }

    public Grafite remover() {
    	Grafite aux = this.bico;
    	
    	if(this.bico != null) {
    		this.bico = null;
    	}
    	else {
    		System.out.println("fail: n�o existe grafite a ser removido");
    	}
    	
    	return aux;
     }
    
    public boolean puxar() {
    	if(bico == null) {
    		if(tambor.isEmpty()) {
    			System.out.println("fail: nao existe grafite no tambor");
    			return false;
    		}
    		
    		bico = tambor.get(0);
    		tambor.remove(0);
    		return true;
    	}
    	else {
    		System.out.println("fail: ja existe grafite no bico");
    		return false;
    	}
    }
    
    public void escrever() {
    	if(bico == null) {
    		System.out.println("fail: nao ha grafite para escrever");
    	}
    	else {
    		
    		if(bico.getTamanho() > 10) {
    			bico.setTamanho(bico.getTamanho() - bico.desgastePorFolha());
    		}
    		
    		if(bico.getTamanho() < 10) {
    			System.out.println("fail: folha incompleta");
    			bico.setTamanho(10);
    		}
    		
    		if(bico.getTamanho() == 10) {
    			System.out.println("warning: grafite acabou");
    		}
    	}
    }
    
    public String toString() {
    	String format = String.format("calibre: %.1f, bico: %s, tambor: {", calibre, bico);
    	
    	for(Grafite g : tambor) {
    		format += g;
    	}
    	
    	return format += "}";
    }
  
}