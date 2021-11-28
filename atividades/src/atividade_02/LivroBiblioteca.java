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
 * - edição: byte
 * - genero: String
 * 
 * OBS: 
 * - A questão não comenta nada sobre os métodos, logo
 *   não farei nenhum método
 */

public class LivroBiblioteca {
	int numPags;
	byte edicao;
	String nome;
	String editora;
	String autor;
	String ISBN;
	String genero;
	
	public static void main(String[] args) {
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Fundamentos Matemáticos para Ciência da Computação";
		livro.editora = "gen";
		livro.autor = "Judith L. Gersting";
		livro.numPags = 750;
		livro.edicao = 5;
		livro.ISBN = "9788533302273";
		livro.genero = "Ciência e  Tecnologia";
		
		System.out.println("Livro 01");
		System.out.println(livro.nome);
		System.out.println(livro.editora);
		System.out.println(livro.autor);
		System.out.println(livro.numPags);
		System.out.println(livro.edicao + "°");
		System.out.println(livro.ISBN);
		System.out.println(livro.genero);
	}

}
