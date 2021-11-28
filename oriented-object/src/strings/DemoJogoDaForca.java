package strings;

public class DemoJogoDaForca {
    public static void main(String[] args) {
        JogoDaForca jogo = new JogoDaForca("miraculosamente");
        while(jogo.howManyLettersHaveNotYetBeenGuessed() > 0) {
            jogo.question();
        }
    }
}
