package atividade_02;

import java.util.Locale;

/** 
 * @author ezequ
 * Essa classe é referente ao item "b" da segunda questão
 *
 * Atributos:
 * - ponto 1 (instância da classe Ponto2D)
 * - ponto 2 (instância da classe Ponto2D)
 * 
 * Operações(métodos):
 * - instacia dois pontos
 * - verifica se são opostos
 * - calcula diagonal
 * - mostra Pontos
 * 
 * OBS: 
 * - É facilmente possível, como esses dois pontos, que representam dois vértices
 *   do retângulo, calcular os outro dois vértices, e assim pode-se calcular o perímetro
 *   e área do retângulo, mas vou abstrair e calcular só a diagonal mesmo.
 * - Irei tomar como padrão o plano cartesiano ℝxℝ
 */

public class Retangulo {
	Ponto2D p1 = new Ponto2D();
	Ponto2D p2 = new Ponto2D();
	
	void instanciaPrimeiroPonto(double x, double y) {
		p1.eixoX = x;
		p1.eixoY = y;
	}
	
	void instanciaSegundoPonto(double x, double y) {
		
		// Os vai ser instanciado o segundo ponto, se o mesmo é oposto do primeiro
		if(pontosSaoOpostos(x, y)) {
			p2.eixoX = x;
			p2.eixoY = y;
		}
		else {
			System.out.println("Por favor, insira cordenadas válidas para o ponto");
		}
		
	}
	
	boolean pontosSaoOpostos(double x, double y) {
		if(p1.eixoX == -x && p1.eixoY == -y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	double calcDiagonal() {
		return Math.sqrt(Math.pow(p1.eixoX - p2.eixoX, 2) + Math.pow(p1.eixoY - p2.eixoY, 2));
	}
	
	void mostraPonto() {
		if(pontosSaoOpostos(p2.eixoX, p2.eixoY)) {
			System.out.printf("Pontos do opostos do retângulo: (%.1f, %.1f), (%.1f, %.1f)\n", p1.eixoX, p1.eixoY, p2.eixoX, p2.eixoY);
		}
		
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Retangulo ret = new Retangulo();
		
		ret.instanciaPrimeiroPonto(7, -2);
		ret.instanciaSegundoPonto(-7, 2);
		
		double d = ret.calcDiagonal();
		System.out.printf("Diagonal = %.2f\n", d);
		
		ret.mostraPonto();
	}

}
