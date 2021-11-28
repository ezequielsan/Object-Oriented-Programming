package modificadores_acesso;

import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite 3 inteiros separados por espaço: ");
	
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		int result = maximo(num1, num2, num3);
		System.out.println(result);
	}
	
	public static int maximo(int x , int y , int z) {
		int maior = x;
		
		maior = (y > maior) ? y : x;
		maior = (z > maior) ? z : y;
		
		return maior;
	}

}
