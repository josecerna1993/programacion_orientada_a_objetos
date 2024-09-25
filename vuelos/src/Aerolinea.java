import static javax.swing.JOptionPane.showInputDialog;

public class Aerolinea {

    private String nombre;
    static Aerolinea[] usuarioAerolinea=new Aerolinea[100];
    static int contador=0;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void ingresarAerolinea(){
        String nombre=ingresarDatos("Ingrese el nombre de la Aerolinea");
        usuarioAerolinea[contador]=new Aerolinea(nombre);
        Vuelos.ingresoVuelo(usuarioAerolinea[contador]);
        contador++;
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

}
