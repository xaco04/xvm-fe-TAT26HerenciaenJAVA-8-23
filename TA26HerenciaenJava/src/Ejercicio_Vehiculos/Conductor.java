package Ejercicio_Vehiculos;

public class Conductor extends Persona {
    private LlicenciaConduir llicencia;

    public Conductor(String nom, String cognoms, String dataNaixement, LlicenciaConduir llicencia) {
        super(nom, cognoms, dataNaixement);
        this.llicencia = llicencia;
    }

}
