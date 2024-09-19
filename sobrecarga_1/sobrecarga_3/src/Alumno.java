public class Alumno {

    String nombre;
    int edad;
    String curso;
    double calificacion_promedio;

    public Alumno(String nombre,int edad,String curso, double calificacion_promedio)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.curso=curso;
        this.calificacion_promedio=calificacion_promedio;
    }
    public Alumno(String nombre,int edad)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.curso="No asignado";
        this.calificacion_promedio=0;
    }
    public Alumno(String nombre)
    {
        this.nombre=nombre;
        this.edad=0;
        this.curso="No asignado";
        this.calificacion_promedio=0;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                ", calificacion_promedio=" + calificacion_promedio +
                '}';
    }
}
