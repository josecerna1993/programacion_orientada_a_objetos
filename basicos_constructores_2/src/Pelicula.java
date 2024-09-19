public class Pelicula {
    String nombre;
    int duracion;
    String calificacion;
    String saga;


    public Pelicula(String nombre,int duracion,String calificacion,String saga)
    {
        this.nombre=nombre;
        this.duracion=duracion;
        this.calificacion=calificacion;
        this.saga=saga;
    }
    public String toString(){
        return "Pelicula "+nombre+" con duracion de "+duracion+" tiene una calificacion de "+calificacion+" y "+saga+" tiene saga";
    }

}
