package atividade_02;

/** 
 * @author ezequ
 * Essa classe é referente ao item "a" da terceira questão
 *
 * Atributos:
 * - quantidadeLados
 * 
 * Operações(métodos):
 * - Retornar o nome do poligono referente a sua quantidade de quantidadeLadoss
 * - Calcular perimetro
 * - Calcular soma dos ângulos internos
 * 
 * OBS: 
 */

public class PoligonoRegular {
	byte qntLados;
	
	void criaPoligono(byte qnt) {
		if(!verificaQuantidadeLados(qnt))
			System.out.println("Não existe poligono regular com essa quantidade de lados.");
		else
		    qntLados = qnt;
	}
	
	boolean verificaQuantidadeLados(byte qnt) {
		if(qnt < 3) 
			return false;
		
		else 
			return true;
	}
	
	void nomePoligono() {
		
		if(!verificaQuantidadeLados(qntLados)) {
			System.out.println("Polígono ainda não foi criado, por favor crie um poligono");
		}
		
		if(qntLados == 3) System.out.println("Triângulo");
		if(qntLados == 4) System.out.println("Quadrado");
		if(qntLados == 5) System.out.println("Pentágono");
		if(qntLados == 6) System.out.println("Hexágono");
		if(qntLados == 7) System.out.println("Heptágono");
		if(qntLados == 8) System.out.println("Octógono");
		if(qntLados == 9) System.out.println("Eneágono");
		if(qntLados == 10) System.out.println("Decágono");
	}

	void perimetroPoligono(double medidaLado) {
		if(!verificaQuantidadeLados(qntLados)) {
			System.out.println("Polígono ainda não foi criado, por favor crie um poligono");
		}
		
		else if(medidaLado <= 0) {
			System.out.println("Por favor, informe uma medida valida para o lado do triângulo.");
		}
		else
		    System.out.println("Perímetro = " + qntLados * medidaLado);
	}
	
	void somaAngulosInternos() {
		if(qntLados != 0) {
			System.out.println("Soma dos ângulos internos é " + (qntLados - 2) * 180 + "°");
		}
		else {
			System.out.println("Polígono ainda não foi criado, por favor crie um poligono");
		}
	}

	public static void main(String[] args) {
		PoligonoRegular p1 = new PoligonoRegular();
		
		p1.criaPoligono((byte)3);
		
		p1.perimetroPoligono(18);
		
		p1.somaAngulosInternos();
		
		p1.nomePoligono();
	}
}
