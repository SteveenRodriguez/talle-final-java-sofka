package ejercicio_01;

public class NumeroMayor {
    private int numero1;
    private int numero2;

    public NumeroMayor(){
        this.numero1 = 10;
        this.numero2 = 22;
    }

    public String comprobar(){
        String mensaje = "";
        if (numero1 < numero2){
            mensaje  = "Entre el " + numero1 +  " y el " + numero2 + ", el mayor es --> " + numero2 + " y el menor es --> " + numero1;
            return mensaje;
        }if (numero1 > numero2){
            mensaje  = "Entre el " + numero1 +  " y el " + numero2 + ", el mayor es --> " + numero1 + " y el menor es --> " + numero2;
            return mensaje;
        }if (numero1 == numero2){
            mensaje  = "El número " + numero1 +  " y el número " + numero2 + ", son numeros iguales";
            return mensaje;
        }
        return mensaje;
    }

}
