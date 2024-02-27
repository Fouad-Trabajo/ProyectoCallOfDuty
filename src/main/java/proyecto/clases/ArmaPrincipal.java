package proyecto.clases;

public class ArmaPrincipal extends Arma {

	// Atributos
	private String velocidadRecarga;
	private int alcance; // Se entiende que el alcanse es en metros

	// Constructor
	public ArmaPrincipal(int espacioEnMochila, String tipoArma, int municion, String velocidadRecarga,
			int alcance) {
		super(espacioEnMochila, tipoArma, municion);
		this.velocidadRecarga = velocidadRecarga;
		this.alcance = alcance;
	}

	// Getter y setter
	public String getVelocidadRecarga() {
		return velocidadRecarga;
	}

	public void setVelocidadRecarga(String velocidadRecarga) {
		this.velocidadRecarga = velocidadRecarga;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	@Override
	public String toString() {
		return "id: " + getId() + ", espacio en mochila: " + getEspacioEnMochila() + ", tipo de arma: " + getTipoArma()
				+ ", munición: " + getMunicion() + ", velocidad de recarga: " + velocidadRecarga + ", alcance:"
				+ alcance;
	}

}
