package enumeracoes;

public enum Semana {
    DOM(1, "Domingo"), SEG(2, "Segunda"), TER(3, "Terça"), 
    QUA(4, "Quarta"), QUI(5, "Quinta"), SEX(6, "Sexta"), SAB(7, "Sabado");
	
	private final int dia;
	private final String nome;
	
	Semana(int dia, String nome) {
		this.dia = dia;
		this.nome = nome;
	}
	
	public int getDia() {
		return dia;
	}
	
	public String getNome() {
		return nome;
	}
}
