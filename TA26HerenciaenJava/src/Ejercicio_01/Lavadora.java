package Ejercicio_01;

public class Lavadora extends Electrodomestico {

    private float carga;

    protected static final float CARGA_DEF = 5;

    public Lavadora() {
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF, CARGA_DEF);
    }

    public Lavadora(float precioBase, float peso) {
        this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso, CARGA_DEF);
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public float precioFinal() {
        float aumentoPorCarga = 0;

        if (carga > 30) {
            aumentoPorCarga = 50;
        }

        return super.precioFinal() + aumentoPorCarga;
    }
}
