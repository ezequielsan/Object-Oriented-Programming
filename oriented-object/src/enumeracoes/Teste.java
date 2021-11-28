package enumeracoes;

// Como o enum � na pr�tica
enum Color { RED, GREEN, BLUE; };

// Como o enum � na verdade implementado por debaixo dos panos
class ColorTwo {
	public static final ColorTwo RED = new ColorTwo();
	public static final ColorTwo GREEN = new ColorTwo();
	public static final ColorTwo BLUE = new ColorTwo();

}

public class Teste {
    public static void main(String[] args) {
		Color r = Color.RED;
		Color g = Color.GREEN;
		Color b = Color.BLUE;
		
		System.out.println(r);
		System.out.println(g);
		System.out.println(b);
		
		System.out.println("==================================");
		
		ColorTwo r2 = ColorTwo.RED;
		ColorTwo g2 = ColorTwo.GREEN;
		ColorTwo b2 = ColorTwo.BLUE;
		
		System.out.println(r2);
		System.out.println(g2);
		System.out.println(b2);
		
	}
}
