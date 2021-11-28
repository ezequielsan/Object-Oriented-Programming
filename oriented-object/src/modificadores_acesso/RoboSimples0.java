package modificadores_acesso;

/**
 * A classe RoboSimples0 representa um rob� que tem uma posi��o qualquer
 * no espa�o de duas dimens�es, pode modificar a posi��o e dire��o 
 * (se movimentar somente para a frente) e informar a sua posi��o e dire��o.
 * Este rob� � um modelo supersimplificado de um pequeno rob� m�vel.
 * O nome da classe tem um zero pois esta classe ainda ser� modificada.
 */
class RoboSimples0 {
    /**
     * Declara��o dos atributos da classe
     */
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private char direcaoAtual; // pode ser norte(N), sul(S), leste(L) e oeste(O)

    /**
     * O construtor para a classe RoboSimples0, que recebe argumentos
     * para inicializar todos os campos da classe
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     */
    RoboSimples0(String n, int px, int py, char d) {
        nomeDoRobo = n;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    /**
     * O construtor para a classe RoboSimples0 que recebe o nome do rob�
     * e assume que este rob� est� na posi��o (0,0) e dire��o norte.
     * @param n o nome do rob�
     */
    RoboSimples0(String n) {
    	this(n, 0, 0, 'N');
    }

    /**
     * O construtor para a classe RoboSimples0 que n�o recebe argumento e 
     * assume que o rob� n�o tem nome e que este rob� est� na posi��o (0,0) e dire��o norte.
     */
    RoboSimples0() {
    	this("", 0, 0, 'N');
    }

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em uma unidade
     * a dire��o em que o rob� est�. 
     */
    public void move() {
    	this.move(1);
    }

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em 
     * um certo n�mero de unidades na dire��o em que o rob� est�.
     * @param passos o n�mero de "passos" para o rob�
     */
    public void move(int passos) {
        if(direcaoAtual == 'N') posicaoYAtual += passos;
        if(direcaoAtual == 'S') posicaoYAtual -= passos;
        if(direcaoAtual == 'L') posicaoXAtual += passos;
        if(direcaoAtual == 'O') posicaoXAtual -= passos;
    }

    /**
     * O m�todo mudaDirecao permite que a dire��o do rob� seja mudada
     * depois de ele ter sido criado.
     * @param novaDirecao a nova dire��o para o rob�
     */
    public void mudaDirecao(char novaDirecao) {
        direcaoAtual = novaDirecao;
    }

    /**
     * O m�todo toString retorna uma string contendo os valores dos
     * atributos da classe formatados.
     * @return uma string com os valores dos atributos formatados
     */
    public String toString() {
        return String.format("Nome do rob�: %s\n"
        		+ "Posi��o do rob�: (%d, %d)\n"
        		+ "Dire��o do rob�: %c ", 
        		nomeDoRobo, posicaoXAtual, posicaoYAtual, direcaoAtual);
    }
    
    public static void main(String[] args) {
        RoboSimples0 bob = new RoboSimples0("Bob", 10, 10, 'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();
        
        // Movimentamos esses rob�s
        bob.move(10);
        chico.mudaDirecao('L');
        chico.move(5);
        semNome.move();

        // Onde os rob�s est�o agora?
        System.out.println(bob);
        System.out.println(chico);
        System.err.println(semNome);

        System.out.println(bob);
    }
    
}





