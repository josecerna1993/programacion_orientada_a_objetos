
import javax.swing.*;
import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String [] opciones={"si","no"};

        String[] marcas=new String[20];
        String[] modelos=new String[20];
        int [] anyo=new int[20];
        Coche[] usuario=new Coche[20];
        int contador=0;
        int opcion;
        String anyo_ingresado;


        do {
            /*validar que siempre ingrese la marca*/
            do {
                marcas[contador]= JOptionPane.showInputDialog(null,"Ingrese la marca del coche");
                if (marcas[contador].length()==0)
                {
                    JOptionPane.showMessageDialog(null,"Ingrese un dato","Error",0);
                }
            }while (marcas[contador].length()==0);

            modelos[contador]=JOptionPane.showInputDialog(null,"Ingrese el modelo del coche");
            anyo_ingresado=JOptionPane.showInputDialog(null,"Ingrese el año de fabricacion");
            if (anyo_ingresado.length()==0)
            {
                anyo[contador]=0;
            }
            else {
                anyo[contador]= Integer.parseInt(anyo_ingresado);
            }

            switch (validar(modelos[contador],anyo[contador]))
            {
                case 0: usuario[contador]= new Coche(marcas[contador],modelos[contador],anyo[contador]);
                break;
                case 1:usuario[contador]=new Coche(marcas[contador],modelos[contador]);
                break;
                case 2:usuario[contador]=new Coche(marcas[contador]);
                break;
                case 3:usuario[contador]=new Coche(marcas[contador],anyo[contador]);
            }


            contador++;
            opcion=JOptionPane.showOptionDialog(null,"Desea continuar ingresando datos",null,0,0,null,opciones,opciones[0]);

        }while(contador==20 || opcion!=1);

        for (int i=0;i<contador;i++)
        {
            JOptionPane.showMessageDialog(null,usuario[i]);
        }


    }

    public static int validar (String modelo,int anyo){

        int dato;
        if (modelo.length()!=0 && anyo!=0)
        {
            dato=0;
        }
        else
        {
            if (modelo.length()!=0 && anyo==0)
            {
                dato=1;
            }
            else
            {
                if (modelo.length()==0 && anyo==0)
                {
                    dato=2;
                }
                else
                {
                    dato=3;
                }
            }
        }
        return dato;
    }
}
