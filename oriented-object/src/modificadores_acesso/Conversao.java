package modificadores_acesso;

public class Conversao {
	private static double fator = 3.6;
	
	public static double metroPorSegundoParaKiloPorHora(double metroPorSegundo) {
		return metroPorSegundo * fator;
	}
	
	public static double kiloPorHoraParaMetroPorSegundo(double kiloPorHora) {
		return kiloPorHora / fator;
	}
	
	public static void main(String[] args) {
		System.out.println(Conversao.metroPorSegundoParaKiloPorHora(300000));
	}

}
