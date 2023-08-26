package Ejercicio_05;

public class MainApp {

	public static void main(String[] args) {

		Estudiante estudiantes[] = new Estudiante[5];

		estudiantes[0] = new Estudiante("Xavi", 25, 'H', 8);
		estudiantes[1] = new Estudiante("Joan", 23, 'H', 11);
		estudiantes[2] = new Estudiante("Roberto", 30, 'H', 3);
		estudiantes[3] = new Estudiante("Jesus", 24, 'H', 4);
		estudiantes[4] = new Estudiante("Mar", 23, 'M', 2);

		Professor professor = new Professor("Jose", 35, 'H', "programacion");

		Aula aula = new Aula(8, 11, "programacion", professor, estudiantes);

		if (aula.puedeDarseClase()) {

			System.out.println("Se puede dar clase");

			int alumnasAprobadas = 0;
			int alumnosAprobados = 0;

			for (int i = 0; i < estudiantes.length; i++) {
				
				if (estudiantes[i].getCalificacion() >= 5) {
					if (estudiantes[i].getSexo() == 'M') {
						alumnasAprobadas++;
					}else{

						alumnosAprobados++;
					}
				}
			}
			
			System.out.println("Alumnas aprobadas: " + alumnasAprobadas);
			System.out.println("Alumnos aprobados: " + alumnosAprobados);

		} else {
			System.out.println("No se puede dar clase");
		}
	}
}