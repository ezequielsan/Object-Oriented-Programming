package atividade_02;

/** 
 * @author ezequ
 * Essa classe é referente ao item "b" da primeira questão
 *
 * Atributos:
 * - hora
 * - minutos
 * - segundos
 * - centésimos de segundos
 * 
 * Operações(métodos):
 * - Inicializa horas
 * - Verifica se hora é válida
 * - mostrar horas
 * 
 * OBS: Basicamente a única mudança foi o acrésimo de mais um atributo em relação ao item a
 */


public class HoraPrecisa {

	byte hour, minutes, seconds, milliseconds;
		
	void initTime(byte h, byte m, byte s, byte ms) {
		if(validTime(h, m, s, ms)) {
			hour = h;
			minutes = m;
			seconds = s;
			milliseconds = ms;
		}
		else {
			System.out.println("Data inválida");
			hour = 0;
			minutes = 0;
			seconds = 0;
			milliseconds = 0;
		}
	}
	
	boolean validTime(byte h, byte m, byte s, byte ms) {
		if((h >= 0 && h <= 23) && (m >= 0 && m < 60) && (s >= 0 && s < 60) && (ms >= 0 && ms < 100)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void printTime() {
		String h = hour + "";
		String m = minutes + "";
		String s = seconds + "";
		String ms = milliseconds + "";
		
		String arry[] = {h, m, s, ms};
		
		// chamando a função que formata a data
		formatTime(arry);
		
		System.out.println(arry[0] + ":" + arry[1] + ":" + arry[2] + ":" + arry[3]);
	}
	
	// Função simples que formata a data
	void formatTime(String arry[]) {
		for(int i = 0; i < arry.length; i++) {
			if(arry[i].length() < 2) {
				arry[i] = "0" + arry[i];
			}
		}
	}

	public static void main(String[] args) {
		HoraPrecisa h = new HoraPrecisa();
		
		h.initTime((byte)13, (byte)10, (byte)5, (byte)9);
		
		h.printTime();
	}
}






