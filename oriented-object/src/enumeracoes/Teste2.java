package enumeracoes;

class ColorThree {
	public static final ColorThree RED = new ColorThree();
	public static final ColorThree GREEN = new ColorThree();
	public static final ColorThree BLUE = new ColorThree();
}

public class Teste2 {
	public static void main(String[] args) {
		ColorThree c = ColorThree.RED;
		ColorThree d = ColorThree.RED;
		
		if(c == d) System.out.println("c e d apontam pro mesmo objeto");
		
		if(c.equals(d)) System.out.println("c e d d�o iguais");
		
		System.out.println(c.toString());
	}


}
