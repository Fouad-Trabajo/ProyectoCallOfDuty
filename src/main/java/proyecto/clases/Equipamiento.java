package proyecto.clases;

public class Equipamiento {
	
	
	//Constante
	private static int ID_AUTOGENERADO=0;
	
	//Atributos
	private int id;
	private int espacioEnMochila;
	
	//Constructor
	public Equipamiento(int espacioEnMochila) {
		this.id = ID_AUTOGENERADO++;
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

	//La constante no necesita getter y setter
	
	
	
	
	

}
