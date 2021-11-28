package atividade_02;

/** 
 * @author ezequ
 * Essa classe � referente ao item "e" da primeira quest�o
 *
 * Atributos:
 * - dia
 * - mes
 * - ano
 * 
 * Opera��es(m�todos):
 * - Inicializa data
 * - Verifica se data � v�lida
 * - mostrar data
 * 
 * OBS: 
 * - As unicas modifica��es foram na refatora��o do metodo
 *   de valida��o da data
 */

public class DataValidada {
	byte dia, mes;
	short ano;
	
	// Inicializando simultaneamente todos os dados do modelo
	void inicializaData(byte d, byte m, short a) {
		if(dataEhValida(d, m, a)) {
			dia = d;
			mes = m;
			ano = a;
		}
	}
	
	boolean dataEhValida(byte d, byte m, short a) {
		// Para meses de 30 dias, entrada que contenham 31 est�o incorretas
		//   - Verificar quais meses tem 30 dias, e fazer a restri��o
		// Fevereiro(02) tem 28 ou 29 dias
		//   - Se o ano for bissexto, ou seja (ser divisivel por 4 e n�o por 100) ou (ser divis�vel por 400), ent�o ele tem 29 dias
		//   - Se o ano n�o for bissexto ent�o ele tem 28 dias
		
		// Restri��o do ano bissexto
		if(m == 2) {
			if(((a % 4 == 0) && !(a % 100 == 0)) || (a % 400 == 0)) { // se � bissexto, ou seja, tem 29 dias
				if(!(d >= 1 && d <= 29)) {
					return false;
				}
				else {
					return true;
				}
			}
			else { // se n�o � bissexto
				if(!(d >= 1 && d <= 28)) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		
		// Restri��o dos meses com 30 dias
		if(m == 4 || m == 6 || m == 9 || m == 11) {
			if(!(d >= 1 && d <= 30)) {
				return false;
			}
			else {
				return true;
			}
		}
		
		// verificando se os meses que n�o tem 30 dias e n�o s�o fevereiro est�o corretos
		if((d <= 31 && d >= 1) && (m <= 12 && m >= 1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	boolean ehIgual(DataValidada data) {
		if(dia == data.dia && mes == data.mes && ano == data.ano) {
			return true;
		}
		else {
			return false;			
		}
	}
	
	void mostraData() {
		
		// como temos que, se pelo menos um dos tr�s atributos forem invalidos
		// ent�o todos os atributos receberam 0 como valor
		// logo, s� � necess�rio verificar se uma dos tr�s atributos � 0
		// pois se ele for igual a 0, os outros atributos tamb�m s�o
		if(dia == 0) {
			System.out.println("Data inv�lida, por favor inseria uma data v�lida");
		}
		else {
			// transformando os valores pera String
			String d = dia + "";
			String m = mes + "";
			String a = ano + "";
			
			String arry[] = {d, m, a};
			
			formatData(arry);
			
			System.out.println(arry[0] + "/" + arry[1] + "/" + arry[2]);			
		}
		
	}
	
	// Fun��o que formata a data
	void formatData(String arry[]) {
		for(int i = 0; i < arry.length; i++) {
			if(arry[i].length() < 2) {
				arry[i] = "0" + arry[i];
			}
		}
	}

	public static void main(String[] args) {
		DataValidada d = new DataValidada();
		
		d.inicializaData((byte)7, (byte)2, (short)2021);
		
		d.mostraData();
	}
}






