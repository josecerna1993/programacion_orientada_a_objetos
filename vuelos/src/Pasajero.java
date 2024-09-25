import javax.swing.*;
import java.util.Arrays;

public class Pasajero {

    private String nombre;
    private int pasaporte;
    private Vuelos vuelo;
    private String asiento;
    static Pasajero [] usuarioPasajero=new Pasajero[100];
    static int contador=0;

    public Pasajero(String nombre, int pasaporte, Vuelos vuelo) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.vuelo = vuelo;
        this.asiento="vacio";
    }
    public static void cargarPasajero(int numero){
        String nombre=Aerolinea.ingresarDatos("ingresar nombre");
        int pasaporte=Aerolinea.ingresarNumeros("ingrese pasaporte");
        int posicionVuelo=0;
        for (int i=0;i<Vuelos.contador;i++)
        {
            if (Vuelos.usuarioVuelos[i].getNumeroVuelo()==numero)
            {
                posicionVuelo=i;
            }
        }
        usuarioPasajero[contador]=new Pasajero(nombre,pasaporte,Vuelos.usuarioVuelos[posicionVuelo]);
        usuarioPasajero[contador].reservarAsiento(Vuelos.usuarioVuelos[posicionVuelo]);

    }
    public void reservarAsiento(Vuelos dato){

        String asiento= JOptionPane.showInputDialog(null,"Lista de asientos \n"+Arrays.deepToString(dato.getAsiento()));
        char[] letras=asiento.toCharArray();
        int numero= letras[1]-'0';
        switch (letras[0])
        {
            case 'A':dato.setCambio(numero,0,"Asiento A"+numero+" ocupado  ");
            break;
            case 'B':dato.setCambio(numero,1,"Asiento B"+numero+" ocupado  ");
            break;
            case 'C':dato.setCambio(numero,2,"Asiento C"+numero+" ocupado  ");
            break;
            case 'D':dato.setCambio(numero,3,"Asiento D"+numero+" ocupado  ");
            break;
        }

        this.asiento=asiento;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Vuelos getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelos vuelo) {
        this.vuelo = vuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", pasaporte=" + pasaporte +
                ", vuelo=" + vuelo.getNumeroVuelo() +
                ", asiento='" + asiento + '\'' +
                '}';
    }
}
