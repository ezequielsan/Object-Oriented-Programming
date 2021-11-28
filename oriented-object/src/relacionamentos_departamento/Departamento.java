package relacionamentos_departamento;

import java.util.*;

public class Departamento {
	private TipoDepartamento nomeDep;
	private Empregado gerente;
	private ArrayList<Empregado> empregados = new ArrayList<>();

	Departamento(TipoDepartamento nomeDep) {
		this.nomeDep = nomeDep;
	}

	public TipoDepartamento getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(TipoDepartamento nomeDep) {
		this.nomeDep = nomeDep;
	}

	public Empregado getGerente() {
		return gerente;
	}

	public void setGerente(Empregado gerente) {
		this.gerente = gerente;
	}

	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}

	public void addEmpregado(Empregado empregado) {
		this.empregados.add(empregado);
	}

	public void removeEmpregado(Empregado empregado) {
		this.empregados.remove(empregado);
	}

	public String toString() {
		return String.format("Nome departamento: %s, Gerente: %s", this.nomeDep, this.gerente);
	}

}
