package relacionamentos_bike;

public class App {
	public static void main(String[] args) {
		Bicicleta bike = new Bicicleta(new Roda(), new Roda(), new Quadro(), new Selim(), new Guidao());
		
		System.out.println(bike);
	}

}
