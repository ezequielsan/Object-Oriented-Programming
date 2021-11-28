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
			System.out.println("A lâmpada está ligada");
		}
		else {
			System.out.println("A lâmpada está desligada");
			
		}
	}

}
