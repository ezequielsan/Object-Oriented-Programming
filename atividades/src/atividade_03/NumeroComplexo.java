package atividade_03;

/**
 * @author ezequ
 * Essa classe é referente a primeira questão
 * 
 * Atributos
 * - valor real: float  
 * - valor imaginário: float
 * 
 * Métodos
 * - inicializa número:void
 * - imprime número: void
 * - verifica dois números complexos são iguais: boolean
 * - soma dois números complexos: String
 * - subtrai dois números complexos: String
 * - multiplica dois números complexos: String
 * - divide dois números complexos: String
 * 
 * OBS: 
 * - Decide fazer os métodos que realizam cálculos em cima 
 *   dos númreros complexos retornarem o resultado, logo tais
 *   métodos serão do tipo String
 * - Vou considerar as partes do numero imaginario como reais, ou seja,
 *   numeros inteiros ou com pontos flutuantes
 */

public class NumeroComplexo {
	private float real;
	private float imaginario;
	
	public void incializaNumero(float real, float imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public void imprimeNumero() {
		String numImag = String.format("(%.1f + %.1fi)", this.real, this.imaginario);
		
		System.out.println(numImag);
	}
	
	public boolean ehIgual(NumeroComplexo numComp) {
		return ((numComp.real == this.real) && (numComp.imaginario == this.imaginario))? true : false;
	}
	
	public String soma(NumeroComplexo numComp) {
		return String.format("(%.1f + %.1fi)", this.real + numComp.real , this.imaginario + numComp.imaginario);
	}
	
	public String subtrai(NumeroComplexo numComp) {
		return String.format("(%.1f + %.1fi)", this.real - numComp.real , this.imaginario - numComp.imaginario);
	}
	
	public String multiplica(NumeroComplexo numComp) {
		return String.format("(%.1f + %.1fi)", 
				((this.real * numComp.real) - (this.imaginario * numComp.imaginario)), 
				((this.real * numComp.imaginario) + (this.imaginario * numComp.real)));
	}
	
	public String divide(NumeroComplexo numComp) {
		return String.format("(%.1f + %.1fi)", 
				((this.real * numComp.real) + (this.imaginario * numComp.imaginario)) / 
				(Math.pow(numComp.real, 2) + Math.pow(numComp.imaginario, 2)), 
				((this.imaginario * numComp.real) - (this.real * numComp.imaginario)) / 
				(Math.pow(numComp.real, 2) + Math.pow(numComp.imaginario, 2)));
	}

}








