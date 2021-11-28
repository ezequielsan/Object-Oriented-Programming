package atividade_02;

import java.util.Locale;

/** 
 * @author ezequ
 * Essa classe é referente ao item "c" da segunda questão
 *
 * Atributos:
 * - ponto 1 (instância da classe Ponto2D)
 * - ponto 2 (instância da classe Ponto2D)
 * 
 * Operações(métodos):
 * - instacia dois pontos
 * - mostra dois pontos
 * 
 * OBS: 
 * - Reutilizei grande parte do código do item b
 * - Irei tomar como padrão o plano cartesiano ℝxℝ
 */

public class Reta {
	Ponto2D p1 = new Ponto2D();
	Ponto2D p2 = new Ponto2D();
	
	void instanciaPrimeiroPonto(double x, double y) {
		p1.eixoX = x;
		p1.eixoY = y;
	}
	
	void instanciaSegundoPonto(double x, double y) {
		p2.eixoX = x;
		p2.eixoY = y;
	}
 
	void mostraReta() {
		System.out.printf("Pontos da reta: (%.1f, %.1f), (%.1f, %.1f)\n", p1.eixoX, p1.eixoY, p2.eixoX, p2.eixoY);
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Reta reta = new Reta();
		
		reta.instanciaPrimeiroPonto(6, 3);
		reta.instanciaSegundoPonto(-7, 3);
		
		reta.mostraReta();
	}
	
}
