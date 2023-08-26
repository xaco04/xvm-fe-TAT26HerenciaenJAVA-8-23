package Ejercicio_01;

public class Television extends Electrodomestico {

    private float resolucion;
    private boolean tdt;

    public Television() {
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF, 20, false);
    }

    public Television(float precioBase, float peso) {
        this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso, 20, false);
    }

    public Television(float precioBase, String color, char consumoEnergetico, float peso, float resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public float precioFinal() {
        float aumentoPorResolucion = 0;
        float aumentoPorTdt = 0;

        if (resolucion > 40) {
            aumentoPorResolucion = (float) (precioBase * 0.30);
        }

        if (tdt) {
            aumentoPorTdt = 50;
        }

        return super.precioFinal() + aumentoPorResolucion + aumentoPorTdt;
    }
}
