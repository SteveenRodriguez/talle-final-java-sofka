package ejercicio_10;

/*Realizar una aplicación de consola, que al ingresar una frase
 por teclado elimine los espacios que esta contenga.*/
public class EliminarEspacios {
    private String frase;

    public EliminarEspacios(String frase) {
        this.frase = frase;
    }

    public String removerEspacios() {
        String nuevaFrase = frase.replace(" ", "");
        return nuevaFrase;
    }
}
