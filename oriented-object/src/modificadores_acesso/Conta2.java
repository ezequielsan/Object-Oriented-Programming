package modificadores_acesso;

/**
 * A classe Conta2 modela uma conta banc�ria simplificada.
 */

public class Conta2 {
    private int numero;
    private String titular;
    private double saldo;
    private static int quantidadeDeContas = 0;

    /**
     * Construtor que recebe tr�s argumentos. 
     * Quando o objeto do tipo Conta2 for instanciado com um inteiro, 
     * uma String e um double passados por par�metro, esse construtor ser� executado.
     * @param numero n�mero da conta
     * @param titular nome do titular da conta
     * @param saldo saldo da conta
     */
    Conta2(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        quantidadeDeContas++;
    }

    /**
     * Construtor que recebe dois argumentos. 
     * Quando o objeto do tipo Conta2 for instanciado com um inteiro e 
     * uma String passados por par�metro, esse construtor ser� executado.
     * @param numero n�mero da conta
     * @param titular nome do titular da conta
     */
    Conta2(int numero, String titular) {
        this(numero, titular, 0.0); // invoca o construtor com tr�s par�metros
    }

    public int getNumero() { // getter
        return numero;
    }

    public double getSaldo() { // getter
        return saldo;
    }

    public String getTitular() { // getter
        return titular;
    }

    /**
     * M�todo para sacar uma quantia da conta.
     * @param valor o valor a ser sacado da conta
     * @return true se o saque for bem-sucedido, false caso contr�rio
     */
    public boolean saca(double valor) {
        if(valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        else return false;
    }

    /**
     * M�todo usado para depositar uma quantia na conta.
     * Antes de depositar, verifica se o valor � n�o-negativo.
     * @param valor quantia a ser depositada na conta
     * @return true se o dep�sito for bem-sucedido, false caso contr�rio
     */
    public boolean deposita(double valor) {
        if(valor >= 0) {
            this.saldo += valor;
            return true;
        }
        else return false;
    }

    /**
     * M�todo que transfere uma quantia desta conta para outra
     * Antes de transferir, verifica se a conta possui a 
     * quantidade a ser transferida dispon�vel.
     * @param destino conta para a qual a quantia deve ser transferida
     * @param valor quantia a ser transferida
     * @return true se a transfer�ncia for bem sucedida, false caso contr�rio
     */
    public boolean transfere(Conta2 destino, double valor) {
        boolean retirou = this.saca(valor);
        if(retirou == false) {
            return false; // n�o deu para sacar
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }
    
    /**
     * M�todo toString sobrescrito.
     * @return uma string com a descri��o do objeto
     */
    public String toString() {
        String output = "Conta[" + 
            "n�mero:" + numero + "," +
            "Titular:" + titular + "," + 
            "Saldo:" + saldo + "]";
        return output;
    }
    
    public static void main(String[] args) {
        Conta2 cc1 = new Conta2(234, "Fulano", 700.0);
        Conta2 cc2 = new Conta2(235, "Cliclano", 4500.0);
        Conta2 cc3 = new Conta2(236, "Beltrano", 900.87);
        Conta2 cc4 = new Conta2(237, "Neltrano", 1473);
        Conta2 cc5 = new Conta2(238, "Butano", 458.44);
        Conta2 cc6 = new Conta2(239, "Propano", 789.1);
        Conta2 cc7 = new Conta2(240, "Octano", 1234);

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(cc4);
        System.out.println(cc5);
        System.out.println(cc6);
        
        System.out.println("Quantidade de contas: " + Conta2.quantidadeDeContas);
    }
}




