package intro_poo;

import java.util.Scanner;

public class AppData {
	public static void main(String[] args) {
		
		// Declarando os objetos
		Scanner in = new Scanner(System.in);
		Data dataNasc = new Data();
		Data descBrasil = new Data();
		
		// Declarando as vari�veis
		byte dia;
		byte mes;
		short ano;
		
		// Lendo a data de nasscimento pelo stdin e inicializando data
		System.out.println("Informe e data do seu nascimento: ");
		dia = in.nextByte();
		mes = in.nextByte();
		ano = in.nextShort();
		
		dataNasc.inicializaData(dia, mes, ano);
		
		System.out.print("Sua data de nascimento �: ");
		dataNasc.mostraData();
		
		// Inicializando data do descobrimento do Brasil
		descBrasil.inicializaData((byte)22, (byte)04, (short)1500);
		System.out.print("Data de descobrimento do Brasil �: ");
		descBrasil.mostraData();
		
		// Verificando se a data de nascimento � a mesma da do descobrmienro do Brasil
		if(dataNasc.ehIgual(descBrasil)) {
			System.out.println("Sua data de nascimento � a mesma do do descobrimento do Brasil");
		}
		
		in.close();
		
	}

}
