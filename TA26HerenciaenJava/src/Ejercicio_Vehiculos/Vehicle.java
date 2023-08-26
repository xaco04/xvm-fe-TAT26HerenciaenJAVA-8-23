package Ejercicio_Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private TitularVehicle titular;
    private List<Conductor> conductors = new ArrayList<>();

    public Vehicle(TitularVehicle titular) {
        this.titular = titular;
    }

    public TitularVehicle getTitular() {
        return titular;
    }

    public List<Conductor> getConductors() {
        return conductors;
    }

    public void afegirConductor(Conductor conductor) {
        if (conductorPotConduir(conductor)) {
            conductors.add(conductor);
        } else {
            System.out.println("Aquest conductor no té la llicència adequada per conduir aquest vehicle.");
        }
    }

    private boolean conductorPotConduir(Conductor conductor) {
        return true; 
    }
}
