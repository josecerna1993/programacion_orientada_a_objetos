import javax.swing.*;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    String genero;

    public Persona(String nombre,String apellido,int edad,String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }
    public Persona(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=10;
        this.genero="no definido";
    }
    public Persona(){
        this.nombre="no defiido";
        this.apellido="no definido";
        this.edad=0;
        this.genero="no definido";
    }
    public static String validarPersona(String mensaje){
        String valida= JOptionPane.showInputDialog(mensaje);
        boolean flay;
        String retorno="";
        flay=true;
        do {
            if (valida.isEmpty())
            {
                valida=JOptionPane.showInputDialog("error"+mensaje);

            }
            else{
                retorno=valida;
                flay=false;
            }

        }while (!flay == false);
        return retorno;
    }
    public static int validarPersonaEdad(String mensaje){
        String validar=JOptionPane.showInputDialog(mensaje);
        boolean flay;
        while (validar.isEmpty()){
            validar=JOptionPane.showInputDialog("error " +mensaje);
        }
        return Integer.parseInt(validar);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
