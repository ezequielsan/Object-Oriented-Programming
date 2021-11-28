package atividade_03;

/**
 * 
 * @author ezequ
 *
 * OBS:
 * - Como o array cadeirasOcupadas se comporta as chamadas de objeto
 */
public class Voo {
	private int numeroVoo;
	private Data data;
	private static int numeroVagas = 100;
	private int cadeirasOcupadas[] = new int[100];

	Voo(int numeroVoo, Data data) {
		this.numeroVoo = numeroVoo;
		this.data = data;
	}

	public int proximoLivre() {
		int num = 1;
		
		while(verifica(num)) {
			num++;
		}
		
		return num;
	}

	// return true, se ocupada
	// return false, caso contrário
	public boolean verifica(int numeroCadeira) {
		boolean estaOcupada = false;
		
		for (int i : cadeirasOcupadas) {
			if(i == numeroCadeira) {
				estaOcupada = true;
				break;
			}
		}
		
		return estaOcupada;
	}

	public boolean ocupa(int numeroCadeira) {
		
		if(!verifica(numeroCadeira)) { // Se a cadeira não estiver ocupada
			cadeirasOcupadas[100 - numeroVagas] = numeroCadeira;
			numeroVagas--;
			System.out.printf("Cadeira %d ocupada com sucesso.\n", numeroCadeira);
			
			return true;
		}
		else { // Se estiver ocupada
			System.out.printf("Cadeira %d já está ocupada.\n", numeroCadeira);
			return false;
		}
	}

	// o estatico doi atribuido ao método pois ele retorna um valor que é estatico
	public static int vagas() {
		return Voo.numeroVagas;
	}

	public int getVoo() {
		return this.numeroVoo;
	}

	public Data getData() {
		return this.data;
	}

	public Voo clone() {
		return new Voo(this.numeroVoo, this.data);
	}
	
	public void cadeirasJaOcupadas() {
		String ocupadas = "Cadeiras ocupadas: ";
		for(int i: cadeirasOcupadas) {
			if(i != 0) {
				ocupadas += i + " ";
			}
		}
		System.out.println(ocupadas);
	}
	
	public String toString() {
		return String.format("Número do Voo: %d\nData: %s", this.numeroVoo, this.data);
	}

}
