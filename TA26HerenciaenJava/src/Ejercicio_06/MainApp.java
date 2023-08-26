package Ejercicio_06;

public class MainApp {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Top Gun", 140, 22, "Defoe");
		Cine cine = new Cine(pelicula, 9);

		Espectador[] espectadores = {
				new Espectador("Xavi", 40, 200),
				new Espectador("Mar", 1, 10),
				new Espectador("Joan", 43, 500),
				new Espectador("Roberto", 42, 35),
				new Espectador("Jose", 65, 20),
				new Espectador("Albert", 72, 99),
				new Espectador("Sergio", 3, 63),
		};
		
		Asiento asientos[][] = cine.getAsientos();

		for (int i = 0; i < espectadores.length; i++) {
			boolean asientoOcupado = true;

			if (espectadores[i].getDinero() >= cine.getPrecioEntrada() && espectadores[i].getEdad() >= pelicula.getEdadMin()) {

				while (asientoOcupado) {
					int fil = (int) (Math.random() * asientos.length);
					int col = (int) (Math.random() * asientos[0].length);

					if (!asientos[fil][col].isOcupado()) {
						asientos[fil][col].setOcupado(true);
						System.out.println("El asiento " + asientos[fil][col].getNombre() + " corresponde al espectador  " + espectadores[i].getNombre());
						asientoOcupado = false;
					}
				}
			}
		}
	}
}