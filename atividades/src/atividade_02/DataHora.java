package atividade_02;

/** 
 * @author ezequ
 * Essa classe � referente ao item "c" da primeira quest�o
 *
 * Atributos:
 * - Data (da classe Data)
 * - Hora (da classe HoraAproximada)
 * 
 * Opera��es(m�todos):
 * - Inicializa data e hora
 * - mostrar data e hora
 * 
 * OBS: 
 * - As classes data e hora j� est�o criados, logo so criarei inst�ncias dos mesmos
 * - No m�todo que inicializa a data e hora, ser�o passados como par�metros,
 *   primeiro a data, depois a hora, nessa prespectiva ordem
 * - Em rela��o da validade das entradas, os pr�prios objetos data e hora ja tem
 *   m�todos que fazem essa valida��o, logo n�o � necess�rio criar outro m�todo que
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
