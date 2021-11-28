package atividade_03;

/**
 * @author ezequ
 * Essa classe � referente a segunda quest�o
 * 
 * Atributos
 * - dia: byte
 * - mes: byte
 * - ano: short 
 * 
 * M�todos
 * - construtor: Data
 * - compara duas datas: byte
 * - getDia: byte
 * - getMes: byte
 * - getMesExtenso: String
 * - getAno: short
 * - verifica se � bissexto: boolean
 * - clone: Data
 * 
 * OBS: 
 * - 
 */

public class Data {
	private byte dia, mes;
	private short ano;
	
	Data(byte dia, byte mes, short ano) {
		if(dataEhValida(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else {
			System.out.println("Data inv�lida.");
			this.dia = 01;
			this.mes = 01;
			this.ano = 0001;
		}
		
	}
	

	// Para meses de 30 dias, entrada que contenham 31 est�o incorretas
	//   - Verificar quais meses tem 30 dias, e fazer a restri��o
	// Fevereiro(02) tem 28 ou 29 dias
	//   - Se o ano for bissexto, ou seja (ser divisivel por 4 e n�o por 100) ou (ser divis�vel por 400), ent�o ele tem 29 dias
	//   - Se o ano n�o for bissexto ent�o ele tem 28 dias
	public boolean dataEhValida(byte dia, byte mes, short ano) {
		
		// Restri��o do ano bissexto
		if(mes == 2) {
			if(((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)) { // se � bissexto, ou seja, tem 29 dias
				if(!(dia >= 1 && dia <= 29)) {
					return false;
				}
				else {
					return true;
				}
			}
			else { // se n�o � bissexto
				if(!(dia >= 1 && dia <= 28)) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		
		// Restri��o dos meses com 30 dias
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(!(dia >= 1 && dia <= 30)) {
				return false;
			}
			else {
				return true;
			}
		}
		
		// verificando se os meses que n�o tem 30 dias e n�o s�o fevereiro est�o corretos
		if((dia <= 31 && dia >= 1) && (mes <= 12 && mes >= 1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public byte compara(Data data) {
		
		if(this.ano == data.ano) {
			if(this.mes == data.mes) {
				if(this.dia == data.dia) {
					return 0;
				}
				else if(this.dia > data.dia) {
					return 1;
				}
				else {
					return -1;
				}
			}
			else if(this.mes > data.mes) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else if(this.ano > data.ano){
			return 1;
		}
		else {
			return -1;
		}
		
	}

    public byte getDia() {
    	return this.dia;
    }
    
    public byte getMes() {
    	return this.mes;
    }
    
    public String getMesExtenso() {
    	String meses[] = {
    			"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", 
    			"Junho", "Julho", "Agosto", "Setembro", "Outubro", 
    			"Novembro", "Dezembro"
    			};
    	
    	return meses[this.mes - 1];
    }
    
    public short getAno() {
    	return this.ano;
    }
    
    public boolean isBissexto() {
    	if(((this.ano % 4 == 0) && !(this.ano % 100 == 0)) || (this.ano % 400 == 0)) {
    		return true;    		
    	}
    	else {
    		return false;
    	}
    }
    
    public Data clone() {
    	return new Data(this.dia, this.mes, this.ano);
    }
    
    public String toString() {
    	return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }
}






