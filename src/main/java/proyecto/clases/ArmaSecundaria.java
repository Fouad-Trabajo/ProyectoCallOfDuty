package proyecto.clases;

public class ArmaSecundaria extends Arma{
	
	//Atributos
	private int daño;

	//Constructor
	public ArmaSecundaria(int id, int espacioEnMochila, String tipoArma, int municion, int daño) {
		super(id, espacioEnMochila, tipoArma, municion);
		this.daño = daño;
	}
	
	//Getter y setter
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	

	
}
