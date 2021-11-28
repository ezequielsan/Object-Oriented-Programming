package atividade_02;

/**
 * @author ezequ 
 * Essa classe � referente ao item "b" da quarta quest�o
 *
 * Atributos: 
 * - nome do livro: String
 * - n�mero de p�ginas: int
 * - editora: String
 * - autor: String
 * - ISBN: String
 * - edi��o: int
 * - ano de publica��o
 * - g�nero
 * - pre�o do livro
 * - desconto
 * 
 * OBS: 
 * - Essa classe � basicamente uma c�pia da classe do item a,
 *   salve umas modifica��es, como a introdu��o de alguns atributos
 */

public class LivroLivraria {
	String nome;
	String editora;
	String autor;
	String ISBN;
	String genero;
	double preco;
	float desconto;
	int numPags;
	int anoPublicacao;
	byte edicao;
	
	public static void main(String[] args) {
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Fundamentos Matem�ticos para Ci�ncia da Computa��o";
		livro.editora = "gen";
		livro.autor = "Judith L. Gersting";
		livro.numPags = 750;
		livro.ISBN = "9788533302273";
		livro.edicao = 5;
		livro.preco = 340.47;
		livro.desconto = 0.1F;
		livro.anoPublicacao = 2003;
		livro.genero = "Ci�ncia e Tecnologia";
		
		
		System.out.println("Livro 01");
		System.out.println(livro.nome);
		System.out.println(livro.editora);
		System.out.println(livro.autor);
		System.out.println(livro.numPags);
		System.out.println(livro.ISBN);
		System.out.println(livro.edicao + "�");
		System.out.println(livro.preco);
		System.out.println(livro.desconto);
		System.out.println(livro.anoPublicacao);
		System.out.println(livro.genero);
	}
	

}
