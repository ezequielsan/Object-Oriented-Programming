package strings;

import java.util.Scanner;

public class JogoDaForca {
	private String word;
	private int size;
	private boolean[] corrects;
	private boolean[] lettersUsed;
	
	public JogoDaForca(String word) {
	    this.word = word;
	    this.size= word.length();
	    this.corrects = new boolean[size];
	    this.lettersUsed = new boolean[26];
	}
	
	public void question() {
		Scanner input = new Scanner(System.in);
		
		// mostrando ao jogador quais letras foram advinhadas
		showGuessedLetters();
		
		// mostrando ao jogador as letras que já foram usadas
		showUsedLetters();
		
		System.out.printf("Entre como uma letra: %n> ");
		char attempt = input.next().charAt(0);
		
		lettersUsed[attempt - 'a'] = true;
		
		for(int i = 0; i < size; i++) {
			if(word.charAt(i) == attempt) corrects[i] = true;
		}
		
		input.close();
		
	}
	
	private void showGuessedLetters() {
		
		System.out.println("Advinhado até agora: ");
		
		for(int i = 0; i < size; i++) {
			if(corrects[i]) System.out.print(word.charAt(i) + " ");
			else System.out.print("_ ");
		}
		System.out.println();
	}
	
	private void showUsedLetters() {
		
		System.out.println("Letras utilizadas: ");
		
		for(int i = 0; i < 26; i++) {
			if(lettersUsed[i]) {
				System.out.println((char)('a' + i));
			}
		}
		
		System.out.println();
	}
	
	public int howManyLettersHaveNotYetBeenGuessed() {
		int total = 0;
		
		for(int i = 0; i < size; i++) 
			if(!corrects[i]) total++;
		
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	

}
