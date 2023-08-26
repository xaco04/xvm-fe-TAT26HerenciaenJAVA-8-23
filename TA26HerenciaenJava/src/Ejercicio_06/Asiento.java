package Ejercicio_06;

public class Asiento {

	private String nombre;
	private boolean ocupado;

	public Asiento() {
		this.nombre = "";
		this.ocupado = false;
	}

	public Asiento(String nombre, boolean ocupado) {
		this.nombre = nombre;
		this.ocupado = ocupado;
	}

	public Asiento(String nombre) {
		this.nombre = nombre;
		this.ocupado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}