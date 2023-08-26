package Ejercicio_Vehiculos;

public class TitularVehicle extends Persona {
    private boolean teAssegurança;
    private boolean garatgePropi;

    public TitularVehicle(String nom, String cognoms, String dataNaixement, boolean teAssegurança, boolean garatgePropi) {
        super(nom, cognoms, dataNaixement);
        this.teAssegurança = teAssegurança;
        this.garatgePropi = garatgePropi;
    }

}
