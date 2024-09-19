import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Alquiler {
    //atributos

    private String zona;
    private int ambientes;
    private String tipoVivienda;
    private String estadoAlquiler;
    private double precio;
    private int codigoVivienda;
    private int documento;
    private String nombre;
    private String apellido;
    static Alquiler[] vivienda=new Alquiler[100];
    static int[] codigo_array=new int[100];
    static int cont=0;

    //constructor
    public Alquiler(String zona, int ambientes, String tipoVivienda,String estadoAlquiler, double precio){
        this.zona=zona;
        this.ambientes=ambientes;
        this.tipoVivienda=tipoVivienda;
        this.estadoAlquiler=estadoAlquiler;
        this.precio=precio;
        this.codigoVivienda=generadorCodigos();
        this.apellido="no definido";
        this.nombre="no definido";
        this.documento=99999999;
    }
    public Alquiler(String zona, int ambientes, String tipoVivienda,String estadoAlquiler, double precio,int documento,String nombre, String apellido){
        this.zona=zona;
        this.ambientes=ambientes;
        this.tipoVivienda=tipoVivienda;
        this.estadoAlquiler=estadoAlquiler;
        this.precio=precio;
        this.codigoVivienda=generadorCodigos();
        this.apellido=apellido;
        this.nombre=nombre;
        this.documento=documento;
    }
    public String getZona(){
        return this.zona;
    }
    public int getAmbientes(){
        return this.ambientes;
    }
    public String getTipoVivienda(){
        return this.tipoVivienda;
    }

    public String getEstadoAlquiler(){
        return this.estadoAlquiler;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCodigoVivienda(){
        return this.codigoVivienda;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public int getDocumento(){
        return this.documento;
    }
    public void setDocumento(int documento){
        this.documento=documento;
    }



    public static int generadorCodigos(){
        int cont2=0;
        int retorno=0;
        do {
            int numero=(int)(Math.random()*(300-100+1))+100;

            for (int i=0;i<=cont;i++)
            {
                if (numero==codigo_array[i]){
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
    public static void ingresoVivienda(){
        String[] arrayZonas={"Palermo","Recoleta","Belgrano","Nuñez","Almagro","Microcentro","Flores","Devoto","Caballito"};
        String[] arrayTipoViviendas={"Casa","Departamento","Local"};
        String[] opciones={"si","no"};
        int opcion;


        String zona= (String) JOptionPane.showInputDialog(null,"Seleccionar zona:",null,0,null,arrayZonas,arrayZonas[0]);
        int ambientes=validarAmbientes("Ingrese numero de ambientes");
        String tipo= (String) JOptionPane.showInputDialog(null,"Seleccione tipo de vivienda",null,0,null,arrayTipoViviendas,arrayTipoViviendas[0]);
        opcion=JOptionPane.showOptionDialog(null,"El precio estimado es de "+precioVivienda(zona,ambientes,tipo)+". Desea mantener ese precio?",null,0,0,null,opciones,opciones[0]);
        if (opcion==0)
        {
            ingresoEstadoVivienda(zona,ambientes,tipo,precioVivienda(zona,ambientes,tipo));
        }
        else {
            double precio=validarNumeros("Ingresa el precio");
            ingresoEstadoVivienda(zona,ambientes,tipo,precio);
        }

    }
    public  static void ingresoEstadoVivienda(String zona,int ambientes,String tipo,double precio){
        String [] opciones={"Alquilar","Dejar en disponible"};
        String estado;

        int opcion=JOptionPane.showOptionDialog(null,"Desea alquilarlo",null,0,0,null,opciones,opciones[0]);
        switch (opcion)
        {
            case 0: estado="Alquilado";
                ingresoInquilino(zona,ambientes,tipo,estado,precio);
                break;
            case 1: estado="Disponible";
                 vivienda[cont]=new Alquiler(zona,ambientes,tipo,estado,precio);
                JOptionPane.showMessageDialog(null,"Nuevo codigo de usuario \n"+vivienda[cont].getCodigoVivienda());
                mostrarDatos(cont);
                 cont++;

                 break;
        }
    }

    public static void ingresoInquilino(String zona,int ambientes,String tipo,String estado,double precio){

        String nombre=validarTexto("Ingrese el nombre");
        String apellido=validarTexto("Ingrese el apelido");
        int documento=validarDocumento("Ingrese el documento");

        vivienda[cont]=new Alquiler(zona,ambientes,tipo,estado,precio,documento,nombre,apellido);
        JOptionPane.showMessageDialog(null,"Nuevo codigo de usuario \n"+vivienda[cont].getCodigoVivienda());
        mostrarDatos(cont);
        cont++;

    }
    public static int validarDocumento(String mensaje){
        int validar= Integer.parseInt(showInputDialog(mensaje));
        int retorno=0;
        boolean conf=false;
        do {
            if (validar<10000000 || validar>99999999)
            {
                validar= Integer.parseInt(showInputDialog("Documento errado. "+mensaje));
            }
            else {
                retorno=validar;
                conf=true;
            }
        }while (conf==false);
        return  retorno;
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

    public static double validarNumeros(String mensaje){
        String validar=JOptionPane.showInputDialog(mensaje);
        boolean flay;
        while (validar.isEmpty()){
            validar=JOptionPane.showInputDialog("error " +mensaje);
        }
        return Double.parseDouble(validar);
    }
    public static int validarAmbientes(String mensaje){
        String validar=JOptionPane.showInputDialog(mensaje);
        boolean flay;
        while (validar.isEmpty()){
            validar=JOptionPane.showInputDialog("error " +mensaje);
        }
        return Integer.parseInt(validar);
    }
    public static double precioVivienda(String zona, int ambientes,String tipo){
        double precio=0;
        double baseZona1=200000;
        double baseZona2=150000;
        double porcentajeTipoDepto=1.0;
        double porcentajeTipoCasa=1.75;
        double porcentajeTipoLocal=2.10;
        if (zona=="Palermo" || zona=="Recoleta" || zona=="Belgrano" || zona=="Nuñez" || zona=="Microcentro")
        {
            switch (tipo)
            {
                case "Departamento": precio=baseZona1*porcentajeTipoDepto*ambientes;
                    break;
                case "Casa": precio=baseZona1*porcentajeTipoCasa*ambientes;
                    break;
                case "Local": precio=baseZona1*porcentajeTipoLocal;
                break;/*no trengo en cuenta los ambientes*/

            }
        }
        else
        {
            switch (tipo)
            {
                case "Departamento": precio=baseZona2*porcentajeTipoDepto*ambientes;
                    break;
                case "Casa": precio=baseZona2*porcentajeTipoCasa*ambientes;
                    break;
                case "Local": precio=baseZona2*porcentajeTipoLocal;
                break;/*no trengo en cuenta los ambientes*/

            }
        }
        return precio;
    }

    public static void buscar(int num){

        switch (num)
        {
            case 0: int codigoBusqueda= (int) validarNumeros("Ingrese el codigo");
                    int posicion=-1;
                    for (int i=0;i<cont;i++)
                    {
                        if (vivienda[i].getCodigoVivienda()==codigoBusqueda)
                        {
                            posicion=i;
                        }
                    }
                    if (posicion!=-1)
                    {
                        mostrarDatos(posicion);
                        editarDatos(posicion);

                    }
                    else {
                        JOptionPane.showMessageDialog(null,"El codigo es errado");
                    }
            break;
            case 1:  String[] arrayZonas={"Palermo","Recoleta","Belgrano","Nuñez","Almagro","Microcentro","Flores","Devoto","Caballito"};
                     String zona= (String) JOptionPane.showInputDialog(null,"Seleccionar zona en donde buscar",null,0,null,arrayZonas,arrayZonas[0]);
                     for (int i=0;i<cont;i++)
                     {
                         if (zona == vivienda[i].getZona())
                         {
                             mostrarDatos(i);
                             editarDatos(i);
                         }
                     }
            break;
            case 2: String[] arrayDisponible={"Alquilado","Disponible"};
                    String disponibilidad=(String) JOptionPane.showInputDialog(null,"Seleccionar que busca",null,0,null,arrayDisponible,arrayDisponible[0]);
                for (int i=0;i<cont;i++)
                {
                    if (disponibilidad == vivienda[i].getEstadoAlquiler())
                    {
                        mostrarDatos(i);
                        editarDatos(i);
                    }
                }
            break;

            case 3:int dni=validarDocumento("Ingrese el documento del inquilino");
                int post=-1;
                for (int i=0;i<cont;i++)
                {
                    if (vivienda[i].getDocumento()==dni)
                    {
                        post=i;
                    }
                }
                if (post!=-1)
                {
                    mostrarDatos(post);
                    editarDatos(post);

                }
                else {
                    JOptionPane.showMessageDialog(null,"El DNI es errado");
                }
                break;
        }
    }
    public static void mostrarDatos(int posicion){

        String formulario="La vivienda ubicada en la zona: "+vivienda[posicion].getZona()+
                "\n"+"Cuenta con "+vivienda[posicion].getAmbientes()+" ambientes. \n"+
                "La vivienda es "+vivienda[posicion].getTipoVivienda()+".\n"+
                "Estado de la vivienda: "+vivienda[posicion].getEstadoAlquiler()+"\n"+
                "Precio: "+vivienda[posicion].getPrecio()+"\n"+
                "Datos del dueño \n"+
                "Nombre: "+vivienda[posicion].getNombre()+"\n"+
                "Apellido: "+vivienda[posicion].getApellido()+"\n"+
                "Documento: "+vivienda[posicion].getDocumento();

        JOptionPane.showMessageDialog(null,formulario);

    }
    public static void editarDatos(int posicion){
        String []opciones={"Editar datos","salir"};
        String[] camposEditar={"Nombre","Apellido","Documento","salir"};
        int editar;
        int opcion;
        do {
            opcion=JOptionPane.showOptionDialog(null,"Desea  modificar datos de inquilino",null,0,0,null,opciones,opciones[0]);
            if (opcion==0)
            {
                do {
                    editar=JOptionPane.showOptionDialog(null,"Seleccionar que campo editara",null,0,0,null,camposEditar,camposEditar[0]);
                    switch (editar) {
                        case 0:
                            vivienda[posicion].setNombre(validarTexto("Ingrese el nombre"));
                            break;
                        case 1:
                            vivienda[posicion].setApellido(validarTexto("Ingrese el apelido"));
                            break;
                        case 2:
                            vivienda[posicion].setDocumento(validarDocumento("Ingrese el documento"));
                            break;
                    }
                }while (editar!=3);
                mostrarDatos(posicion);
            }
        }while (opcion!=1);
    }



}
