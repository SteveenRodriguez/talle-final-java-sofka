package ejercicio_18;

public class Main {
    public static void main(String[] args) {

        crearSeries();
        crearVideojuegos();
    }

    public static void crearSeries() {

        Serie[] arreglo_serie = new Serie[5];

        arreglo_serie[0] = new Serie("Halo", "Kai Havertz");
        arreglo_serie[1] = new Serie();
        arreglo_serie[2] = new Serie();
        arreglo_serie[3] = new Serie("Jesus de Nazaret", 3, "familiar", "Juan Pacheco");
        arreglo_serie[4] = new Serie("Sobreviviendo en Colombia", 2, "docuserie", "John Salas");

        arreglo_serie[1].entregar();
        arreglo_serie[4].entregar();

        int series_entregadas = 0;
        for (int i = 0; i < arreglo_serie.length; i++) {

            if (arreglo_serie[i].isEntregado()) {
                series_entregadas++;
            }
            System.out.println(arreglo_serie[i].toString());
        }
        System.out.println("El total de series entragadas son: " + series_entregadas);

    }

    public static void crearVideojuegos() {

        Videojuego[] arreglo_videojuego = new Videojuego[5];

        arreglo_videojuego[0] = new Videojuego();
        arreglo_videojuego[1] = new Videojuego("Fortnite", 7);
        arreglo_videojuego[2] = new Videojuego("God of war", 12);
        arreglo_videojuego[3] = new Videojuego("Fifa", 5, "Deportes", "Ea");
        arreglo_videojuego[4] = new Videojuego("NBA 2k21", 3, "Deportes", "Ea");

        arreglo_videojuego[0].entregar();
        arreglo_videojuego[2].entregar();
        arreglo_videojuego[3].entregar();

        int videojuegos_entregados = 0;
        for (int i = 0; i < arreglo_videojuego.length; i++) {

            if (arreglo_videojuego[i].isEntregado()) {
                videojuegos_entregados++;
            }
            System.out.println(arreglo_videojuego[i].toString());
        }
        System.out.println("El total de videojuegos entragados son: " + videojuegos_entregados);
    }
}
