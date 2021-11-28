package atividade_03;

/**
 * @author ezequ
 * Essa classe � referente a primeira quest�o
 * 
 * Atributos
 * - valor real: float  
 * - valor imagin�rio: float
 * 
 * M�todos
 * - inicializa n�mero:void
 * - imprime n�mero: void
 * - verifica dois n�meros complexos s�o iguais: boolean
 * - soma dois n�meros complexos: String
 * - subtrai dois n�meros complexos: String
 * - multiplica dois n�meros complexos: String
 * - divide dois n�meros complexos: String
 * 
 * OBS: 
 * - Decide fazer os m�todos que realizam c�lculos em cima 
 *   dos n�mreros complexos retornarem o resultado, logo tais
 *   m�todos ser�o do tipo String
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








