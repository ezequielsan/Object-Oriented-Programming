package aula01;

import java.util.Scanner;

/* Array em Java
 * 
 * Um array � uma lista homog�nea de dados
 * Um array tem um tipo, refer�ncia(nome), e um tamanho
 * Um array em java � um objeto
 * � preciso incializar o array durante a sua declara��o
 * A inicializa��o do array se da usando a palavra reservada new
 * O array tem um atributo chamado length, que retorna o tamanho do array
 * o array tem
 */

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int array[] = new int[10]; // Declara��o de um array e inicializando

		// Declara��o de outro array e inicializando cada posi��o manualmente
		int size = 5;
		int fibon[] = new int[size];
		fibon[0] = 1;
		fibon[1] = 1;
		fibon[2] = 2;
		fibon[3] = 3;
		fibon[4] = 5;

		// imprimdo array fibonnaci
		System.out.println("Sequ�ncia de fibonnaci");
		for (int i = 0; i < size; i++) {
			System.out.println(fibon[i]);
		}

		int primes[] = { 2, 3, 5, 7, 11, 13 };

		// imprimdo array de primos
		System.out.println("\nN�mero primos pequenos");
		for (int value : primes) {
			System.out.println(value);
		}

		// Copiando array por refer�ncia
		int largePrimes[] = { 997, 991, 983, 977, 971, 967 };
		int luckyNumbers[] = largePrimes;

		System.out.println("\nN�mero primos grandes");
		for (int value : largePrimes) {
			System.out.println(value);
		}

		System.out.println("-------------------");
		for (int value : luckyNumbers) {
			System.out.println(value);
		}

		sc.close();
	}

}
