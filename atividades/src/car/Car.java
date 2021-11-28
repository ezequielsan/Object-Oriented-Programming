package car;

public class Car {
    private int pass; // Passageiros
    private int passMax = 2; // limite de Passageiros
    private int gas; // tanque
    private int gasMax = 100; // limite do tanque
    private int km; // quantidade de quilometragem
    
    /**
     * Foi pedido que p carro inicie com tanque vazio
     * e 0 de kilometragem, logo ele não rebera dados
     * quando instanciado
     */
    Car() {
    	this.pass = 0;
    	this.gas = 0;
    	this.km = 0;
    }
    
    public void in() {
    	if(this.pass < passMax)
    	  this.pass++;
    	else
    		System.out.println("fail: limite de pessoas atingido");
    }
    
    public void out() {
    	if(this.pass > 0)
    		this.pass--;
    	else
    		System.out.println("fail: nao ha ninguem no carro");
    }
    
    /**
     * Nesta classe, irei fazer uma validação da entrada,
     * como por exemplo verificar se foi passado uma valor negativo
     */
    public void fuel(int gas) {
    	if(gas < 0) 
    		System.out.println("Valor inválido");
    	else {
    		this.gas += gas;	
    		this.gas = (this.gas > this.gasMax) ? 100 : this.gas;
    	}
    }
    
    public void drive (int km) {
    	if(this.pass > 0) {
    		if(this.gas > 0) {
    			if(km > this.gas) { // qnt de km a rodar maior do que qnt de gas
    				System.out.printf("fail: tanque vazio apos andar %d km\n", this.gas);
    				this.km += this.gas;
    				this.gas -= this.gas;
    			}
    			else {
    				this.km += km;
    				this.gas -= km;
    			}	
    		}
    		else 
    			System.out.println("fail: tanque vazio");
    	}
    	else 
    		System.out.println("fail: nao ha ninguem no carro");

    }
    
    public String toString() {
    	return String.format("pass: %d, gas: %d, km: %d", this.pass, this.gas, this.km);
    }
}