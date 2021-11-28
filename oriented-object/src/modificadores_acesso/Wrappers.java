package modificadores_acesso;

public class Wrappers {

	public static void main(String[] args) {
		int x = 10;
		Integer y = 15;

		System.out.println(x);
		System.out.println(y);
		System.out.println(Integer.min(x, y));
		System.out.println(Integer.toString(123456789, 2));

		System.out.println("-----------------------------------");

	}

}
