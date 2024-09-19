import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        String []opciones={"Usuario nuevo","Buscar usuario","salir"};
        int opcion;
        int cont=0;

        do {
            opcion=JOptionPane.showOptionDialog(null,"Bienvenidos a Amigos Peludos",null,0,0,null,opciones,opciones[0]);
            switch (opcion){
                case 0:String nombre=Paciente.validarTexto("Ingrese el nombre del paciente");
                       String edad=Paciente.validarTexto("Ingrese la edad(semanas, meses o años)");
                       String razaEspecie=Paciente.validarTexto("Ingrese raza y/o especie");
                       String informe=Paciente.validarTexto("Ingrese el informe del paciente");
                       LocalDate fechaConsulta= Paciente.validarConsulta("Ingrese proxima fecha de consulta (AAAA-MM-DD)");

                       Paciente.cargarUsuario(nombre,edad,razaEspecie,fechaConsulta,informe);
                       Paciente.mostrarCodigoCarga(cont);
                       cont++;
                       break;
                case 1: int codigoBuscar= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de usuario"));
                       Paciente.buscarCliente(codigoBuscar);
            }

        }while (opcion!=2);

    }
}
