package ejercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumeroMayor mayor;
        System.out.println("Digite número uno");
        int num1= sc.nextInt();
        System.out.println("Digite número dos");
        int num2= sc.nextInt();
        mayor = new NumeroMayor(num1, num2);
        System.out.println(mayor.comprobar());
    }

}




