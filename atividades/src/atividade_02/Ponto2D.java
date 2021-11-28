package atividade_02;

import java.util.Locale;

/** 
 * @author ezequ
 * Essa classe é referente ao item "a" da segunda questão
 *
 * Atributos:
 * - eixo x (abscissas)
 * - eixo y (ordendas)
 * 
 * Operações(métodos):
 * - instacia o Ponto
 * - Mostra o Ponto
 * 
 * OBS: 
 * - Um ponto, em um ponto cartesiano por exemplo, e representado
 *   por duas cordenadas(x, y)
 * - Irei tomar como padrão o plano cartesiano ℝxℝ
 */

public class Ponto2D {
	double eixoX, eixoY;
	
	void criaPonto(double x, double y) {
		eixoX = x;
		eixoY = y;
	}
	
	void mostraPonto() {
		System.out.printf("(%.1f, %.1f)", eixoX, eixoY);
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Ponto2D ponto = new Ponto2D();
		
		ponto.eixoX = 4;
		ponto.eixoY = -7;
		
		ponto.mostraPonto();
	}

}
