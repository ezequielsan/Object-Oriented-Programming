package atividade_03;

import java.util.Locale;

public class DemoNumeroComplexo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		NumeroComplexo nc = new NumeroComplexo();
		NumeroComplexo nc2 = new NumeroComplexo();
		
		
		nc.incializaNumero(1, 1);
		nc2.incializaNumero(1, 2);
		
		nc.imprimeNumero();
		nc2.imprimeNumero();
		
		boolean iguais = nc.ehIgual(nc2);
		System.out.println("São iguais: " + iguais);
		
		String resultSum = nc.soma(nc2);
		System.out.println(resultSum);
	
		String resultSub = nc.subtrai(nc2);
		System.out.println(resultSub);
		
		String resultMult = nc.multiplica(nc2);
		System.out.println(resultMult);
		
		String resultDiv = nc.divide(nc2);
		System.out.println(resultDiv);
	}

}
