import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String [] nombre=new String[10];
        int [] edad=new int[10];
        String[] curso=new String[10];
        double[] promedio=new double[10];
        Alumno [] usuario=new Alumno[10];
        int cont=0,opcion;
        String ingreso_edad,ingreso_promedio;
        String [] opciones={"Si","No"};

        do {
            do {
                nombre[cont]= JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno");
                if (nombre[cont].length()==0)
                {
                    JOptionPane.showMessageDialog(null,"Ingrese un nombre valido porfavor");
                }
            }while (nombre[cont].length()==0);

            ingreso_edad=JOptionPane.showInputDialog(null,"Ingrese la edad del alumno");
            if (ingreso_edad.length()==0)
            {
                edad[cont]=0;
            }
            else {
                edad[cont]= Integer.parseInt(ingreso_edad);
            }

            curso[cont]=JOptionPane.showInputDialog(null,"Ingrese el curso del alumno");

            ingreso_promedio=JOptionPane.showInputDialog(null,"Ingrese el promedio del alumno");
            if (ingreso_promedio.length()==0)
            {
                promedio[cont]=11;
            }
            else {
                promedio[cont]= Double.parseDouble(ingreso_promedio);
            }
            switch (asignador(edad[cont],curso[cont],promedio[cont]))
            {
                case 0: usuario[cont]=new Alumno(nombre[cont],edad[cont],curso[cont],promedio[cont]);
                break;
                case 1: usuario[cont]=new Alumno(nombre[cont],edad[cont]);
                break;
                case 2: usuario[cont]=new Alumno(nombre[cont]);
            }
            cont++;
            opcion=JOptionPane.showOptionDialog(null,"Desea volver a ingresar un alumno",null,0,0,null,opciones,opciones[0]);

        }while (cont==10 || opcion!=1);

    }

    public static int asignador (int edad, String curso, double promedio){

        int valor;
        if (edad!=0 && curso.length()!=0 && promedio!=11)
        {
            valor=0;
        }
        else
        {
            if (edad!=0 && curso.length()==0 && promedio==11)
            {
                valor=1;
            }
            else valor=2;
        }
        return valor;
    }
}
