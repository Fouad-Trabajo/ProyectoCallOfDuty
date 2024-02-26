package proyecto.clases;

public class Usuario {
	
	// Atributos
	private String nombre;
	private int espacioMochila;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	private Accesorio[] accesorios = new Accesorio[3]; // Solo puede tener equipado hasta 3 accesorios
	//Debería hacerlo con <arrayList>??? No lo se jajaja 😅😅
	
	
	
	// Constructor
	public Usuario(String nombre, int espacioMochila, Arma armaPrincipal, Arma armaSecundaria, Accesorio[] accesorios) {
		this.nombre = nombre;
		this.espacioMochila = espacioMochila;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		this.accesorios = accesorios;
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspacioMochila() {
		return espacioMochila;
	}

	public void setEspacioMochila(int espacioMochila) {
		this.espacioMochila = espacioMochila;
	}

	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}

	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}

	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}

	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}

	public Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}

}
