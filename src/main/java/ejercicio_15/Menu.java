package ejercicio_15;

import java.util.Scanner;

public class Menu {

    public void elegirMenu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        try {
            do {
                listarMenu();
                System.out.println("Elija una opción del menú ");

                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA \n");
                }
            } while (opc != 8);
        } catch (Exception e) {
            System.out.println("Debe ingresar un número \n");
            elegirMenu();
        }
    }

    public void listarMenu() {

        System.out.println("****** GESTION CINEMATOGRAFICA ********\n "
                + "1-NUEVO ACTOR\n "
                + "2-BUSCAR ACTOR\n "
                + "3-ELIMINAR ACTOR\n "
                + "4-MODIFICAR ACTOR\n "
                + "5-VER TODOS LOS ACTORES\n "
                + "6-VER PELICULAS DE LOS ACTORES\n "
                + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n "
                + "8-Salir\n");
    }
}
