import javax.swing.*;
import  java.time.LocalDate;
import java.time.Period;

import static javax.swing.JOptionPane.*;

public class Paciente {

    private String nombre;
    private String edad;
    private String razaEspecie;
    private int codigoPaciente;
    private LocalDate fechaIngreso;
    private LocalDate fechaConsulta;
    private String informe;
    static Paciente[] usuario=new Paciente[100];
    static  int cont=0;
    static int[] codigoArray=new int[100];

    public Paciente(String nombre, String edad,String razaEspecie, LocalDate fechaConsulta, String informe){
        this.nombre=nombre;
        this.edad=edad;
        this.razaEspecie=razaEspecie;
        this.fechaIngreso=LocalDate.now();
        this.fechaConsulta=fechaConsulta;
        this.informe=informe;
        this.codigoPaciente=generadorCodigos();

    }

    public String getNombre(){
        return  this.nombre;
    }
    public String getEdad(){
        return this.edad;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }
    public String getRazaEspecie(){
        return this.razaEspecie;
    }
    public int getCodigoPaciente(){
        return this.codigoPaciente;
    }
    public LocalDate getfechaIngreso(){
        return this.fechaIngreso;
    }
    public LocalDate getFechaConsulta(){
        return this.fechaConsulta;
    }
    public void setFechaConsulta(LocalDate fechaConsulta){
        this.fechaConsulta=fechaConsulta;
    }
    public String getInforme(){
        return this.informe;
    }
    public void setInforme(String informe){
        this.informe=informe;
    }

    public static int generadorCodigos(){
        int cont2=0;
        int retorno=0;
        do {
            int numero=(int)(Math.random()*(300-100+1))+100;

            for (int i=0;i<=cont;i++)
            {
                if (numero==codigoArray[i]){
                    cont2++;
                }
            }
            if (cont2==0)
            {
                retorno=numero;
            }
        }while (cont2!=0);
        return retorno;
    }
    public static void cargarUsuario(String nombre, String edad,String raza_especie, LocalDate fechaConsulta, String informe){
        usuario[cont]=new Paciente(nombre,edad,raza_especie,fechaConsulta,informe);
        cont++;

    }
    public static void mostrarCodigoCarga(int i){
        JOptionPane.showMessageDialog(null,"Nuevo Usuario codigo de identificacion "+usuario[i].getCodigoPaciente());
    }
    public static void buscarCliente(int codigo){
        String[] opciones={"Editar","salir"};
        int opcion;
        int opcionEdicion;
        String[] opcionesEdicion={"Edad","Informe","Fecha prox. consulta","salir"};
        int posicion=-1;
        for(int i=0;i<cont;i++)
        {
            if (usuario[i].getCodigoPaciente() == codigo){
                posicion=i;
            }
        }
        if (posicion==-1)
        {
            JOptionPane.showMessageDialog(null,"No se encontro usuario");
        }
        else {
            do {
                String formulario="Usuario: "+usuario[posicion].getCodigoPaciente()+"\n " +
                        "Nombre: "+usuario[posicion].getNombre()+"\n"+
                        "Edad: "+usuario[posicion].getEdad()+"\n"+
                        "Raza y/o especie: "+usuario[posicion].getRazaEspecie()+"\n"+
                        "Fecha de ingreso: "+usuario[posicion].getfechaIngreso()+"\n"+
                        "Fecha de proxima consulta: "+usuario[posicion].getFechaConsulta()+"\n"+
                        "Informe de salud: "+usuario[posicion].getInforme();
                opcion=JOptionPane.showOptionDialog(null,formulario,null,0,0,null,opciones,opciones[0]);
                if (opcion==0)
                {
                    opcionEdicion=JOptionPane.showOptionDialog(null,"Que desea editar",null,0,0,null,opcionesEdicion,opcionesEdicion[0]);
                    switch (opcionEdicion)
                    {
                        case 0: usuario[posicion].setEdad(JOptionPane.showInputDialog(null,"Ingrese edad"));
                            break;
                        case 1: usuario[posicion].setInforme(JOptionPane.showInputDialog(null,"Ingrese informe"));
                            break;
                        case 2:usuario[posicion].setFechaConsulta(LocalDate.parse(JOptionPane.showInputDialog(null,"Ingrese proxima consulta")));

                    }
                }

            }while (opcion!=1);



        }

    }
    public static String validarTexto(String mensaje){
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
    public static LocalDate validarConsulta(String mensaje){
        LocalDate fecha= LocalDate.parse(showInputDialog(mensaje));
        LocalDate retorno = null;
        boolean conf;
        conf=false;

        do {
            if (fecha.isBefore(LocalDate.now())){
               fecha=LocalDate.parse(showInputDialog("Error "+mensaje));
            }
            else{
                retorno=fecha;
                conf=true;
            }
        }while (conf==false);
        return retorno;
    }







}
