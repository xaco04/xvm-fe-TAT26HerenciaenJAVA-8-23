package Ejercicio_Vehiculos;

public class Cotxe {
    private String matricula;
    private String marca;
    private String color;
    private Roda[] rodes = new Roda[4];

    public Cotxe(String matricula, String marca, String color) {
        if (validarMatricula(matricula)) {
            this.matricula = matricula;
        } else {
            System.out.println("Matrícula invàlida.");
        }
        this.marca = marca;
        this.color = color;
    }

    public void afegirRoda(Roda roda, int posicio) {
        if (posicio >= 0 && posicio < 4) {
            if (roda.getDiametre() > 0.4 && roda.getDiametre() < 4) {
                rodes[posicio] = roda;
            } else {
                System.out.println("Diàmetre de roda invàlid.");
            }
        } else {
            System.out.println("Posició de roda invàlida.");
        }
    }

    private boolean validarMatricula(String matricula) {
        return false; 
    }
}
