package ejercicio_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EliminarEspacios eliminarEspacios;
        System.out.println("Ingrese frase");
        eliminarEspacios = new EliminarEspacios(sc.nextLine());
        System.out.println(eliminarEspacios.removerEspacios());
    }
}
