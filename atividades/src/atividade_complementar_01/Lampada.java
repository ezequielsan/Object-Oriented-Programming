package atividade_complementar_01;

/**
 * @author ezequ
 * 
 * Classe referente ao item a da quarta questão
 * 
 */

public class Lampada {
	boolean lampStatus;
	
	void turnOn() {
		lampStatus = true;
	}
	
	void turnOff() {
		lampStatus = false;
	}
	
	boolean isOn() {
		return lampStatus? true : false;
	}
	
	void printStatus() {
		if(lampStatus) {
			System.out.println("A lâmpada está ligada");
		}
		else {
			System.out.println("A lâmpada está desligada");
			
		}
	}
	
	public static void main(String[] args) {
		Lampada lamp;
		lamp = new Lampada();
		
		lamp.turnOn();
		lamp.printStatus();

		System.out.println("Está ligada: " + lamp.isOn());
		
	}

}
