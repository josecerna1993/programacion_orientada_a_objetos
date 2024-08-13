import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] confirmador={"Salir","Nuevo Ingreso"};
        int opcion;
        do{
            int numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero:","Contador de digitos",0));
            JOptionPane.showMessageDialog(null,"La cantidad de digitos es de "+contador(numero));
            opcion=JOptionPane.showOptionDialog(null,"Seleccionar una opcion","Confirmacion",0,0,null,confirmador,confirmador[0]);

        }while (opcion!=0);
        JOptionPane.showMessageDialog(null,"Gracias por visitarnos");

    }
    public static int contador(int numero){
        int cantidad_digitos=0;
        int dividendo=1;
        int resto=numero;
        while (dividendo!=0)
        {
            dividendo=resto/10;
            if (dividendo!=0)
            {
                cantidad_digitos++;
                resto=dividendo;
            }
            else {
                cantidad_digitos++;
            }
        }
        return cantidad_digitos;
    }
}
