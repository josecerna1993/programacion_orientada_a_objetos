public class Libro {

    String titulo;
    String autor;
    double precio;
    int anyo_publicacion;

    public Libro(String titulo, String autor, double precio, int anyo_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anyo_publicacion = anyo_publicacion;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 111;
        this.anyo_publicacion = 2024;
    }

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.precio = 111;
        this.anyo_publicacion = 2024;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anyo_publicacion=" + anyo_publicacion +
                '}';
    }
}
