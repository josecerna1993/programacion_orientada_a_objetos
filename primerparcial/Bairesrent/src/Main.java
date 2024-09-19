import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] menuOpciones={"Ingresar nuevo inmueble","Bucar inmueble","Salir"};
        String[] menuBusqueda={"codigo","zona","disponibilidad","documento inquilino","salir"};
        int opcionMenu;
        int opcionBusqueda;

        do {
            opcionMenu= JOptionPane.showOptionDialog(null,"Ingrese opcion",null,0,0,null,menuOpciones,menuOpciones[0]);
            switch (opcionMenu)
            {
                case 0:Alquiler.ingresoVivienda();
                break;
                case 1: opcionBusqueda=JOptionPane.showOptionDialog(null,"Ingrese metodo de busqueda",null,0,0,null,menuBusqueda,menuBusqueda[0]);
                       Alquiler.buscar(opcionBusqueda);
                       break;
            }

        }while (opcionMenu!=2);




    }
}
