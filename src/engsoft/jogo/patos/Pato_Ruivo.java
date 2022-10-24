package engsoft.jogo.patos;

// HERANÇA: Pato_Ruivo é uma classe filha de Pato

// INTERFACE: Pato_Ruivo implementa a interface Padrao_Grasnar,
// obrigatoriamente, deve conter a definição dos métodos contidos
// na interface Padrao_Grasnar (contrato).
public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

	public Pato_Ruivo()
	{
		setComportamento(new Voaveis_Asa());		
	}
	
	// POLIMORFISMO: Implementação do método abstrato mostrar,
	// dentro da classe Pato_Ruivo.
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	// INTERFACE: definição do método grasnar, contido na interface Padrao_Grasnar
	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

}
