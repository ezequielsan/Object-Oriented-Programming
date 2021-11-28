package atividade_02;

/**
 * @author ezequ
 * 
 *         Essa classe � referente ao item "d" da primeira quest�o
 *
 *         Atributos: - dia - mes - ano
 * 
 *         Opera��es(m�todos): - Inicializa data - Verifica se data � v�lida -
 *         mostrar data
 * 
 *         OBS: - As �nicas altera��es foram na adi��o de umas linhas de codigo
 *         que formatam a data e a verifica��o de datas inv�lidas que foi pedido
 *         no enunciado da quest�o
 */

public class Data {
	byte dia, mes;
	short ano;

	// Inicializando simultaneamente todos os dados do modelo
	void inicializaData(byte d, byte m, short a) {
		if (dataEhValida(d, m, a)) {
			dia = d;
			mes = m;
			ano = a;
		}
	}

	boolean dataEhValida(byte d, byte m, short a) {
		if ((d <= 31 && d >= 1) && (m <= 12 && m >= 1)) {
			return true;
		} else {
			return false;
		}
	}

	boolean ehIgual(Data data) {
		if (dia == data.dia && mes == data.mes && ano == data.ano) {
			return true;
		} else {
			return false;
		}
	}

	void mostraData() {

		// como temos que, se pelo menos um dos tr�s atributos forem invalidos
		// ent�o todos os atributos receberam 0 como valor
		// logo, s� � necess�rio verificar se uma dos tr�s atributos � 0
		// pois se ele for igual a 0, os outros atributos tamb�m s�o
		if (dia == 0) {
			System.out.println("Data inv�lida, por favor inseria uma data v�lida");
		} else {
			// transformando os valores pera String
			String d = dia + "";
			String m = mes + "";
			String a = ano + "";

			String arry[] = { d, m, a };

			formatData(arry);

			System.out.println(arry[0] + "/" + arry[1] + "/" + arry[2]);
		}

	}

	// Fun��o que formata a data
	void formatData(String arry[]) {
		for (int i = 0; i < arry.length; i++) {
			if (arry[i].length() < 2) {
				arry[i] = "0" + arry[i];
			}
		}
	}

	public static void main(String[] args) {
		Data d = new Data();

		d.inicializaData((byte) 1, (byte) 2, (short) 2020);

		d.mostraData();
	}
}
