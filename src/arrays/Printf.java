package arrays;

public class Printf {
	public static void main(String[] args) {
		String nombre = "Javier";
		int edad = 25;
		int altura = 190;

		// El amigo Javier tiene 423 años y mide 123312 cm.

		System.out.print("El amigo " + nombre + " tiene " + edad + " y mide " + altura + " cm.\n\n");
		System.out.println("El amigo " + nombre
				+ " tiene " + edad + " y mide " + altura + " cm.");
		System.out.printf("El amigo %s tiene %d años y mide %d cm.%n", 
				nombre, 
				edad, 
				altura); 
		System.out.println("---- fin ----");
	}

}
