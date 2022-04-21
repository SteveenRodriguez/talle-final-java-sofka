package ejercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoArea calculoArea;
        System.out.println("Digite el radio para calcular el área del círculo");
        double radio = Double.parseDouble(sc.nextLine());
        calculoArea = new CalculoArea(radio);
        System.out.println(calculoArea.calculoAreaCirculo());

    }
}
