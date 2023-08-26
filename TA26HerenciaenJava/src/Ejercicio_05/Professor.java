package Ejercicio_05;

public class Professor extends Persona {

	private String materia;

	public Professor() {
		super();
		this.materia = "";
	}

	public Professor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = comprobarCalificacion(materia);
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String comprobarCalificacion(String materia) {
		if(materia.equalsIgnoreCase("matematicas") || materia.equalsIgnoreCase("filosofia") || materia.equalsIgnoreCase("fisica")) {
			return materia;
			
		} else {
			return "matematicas";
		}
	}
	
	public boolean disponible() {
		double resultado = Math.floor((Math.random() * (6)));

		if (resultado == 1) {
			return false;

		} else {
			return true;
		}
	}	
}