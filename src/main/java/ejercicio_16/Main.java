package ejercicio_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nombre");
        String nombre = sc.nextLine();
        System.out.println("Digite Edad");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Digite Sexo");
        String texto = sc.nextLine();
        char sexo = texto.charAt(0);
        System.out.println("Digite Peso");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Digite Altura");
        double altura = Double.parseDouble(sc.nextLine());

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println(persona1.toString());
        mostrarPeso(persona1);
        mayorEdad(persona1);

        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.setPeso(80);
        persona2.setAltura(1.60);
        System.out.println(persona2.toString());
        mostrarPeso(persona2);
        mayorEdad(persona2);

        Persona persona3 = new Persona();
        persona3.setNombre("Stick");
        persona3.setEdad(20);
        persona3.setSexo('h');
        persona3.setPeso(65);
        persona3.setAltura(1.60);
        System.out.println(persona3.toString());
        mostrarPeso(persona3);
        mayorEdad(persona3);
    }

    public static void mostrarPeso(Persona persona) {
        int imc = persona.calcularIMC();
        switch (imc) {
            case Persona.PESO_INFERIOR:
                System.out.println("Peso Inferior");
                break;
            case Persona.PESO_NORMAL:
                System.out.println("Peso Normal");
                break;
            case Persona.PESO_OBESIDAD:
                System.out.println("Sobrepeso");
                break;
        }
    }

    public static void mayorEdad(Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
