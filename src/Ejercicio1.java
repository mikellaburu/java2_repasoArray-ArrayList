public class Ejercicio1 {
	public static void main(String[] args) {
		int [] arrayNumeros = {2,5,9,1,0};

		int aux;
 		System.out.println("Array sin ordenar:");
	    for (int i=0; i<arrayNumeros.length; i++) {
	    	System.out.print(arrayNumeros[i]+" ");
	    }

	    // ordenar elementos del array
	    for (int i=0; i<arrayNumeros.length; i++) {
	        for (int j=i+1; j<arrayNumeros.length; j++) {
	            if (arrayNumeros[j] < arrayNumeros[i]) {
	                aux = arrayNumeros[i];
	                arrayNumeros[i] = arrayNumeros[j];
	                arrayNumeros[j] = aux;
	            }
	        }
	    }
	    System.out.println("\nArray ordenado:");
	    for (int i=0; i<arrayNumeros.length; i++) {
	    	System.out.print(arrayNumeros[i]+" ");
	    }
	}
}