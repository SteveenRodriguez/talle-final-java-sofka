package ejercicio_05;

/*Muestra los números impares y pares del 1 al 100 (ambos incluidos).
 Usa un bucle while.*/
public class Numeros {
    public void listarImpares() {
        int num = 0;
        System.out.println("NUMEROS IMPARES");
        while (num != 100) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }

    public void listarPares() {
        int num = 1;
        System.out.println("NUMEROS PARES");
        while (num != 101) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
