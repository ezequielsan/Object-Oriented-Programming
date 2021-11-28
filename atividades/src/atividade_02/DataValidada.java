package atividade_02;

/** 
 * @author ezequ
 * Essa classe é referente ao item "e" da primeira questão
 *
 * Atributos:
 * - dia
 * - mes
 * - ano
 * 
 * Operações(métodos):
 * - Inicializa data
 * - Verifica se data é válida
 * - mostrar data
 * 
 * OBS: 
 * - As unicas modificações foram na refatoração do metodo
 *   de validação da data
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
		// Para meses de 30 dias, entrada que contenham 31 estão incorretas
		//   - Verificar quais meses tem 30 dias, e fazer a restrição
		// Fevereiro(02) tem 28 ou 29 dias
		//   - Se o ano for bissexto, ou seja (ser divisivel por 4 e não por 100) ou (ser divisível por 400), então ele tem 29 dias
		//   - Se o ano não for bissexto então ele tem 28 dias
		
		// Restrição do ano bissexto
		if(m == 2) {
			if(((a % 4 == 0) && !(a % 100 == 0)) || (a % 400 == 0)) { // se é bissexto, ou seja, tem 29 dias
				if(!(d >= 1 && d <= 29)) {
					return false;
				}
				else {
					return true;
				}
			}
			else { // se não é bissexto
				if(!(d >= 1 && d <= 28)) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		
		// Restrição dos meses com 30 dias
		if(m == 4 || m == 6 || m == 9 || m == 11) {
			if(!(d >= 1 && d <= 30)) {
				return false;
			}
			else {
				return true;
			}
		}
		
		// verificando se os meses que não tem 30 dias e não são fevereiro estão corretos
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
		
		// como temos que, se pelo menos um dos três atributos forem invalidos
		// então todos os atributos receberam 0 como valor
		// logo, só é necessário verificar se uma dos três atributos é 0
		// pois se ele for igual a 0, os outros atributos também são
		if(dia == 0) {
			System.out.println("Data inválida, por favor inseria uma data válida");
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
	
	// Função que formata a data
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






