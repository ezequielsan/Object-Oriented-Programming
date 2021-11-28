package atividade_complementar_01;

/**
 * @author ezequ
 *
 * Classe refeernte ao item a da questão 5
 * 
 */

public class ContaBancariaSimplificada {
	String accountHolderName;
	double balance;
	boolean isAccountSpecial;
	
	// Inicializa todos os dados do modelo
	void openAccount(String name, double deposit, boolean isSpecial) {
		accountHolderName = name;
		balance = (deposit < 0)? 0 : deposit;
		isAccountSpecial = isSpecial;
	}
	
	// Também inicializa dados do modelo
	void openSimpleAccount(String name) {
		accountHolderName = name;
		balance = 0.0;
		isAccountSpecial = false;
	}
	
	// Depostita uma valor na conta
	void deposit(double value) {
		balance += value;
	}
	
	// Retirar um valor da conta
	void remove(double value) {
		if(!isAccountSpecial) {
			if(value <= balance) {
				balance -= value;				
			}
			else {
				System.out.println("Saldo insuficiante");
				System.out.println("O saldo so poderá ser negativo se a conta for especial");			
			}
		}
		else {
			balance -= value;					
		}
	
	}
	
	// Mostra os dados bancários
	void printData() {
		System.out.println("Nome do correntista: " + accountHolderName);
		System.out.println("Saldo: " + balance);
		
		if(isAccountSpecial) {
			System.out.println("A conta é especial");			
		}
		else {
			System.out.println("A conta não é especial");			
		}
	}
	
	public static void main(String[] args) {
		ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
		
		conta1.openSimpleAccount("Ezequiel Santos");
		conta1.deposit(1000);
		conta1.remove(1010);
		
		conta1.printData();
	}
}

