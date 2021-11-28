package relacionamentos_bike;

import java.util.ArrayList;

/**
 * Classe Bicileta que ilustra o relacionamento de composi��o
 */
public class Bicicleta {
    /**
     * Os membros privados rodaDianteira, rodaTraseira, 
     * quadro, selim e guidao s�o as associa��es requeridas 
     * pelo tipo composto Bicicleta. S�o declarados privados 
     * para garantir que n�o sejam substitu�dos por null, 
     * o que tornaria a composi��o inv�lida com a aus�ncia 
     * de qualquer um de seus componentes.
     */
    private Roda rodaDianteira, rodaTraseira;
    private Quadro quadro;
    private ArrayList<Selim> selim = new ArrayList<Selim>();
    private Guidao guidao;

    /**
     * Construtor da classe Bicicleta. O construtor toma como 
     * argumentos os componentes exigidos para a composi��o, 
     * validando e rejeitando componentes nulos. Apenas quando 
     * fornecidas duas inst�ncias distintas de Roda, uma inst�ncia 
     * de Quadro, de Selim e de Guidao, torna-se poss�vel a 
     * instancia��o de um objeto Bicicleta.
     * @param rd a roda dianteira
     * @param rt a roda traseira
     * @param q o quadro
     * @param s o selim
     * @param g o gud�o
     */
    public Bicicleta(Roda rd, Roda rt, Quadro q, Selim s, Guidao g) {
        if (rd == null || rt == null || rd == rt) {
            throw new RuntimeException("Bicicleta requer duas rodas.");
        }
        if (q == null) {
            throw new RuntimeException("Bicicleta requer um quadro.");
        }
        if (s == null) {
            throw new RuntimeException("Bicicleta requer um selim.");
        }
        if (g == null) {
            throw new RuntimeException("Bicicleta requer um guidao.");
        }
        rodaDianteira = rd; 
        rodaTraseira = rt;
        quadro = q;
        selim.add(s);
        guidao = g;
    }

    // As opera��es de acesso getter permitem acessar e, portanto, 
    // navegar, unidirecionalmente, da inst�ncia de Bicicleta para 
    // as suas inst�ncias componentes.
    public Roda getRodaDianteira() { return rodaDianteira; }
    public Roda getRodaTraseira() { return rodaTraseira; }
    public Quadro getQuadro() { return quadro; }
    public ArrayList<Selim> getSelim() { return selim; }
    public Guidao getGuidao() { return guidao; }

    /**
     * M�todo toString, que retorna uma string descrevendo
     * os componentes da bibicleta. O m�todo toString() de 
     * Bicicleta produz uma String que concatena o nome da 
     * classe do tipo Bicicleta e, tamb�m, os nomes das classes 
     * de seus componentes, cujos m�todos toString() s�o 
     * implicitamente acionados quando suas refer�ncias s�o usadas 
     * para suprir um argumento de tipo %s, que indica um tipo String. 
     * Este m�todo mostra uma poss�vel forma de propaga��o de 
     * mensagens entre o objeto composto e seus componentes.
     */
    public String toString() {
        return String.format("%s:\n\t%s,\n\t%s,\n\t%s,\n\t%s,\n\t%s\n",
            getClass().getName(), rodaDianteira, rodaTraseira, 
            quadro, selim, guidao);
    } 

}

