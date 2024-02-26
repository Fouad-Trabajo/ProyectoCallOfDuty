package proyecto.clases;

public class ArmaPrincipal extends Arma {

	// Atributos
	private String velocidadRecarga;
	private int alcance; // Se entiende que el alcanse es en metros

	// Constructor
	public ArmaPrincipal(int id, int espacioEnMochila, String tipoArma, int municion, String velocidadRecarga,
			int alcance) {
		super(id, espacioEnMochila, tipoArma, municion);
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

}
