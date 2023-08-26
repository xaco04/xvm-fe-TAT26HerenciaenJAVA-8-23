package Ejercicio_Vehiculos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> persones = new ArrayList<>();
        List<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Crear usuari (titular o conductor)");
            System.out.println("2. Crear vehicle (cotxe, moto o camió)");
            System.out.println("3. Acabar");

            int opcio = Integer.parseInt(scanner.nextLine());

            if (opcio == 1) {
                System.out.println("Introdueix les dades del titular o conductor:");

                Persona persona = new Persona(null, null, null);
                persones.add(persona);
            } else if (opcio == 2) {
                System.out.println("Vols crear un cotxe (c), una moto (m) o un camió (k)?");
                String tipusVehicle = scanner.nextLine();

                if (tipusVehicle.equalsIgnoreCase("c")) {

                    Vehicle vehicle = crearVehicle(persones, tipusVehicle);
                    vehicles.add(vehicle);
                } else if (tipusVehicle.equalsIgnoreCase("m")) {

                    Vehicle vehicle = crearVehicle(persones, tipusVehicle);
                    vehicles.add(vehicle);
                } else if (tipusVehicle.equalsIgnoreCase("k")) {

                    Vehicle vehicle = crearVehicle(persones, tipusVehicle);
                    vehicles.add(vehicle);
                } else {
                    System.out.println("Opció invàlida.");
                }
            } else if (opcio == 3) {
                break;
            } else {
                System.out.println("Opció invàlida.");
            }
        }

    }

    private static Vehicle crearVehicle(List<Persona> persones, String tipusVehicle) {
        System.out.println("Introdueix les dades del " + tipusVehicle + ":");

        TitularVehicle titular = new TitularVehicle(tipusVehicle, tipusVehicle, tipusVehicle, false, false/* ... */);
        Vehicle vehicle = new Vehicle(titular);

        System.out.println("Vols afegir conductors al vehicle (s/n)?");
        String afegirConductors = new String();
        if (afegirConductors.equalsIgnoreCase("s")) {
            while (true) {
                System.out.println("Introdueix el nom complet del conductor:");
                String nomCompletConductor = new String();
                Conductor conductor = trobarConductorPerNom(persones, nomCompletConductor);
                if (conductor != null) {
                    vehicle.afegirConductor(conductor);
                } else {
                    System.out.println("No s'ha trobat el conductor amb aquest nom.");
                }

                System.out.println("Vols afegir un altre conductor al vehicle (s/n)?");
                String afegirMesConductors = new String();
                if (!afegirMesConductors.equalsIgnoreCase("s")) {
                    break;
                }
            }
        }

        return vehicle;
    }

    private static Conductor trobarConductorPerNom(List<Persona> persones, String nomComplet) {
        for (Persona persona : persones) {
            if (persona instanceof Conductor && persona.getNomComplet().equalsIgnoreCase(nomComplet)) {
                return (Conductor) persona;
            }
        }
        return null;
    }
}
