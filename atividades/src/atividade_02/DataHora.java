package atividade_02;

/** 
 * @author ezequ
 * Essa classe é referente ao item "c" da primeira questão
 *
 * Atributos:
 * - Data (da classe Data)
 * - Hora (da classe HoraAproximada)
 * 
 * Operações(métodos):
 * - Inicializa data e hora
 * - mostrar data e hora
 * 
 * OBS: 
 * - As classes data e hora já estão criados, logo so criarei instâncias dos mesmos
 * - No método que inicializa a data e hora, serão passados como parâmetros,
 *   primeiro a data, depois a hora, nessa prespectiva ordem
 * - Em relação da validade das entradas, os próprios objetos data e hora ja tem
 *   métodos que fazem essa validação, logo não é necessário criar outro método que
 *   valide os dois.
 */

public class DataHora {
	Data data = new Data();
	HoraAproximada horaAprox = new HoraAproximada();
	
	void initData(byte dia, byte mes, short ano) {
		data.inicializaData(dia, mes, ano);
	}
	
	void initHora(byte hora, byte min) {
		horaAprox.initTime(hora, min);
	}
	
	void mostraDataHora() {
		System.out.print("Data: ");
		data.mostraData();
		
		System.out.print("Hora: ");
		horaAprox.printTime();
	}
	
	public static void main(String[] args) {
		DataHora dh = new DataHora();
		
		dh.initData((byte)8, (byte)9, (short)1666);
		dh.initHora((byte)10, (byte)12);
		
		dh.mostraDataHora();
	}

}
