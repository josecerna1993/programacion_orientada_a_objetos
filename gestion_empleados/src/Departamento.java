import javax.swing.*;

public class Departamento {

    private String nombre;
    private String getCodPostal;
    private Empresa empresa;
    private int Bonificacion;
    static Departamento [] usuarioDepartamento=new Departamento[100];
    static  int contador=0;

    public Departamento(String nombre, String getCodPostal, Empresa empresa, int bonificacion) {
        this.nombre = nombre;
        this.getCodPostal = getCodPostal;
        this.empresa = empresa;
        this.Bonificacion = bonificacion;
    }

    public static void ingresoDepartamento(Empresa empresa){

        String nombre=Empresa.ingresarDatos("Ingrese el nombre del departamnto");
        String codPostal=Empresa.ingresarDatos("ingrese el codigo postal");
        int boificacion=Empresa.ingresarNumeros("Ingrese la bonificacion del departamento");
        usuarioDepartamento[contador]=new Departamento(nombre,codPostal,empresa,boificacion);
        JOptionPane.showMessageDialog(null,"Acontinuacion ingrese los datos del empleado");
        Empleado.ingresoEmpleado(usuarioDepartamento[contador]);
        contador++;
    }

    public static boolean buscarDepto(String dato){
        boolean verificar;
        verificar = false;

        for (int i=0;i<contador;i++)
        {
            if (dato.equals(usuarioDepartamento[i].getNombre())) {
                verificar = true;
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

    public String getGetCodPostal() {
        return getCodPostal;
    }

    public void setGetCodPostal(String getCodPostal) {
        this.getCodPostal = getCodPostal;
    }

    public int getBonificacion() {
        return Bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        Bonificacion = bonificacion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", getCodPostal='" + getCodPostal + '\'' +
                ", empresa=" + empresa +
                ", Bonificacion=" + Bonificacion +
                '}';
    }
}
