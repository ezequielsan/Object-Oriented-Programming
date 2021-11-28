package motrocycle;

public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;
    
    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power) {
    	this.power = power;
    	this.time = 0;
    	this.person = null;
    }
    
    //Comprar mais tempo
    public void buy(int time) {
    	this.time += time;
    }
    
    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean in(Person person) {
    	if(this.person == null) {
    		this.person = person;
    		return true;
    	}
    	else {
    		System.out.println("fail: moto ocupada");
    		return false;
    	}
    }
    
    //Se houver uma person, retira e retorna
    //Se não, retorna null
    public Person out() {
    	Person aux = this.person;
    	
    	if(this.person != null) {
    		this.person = null;
    		return aux;
    	}
    	else {
    		System.out.println("fail: moto vazia");
    		return aux;
    	}
    }
    
    
    public void drive(int time) {
    	if(this.person.getAge() <= 10) {
    		if(this.time > 0) {
    			this.time -= time;
    			
    			if(this.time < 0) {
    				System.out.printf("fail: andou %d min e acabou o tempo\n", this.time + time);
    				this.time = 0;
    			}
    		}
    		else {
    			System.out.println("fail: tempo zerado");
    		}
    	}
    	else {
    		System.out.println("fail: muito grande para andar de moto");
    	}
    }
    
    //buzinar
    public void honk() {
    	if(this.person != null) {
    		String buzina = "P";
    		
    		for(int i = 0; i < this.power; i++) {
    			buzina += "e";
    		}
    		
    		buzina += "m";
    		
    		System.out.println(buzina);
    	}
    	else {
    		System.out.println("fail: moto vazia");
    	}
    }
    
    public String toString() {
    	return String.format("potencia: %d, minutos: %d, pessoa: [" + this.person + "]",  this.power, this.time);
    }
    
}