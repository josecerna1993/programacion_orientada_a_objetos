import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String confirmacion;

        String [] titulares= new String[2];
        double [] saldos= new double[2];
        int contador=0;
        while (contador!=2)
        {
            do {
                titulares[contador]=JOptionPane.showInputDialog(null,"Ingrese el nombre del titular "+(contador+1));
                saldos[contador]= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el saldo"));
                confirmacion=verificar(titulares[contador],saldos[contador]);
                if (confirmacion!="true")
                {
                    JOptionPane.showMessageDialog(null,confirmacion);
                }
            }while (confirmacion!="true");
           contador++;
        }
        Cuenta cuenta_1= new Cuenta(titulares[0],saldos[0]);
        Cuenta cuenta_2= new Cuenta(titulares[1],saldos[1]);
        JOptionPane.showMessageDialog(null,cuenta_1);
        JOptionPane.showMessageDialog(null,cuenta_2);

    }
    public static String verificar (String nombre, double cantidad)
    {
        String [] error={"El nombre del titular es errado","El numero ingresado no puede ser cero o mayor a un millon","true"};
        String confirmacion;
        if (nombre.length()<3)
        {
            confirmacion=error[0];
        }
        else {
            if (cantidad<=0 || cantidad>=1000000)
            {
                confirmacion=error[1];
            }
            else
            {
                confirmacion=error[2];
            }
        }

        return confirmacion;

    }
}
