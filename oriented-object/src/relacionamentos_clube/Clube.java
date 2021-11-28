package relacionamentos_clube;

import java.util.ArrayList;

public class Clube {
	private ArrayList<Socio> sociedade;
	
	public Clube() {
		this.sociedade = new ArrayList<>();
	}
	
	public void addSocio(Socio socio) { 
		if(socio == null) throw new RuntimeException("S�cio n�o pode ser nulo");
		
		this.sociedade.add(socio);
	}
	
	public Socio removeSocio(int index) {
		return this.sociedade.remove(index);
	}
	
	public Socio getSocio(int index) {
		return this.sociedade.get(index);
	}
	
	public int numeroDeSocios() {
		return this.sociedade.size();
	}
	
	public String toString() {
		String format = "[ ";
		
		for(Socio socio : this.sociedade) {
			format += socio + " ";
		}
		
		return format += "]";
	}

}
