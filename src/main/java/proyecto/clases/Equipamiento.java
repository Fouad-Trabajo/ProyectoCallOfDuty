package proyecto.clases;

public class Equipamiento {
	
	
	//Constante
	private static final int ID_AUTOGENERADO=0;
	
	//Atributos
	private int id;
	private int espacioEnMochila;
	
	//Constructor
	public Equipamiento(int id, int espacioEnMochila) {
		this.id = id;
		this.espacioEnMochila = espacioEnMochila;
	}

	//Getter y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEspacioEnMochila() {
		return espacioEnMochila;
	}

	public void setEspacioEnMochila(int espacioEnMochila) {
		this.espacioEnMochila = espacioEnMochila;
	}

	public static int getIdAutogenerado() {
		return ID_AUTOGENERADO;
	}
	
	
	
	
	

}
