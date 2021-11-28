package aula01;

import java.util.Scanner;

/* Laços em java 
 * 
 * While
 * Do while
 * For
 * 
 */

public class Lacos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float celsius = 0, fahrenheit = 0;
		char repeat;
		
		do {
			System.out.print("Digite a temperatura em celsius: ");
			celsius = sc.nextFloat();
			
			fahrenheit = ((9 * celsius) / 5) + 32;
			
			System.out.println("A temperatura em fahrenheit é " + fahrenheit);
			System.out.print("Deseja repetir ? (s/n): ");
			repeat = sc.next().charAt(0);
			
		} while(repeat == 's');
		
		sc.close();
	}

}
