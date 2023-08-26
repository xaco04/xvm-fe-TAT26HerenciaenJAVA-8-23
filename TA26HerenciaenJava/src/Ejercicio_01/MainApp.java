package Ejercicio_01;

public class MainApp {

    public static void main(String[] args) {

        Electrodomestico electrodomesticos[] = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora(112, 43);
        electrodomesticos[1] = new Electrodomestico(55, "amarillo", 'A', 49);
        electrodomesticos[2] = new Lavadora(10, "azul", 'B', 42, 15);
        electrodomesticos[3] = new Television();
        electrodomesticos[4] = new Electrodomestico(100, 43);
        electrodomesticos[5] = new Lavadora(100, "verde", 'A', 40, 55);
	       

}
}