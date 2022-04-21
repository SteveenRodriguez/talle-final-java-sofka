package ejercicio_07;

import java.util.Scanner;

public class Numero {
    private int numero;

    public void leerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite número");
        this.numero = sc.nextInt();
    }

    public void compararNumero() {
        do {
            if (this.numero >= 0) {
                System.out.println("Número ingresado es: " + this.numero);
                break;
            }
            leerNumero();
        } while (numero > 0);
    }
}
