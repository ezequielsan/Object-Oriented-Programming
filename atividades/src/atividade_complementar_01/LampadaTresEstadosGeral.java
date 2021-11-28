package atividade_complementar_01;

public class LampadaTresEstadosGeral {
	int luminosidade;
	
	void aumentaLuminosidade(int quant) {
		if(quant < 0) {
			System.out.println("por favor ensira um valor de luminosidade válido.");
		}
		
		luminosidade += quant;
		
		if(luminosidade > 100) {
			luminosidade = 100;
		}
	}
	
	void diminuiLuminosidade(int quant) {
		if(quant < 0) {
			System.out.println("por favor ensira um valor de luminosidade válido.");
		}
		
		luminosidade -= quant;
		
		if(luminosidade < 0) {
			luminosidade = 0;
		}
	}
	
	void printLuminosidade() {
		System.out.println("A luminosidade é de " + luminosidade + "%.");
	}
	
	public static void main(String[] args) {
		LampadaTresEstadosGeral lamp = new LampadaTresEstadosGeral();
		
		lamp.aumentaLuminosidade(30);
		lamp.diminuiLuminosidade(20);
		lamp.aumentaLuminosidade(25);
		lamp.printLuminosidade();
	}

}
