package engsoft.jogo.patos;

// HERANÇA: Pato_Borracha é uma classe filha de Pato
public class Pato_Borracha extends Pato {

	public Pato_Borracha()
	{
		setComportamento(new Nao_Voa());		
	}
	
	// POLIMORFISMO: Implementação do método abstrato mostrar,
	// dentro da classe Pato_Borracha.
	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}
	
}
