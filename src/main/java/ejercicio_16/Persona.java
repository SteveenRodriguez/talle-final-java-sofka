package ejercicio_16;

public class Persona {
    public static final int PESO_INFERIOR = -1;
    public static final int PESO_NORMAL = 0;
    public static final int PESO_OBESIDAD = 1;
    public final static char SEXO_DEF = 'h';

    private String nombre;
    private int edad;
    private String DNI;
    private double peso;
    private double altura;
    private char sexo;

    public Persona() {
        this("", 0, SEXO_DEF, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }

    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual < 20) {
            return PESO_INFERIOR;
        }
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_NORMAL;
        }
        if (pesoActual > 25) {
            return PESO_OBESIDAD;
        }
        return -2;
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'h') {
            this.sexo = SEXO_DEF;
        }
    }

    private void generarDni() {
        final int divisor = 23;
        int numDni = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDni - (numDni / divisor * divisor);
        char letraDni = generarLetraDni(res);
        DNI = Integer.toString(numDni) + letraDni;
    }

    private char generarLetraDni(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[res];
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
