package modificadores_acesso;

/**
 * A classe RoboSimples0 representa um robô que tem uma posição qualquer
 * no espaço de duas dimensões, pode modificar a posição e direção 
 * (se movimentar somente para a frente) e informar a sua posição e direção.
 * Este robô é um modelo supersimplificado de um pequeno robô móvel.
 * O nome da classe tem um zero pois esta classe ainda será modificada.
 */
class RoboSimples0 {
    /**
     * Declaração dos atributos da classe
     */
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private char direcaoAtual; // pode ser norte(N), sul(S), leste(L) e oeste(O)

    /**
     * O construtor para a classe RoboSimples0, que recebe argumentos
     * para inicializar todos os campos da classe
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    RoboSimples0(String n, int px, int py, char d) {
        nomeDoRobo = n;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    /**
     * O construtor para a classe RoboSimples0 que recebe o nome do robô
     * e assume que este robô está na posição (0,0) e direção norte.
     * @param n o nome do robô
     */
    RoboSimples0(String n) {
    	this(n, 0, 0, 'N');
    }

    /**
     * O construtor para a classe RoboSimples0 que não recebe argumento e 
     * assume que o robô não tem nome e que este robô está na posição (0,0) e direção norte.
     */
    RoboSimples0() {
    	this("", 0, 0, 'N');
    }

    /**
     * Esta versão do método move modifica a posição do robô em uma unidade
     * a direção em que o robô está. 
     */
    public void move() {
    	this.move(1);
    }

    /**
     * Esta versão do método move modifica a posição do robô em 
     * um certo número de unidades na direção em que o robô está.
     * @param passos o número de "passos" para o robô
     */
    public void move(int passos) {
        if(direcaoAtual == 'N') posicaoYAtual += passos;
        if(direcaoAtual == 'S') posicaoYAtual -= passos;
        if(direcaoAtual == 'L') posicaoXAtual += passos;
        if(direcaoAtual == 'O') posicaoXAtual -= passos;
    }

    /**
     * O método mudaDirecao permite que a direção do robô seja mudada
     * depois de ele ter sido criado.
     * @param novaDirecao a nova direção para o robô
     */
    public void mudaDirecao(char novaDirecao) {
        direcaoAtual = novaDirecao;
    }

    /**
     * O método toString retorna uma string contendo os valores dos
     * atributos da classe formatados.
     * @return uma string com os valores dos atributos formatados
     */
    public String toString() {
        return String.format("Nome do robô: %s\n"
        		+ "Posição do robô: (%d, %d)\n"
        		+ "Direção do robô: %c ", 
        		nomeDoRobo, posicaoXAtual, posicaoYAtual, direcaoAtual);
    }
    
    public static void main(String[] args) {
        RoboSimples0 bob = new RoboSimples0("Bob", 10, 10, 'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();
        
        // Movimentamos esses robôs
        bob.move(10);
        chico.mudaDirecao('L');
        chico.move(5);
        semNome.move();

        // Onde os robôs estão agora?
        System.out.println(bob);
        System.out.println(chico);
        System.err.println(semNome);

        System.out.println(bob);
    }
    
}





