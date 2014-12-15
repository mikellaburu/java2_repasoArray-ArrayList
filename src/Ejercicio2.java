import java.util.ArrayList;

import java.util.Scanner;

import java.util.Collections;  //clase necesaria para utilizar el metodo Sort


public class Ejercicio2 {
	
	public static void main(String[] args) {

		Scanner tecla = new Scanner (System.in);

		ArrayList <Integer> numeros = new ArrayList <Integer> (5);

		// rellenar el ArrayList

		System.out.println("Rellenar el ArrayList con 5 numeros enteros sinn orden");

		for (int i=0; i<5; i++){

			System.out.println("Posicion "+i+":");

			numeros.add(tecla.nextInt());

		}

		// clon del ArrayList

		ArrayList copia = (ArrayList)numeros.clone();
		//ArrayList copia = numeros;

		// mostrar contenido del ArrayList

		System.out.println("Contenido del ArrayList sin ordenar: ");

		for (int i=0; i<numeros.size(); i++) {

			System.out.print(numeros.get(i)+" ");

		}

		int aux;

 		// ordenar elementos del ArrayList sin utilizar metodo SORT

	    for (int i=0; i<numeros.size(); i++) {

	        for (int j=i+1; j<numeros.size(); j++) {

	            if (numeros.get(j) < numeros.get(i)) {

	            	aux = numeros.get(i);

	            	numeros.set(i,numeros.get(j));

	            	numeros.set(j,aux);

	            }

	        }

	    }

	    System.out.println("\nArrayList ordenado(sin utilizar metodo 'sort'):");

	    for (int i=0; i<numeros.size(); i++) {

	    	System.out.print(numeros.get(i)+" ");

	    }

	    // con metodo SORT
	    
	    System.out.println("\nArrayList(clon) sin ordenar:");

	    for (int i=0; i<copia.size(); i++) {

	    	System.out.print(copia.get(i)+" ");

	    }
	    
	    System.out.println("\nArrayList(clon) sin ordenar(FOR-EACH):");
	    
	    for (Object item : copia) {

	    	System.out.print(item+" ");

	    }
	    
	    System.out.println("\nArrayList(clon) ordenado utilizando metodo 'sort'):");

	    Collections.sort(copia);

	    for (int i=0; i<copia.size(); i++) {

	    	System.out.print(copia.get(i)+" ");

	    }

	}
}
