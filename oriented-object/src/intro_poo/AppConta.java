package intro_poo;

public class AppConta {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.openAccount("Ezequiel Santos", 1400, true);
		conta.deposit(200);
		conta.remove(1000);
		conta.deposit(150);
		conta.printData();
		
		System.out.println("----------------------------");
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.openSimpleAccount("Sara");
		conta2.deposit(100);
		conta2.remove(90);
		conta2.remove(10);
		conta2.printData();
	}

}
