package Ejercicio_11;

/*Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
 indicar cual es la longitud de esta frase,
 adicionalmente cuantas vocales tiene de a,e,i,o,u.*/
public class LongitudFrase {
    private String frase;
    private int contadorA = 0;
    private int contadorE = 0;
    private int contadorI = 0;
    private int contadorO = 0;
    private int contadorU = 0;
    private int cantidadVocales = 0;

    public LongitudFrase(String frase) {
        this.frase = frase.toLowerCase();
    }

    public String mostrarResultados() {
        String mensaje = "";
        int tamanioFrase = frase.length();
        mensaje = "\n Longitud frase --> " + tamanioFrase
                + "\n Cantidad vocales --> " + cantidadVocales
                + "\n Vocal a --> " + contadorA
                + "\n Vocal e --> " + contadorE
                + "\n Vocal i --> " + contadorI
                + "\n Vocal o --> " + contadorO
                + "\n Vocal u --> " + contadorU;
        return mensaje;
    }

    public void contadorVocales() {
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a')) {
                contadorA++;
                cantidadVocales++;
            } else if ((frase.charAt(i) == 'e')) {
                contadorE++;
                cantidadVocales++;
            } else if ((frase.charAt(i) == 'i')) {
                contadorI++;
                cantidadVocales++;
            } else if ((frase.charAt(i) == 'o')) {
                contadorO++;
                cantidadVocales++;
            } else if ((frase.charAt(i) == 'u')) {
                contadorU++;
                cantidadVocales++;
            }
        }
    }
}

/*
 * Es un fracaso:
 * Es imposible: jamas imagine poder entrar a sofka*/