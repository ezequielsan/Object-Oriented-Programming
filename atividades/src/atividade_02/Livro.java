package atividade_02;

/**
 * @author ezequ 
 * Essa classe é referente ao item "a" da quarta questão
 *
 * Atributos: 
 * - nome do livro: String
 * - número de páginas: int
 * - editora: String
 * - autor: String
 * - ISBN: String
 * - edição: int
 * 
 * OBS: 
 * - A questão não comenta nada sobre os métodos, logo
 *   não farei nenhum método
 */

public class Livro {
	String nomeLivro;
	String editora;
	String autor;
	String ISBN;
	int numPags;
	int anoPublicacao;
	byte edicao;
	
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.nomeLivro = "Fundamentos Matemáticos para Ciência da Computação";
		livro.editora = "gen";
		livro.autor = "Judith L. Gersting";
		livro.numPags = 750;
		livro.edicao = 5;
		livro.anoPublicacao = 2007;
		livro.ISBN = "9788533302273";
		
		System.out.println("Livro 01");
		System.out.println(livro.nomeLivro);
		System.out.println(livro.editora);
		System.out.println(livro.autor);
		System.out.println(livro.numPags);
		System.out.println(livro.edicao + "°");
		System.out.println(livro.anoPublicacao);
		System.out.println(livro.ISBN);
	}
	

}
