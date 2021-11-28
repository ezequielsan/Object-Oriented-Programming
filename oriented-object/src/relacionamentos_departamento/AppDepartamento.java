package relacionamentos_departamento;

import java.util.*;

public class AppDepartamento {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Departamento[] deps = new Departamento[TipoDepartamento.values().length];
		deps[0] = new Departamento(TipoDepartamento.ADMINISTRATIVO);
		deps[1] = new Departamento(TipoDepartamento.FINANCEIROS);
		deps[2] = new Departamento(TipoDepartamento.RECURSOS_HUMANOS);
		deps[3] = new Departamento(TipoDepartamento.SETOR_COMERCIAL);
		
		Empregado gabriel = new Empregado("Gabriel", "0000-0000", 500);
		deps[0].addEmpregado(gabriel);
		deps[0].setGerente(gabriel);
		
		Empregado sara = new Empregado("Sara", "1111-1111", 1000);
		deps[1].addEmpregado(sara);
		deps[1].setGerente(sara); 
		
		Empregado zaquiel = new Empregado("Ezequiel", "2222-2222", 1500);
		deps[2].addEmpregado(zaquiel);
		deps[2].setGerente(zaquiel);
		
		Empregado novim = new Empregado("José", "3333-3333", 2000);
		deps[3].addEmpregado(novim);
		deps[3].setGerente(novim);
		
		System.out.println("Cadastros de empregados");
		while(true) {
			System.out.printf("Informe o nome do empregado: %n> ");
			String nome = input.nextLine();
			
			System.out.printf("Informe o cpf(somente digitos): %n> ");
			String cpf = input.next();
			
			System.out.printf("Informe o salario: %n> ");
			double sal = input.nextDouble();
			
			System.out.println("Infome o depatamento(0, 1, 2, 3): %n> ");
			byte numDep = input.nextByte();
			
			Empregado emp = new Empregado(nome, cpf, sal, deps[numDep]);
			deps[numDep].addEmpregado(emp);
			
			System.out.println("Desaja continuar? s/n");
			String op = input.next();
			
			if(op.charAt(0) == 'n') {
				break;
			}
			
			input.nextLine(); // limpando bufffer
			System.out.println();
			
		}
		
		int qnt = TipoDepartamento.values().length;
		
		for(int i = 0; i < qnt; i++) {
			System.out.printf("Departamento %d (%s), seus empregados são:%n", i, deps[i].getNomeDep());
			
			for(Empregado emp : deps[i].getEmpregados()) {
				System.out.println("> " + emp);
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		// Departamentos e Gerentes
		for(Departamento dep : deps) {
			System.out.println(dep);
		}
		
		input.close();
	}

}
