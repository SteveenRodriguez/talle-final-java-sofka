package ejercicio_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoPrecio calculoPrecio;
        System.out.println("Ingrese el valor del producto");
        double precio = Double.parseDouble(sc.nextLine());
        calculoPrecio = new CalculoPrecio(precio);
        System.out.println(calculoPrecio.calcularIva());
    }
}
