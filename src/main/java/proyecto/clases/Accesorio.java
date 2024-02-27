package proyecto.clases;

public class Accesorio extends Equipamiento {

	// Atributos
	private String nombre;
	private String utilidad; // Accesorio para la ropa, para el arma...

	// Constructor
	public Accesorio(int espacioEnMochila, String nombre, String utilidad) {
		super(espacioEnMochila);
		this.nombre = nombre;
		this.utilidad = utilidad;
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}

	@Override
	public String toString() {
		return "\nid: " + getId() + ", espacio en mochila: " + getEspacioEnMochila() + ", nombre: " + nombre
				+ ", utilidad: " + utilidad;
	}

}
