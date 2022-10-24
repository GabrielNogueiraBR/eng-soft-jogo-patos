package engsoft.jogo.patos;

// INTERFACE: A classe Voar_Foguete implementa a interface Padrao_Voaveis,
// ou seja, deve necessariamente conter a implementação dos métodos
// definido no contrato (interface)
public class Voar_Foguete implements Padrao_Voaveis{
	
	private double velocidade;
	
	//DELEGAÇÂO: declaração dos métodos delegados dentro da interface
	// Padrao_Voaveis.
	public Voar_Foguete()
	{
		velocidade = 1000;	
	}
	
	// INTERFACE: Definição de um método de uma interface
	//DELEGAÇÂO: declaração dos métodos delegados dentro da interface
	// Padrao_Voaveis.
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();		
	}

	// INTERFACE: Definição de um método de uma interface
	public double getVelocidade() {
		return velocidade;
	}	
}
