package tamagotchi;

public class Pet{
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;

    /**
     * @method Construtor Pet, inializa os atributos energiaMx, fomeMax, e limpezaMax
     * e e seus respectivos atributos energia, fome e limpeza com seus respectivo valores
     * e os atributos diamantes e idade com zero
     * @param energy maximo
     * @param hungry maximo
     * @param shower maximo
     */
    public Pet(int energy, int hungry, int shower) {
    	this.energyMax = this.energy = energy;
    	this.hungryMax = this.hungry = hungry;
    	this.cleanMax = this.shower = shower;
    	this.diamonds = 0;
    	this.age = 0;
    	this.alive = true;
    }

    private int getClean() {
    	return this.shower;
    }
    
    private int getHungry() {
        return this.hungry;	
    }
    
    private int getEnergy() {
        return this.energy;	
    }
    
    private int getEnergyMax() {
    	return this.energyMax;
    }
    
    private int getCleanMax() {
    	return this.cleanMax;
    }
    
    private int getHungryMax() {
    	return this.hungryMax;
    }
    
    /**
     * @method setEnergy() faz o aumento dos atributos do pet referente a cada ação
     * além de possíveis validações e verificações
     * @param value
     */
    void setEnergy(int value){
    	this.energy += value;
    	
        if(getEnergy() >= getEnergyMax())
            this.energy = getEnergyMax();
        
        else if(getEnergy() <= 0) {
        	System.out.println("fail: pet morreu de fraqueza");
			this.energy = 0;
			this.alive = false;
        }   
    }
    
    /**
     * @method setHungry() funcionamento parecido com o metodo setEnergy
     * @param value
     */
    void setHungry(int value) {
    	this.hungry += value;
    	
    	 if(getHungry() >= getHungryMax())
             this.hungry = getHungryMax();
         
         else if(getHungry() <= 0) {
 			System.out.println("fail: pet morreu de fome");
 			this.hungry = 0;
 			this.alive = false;
         }  
    }
    
    /**
     * @method setClean() funcionamento parecido com o metodo setEnergy
     * @param value
     */
    void setClean(int value) {
    	this.shower += value;
    	
   	    if(getClean() >= getCleanMax())
            this.shower = getCleanMax();
        
        else if(getClean() <= 0) {
		    System.out.println("fail: pet morreu de sujeira");
		    this.shower = 0;
		    this.alive = false;
        }
    }

    /**
     * @method retorna se o Pet esta vivo
     * @return true, se o Pet esta vivo, ou seja, todos os atributos são maiores que 0
     * @return false, se o Pet esta morto, ou seja, algum atributo chegou a 0
     * 
     * OBS: Esse método é redundante pois eu poderia fazer a verificação do pet esta vivou ou não
     *      pelo prórpio atributo alive, mas vou deixa-lo, para fazer a impressão de quanto o pet
     *      estiver morto 
     */
    public boolean testAlive() {
    	if(this.alive == true) {
    		return true;
    	}
    	else {
    		System.out.println("fail: pet esta morto");
    		return false;
    	}
    }
 
    /**
     * @method seta respectivos valores para cada ação que o Pet executa
     * @param energy
     * @param hungry
     * @param shower
     * @param diamonds
     * @param age
     */
    private void setAttributes(int energy, int hungry, int shower, int diamonds, int age) {
    	setEnergy(energy);
    	setHungry(hungry);
    	setClean(shower);

		this.diamonds += diamonds;
		this.age += age;
    }
    
    /**
     * @method play altera em -2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade,
     * se o Pet estiver vivo
     */
    public void play() {
    	if(testAlive()) {
    		setAttributes(-2, -1, -3, 1, 1);
    	}
    }
  
    /**
     * @method eat altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade
     * se o Pet estiver vivo
     */
    public void eat() {
    	if(testAlive()) {
    		setAttributes(-1, 4, -2, 0, 1);
    	}
    }
 
    /**
     * @method shower altera em -3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.
     * se o Pet estiver vivo
     */
    public void shower() {
        if(testAlive()) {
    		setAttributes(-3, -1, this.cleanMax, 0, 2);
    	}
    }
  
    /**
     * @method sleep aumenta energia até o máximo, altera a saciedade em -1 e idade aumenta 
     * do número de turnos que o pet dormiu. Os outros atributos permanecem inalterados.
     * 
     * OBS: Vou interpretar o número de turnos como a diferença entre a energia maxima e a 
     * energia atual do pet antes da chamada do metodo dormir. 
     * A cada +1 energia, +1 de idade, até a energia chega no maximo
     */
    public void sleep() {
    	if(testAlive()) {
    		if(getEnergy() <= getEnergyMax() - 5) {
    			setAttributes(this.energyMax, -1, 0, 0, this.energyMax - this.energy);
    		}
    		else {
    			System.out.println("fail: nao esta com sono");
    		}
    		
    	}
    }
   
    /**
     * @method retorna os dados do Pet em uma string
     * @return Strind dos dados
     */
    public String toString() {
    	return String.format("E:%d/%d, S:%d/%d, L:%d/%d, D:%d, I:%d%n", 
    			this.energy, this.energyMax, this.hungry, this.hungryMax, 
    			this.shower, this.cleanMax, this.diamonds, this.age);
    }

}




