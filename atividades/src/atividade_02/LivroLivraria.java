package atividade_02;

/**
 * @author ezequ 
 * Essa classe é referente ao item "b" da quarta questão
 *
 * Atributos: 
 * - nome do livro: String
 * - número de páginas: int
 * - editora: String
 * - autor: String
 * - ISBN: String
 * - edição: int
 * - ano de publicação
 * - gênero
 * - preço do livro
 * - desconto
 * 
 * OBS: 
 * - Essa classe é basicamente uma cópia da classe do item a,
 *   salve umas modificações, como a introdução de alguns atributos
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
		
		livro.nome = "Fundamentos Matemáticos para Ciência da Computação";
		livro.editora = "gen";
		livro.autor = "Judith L. Gersting";
		livro.numPags = 750;
		livro.ISBN = "9788533302273";
		livro.edicao = 5;
		livro.preco = 340.47;
		livro.desconto = 0.1F;
		livro.anoPublicacao = 2003;
		livro.genero = "Ciência e Tecnologia";
		
		
		System.out.println("Livro 01");
		System.out.println(livro.nome);
		System.out.println(livro.editora);
		System.out.println(livro.autor);
		System.out.println(livro.numPags);
		System.out.println(livro.ISBN);
		System.out.println(livro.edicao + "°");
		System.out.println(livro.preco);
		System.out.println(livro.desconto);
		System.out.println(livro.anoPublicacao);
		System.out.println(livro.genero);
	}
	

}
