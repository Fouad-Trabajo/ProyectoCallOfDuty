package proyecto.clases;

public class InventarioController {

	// Atributos
	private ArmaPrincipal[] armasPrincipales;
	private ArmaSecundaria[] armasSecundarias;
	private Accesorio[] accesorios;

	// Constructor
	public InventarioController(ArmaPrincipal[] armasPrincipales, ArmaSecundaria[] armasSecundarias,
			Accesorio[] accesorios) {
		this.armasPrincipales = armasPrincipales;
		this.armasSecundarias = armasSecundarias;
		this.accesorios = accesorios;
	}

	// Instancia de armas
	static ArmaPrincipal armaPricipal1 = new ArmaPrincipal(10, "Sub fusil", 260, "rápida", 380);
	// static ArmaPrincipal armaPricipal2= new ArmaPrincipal(10, "AK-47", 500,
	// "rápida", 215);
	static ArmaSecundaria armaSecundaria1 = new ArmaSecundaria(7, "doble glock", 88, 105);
	// static ArmaSecundaria armaSecundaria2 = new ArmaSecundaria(7, "escopeta", 34,
	// 725);

	// Instancia de accesorios
	static Accesorio accesorio1 = new Accesorio(1, "bomba", "daño de área");
	static Accesorio accesorio2 = new Accesorio(1, "vendas", "curación");
	static Accesorio accesorio3 = new Accesorio(1, "mira telescópica", "visión nocturna");
	// static Accesorio accesorio4= new Accesorio(004, 1, "silenciador", "reducción
	// de ruido");

	static Accesorio[] accesorios1 = { accesorio1, accesorio2, accesorio3 };
	// static Accesorio[] accesorios2 ={accesorio2, accesorio3, accesorio4};

	// Craer usuario
	static Usuario usuario = new Usuario("Rubén", 20, armaPricipal1, armaSecundaria1, accesorios1);
	// static Usuario usuario2= new Usuario("Fouad", 20, armaPricipal2,
	// armaSecundaria1, accesorios2);

	// Métodos
	public static void mostrarInventario() {
		System.out.println(usuario);
		// System.out.println(usuario2);
	}

	public static void addArma(Arma arma) {
		Arma armaPrincipal3 = new ArmaPrincipal(12, "Francotirador", 15, "lenta", 1150);
		Arma armaSecundaria3 = new ArmaSecundaria(5, "Cuchillo", 0, 20);

	}

	public static void addAccesorio(Accesorio accesorio) {

		Accesorio accesorio3 = new Accesorio(6, "mango estabilizador", "estabiliza la mirilla");
		/*
		 * Para poder añadir este accesorio antes debemos desequipar uno de los 3
		 * accesorios que tenemos equipados porque solo se pueden tener 3 accesorios
		 * equipados
		 */
	}

	public static boolean equipar(Equipamiento equipamiento, Usuario usuario) {
		// Comprobar que el usuario está equipado
		if (usuario.getArmaPrincipal()) { // El usuario ya tiene un arma principal equipada
			return false;
		} else if (usuario.getArmaSecundaria()) { // El usuario ya tiene un arma secundaria equipada
			return false;
		} else if (usuario.getAccesorios()) { // El usuario ya tiene 3 accesorios equipados
			return false;
		}

		// Equipar al usuario
		if (!usuario.getArmaSecundaria()) {
			usuario.setArmaPrincipal((ArmaPrincipal) equipamiento);
			return true;// Casting, arma es hija de equipamiento,nos piden equipar equipamiento no arma
		} else if (!usuario.getArmaSecundaria()) {
			usuario.setArmaSecundaria((ArmaPrincipal) equipamiento);
			return true;
		} else if (!usuario.getAccesorios()) {
			for (int i = 0; i < accesorios1.length; i++) { // Recorrer el array para ver equipar el que está vacío
				Accesorio accesorio = accesorios1[i];
				return true; // Estos trues, no hacen falta, con el de abajo nos sobra
			}
		}

		return true;

	}

	public static boolean desEquipar(int id, Usuario usuario) {

		return false;
	}

}
