package ejercicio_12;

import java.util.Scanner;

public class Diferencias {
    private String palabraUno;
    private String palabraDos;

    public void leerDatos() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite Palabra Uno");
        palabraUno = lector.nextLine();
        System.out.println("Digite Palabra Dos");
        palabraDos = lector.nextLine();
    }

    public void comparar() {
        compararLongitud();
        compararTexto();
    }

    public void compararLongitud() {
        if (palabraUno.length() == palabraDos.length()) {
            System.out.println("La palabra " + palabraUno + ", longitud --> " + palabraUno.length());
            System.out.println("La palabra " + palabraDos + ", longitud --> " + palabraDos.length());
            System.out.println("Las palabras son Iguales en longitud");
        } else {
            System.out.println("La palabra " + palabraUno + ", longitud --> " + palabraUno.length());
            System.out.println("La palabra " + palabraDos + ", longitud --> " + palabraDos.length());
            System.out.println("Las palabras son diferentes en longitud");
        }

    }

    public void compararTexto() {
        if (palabraUno.equals(palabraDos)) {
            System.out.println("La palabra " + palabraUno + " y la palabra " + palabraDos + " son iguales en texto.");
        } else {
            for (int i = 0; i < palabraUno.length(); i++) {
                if (palabraUno.charAt(i) != palabraDos.charAt(i)) {
                    System.out.println("Las palabras no coinciden en la posición: " + i);
                    System.out.println("Siendo la diferencia: (" + palabraUno.charAt(i) + ") en vez de: (" + palabraDos.charAt(i) + ")");
                }
            }
        }
    }

}
