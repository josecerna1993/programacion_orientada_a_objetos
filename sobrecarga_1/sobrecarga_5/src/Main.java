import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int cont=0;
        Persona usuario=new Persona();
        do {
            String nombre= Persona.validarPersona("Ingrese su nombre");
            String apellido=Persona.validarPersona("Ingrese su apellido");
            int edad=Persona.validarPersonaEdad("Ingrese su edad");
            String genero= Persona.validarPersona("Ingrese su genero");
            cont++;
            usuario=new Persona(nombre,apellido,edad,genero);

        }while (cont!=2);

        JOptionPane.showMessageDialog(null,usuario);


    }
}
