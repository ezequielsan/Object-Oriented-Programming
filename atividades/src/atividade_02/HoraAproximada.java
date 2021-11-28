package atividade_02;

/** 
 * @author ezequ
 * Essa classe � referente ao item "a" da primeira quest�o
 *
 * Atributos:
 * - hora
 * - minutos
 * 
 * Opera��es(m�todos):
 * - Inicializa horas
 * - Verifica se hora � v�lida
 * - mostrar horas
 */


public class HoraAproximada {

	byte hour, minutes;
		
	void initTime(byte h, byte m) {
		if(validTime(h, m)) {
			hour = h;
			minutes = m;
		}
		else {
			System.out.println("Hora inv�lida");
			hour = 0;
			minutes = 0;
		}
	}
	
	boolean validTime(byte h, byte m) {
		if((h >= 0 && h <= 23) && (m >= 0 && m < 60)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void printTime() {
		
		// Formartando data
		String h = hour + "";
		String m = minutes + "";
		
		if(h.length() < 2) {
			h = "0" + h;
		}
		
		if(m.length() < 2) {
			m = "0" + m;
		}
		
		System.out.println(h + ":" + m);
	}

	public static void main(String[] args) {
		HoraAproximada h = new HoraAproximada();
		
		h.initTime((byte)24, (byte)60);
		
		h.printTime();
	}
}






