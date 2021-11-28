package intro_poo;

public class Swap {
    public static void main(String[] args) {
        Empregado a = new Empregado();
        Empregado b = new Empregado();
        a.nome = "Alice";
        b.nome = "Bob";
        swap(a, b);
        System.out.printf("%s, %s%n", a.nome, b.nome);
        
        swapCerto(a, b);
        System.out.printf("%s, %s%n", a.nome, b.nome);
    }

    public static void swap(Empregado x, Empregado y) {
        Empregado temp = x;
        x = y;
        y = temp;
    }
    
    public static void swapCerto(Empregado x, Empregado y) {
    	String nome = x.nome;
    	x.nome = y.nome;
    	y.nome = nome;
    }
}

class Empregado {
    String nome;
}
