package relacionamentos_exercicios;

public class Produto {
	private int code;
	private String name;
	private String description;
	private float value;
	
	Produto(int code, String name, String description, float value) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.value = value ;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public float getValue() {
		return value;
	}
	
	public boolean increasePrice(float increase) {
		if(increase >= 0) {
			this.value += increase;
			return true;
		}
		else return false;
	}
	
	public boolean discount(float disc) {
		if(disc >= 0) {
			this.value -= disc;
			return true;
		}
		else return false;	
	}

	
	
		
}
