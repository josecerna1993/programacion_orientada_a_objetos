import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String [] menuPrincipal={"Agregar Empresa-Departamento-Empleado","Buscar sueldo a pagar","Salir"};
        int opcionPrincipal;
        do {
            opcionPrincipal= JOptionPane.showOptionDialog(null,"Ingresa opcion",null,0,0,null,menuPrincipal,menuPrincipal[0]);
            switch (opcionPrincipal)
            {
                case 0:Empresa.ingresoDatosEmpresa("Ingrese el nombre de la empresa");
                       break;
                case 1: String []subMenu={"nombre del empleado","Departamento","empresa","salir"};
                        int opcionSubMenu;
                        do {
                            opcionSubMenu=JOptionPane.showOptionDialog(null,"ingrese opcion de busqueda",null,0,0,null,subMenu,subMenu[0]);
                            switch (opcionSubMenu)
                            {
                                case 0: String nombre=Empresa.ingresarDatos("ingrese el nombre a buscar");
                                        if (Empleado.buscardorEmpleado(nombre)){
                                            for (int i=0;i<Empleado.contador;i++){
                                                if (Empleado.usuarioEmpleado[i].getNombre().equals(nombre))
                                                {
                                                    JOptionPane.showMessageDialog(null,"El empleado "+Empleado.usuarioEmpleado[i].getNombre()+ "tiene un salario "+Empleado.usuarioEmpleado[i].getDepartamento().getEmpresa().calcularSueldo(Empleado.usuarioEmpleado[i]));
                                                }
                                            }
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null,"El nombre de empleado no existe");
                                        }
                                        break;
                                case 1: String nombreDepto=Empresa.ingresarDatos("ingrese el departamento a buscar");
                                        if (Departamento.buscarDepto(nombreDepto)){
                                            JOptionPane.showMessageDialog(null,"Acontinuacion se muestran los empleados en este Departamento y sus sueldos");
                                            for (int i=0;i<Empleado.contador;i++){
                                                if (Empleado.usuarioEmpleado[i].getDepartamento().getNombre().equals(nombreDepto))
                                                {
                                                    JOptionPane.showMessageDialog(null,"El empleado "+Empleado.usuarioEmpleado[i].toString()+"\n tiene sueldo "+Empleado.usuarioEmpleado[i].getDepartamento().getEmpresa().calcularSueldo(Empleado.usuarioEmpleado[i]));
                                                }
                                            }
                                        }
                                case 2: String nombreEmp=Empresa.ingresarDatos("ingrese la empresa a buscar");
                                        if (Empresa.buscarEmpresa(nombreEmp)){
                                            JOptionPane.showMessageDialog(null,"Acontinuacion se mostraran los empleados y sus sueldos en esta empresa");
                                            for (int i=0;i<Empleado.contador;i++)
                                            {
                                                if (Empleado.usuarioEmpleado[i].getDepartamento().getEmpresa().getNombre().equals(nombreEmp))
                                                {
                                                    JOptionPane.showMessageDialog(null,"El empleado "+Empleado.usuarioEmpleado[i].toString()+ "\n tiene sueldo "+Empleado.usuarioEmpleado[i].getDepartamento().getEmpresa().calcularSueldo(Empleado.usuarioEmpleado[i]));
                                                }
                                            }
                                        }
                            }
                        }while (opcionSubMenu!=3);

            }

        }while (opcionPrincipal!=2);
        


    }
}
