package proyecto.clases;

public class ArmaSecundaria extends Arma {

	// Atributos
	private int daño;

	// Constructor
	public ArmaSecundaria(int espacioEnMochila, String tipoArma, int municion, int daño) {
		super(espacioEnMochila, tipoArma, municion);
		this.daño = daño;
	}

	// Getter y setter
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return "id: " + getId() + ", espacio en mochila: " + getEspacioEnMochila() + ", tipo de arma: " + getTipoArma()
				+ ", munición: " + getMunicion() + ", daño: " + getDaño();
	}

}
