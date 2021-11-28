package atividade_02;

/**
 * @author ezequ 
 * Essa classe � referente ao item "a" da quarta quest�o
 *
 * Atributos: 
 * - nome do livro: String
 * - n�mero de p�ginas: int
 * - editora: String
 * - autor: String
 * - ISBN: String
 * - edi��o: byte
 * - genero: String
 * 
 * OBS: 
 * - A quest�o n�o comenta nada sobre os m�todos, logo
 *   n�o farei nenhum m�todo
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
		
		livro.nome = "Fundamentos Matem�ticos para Ci�ncia da Computa��o";
		livro.editora = "gen";
		livro.autor = "Judith L. Gersting";
		livro.numPags = 750;
		livro.edicao = 5;
		livro.ISBN = "9788533302273";
		livro.genero = "Ci�ncia e  Tecnologia";
		
		System.out.println("Livro 01");
		System.out.println(livro.nome);
		System.out.println(livro.editora);
		System.out.println(livro.autor);
		System.out.println(livro.numPags);
		System.out.println(livro.edicao + "�");
		System.out.println(livro.ISBN);
		System.out.println(livro.genero);
	}

}
