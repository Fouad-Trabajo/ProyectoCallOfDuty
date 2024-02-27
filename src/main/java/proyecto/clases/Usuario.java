package proyecto.clases;

import java.util.Arrays;

public class Usuario {

	// Atributos
	private String nombre;
	private int espacioMochila;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	private Accesorio[] accesorios = new Accesorio[3]; // Solo puede tener equipado hasta 3 accesorios

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

	public boolean getArmaPrincipal() {
		return false;
	}

	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}

	public boolean getArmaSecundaria() {
		return false;
	}

	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}

	public boolean getAccesorios() {
		return false;
	}

	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}

	@Override
	public String toString() {
		return "Usuario--> [nombre=" + nombre + ", espacio de la mochila = " + espacioMochila + "]"
				+ "\nArmaPrincipal--> [" + armaPrincipal + "], "
				+ "\nArmaSecundaria--> [" + armaSecundaria + "], "
				+ "\nAccesorios--> " + Arrays.toString(accesorios);
	}

}
