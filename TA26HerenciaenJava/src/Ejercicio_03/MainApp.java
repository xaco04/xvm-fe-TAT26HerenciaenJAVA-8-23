package Ejercicio_03;

public class MainApp {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("3243243243243", "El Imperio Final", "Brandon", 700);
		Libro libro2 = new Libro("6546546546546", "Aleación de Ley", "Brandon", 400);

		System.out.println(libro1);
		System.out.println(libro2);
		
		System.out.println("------------------------------------------------------------------------------");
		
		if (libro1.getNumPaginas() >= libro2.getNumPaginas()) {
			System.out.println("El libro con mas páginas es: " + libro1);
			
		} else {
			System.out.println("El libro con mas páginas es: " + libro2);
		}
	}
}