import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] datos = new int[3];
        String [] seleciones={"Salir","Nueva Solicitud"};
        int opcion;
        do {
            datos[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus ingresos anuales(12meses): ", "Validar Prestamo", 0));

            datos[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a solicitar", "Solicitud de prestamo", 0));

            datos[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el plazo en meses a pagar", "Solicitud de Prestamo", 0));

            switch (validar(datos))
            {
                case "falso_ingresos":
                    JOptionPane.showMessageDialog(null,"Lo sentimos su solicitud no pudo se validad error en sus ingresos","ERROR",0);
                    break;
                case "falso_monto":
                    JOptionPane.showMessageDialog(null,"Lo sentimos el monto ingresado supera el limite que se le puede ofrecer","ERROR",0);
                    break;
                case "falso_plazo":
                    JOptionPane.showMessageDialog(null,"Lo sentimos el plazo ingresado no es acorde a la solicitud","ERORR",0);
                    break;
                case "validado":
                    JOptionPane.showMessageDialog(null,"Felicidades su solicitud fue recibida");
            }
            opcion=JOptionPane.showOptionDialog(null,"Seleccione opcion",null,0,0,null,seleciones,seleciones[0]);
        }while (opcion!=0);


    }

    public static String validar (int [] datos){
         String confirmacion;
         if (datos[0]<=0)
         {
             confirmacion="falso_ingresos";
         }
         else
         {
             if (datos[1]>(10*datos[0]))
             {
                 confirmacion="falso_monto";
             }
             else
             {
                 if (datos[2]<6 || datos[2]>360)
                 {
                     confirmacion="falso_plazo";
                 }
                 else
                 {
                     confirmacion="validado";
                 }
             }
         }
         return confirmacion;
    }
}
