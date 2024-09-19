import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int cont=0;
        int opcion;
        String [] opciones={"Si","No"};
        String titulo []= new String[10];
        String autor[]=new String[10];
        double precio[]=new double[10];
        int anyo []=new  int[10];
        Libro [] usuario= new Libro[10];
        String ingreso_precio,ingreso_anyo;

        do {

            titulo[cont]=JOptionPane.showInputDialog(null,"Ingrese el titulo del libro");
            autor[cont]=JOptionPane.showInputDialog(null,"Ingrese el autor");
            ingreso_precio=JOptionPane.showInputDialog(null,"Ingrese el precio del libro");
            if (ingreso_precio.length()==0)
            {
                precio[cont]=0;
            }
            else
            {
                precio[cont]= Double.parseDouble(ingreso_precio);
            }
            ingreso_anyo= JOptionPane.showInputDialog(null,"Ingrese el año de publicacion");
            if (ingreso_anyo.length()==0)
            {
                anyo[cont]= 0;
            }
            else {
                anyo[cont]= Integer.parseInt(ingreso_anyo);
            }
            switch (valor_clase(titulo[cont],autor[cont],precio[cont],anyo[cont]))
            {
                case 0: usuario[cont]=new Libro(titulo[cont],autor[cont],precio[cont],anyo[cont]);
                break;
                case 1: usuario[cont]=new Libro(titulo[cont],autor[cont]);
                break;
                case 2: usuario[cont]=new Libro();
            }
            cont++;
            opcion=JOptionPane.showOptionDialog(null,"Desea cargar otro dato",null,0,0,null,opciones,opciones[0]);
        }while(cont==10 || opcion!=1);

        for (int i=0;i<cont;i++)
        {
            JOptionPane.showMessageDialog(null,usuario[i]);
        }


    }

    public static int valor_clase(String titulo,String autor,double precio,int anyo){
        int valor;
        if(titulo.length()!=0 && autor.length()!=0 && precio!=0 && anyo!=0)
        {
            valor=0;
        }
        else {
            if (titulo.length()!=0 && autor.length()!=0 && precio==0 && anyo==0)
            {
                valor=1;
            }
            else
                valor=2;
        }
        return valor;
    }

}
