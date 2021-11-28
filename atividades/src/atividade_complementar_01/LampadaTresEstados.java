package atividade_complementar_01;

/**
 * @author ezequ
 * 
 * Classe referente ao item b da quarta quest�o
 *
 */

public class LampadaTresEstados {
	String estado;
	
	void turnOn() {
		estado = "Acesa";
	}
	
	void turnOff() {
		estado = "Apagada";
	}
	
	void halfLight() {
		estado = "Meia-Luz";
	}
	
	void printStatus() {
		String str = String.format("A l�mpada est� %s." , estado);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		LampadaTresEstados lamp = new LampadaTresEstados();
		
		lamp.turnOn();
		lamp.turnOff();
		lamp.halfLight();
		lamp.printStatus();
	}

}
