import java.util.Arrays;
import java.util.Random;

public class Producto {

    String nombre;
    double precio;
    int cantidad;
    int codigo;
    int [] codigo_array=new int[100];
    int cont=0;
    public Producto(String nombre,double precio, int cantidad)
    {
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        int cont2=0;
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
                this.codigo=numero;
            }
        }while (cont2!=0);

    }
    public Producto(String nombre,double precio)
    {
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=0;
        int cont2=0;
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
                this.codigo=numero;
            }
        }while (cont2!=0);

    }

    public Producto(String nombre)
    {
        this.nombre=nombre;
        this.precio=0;
        this.cantidad=0;
        int cont2=0;
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
                this.codigo=numero;
            }
        }while (cont2!=0);
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombre=" + nombre +
                ", ncantidad='" + cantidad + '\'' +
                ", precio=" + precio +
                ", codigo=" + codigo +
                '}';
    }
}
