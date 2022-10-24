package engsoft.jogo.patos;

// HERANÇA: Pato_Bravo é uma classe filha de Pato

// INTERFACE: Pato_Bravo implementa a interface Padrao_Grasnar,
// obrigatoriamente, deve conter a definição dos métodos contidos
// na interface Padrao_Grasnar (contrato).
public class Pato_Bravo extends Pato implements  Padrao_Grasnar{

	public Pato_Bravo()	
	{
		setComportamento(new Voaveis_Asa());		
	}
	
	// POLIMORFISMO: Implementação do método abstrato mostrar,
	// dentro da classe Pato_Bravo.
	public String mostrar() {		
		return "Eu sou o Pato Bravo.";
	}

	// INTERFACE: definição do método grasnar, contido na interface Padrao_Grasnar
	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}

}
