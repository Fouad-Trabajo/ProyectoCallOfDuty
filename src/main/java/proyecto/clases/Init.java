package proyecto.clases;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		InventarioController inventarioController = new InventarioController(null, null, null);

		System.out.println("-------MENU--------");
		System.out.println("1-Mostrar inventario");
		System.out.println("2-Añadir armas");
		System.out.println("3-Añadir accesorios");
		System.out.println("4-Equipar");
		System.out.println("5-Desequipar");
		System.out.println("6-Exit");

		System.out.print("\n¿Qué quieres hacer?: ");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Mostrando inventario...");
			InventarioController.mostrarInventario();
			break;

		case 2:
			System.out.println("Añadiendo armas...");
			InventarioController.addArma(null);
			break;

		case 3:
			System.out.println("Añadiendo accesorio...");
			InventarioController.addAccesorio(null);
			break;

		case 4:
			System.out.println("Equipando artículos...");
			InventarioController.equipar(null, null);
			break;

		case 5:
			System.out.println("Quitando artículos...");
			InventarioController.desEquipar(0, null);
			break;

		case 6:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opción no válida");
			break;
		}

		sc.close();

	}

}
