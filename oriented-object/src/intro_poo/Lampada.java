package intro_poo;

public class Lampada {
	boolean lampStatus;
	
	void turnOn() {
		lampStatus = true;
	}
	
	void turnOff() {
		lampStatus = false;
	}
	
	void printStatus() {
		if(lampStatus) {
			System.out.println("A l�mpada est� ligada");
		}
		else {
			System.out.println("A l�mpada est� desligada");
			
		}
	}

}
