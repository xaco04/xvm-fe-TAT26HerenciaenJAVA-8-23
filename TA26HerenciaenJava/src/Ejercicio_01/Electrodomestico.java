package Ejercicio_01;

public class Electrodomestico {

    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    protected static final float PRECIO_BASE_DEF = 100;
    protected static final String COLOR_DEF = "Blanco";
    protected static final char CONSUMO_ENERGETICO_DEF = 'F';
    protected static final float PESO_DEF = 5;

    public Electrodomestico() {
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF);
    }

    public Electrodomestico(float precioBase, float peso) {
        this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso);
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color) ? color : COLOR_DEF;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico) ? consumoEnergetico : CONSUMO_ENERGETICO_DEF;
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    private boolean comprobarConsumoEnergetico(char letra) {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean esValido = false;

        for (char caracter : letras) {
            if (caracter == Character.toUpperCase(letra)) {
                esValido = true;
            }
        }

        return esValido;
    }

    private boolean comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean esValido = false;

        for (String colorEnArray : colores) {
            if (colorEnArray.equalsIgnoreCase(color)) {
                esValido = true;
            }
        }

        return esValido;
    }

    public float precioFinal() {
        float aumentoPorConsumo = 0;
        float aumentoPorPeso = 0;

        switch (consumoEnergetico) {
            case 'A':
                aumentoPorConsumo = 100;
                break;

            case 'B':
                aumentoPorConsumo = 80;
                break;

            case 'C':
                aumentoPorConsumo = 60;
                break;

            case 'D':
                aumentoPorConsumo = 50;
                break;

            case 'E':
                aumentoPorConsumo = 30;
                break;

            case 'F':
                aumentoPorConsumo = 10;
                break;
        }

        if (peso <= 19) {
            aumentoPorPeso = 10;

        } else if (peso <= 49) {
            aumentoPorPeso = 50;

        } else if (peso <= 79) {
            aumentoPorPeso = 80;

        } else {
            aumentoPorPeso = 100;
        }

        return precioBase + aumentoPorConsumo + aumentoPorPeso;
    }
}
