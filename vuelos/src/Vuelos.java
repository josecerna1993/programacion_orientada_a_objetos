import java.util.Arrays;

public class Vuelos{

    private int numeroVuelo;
    private String destino;
    private String origen;
    private String[][] asiento;
    private Aerolinea aerolinea;
    static Vuelos []usuarioVuelos=new Vuelos[100];
    static int contador=0;

    public static String[][] asientos(){
          String[][] ubicacion= new String[10][4];
          for (int i=0;i<10;i++)
          {
              for (int j=0;j<4;j++)
              {
                  switch (j)
                  {
                      case 0:ubicacion[i][j]="Asiento A"+i+" disponible   ";
                      break;
                      case 1:ubicacion[i][j]="Asiento B"+i+" disponible   ";
                      break;
                      case 2:ubicacion[i][j]="Asiento C"+i+" disponible   ";
                      break;
                      case 3:ubicacion[i][j]="Asiento D"+i+" disponible \n";
                      break;
                  }

              }
          }
          return ubicacion;
    }

    public Vuelos(int numeroVuelo, String destino, String origen, String [][]asiento, Aerolinea aerolinea) {
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.origen = origen;
        this.aerolinea = aerolinea;
        this.asiento=asiento;
    }
    public static void ingresoVuelo(Aerolinea dato){

        int numeroVuelo=Aerolinea.ingresarNumeros("Ingrese su numero de vuelo");
        String origen=Aerolinea.ingresarDatos("Ingrese origen del vuelo");
        String destino=Aerolinea.ingresarDatos("Ingrese destino del vuelo");
        usuarioVuelos[contador]=new Vuelos(numeroVuelo,destino,origen,Vuelos.asientos(),dato);
        contador++;
    }

    public static boolean buscarVuelo(int numero){
        boolean verificar;
        verificar = false;
        for (int i=0;i<contador;i++)
        {
            if (usuarioVuelos[i].getNumeroVuelo()==numero){
               verificar=true;
               break;
            }
        }
        return verificar;
    }
    public void setCambio(int fila, int columna, String valor) {

        this.asiento[fila][columna] = valor;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(String [][] asiento) {
        this.asiento = asiento;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Override
    public String toString() {
        return "Vuelo:\n" +
                "Numero Vuelo= " + numeroVuelo +"\n"+
                "Destino= " + destino +"\n"+
                "Origen='" + origen +"\n"+
                "Aerolinea=" + aerolinea.getNombre();
    }
}
