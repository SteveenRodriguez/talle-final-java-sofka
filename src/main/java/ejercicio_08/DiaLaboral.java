package ejercicio_08;

/*Crea una aplicación por consola que nos pida un día de la semana y
que nos diga si es un día laboral o no. Usa un switch para ello.*/
public class DiaLaboral {
    private String dia;

    public DiaLaboral(String dia) {
        this.dia = dia;
    }

    public void esDiaLaboral() {
        String opcion = dia.toLowerCase();
        switch (opcion) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El " + dia + " es un día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El " + dia + " no es un día laboral");
                break;
            default:
                System.out.println("Dia ingresado no valido ");
        }
    }
}
