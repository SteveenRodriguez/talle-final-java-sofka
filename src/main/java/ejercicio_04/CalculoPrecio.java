package ejercicio_04;

public class CalculoPrecio {
    private double precioProducto;
    private static double IVA = 0.21;

    public CalculoPrecio(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String calcularIva() {
        double calculoProducto = (precioProducto * IVA) + precioProducto;
        String mensaje = "Precio del Producto $" + calculoProducto + " pesos, iva incluido";
        return mensaje;
    }
}
