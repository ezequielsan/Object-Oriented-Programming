package modificadores_acesso;

public class RegistroAcademico {
	private String nomeDoAluno;
	private int numeroMatricula;
	private byte codigoDoCurso;
	private double percentualDeCobranca;
	
	public void inicializaRegistro(String n, int m, byte c, double p) {
		nomeDoAluno = n;
		numeroMatricula = m;
		codigoDoCurso = c;
		percentualDeCobranca = p;
	}
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public byte getCodigoDoCurso() {
		return codigoDoCurso;
	}
	
	public double calculaMensalidade() {
		double mensalidade = 0.0;
		
		switch(codigoDoCurso) {
		case 1: mensalidade = 450.0; break; // Arquitetura
		case 2: mensalidade = 500.0; break; // Ciência da Computação
		case 3: mensalidade = 550.0; break; // Engenharia de Computação
		case 4: mensalidade = 380.0; break; // Zootecnia

		}
		
		if(percentualDeCobranca == 0) {
			mensalidade = 0.0;
		}
		else {
			mensalidade = (percentualDeCobranca * mensalidade) / 100.0;
			System.out.println("Mensalidade = " + mensalidade);
		}
		
		return mensalidade;
	}
	
	public static void main(String[] args) {
        RegistroAcademico michel = new RegistroAcademico();
        RegistroAcademico roberto = new RegistroAcademico();
        
        michel.inicializaRegistro("Michel Santos", 34980030, (byte)4, 50);

        System.out.println("A mensalidade do " + 
            michel.getNomeDoAluno() + " é " + michel.calculaMensalidade());
        System.out.println("A mensalidade do " + 
            roberto.getNomeDoAluno() + " é " + roberto.calculaMensalidade());
    }

}
