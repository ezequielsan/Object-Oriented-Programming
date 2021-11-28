package calculator;

import java.text.DecimalFormat;

public class Calculator {
    private int batteryMax;
    private int battery;
    private float display;
    
    DecimalFormat form = new DecimalFormat("0.00");
    
    //Inicia os atributos, battery e display começam com o zero.
    // Irei fazer uma verificação do valor do parâmetro
    // Se o valor for menor que 0, valor invalido, pois
    // valores negativos não são validos 
    // nesse caso irei setar valores defalut para os dados
    public Calculator(int batteryMax) {
    	if(batteryMax < 0) {
    		System.out.println("Valor invalido");
    		batteryMax = 1;
    	}
    	else {
        	this.batteryMax = batteryMax;
        	this.battery = 0;
        	this.display = 0.0f;
    	}

    }
    
    //Aumenta a bateria, porém não além do máximo.
    public void chargeBattery(int value) {
    	if(value < 0) System.out.println("Valor invalido");
    	else {
    		this.battery += value;
        	this.battery = (this.battery > this.batteryMax) ? this.batteryMax : this.battery;		
    	}
    }
    
    //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
    private boolean useBattery() { 
    	if(this.battery > 0) {
    		this.battery--;
    		return true;
    	}
    	else {
    		System.out.println("fail: bateria insuficiente");
    		return false;
    	}
    }
    
    //Se conseguir gastar bateria, armazene a soma no atributo display.
    public void sum(int a, int b) {
    	if(useBattery()) {
    		this.display = a + b;
    	}	
    }
    
    //Se conseguir gastar bateria e não for divisão por 0.
    public void division(int num, int den) {
    	if(useBattery()) {
    		if(den == 0) {
    			System.out.println("divisao por zero");
    		}
    		else
    			this.display = num / (float)den;
    	}
    }
    
    //Retorna o conteúdo do display com duas casas decimais.
    public String toString() {
    	return "display = " + form.format(this.display) + ", battery = " + this.battery;
    }
}
