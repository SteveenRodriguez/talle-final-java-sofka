package ejercicio_06;

/*Muestra los números impares y pares del 1 al 100 (ambos incluidos).
 Usa un bucle while.*/
public class Numeros {
    public void listarImpares() {
        System.out.println("NUMEROS IMPARES");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void listarPares() {

        System.out.println("NUMEROS PARES");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
