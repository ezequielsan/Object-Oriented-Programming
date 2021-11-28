package arrays_arrayslist;

public class VetorDinamico {
	private Integer[] arry;
	private int quantElementos;
	private int capacidade;

	VetorDinamico(int n) {
		this.capacidade = n;
		this.quantElementos = 0;
		this.arry = new Integer[n];
	}

	public void add(Integer i) {
		if (this.quantElementos == this.capacidade) {
			capacidade *= 2;

			Integer[] aux = new Integer[this.capacidade];

			for (int j = 0; j < this.quantElementos; j++) {
				aux[j] = this.arry[j];
			}

			this.arry = aux;
		}

		this.arry[this.quantElementos] = i;
		this.quantElementos++;
	}

	public boolean equals(VetorDinamico v) {
		if (v == null)
			return false;

		if (v.size() != this.size())
			return false;

		for (int i = 0; i < this.size(); i++)
			if (v.get(i) != arry[i])
				return false;

		return true;
	}

	public Integer get(int i) {
		if (i >= 0 && i <= quantElementos)
			return arry[i];

		else
			return null;
	}

	public int size() {
		return this.quantElementos;
	}

	public int capacity() {
		return this.capacidade;
	}

	public String toString() {
		String format = "Vetor [ ";

		for (Integer i : this.arry) {
			if (i != null)
				format += i + " ";
		}

		return format += "]";
	}

}
