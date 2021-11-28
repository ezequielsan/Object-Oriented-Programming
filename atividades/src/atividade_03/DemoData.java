package atividade_03;

public class DemoData {
	public static void main(String[] args) {
		Data d1 = new Data((byte)29, (byte)3, (short)2000);
		Data d2 = new Data((byte)01, (byte)11, (short)2011);
		
		System.out.println("Dia: " + d1.getDia());
		System.out.println("M�s: " + d1.getMes());
		System.out.println("M�s por extenso: " + d1.getMesExtenso());
		System.out.println("Ano: " + d1.getAno());
		System.out.println(d1.compara(d2));
		System.out.println("Bissexto: " + d1.isBissexto());
		System.out.println("Data d1: " + d1);
		
		Data dataClone = d1.clone();
		System.out.println("Data clone da d1: " + dataClone);
	
		// Verifica se a data clone � igual a data de onde foi clonada
		// E de fato n�o s�o iguais, pois ambas as vari�veis d2 e dataClone
		// do tipo Data apontam para objetos diferentes na mem�ria
		if(d2.equals(dataClone)) {
			System.out.println("S�o iguais!!");
		}
		else {
			System.out.println("N�o s�o iguais.");
		}

    }
}