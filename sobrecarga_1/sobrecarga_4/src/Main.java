import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Producto [] usuario= new Producto[10];
        String [] nombre = new String[10];
        Double [] precio= new Double[10];
        int [] cantidad = new int[10];
        int cont=0,opcion;
        String [] opciones={"si","no"};
        String datos_precio,datos_cantidad;

        do {
            do {
                nombre[cont]=JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
                if (nombre[cont].length()==0)
                {
                    JOptionPane.showMessageDialog(null,"Se tiene que ingresar un nombre");
                }
            }while (nombre[cont].length()==0);

            datos_precio=JOptionPane.showInputDialog(null,"Ingrese el precio del producto");
            if (datos_precio.length()==0)
            {
                precio[cont]= (double) -1;
            }
            else
            {
                precio[cont]= Double.valueOf(datos_precio);
            }

            datos_cantidad=JOptionPane.showInputDialog(null,"Ingrese la cantidad del producto");

            if (datos_cantidad.length()==0)
            {
                cantidad[cont]= -1;
            }
            else
            {
                cantidad[cont]= Integer.parseInt(datos_cantidad);
            }

            switch (validar(precio[cont],cantidad[cont]))
            {
                case 0: usuario[cont]=new Producto(nombre[cont],precio[cont],cantidad[cont]);
                break;
                case 1: usuario[cont]=new Producto(nombre[cont],precio[cont]);
                break;
                case 2: usuario[cont]=new Producto(nombre[cont]);
            }
            cont++;
            opcion=JOptionPane.showOptionDialog(null,"Desea seguir ingresando datos",null,0,0,null,opciones,opciones[0]);

        }while (opcion==0 || cont==10);

        for (int i=0;i<cont;i++)
        {
            JOptionPane.showMessageDialog(null,usuario[i]);
        }



    }

    public static int validar(double precio,int cantidad){

        int valor;
        if (precio!=-1 && cantidad!=-1)
        {
            valor=0;
        }
        else
        {
            if(precio!=-1 && cantidad==-1)
            {
                valor=1;
            }
            else
                valor =2;
        }
        return valor;
    }
}
