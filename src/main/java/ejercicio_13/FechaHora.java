package ejercicio_13;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaHora {
    LocalDateTime fechaHora;
    DateTimeFormatter dtf;

    public void mostrarFechaHora() {
        fechaHora = LocalDateTime.now();
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual con formato");
        System.out.println("(AAAA/MM/DD) (HH:MM:SS)");
        System.out.println(dtf.format(fechaHora));
    }
}
