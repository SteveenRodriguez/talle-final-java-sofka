package ejercicio_03;

/*Haz una aplicación que calcule el área de un círculo(pi*R2).
El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
Usa la constante PI y el método pow de Math.*/
public class CalculoArea {
    private double radio;

    public CalculoArea(double radio) {
        this.radio = radio;
    }

    public String calculoAreaCirculo() {
        double area = Math.PI * Math.pow(radio, 2);
        String mensaje = "El área del círculo con radio: " + radio + ", es --> " + area;
        return mensaje;
    }

}
