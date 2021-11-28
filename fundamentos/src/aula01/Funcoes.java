package aula01;

import java.util.Scanner;

public class Funcoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = maximo(a, b, c);
		
		System.out.println("Maior valor = " + maior);
		
		sc.close();
	}
	
	public static int maximo(int a, int b, int c) {
		return (a > b)? (a > c)? a : c : (b > c)? b : c;
	}

}
