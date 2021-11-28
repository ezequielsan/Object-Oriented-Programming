package atividade_03;

public class DemoData {
	public static void main(String[] args) {
		Data d1 = new Data((byte)29, (byte)3, (short)2000);
		Data d2 = new Data((byte)01, (byte)11, (short)2011);
		
		System.out.println("Dia: " + d1.getDia());
		System.out.println("Mês: " + d1.getMes());
		System.out.println("Mês por extenso: " + d1.getMesExtenso());
		System.out.println("Ano: " + d1.getAno());
		System.out.println(d1.compara(d2));
		System.out.println("Bissexto: " + d1.isBissexto());
		System.out.println("Data d1: " + d1);
		
		Data dataClone = d1.clone();
		System.out.println("Data clone da d1: " + dataClone);
	
		// Verifica se a data clone é igual a data de onde foi clonada
		// E de fato não são iguais, pois ambas as variáveis d2 e dataClone
		// do tipo Data apontam para objetos diferentes na memória
		if(d2.equals(dataClone)) {
			System.out.println("São iguais!!");
		}
		else {
			System.out.println("Não são iguais.");
		}

    }
}