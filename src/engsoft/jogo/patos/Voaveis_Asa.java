package engsoft.jogo.patos;

// INTERFACE: A classe Voaveis_Asa implementa a interface Padrao_Voaveis,
// ou seja, deve necessariamente conter a implementação dos métodos
// definido no contrato (interface)
public class Voaveis_Asa implements Padrao_Voaveis {

	private double velocidade;

	public Voaveis_Asa() {
		velocidade = 10;
	}

	// INTERFACE: Definição de um método de uma interface
	public String voar() {
		return "Voando como um p�ssaro que voa. Velocidade: "
				+ getVelocidade();
	}

	// INTERFACE: Definição de um método de uma interface
	public double getVelocidade() {
		return velocidade;
	}

}
