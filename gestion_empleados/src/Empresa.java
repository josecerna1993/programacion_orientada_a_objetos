import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Empresa {

    private String nombre;
    static Empresa []usuarioEmpresa=new Empresa[100];
    static int contador=0;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void ingresoDatosEmpresa(String dato){
         String validar=ingresarDatos(dato);
         usuarioEmpresa[contador]=new Empresa(validar);
         JOptionPane.showMessageDialog(null,"Acontinuacion ingrese datos del departamento");
         Departamento.ingresoDepartamento(usuarioEmpresa[contador]);
         contador++;
    }
    public static boolean buscarEmpresa(String dato){
        boolean verificar;
        verificar = false;

        for (int i=0;i<contador;i++)
        {
            if (dato.equals(usuarioEmpresa[i].getNombre())) {
                verificar = true;
                break;
            }
        }
        return verificar;
    }


    public static String ingresarDatos(String mensaje){
        String validar= showInputDialog(mensaje);
        String retorno="";
        boolean conf;
        conf=false;
        do {

            if (validar.isEmpty())
            {
                validar= showInputDialog("error "+mensaje);
            }
            else{
                retorno=validar;
                conf=true;
            }

        }while (conf==false);

        return retorno;

    }
    public static int ingresarNumeros(String mensaje){
        String validar= showInputDialog(mensaje);
        int retorno=0;
        boolean conf=false;
        do {
            if (validar.length()==0)
            {
                validar=showInputDialog("Error "+mensaje);
            }
            else {
                retorno= Integer.parseInt(validar);
                conf=true;
            }
        }while (conf==false);
        return retorno;

    }

    public double calcularSueldo(Empleado empleado){

        double total= empleado.getHoras()*empleado.getDepartamento().getBonificacion()+empleado.getSalariobase();
        return total;
    }
}
