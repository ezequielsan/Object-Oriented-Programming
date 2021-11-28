package intro_poo;

public class Data {
	byte dia, mes;
	short ano;
	
	// Inicializando simultaneamente todos os dados do modelo
	void inicializaData(byte d, byte m, short a) {
		if(dataEhValida(d, m, a)) {
			dia = d;
			mes = m;
			ano = a;
		}
		else {
			dia = 01;
			mes = 01;
			ano = 2021;
		}
	}
	
	boolean dataEhValida(byte d, byte m, short a) {
		if((d <= 31 && d >= 1) && (m <= 12 && m >= 1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	boolean ehIgual(Data data) {
		if(dia == data.dia && mes == data.mes && ano == data.ano) {
			return true;
		}
		else {
			return false;			
		}
	}
	
	void mostraData() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

}






