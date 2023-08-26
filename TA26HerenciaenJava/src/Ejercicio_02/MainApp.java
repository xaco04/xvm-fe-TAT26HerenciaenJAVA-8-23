package Ejercicio_02;

public class MainApp {
    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("Memento", 20, "Intriga", "Tom Holand");
        series[1] = new Serie("Interstelar", "Ryan");
        series[2] = new Serie();
        series[3] = new Serie("Capitan Fall", "Rick");
        series[4] = new Serie("Berserk", 3, "Drama", "Margot");

        videojuegos[0] = new Videojuego("Pokémon", 30, "rpg", "Ash ketchup");
        videojuegos[1] = new Videojuego();
        videojuegos[2] = new Videojuego("League of Legends", 18);
        videojuegos[3] = new Videojuego("Starfield", 20, "Aventura", "sr bethesda");
        videojuegos[4] = new Videojuego("Skyrim", 60);

        for (int i = 0; i < 3; i++) {
            series[i].entregar();
            videojuegos[i].entregar();
        }

        int seriesEntregadas = contarEntregados(series);
        int videojuegosEntregados = contarEntregados(videojuegos);

        System.out.println("Total de series entregadas: " + seriesEntregadas);
        System.out.println("Total de videojuegos entregados: " + videojuegosEntregados);

        System.out.println("-----------------------");

        Serie serieConMasTemporadas = buscarMayor(series);
        Videojuego videojuegoConMasHoras = buscarMayor(videojuegos);

        System.out.println("Serie con más temporadas: " + serieConMasTemporadas);
        System.out.println("Videojuego con más horas: " + videojuegoConMasHoras);
    }

    public static int contarEntregados(Entregable[] elementos) {
        int entregados = 0;
        for (Entregable elemento : elementos) {
            if (elemento.isEntregado()) {
                elemento.devolver();
                entregados++;
            }
        }
        return entregados;
    }

    public static <T extends Entregable> T buscarMayor(T[] elementos) {
        T mayor = elementos[0];
        for (T elemento : elementos) {
            if (elemento.compareTo(mayor) == elemento) {
                mayor = elemento;
            }
        }
        return mayor;
    }
}
