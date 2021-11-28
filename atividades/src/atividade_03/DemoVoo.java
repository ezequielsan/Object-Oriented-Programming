package atividade_03;

public class DemoVoo {
	public static void main(String[] args) {
		Data data = new Data((byte)06, (byte)12, (short)2400);
		Voo v = new Voo(123456, data);
		
		v.ocupa(100);
		v.ocupa(1);
		
		System.out.println("Vagas sobrando: " + Voo.vagas());
		
		System.out.println("-----------------------------------");
		
		v.ocupa(2);
		v.ocupa(56);
		System.out.println("Vagas sobrando: " + Voo.vagas());
		
		System.out.println("-----------------------------------");
		
		// Verifica se esta ocupado, se sim retorna true, se não retorn false
		System.out.println("Cadeira 100 esta ocupada? " + v.verifica(100));
		System.out.println("Cadeira 41 esta ocupada? " + v.verifica(41));
		System.out.println(v);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Número: " + v.getVoo());
		System.out.println("Data do voo: " + v.getData());
		
		System.out.println("-----------------------------------");
		
		Voo v2 = v.clone();
		System.out.println("Dados do v2 clone\n" + v2);
		System.out.println("v e v2 são iguais: " + v.equals(v2));
		
		System.out.println("-----------------------------------");
		
		v.cadeirasJaOcupadas();
		System.out.println("Próxima cadeira livre é " + v.proximoLivre());
	}

}
