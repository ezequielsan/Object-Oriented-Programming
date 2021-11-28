package modificadores_acesso;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	Conta (int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	Conta (int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.0;
	
	}
	
	public boolean sacar(double valor) {
		if(valor > 0) {
			if(valor <= saldo) {
				saldo -= valor;
				return true;
			}
			else {
				System.out.println("Salso insuficiente.");
				return false;
			}
		}
		else {
			System.out.println("Valor inválido.");
			return false;
		}
	}
	
	public boolean deposita(double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}
		else {
			System.out.println("Valor inválido");
			return false;
		}
	}

	public boolean transfere(Conta destino, double valor) {
		if(valor > 0) {
			boolean retira = sacar(valor);
			
			if(retira) {
				destino.saldo += valor;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println("Valor inválido.");
			return false;
		}
	}

	public int getNumero() {
		return numero;
	}
	
//  Não é viável deixar os programdor usuário mudar o numero da conta	
//	public void setNumero(int num) {
//		numero = num;
//	}
	
	public String getTitular() {
		return titular;
	}
	
//  Não é viável deixar os programdor usuário mudar o nome da conta	
//	public void setTitular(String nome) {
//		titular = nome;
//	}
	
	public double getSaldo() {
		return saldo;
	}
	
//  Não é viável deixar os programdor usuário mudar o saldo da conta	
//	public void setSaldo(double valor) {
//		saldo = valor;
//	}
	
	void mostraConta() {
        System.out.println("Conta2[" + 
            "número:" + numero + "," +
            "Titular:" + titular + "," + 
            "Saldo:" + saldo + "]");
    }
	
	public static void main(String[] args) {
		Conta c1 = new Conta(123, "Ezequiel", 450);
		Conta c2 = new Conta(123, "Sara");
		
		System.out.println("Saldo Ezequiel: " + c1.getSaldo());
		c1.sacar(300);
		System.out.println("Saldo Ezequiel depois de sacar: " + c1.getSaldo());
		
		System.out.println("Saldo Sara: " + c2.getSaldo());
		c1.transfere(c2, 100);
		System.out.println("Saldo Sara depois de transferencia: " + c2.getSaldo());
		
		System.out.println("");
		c1.mostraConta();
		c2.mostraConta();
	}
}
