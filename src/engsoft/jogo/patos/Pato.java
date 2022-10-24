package engsoft.jogo.patos;

// Classe Abstrata: Pato é uma classe abstrata, ou seja
// não pode ser instânciada no sistema, apenas serve de
// "modelo" para a criação das demais classes.
public abstract class Pato {
	
	// COMPOSIÇÂO: Dentro dessa lógica do sistema, Padrao_Voaveis
	// percente à classe pato, não possuindo sentido ela existir sem
	// a classe Pato. Portanto, é utilizado composição nessa parte do código.
	protected Padrao_Voaveis comportamento_pato;

	// POLIMORFISMO: Definição do método abstrato dentro da classe
	// Pato
	abstract String mostrar();
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}
	
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		
	}
}
