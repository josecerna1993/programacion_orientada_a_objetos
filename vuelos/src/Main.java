import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String [] menuPrincipal={"Agregar Aerolinea-vuelo","sacar pasaje","salir"};
        int opcionPrincipal;

        do {
            opcionPrincipal= JOptionPane.showOptionDialog(null,"Seleccione accion",null,0,0,null,menuPrincipal,menuPrincipal[0]);
            switch (opcionPrincipal)
            {
                case 0: Aerolinea.ingresarAerolinea();
                break;
                case 1: String [] subMenu={"Sacar pasaje/seleccion de asiento","mostrar todos los vuelos","salir"};
                        int opcionSubMenu;
                        do {
                            opcionSubMenu=JOptionPane.showOptionDialog(null,"Seleccione opcion de busqueda",null,0,0,null,subMenu,subMenu[0]);
                            switch (opcionSubMenu)
                            {
                                case 0: int numeroVuelo=Aerolinea.ingresarNumeros("Ingrese numero de vuelo");
                                        if (Vuelos.buscarVuelo(numeroVuelo)){
                                            Pasajero.cargarPasajero(numeroVuelo);
                                        }
                                        else {
                                            JOptionPane.showMessageDialog(null,"vuelo inexistente");
                                        }
                                        break;
                                case 1: for (int i=0;i<Vuelos.contador;i++)
                                {
                                    JOptionPane.showMessageDialog(null,Vuelos.usuarioVuelos[i].toString());
                                }
                                break;

                            }
                        }while (opcionSubMenu!=2);


            }

        }while (opcionPrincipal!=2);




    }

}
