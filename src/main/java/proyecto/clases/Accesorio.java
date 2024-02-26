package proyecto.clases;

public class Accesorio extends Equipamiento{

	//Atributos
	private String utilidad; //Accesorio para la ropa, para el arma...

	
	//Constructor 
	public Accesorio(int id, int espacioEnMochila, String utilidad) {
		super(id, espacioEnMochila);
		this.utilidad = utilidad;
	}


	//Getter y setter
	public String getUtilidad() {
		return utilidad;
	}


	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}
	
	
	
}
