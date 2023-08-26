package Ejercicio_05;

public class Aula {

	private int id;
	private int numMaxEstudiantes;
	private String materia;
	private Professor professor;
	private Estudiante[] estudiantes;

	public Aula() {
		this.id = 0;
		this.numMaxEstudiantes = 0;
		this.materia = "";
		this.professor = new Professor();
		this.estudiantes = new Estudiante[10];
	}

	public Aula(int id, int numMaxEstudiantes, String materia, Professor profesor, Estudiante[] estudiantes) {
		this.id = id;
		this.numMaxEstudiantes = numMaxEstudiantes;
		this.materia = materia;
		this.professor = profesor;
		this.estudiantes = estudiantes;
	}

	public boolean puedeDarseClase() {
		if (!professor.disponible()) {
			return false;
		}

		if (!professor.getMateria().equalsIgnoreCase(materia)) {
			return false;
		}

		int numEstudiantes = this.estudiantes.length;
		int numEstudiantesPresentes = 0;
		
		for (Estudiante estudiante : this.estudiantes) {
			if (estudiante.disponible()) {
				numEstudiantesPresentes++;
			}
		}

		if ((double) numEstudiantesPresentes / numEstudiantes < 0.5) {
            return false;
        }
		
		return true;
	}
}
