package intro_poo;

public class AppLamp {
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		lamp.turnOn();
		lamp.printStatus();
		lamp.turnOff();
		lamp.printStatus();
		lamp.turnOn();
	}

}
