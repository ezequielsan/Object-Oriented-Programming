package trampoline_linkedlist;

import java.util.LinkedList;

public class Trampoline{
    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;
    
    public Trampoline() {
    	waiting = new LinkedList<>();
    	playing = new LinkedList<>();
    }
    
    //remove and return the Kid with this name or null
    private Kid remove_kid(String name, LinkedList<Kid> list) {
    	return list.remove();
    }
    
    //insere na lista de espera
    public void arrive(Kid kid) {
    	waiting.add(kid);
    }
   
    //remove da lista de espera e insere na lista playing
    public void in() {
    	playing.add(remove_kid(waiting.getFirst().getName(), waiting));
    }

    //remove de playing para wainting
    public void out() {
    	waiting.add(remove_kid(playing.getFirst().getName(),  playing));
    }
  
    //remove do parquinho
    public Kid remove(String name) {
    	Kid aux = null;
    	
    	for(Kid k : playing) 
    		if(k.getName().equals(name)) {
    			aux = k;
    			playing.remove(k);
    		}
    	
    	for(Kid k : waiting) 
    		if(k.getName().equals(name)) {
    			aux = k;
    			waiting.remove(k);
    		}
    
    	if(aux == null) System.out.println("fail: crianca nao encontrada");

    	return aux;
    }

    public String toString() {
    	String format = "=> ";
    	
    	for(int i = waiting.size() - 1; i >= 0; i--) {
    		format += waiting.get(i) + " ";
    	}
    	
    	format += "=> [ ";
    	
    	for(int i = playing.size() - 1; i >= 0; i--) {
    		format += playing.get(i) + " ";
    	}
    	
    	return format + "]";
    }
  
}
