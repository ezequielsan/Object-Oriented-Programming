package modificadores_acesso;

/**
 * A classe MathConst contém vários valores que são constantes.
 * Esta classe não tem métodos, e todos os campos são 
 * declarados como static, assim não é necessário criar
 * instâncias desta classe para acessar os valores.
 */
public class MathConst {
	
    // A raiz quadrada de 2
    public static final double raizDe2 = 1.4142135623730950488;

    // A raiz quadrada de 3
    public static final double raizDe3 = 1.7320508075688772935;

    // A raiz quadrada de 5
    public static final double raizDe5 = 2.2360679774997896964;
    
    // A raiz quadrada de 6: podemos usar as constantes já definidas
    public static final double raizDe6 = raizDe2*raizDe3; 
    
    public static void main(String[] args) {
    	int x = -5;
    	
        System.out.println("Raiz(2) = " + MathConst.raizDe2);
        System.out.println("Raiz(3) = " + MathConst.raizDe3);
        System.out.println("Raiz(5) = " + MathConst.raizDe5);
        System.out.println("Raiz(6) = " + MathConst.raizDe6);
        System.out.println("Raiz(10) = " + MathConst.raizDe2 * MathConst.raizDe5);
        
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);
        System.out.printf("|%d| = %d\n", x, Math.abs(x));
    }
}