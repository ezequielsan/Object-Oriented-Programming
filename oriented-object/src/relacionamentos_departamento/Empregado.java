package relacionamentos_departamento;

public class Empregado {
	private String nome;
	private String cpf;
	private double salario;
	private Departamento dep;

	Empregado(String nome, String cpf, double salario, Departamento dep) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.dep = dep;
	}

	Empregado(String nome, String cpf, double salario) {
		this(nome, cpf, salario, null);
	}

	public String getNome() {
		return this.nome;
	}

	public double getSalario(double salario) {
		return this.salario;
	}

	public String getCpf() {
		return this.cpf;
	}

	public Departamento getDepartamento() {
		return this.dep;
	}

	public void setDepartamento(Departamento dep) {
		this.dep = dep;
	}

	public String toString() {
		return String.format("Nome: %s, salario: %.2f", this.nome, this.salario);
	}

}
