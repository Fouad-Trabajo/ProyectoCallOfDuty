package proyecto.clases;

public class Arma extends Equipamiento{

	//Atributos
	private String tipoArma; //Semiautomática, arma blanca, escopeta....
	private int municion; //Número de valas, tipo de munición...
	
	
	//Constructor
	public Arma(int id, int espacioEnMochila, String tipoArma, int municion) {
		super(id, espacioEnMochila);
		this.tipoArma = tipoArma;
		this.municion = municion;
	}



	//Getter y setter
	public String getTipoArma() {
		return tipoArma;
	}


	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}


	public int getNumValas() {
		return municion;
	}


	public void setNumValas(int muncicion) {
		this.municion = muncicion;
	}
	
	
	
	
	
	
	
	
	

}
