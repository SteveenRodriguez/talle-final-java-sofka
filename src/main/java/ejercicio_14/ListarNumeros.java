package ejercicio_14;

import java.util.Scanner;

public class ListarNumeros {
    private int numero;

    public void imprimir() {

        try {
            while (numero < 0) {
                System.out.println("\nEl número ingresado debe ser mayor que cero \n");
                leerNumero();
            }

            System.out.println("Los número del: " + numero + " al 1000 son:");
            for (int i = numero; i <= 1000; i += 2) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Debe digitar un número \n");
            imprimir();
        }
    }

    public void leerNumero() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite un número mayor que cero");
            numero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Debe digitar un número");
            leerNumero();
        }

    }
}
