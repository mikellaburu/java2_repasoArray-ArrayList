import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		
		Scanner tecla = new Scanner (System.in);
		
		ArrayList <String> lista = new ArrayList <String> ();
		// rellenar el ArrayList
		System.out.println("Cuantos elementos quires que tenga al principio?");
		int cantidad = tecla.nextInt();
		for (int i=0; i<cantidad; i++) {
			System.out.println("Elemento "+(i+1)+":");
			lista.add(tecla.next());
		}
		
		String opcion = " ";
			
		do {
			System.out.println("---------------MENU-------------------");
			System.out.println("a) Introducir dato");
			System.out.println("b) Modificar dato (pedir el dato a modificar y el nuevo dato)");
			System.out.println("c) Eliminar dato");
			System.out.println("d) Buscar dato");
			System.out.println("e) Mostrar datos");
			System.out.println("x) Salir");
			opcion = tecla.next();
			String elem1, elem2;
			
			switch (opcion) {
				case "a":
					System.out.println("Introducir dato");
					System.out.println("Introduce el nuevo dato: ");
					lista.add(tecla.next());
					break;
					
				case "b":
					do {
						System.out.println("Modificar dato");
						System.out.println("Que dato quieres cambiar?");
						elem1 = tecla.next();
						if (lista.contains(elem1)) {
							int pos = lista.indexOf(elem1);
							System.out.println("Nuevo dato: ");
							elem2 = tecla.next();
							lista.set(pos, elem2);
							break;
						}else{
							System.out.println("No esta ese dato");
						}
					} while (!lista.contains(elem1));
					break;
					
				case "c":
					do {
						System.out.println("Eliminar dato");
						System.out.println("Que dato quieres eliminar?");
						elem1 = tecla.next();
						if (lista.contains(elem1)) {
							lista.remove(elem1);
							break;
						} else {
							System.out.println("No esta ese dato");
						}
					} while (!lista.contains(elem1));
					break;
					
				case "d":
					System.out.println("Buscar dato");
					do {
						System.out.println("Que dato quieres Buscar?");
						elem1 = tecla.next();
						if (lista.contains(elem1)) {
							System.out.println("El elemento "+elem1+" esta en la posicion "+lista.indexOf(elem1));
						} else {
							System.out.println("No esta ese dato");
						}
					} while (!lista.contains(elem1));
					break;
					
				case "e":
					System.out.println("Mostrar datos");
					for (int i=0; i<lista.size(); i++) {
						System.out.println("\tpos "+i+": "+lista.get(i));
					}
					break;
					
				case "x":
					System.out.println("Salir");
					break;
					
				default:
					System.out.println("Opcion incorrecta, prueba otro");
			}
		} while (!opcion.equalsIgnoreCase("x"));
		
		System.out.println("Programa terminado");
		
		tecla.close();
	}

}
