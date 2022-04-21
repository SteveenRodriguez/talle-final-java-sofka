package ejercicio_09;

import java.util.Scanner;

public class CambiarLetra {
    private String frase1 = "La sonrisa sera la mejor arma contra la tristeza";
    private String frase2;

    public void leerFrase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase que desea anexar");
        frase2 = sc.nextLine();
    }

    public void reemplazarLetra() {
        System.out.println(frase1.replace("a", "e").concat(" " + frase2));
    }
}
