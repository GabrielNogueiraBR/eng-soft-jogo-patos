package engsoft.jogo.patos;

// INTERFACE: define um método que deve ser definido na forma de contrato,
// ou seja, deve existir, na classe que implementa essa interface.
public interface Padrao_Voaveis {

	// DELEGAÇÃO: Definição de métodos que serão repassados
	// à classe instanciada.
	String voar();
	
	// DELEGAÇÃO: Definição de métodos que serão repassados
	// à classe instanciada.
	double getVelocidade();

}
