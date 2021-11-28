package atividade_complementar_01;

public class EquacaoSegundoGrau {
	int a, b, c;

	void initEquacao(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double calculaDelta() {
		return (b * b) - (4 * a * c);
	}

	void calculRaizes() {
		if (calculaDelta() < 0) {
			System.out.println("N�o h� ra�zes reais.");
		} else {
			double x1 = (-b + Math.sqrt(calculaDelta())) / (2 * a);
			double x2 = (-b - Math.sqrt(calculaDelta())) / (2 * a);
			System.out.printf("x1 = %f, x2 = %f\n", x1, x2);
		}
	}

	public String toString() {
		return String.format("%dx� + %dx + %d", this.a, this.b, this.c);
	}

	public static void main(String[] args) {
		EquacaoSegundoGrau equa = new EquacaoSegundoGrau();

		equa.initEquacao(4, -4, 1);
		equa.calculRaizes();

		System.out.println(equa);
	}
}
