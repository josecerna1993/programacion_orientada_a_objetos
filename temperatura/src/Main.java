import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] grados = {"Celsius" , "Kelvin" , "Fahrenheit" ,"Salir" };
        int opcion;
        do {
            opcion=JOptionPane.showOptionDialog(null,"Seleccione el tipo de grados que ingresara","Ingreso de grados",0,0,null,grados,grados[0]);
            switch (opcion)
            {
                case 0:
                    JOptionPane.showMessageDialog(null,"La conversion seria de "+String.format("%.2f",convertirdor_kelvin_fahrenheit()));
                    break;
                case  1:
                    JOptionPane.showMessageDialog(null,"La conversion seria de "+String.format("%.2f",convertidor_celsius_fahrenheit()));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"La conversion seria de "+String.format("%.2f",convertidor_celsius_kelvin()));
                    break;
            }
        }while (opcion!=3);

    }
    public static double convertirdor_kelvin_fahrenheit (){
        String [] grados ={"Kelvin","Fahrenheit"};
        double celcius= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese los grados Celsius: "));
        int opcion;
        double resultado;
        opcion=JOptionPane.showOptionDialog(null,"Seleccionar a que grados se convertira","Convertir",0,0,null,grados,grados[0]);
        if (opcion==0)
        {
            resultado=celcius+273;
        }
        else
        {
            resultado=((9*celcius)/5)+32;
        }
        return resultado;
    }
    public  static double convertidor_celsius_fahrenheit(){
        String [] grados={"Celsius","Fahrenheit"};
        double kelvin= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese los grados Kelvin: "));
        int opcion;
        double resultado;
        opcion=JOptionPane.showOptionDialog(null,"Seleccionar a que grado desea convertir","Convertidor",0,0,null,grados,grados[0]);
        if (opcion==0)
        {
            resultado=kelvin-273;
        }
        else {
            resultado=(9/5)*(kelvin-273)+32;
        }
        return resultado;
    }
    public  static double convertidor_celsius_kelvin(){
        String [] grados={"Celsius","Kelvin"};
        double fahrenheit= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese los grados Fahrenheit"));
        int opcion;
        double resultado;
        opcion=JOptionPane.showOptionDialog(null,"Seleccionar a que grado desea convertir","Convertidor",0,0,null,grados,grados[0]);
        if (opcion==0)
        {
            resultado=(5/9)*(fahrenheit+32);
        }
        else
        {
            resultado=(5/9)*(fahrenheit+32)+273;
        }
        return resultado;
    }
}
