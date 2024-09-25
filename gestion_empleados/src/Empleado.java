import javax.swing.*;

public class Empleado {

    private String nombre;
    private Departamento departamento;
    private double salariobase;
    private int horas;

    static Empleado [] usuarioEmpleado=new Empleado[100];
    static int contador=0;

    public Empleado(String nombre, Departamento departamento, double salariobase, int horas) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salariobase = salariobase;
        this.horas = horas;
    }

    public static void ingresoEmpleado(Departamento depto){

        String nombre=Empresa.ingresarDatos("Ingrese el nombre del empleado");
        double salarioBase=2000;
        int horas=Empresa.ingresarNumeros("Ingresa cantidad de horas");
        usuarioEmpleado[contador]=new Empleado(nombre,depto,salarioBase,horas);
        contador++;
    }
    public static boolean buscardorEmpleado(String nombre){

        boolean verificar;
        verificar = false;


        for (int i=0;i<contador;i++)
        {
            if (usuarioEmpleado[i].getNombre().equals(nombre)){
                verificar=true;
                break;
            }
        }

        return verificar;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Empleado \n" +
                "Nombre= " + nombre + "\n" +
                "Departamento= " + departamento.getNombre()+"\n"+
                "Salario Base= " + salariobase +"\n"+
                "Horas trabajadas= " + horas ;
    }
}
