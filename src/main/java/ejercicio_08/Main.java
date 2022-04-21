package ejercicio_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaLaboral diaLaboral;
        System.out.println("Digite dia de la semana");
        String dia = sc.nextLine();
        diaLaboral = new DiaLaboral(dia);
        diaLaboral.esDiaLaboral();
    }
}
