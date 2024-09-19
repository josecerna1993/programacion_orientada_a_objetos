import javax.swing.*;

public class Empleado {

    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre,String puesto,double salario) {
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
    }
    public String getNombre(){
        return  this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPuesto(){
        return  this.puesto;
    }
    public void setPuesto(String puesto){
        this.puesto=puesto;
    }
    public Double getSalario(){
        return  this.salario;
    }
    public void setSalario(double salario){
        this.salario= salario;
    }

    public static String validarTexto(String mensaje){
        String validar= JOptionPane.showInputDialog(mensaje);
        String retorno="";
        boolean conf;
        conf=false;
        do {

            if (validar.isEmpty())
            {
                validar=JOptionPane.showInputDialog("error "+mensaje);
            }
            else{
                retorno=validar;
                conf=true;
            }

        }while (conf==false);

        return retorno;

    }
    public  static double valiidarNumeros(String mensaje){
        String validar=JOptionPane.showInputDialog(mensaje);
        boolean conf;
        double retorno=0;
        conf=true;
        do {
            if (validar.isEmpty())
            {
                validar=JOptionPane.showInputDialog("error "+mensaje);
            }
            else {
                retorno= Double.parseDouble(validar);
                conf=false;
            }
        }while (conf==true);
        return retorno;
    }

    public void entregarDatos(){
        String datos="El nombre es "+this.nombre+"\n El puesto es"+this.puesto+"\n El salario es"+this.salario;
        JOptionPane.showMessageDialog(datos);
    }





}
