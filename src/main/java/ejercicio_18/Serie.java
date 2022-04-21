package ejercicio_18;

public class Serie implements Entregable {

    String titulo = "";
    int numero_temporadas = 3;
    boolean entregado = false;
    String genero = "";
    String creador = "";

    public Serie() {
        this.titulo = titulo;
        this.creador = creador;
        this.numero_temporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numero_temporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, int numero_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numero_temporadas = numero_temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    public void setNumero_temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numero_temporadas=" + numero_temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
    public int compareTo(Serie s) {
        int resultado;
        if(this.numero_temporadas < s.numero_temporadas){
            resultado = -1;
        }else if (this.numero_temporadas > s.numero_temporadas){
            resultado = 1;
        }else {
            resultado = 0;
        }
        return resultado;
    }*/
}
