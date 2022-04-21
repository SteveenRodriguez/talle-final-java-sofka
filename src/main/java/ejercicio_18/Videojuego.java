package ejercicio_18;

public class Videojuego implements Entregable {

    String titulo = "";
    int horas_estimadas = 10;
    boolean entregado = false;
    String genero = "";
    String compania = "";

    public Videojuego() {
        this.titulo = "";
        this.horas_estimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horas_estimadas=" + horas_estimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    /*@Override
    public int compareTo(Videojuego v) {
        int resultado;
        if(this.horas_estimadas < v.horas_estimadas){
            resultado = -1;
        }else if (this.horas_estimadas > v.horas_estimadas){
            resultado = 1;
        }else {
            resultado = 0;
        }
        return resultado;}*/
}
