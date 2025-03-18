package arrays;

public class arrays {
	public static void main(String[] args) {
		// Definición y asignación de un array de enteros
		int[] numeros = {5, 10, 15, 20, 25};

		// Acceso y modificación de elementos del array
		System.out.println("Elemento en la posición 2: " + numeros[2]); // Imprime: 15
		numeros[3] = 30;
		System.out.println("Elemento modificado en la posición 3: " + numeros[3]); 
		// Imprime: 30

		// Recorrido del array utilizando un bucle for
		System.out.println("Elementos del array:");
		for (int i = 0; i < numeros.length; i++) {
		   System.out.println(numeros[i]);
		}

		// Suma de todos los elementos del array
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
		   suma += numeros[i];
		}
		System.out.println("Suma de los elementos: " + suma); 
		// Imprime: 75
	}

}
