import javax.swing.*;



public class Main {
    public static void main(String[] args) {

        int a=0;
        Empleado [] usuario=new Empleado[20];
        String[] opciones_menu={"buscar","modificar datos","cargar_datos","salir"};
        String[] opciones={"si","no"};
        int opcion;
        int opcion2;
        String busqueda;


        do {
            do {
                String nombre=Empleado.validarTexto("Ingrese su nombre");
                String puesto=Empleado.validarTexto("Ingrese su puesto");
                double salario=Empleado.valiidarNumeros("Ingrese su salario");
                usuario[a]=new Empleado(nombre,puesto,salario);
                opcion=JOptionPane.showOptionDialog(null,"Desea agregar mas datos","Opciones",0,0,null,opciones,opciones[0]);
            }while (opcion==0);
            opcion2=JOptionPane.showOptionDialog(null,"Ingrese opcion",null,0,0,null,opciones_menu,opciones_menu[0]);
            switch (opcion2)
            {
                case 0:
                    busqueda=Empleado.validarTexto("Ingrese nombre a buscar");
                    for (int i=0;i<a;i++)
                    {
                        if (busqueda != usuario[i].getNombre()) {
                            JOptionPane.showMessageDialog(null,"El usuario no esta cargado");
                        }

                        JOptionPane.showMessageDialog(null,"nombre "+usuario[i].getNombre());

                        usuario[i].entregarDatos();

                    }
                    break;



            }

            /*
            usuario[a].setNombre(nombre);
            usuario[a].setPuesto(puesto);
            usuario[a].setSalario(salario);*/
            a++;

        }while (a!=2);

        for (int i=0;i<2;i++)
        {
            JOptionPane.showMessageDialog(null,"nombre "+usuario[i].getNombre());
        }


    }
}
