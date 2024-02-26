package proyecto.clases;

public class InventarioController {

	// Atributoss
	private ArmaPrincipal[] armasPrincipales;
	private ArmaSecundaria[] armasSecundarias;
	private Accesorio[] accesorios;

	// Constructor
	public InventarioController(ArmaPrincipal[] armasPrincipales, ArmaSecundaria[] armasSecundarias,
			Accesorio[] accesorios) {
		super();
		this.armasPrincipales = armasPrincipales;
		this.armasSecundarias = armasSecundarias;
		this.accesorios = accesorios;
	}

	// Métodos
	public static void mostrarInventario() {
		Usuario usuario = new Usuario(null, 0, null, null, null);
		System.out.println("Jugador - " + usuario); // Solo estoy probando cosas aquí
	}

	public static void addArma(Arma arma) {

	}

	public static void addAccesorio(Accesorio accesorio) {

	}

	public static boolean equipar(Equipamiento equipamiento, Usuario usuario) {

		return false;
	}

	public static boolean desEquipar(int id, Usuario usuario) {

		return false;
	}
}
