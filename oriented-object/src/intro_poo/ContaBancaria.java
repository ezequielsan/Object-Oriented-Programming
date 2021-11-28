package intro_poo;

public class ContaBancaria {
	String accountHolderName;
	double balance;
	boolean isAccountSpecial;
	
	// Inicializa todos os dados do modelo
	void openAccount(String name, double deposit, boolean isSpecial ) {
		accountHolderName = name;
		balance = deposit;
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

}
