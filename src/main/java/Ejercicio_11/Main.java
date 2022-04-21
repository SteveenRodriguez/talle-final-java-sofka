package Ejercicio_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LongitudFrase longitudFrase;
        System.out.println("Ingrese Frase:");
        longitudFrase = new LongitudFrase(sc.nextLine());
        longitudFrase.contadorVocales();
        System.out.println(longitudFrase.mostrarResultados());
    }
}
