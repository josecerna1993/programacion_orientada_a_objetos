import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String validacion;
        String contrasenya= JOptionPane.showInputDialog(null,"Ingrese una contraseña, debe ser de 8 caracteres\n" +
                "mínimo una mayúscula, una minúscula y un numero");
        validacion=validar(contrasenya);
        switch (validacion)
        {
            case "false":
                JOptionPane.showMessageDialog(null,"La contraseña no cumple con los campos requeridos");
                break;
            default:
                JOptionPane.showMessageDialog(null,"La contraseña se acepto con exito");
        }

    }
    public static String validar (String contra){
        String confirmacion;
        if (contra.length()<8 || contra.length()>8)
        {
            confirmacion="false";
        }
        else {
            if (validar_mayusculas(contra)=="false")
            {
                confirmacion="false";
            }
            else {
                if (validar_miniscula(contra)=="false")
                {
                    confirmacion="false";
                }
                else
                {
                    if (validar_numero(contra)=="false")
                    {
                        confirmacion="false";
                    }
                    else
                        confirmacion="true";
                }
            }
        }
        return confirmacion;
    }
    public static String validar_mayusculas(String contra){
        int contador=0;
        String validacion;
        char caracter;
        for (int i=0;i<contra.length();i++)
        {
            caracter=contra.charAt(i);
            if(Character.isUpperCase(caracter)==true)
            {
                contador++;
            }
        }
        if (contador>=1)
        {
            validacion="true";
        }
        else
        {
            validacion="false";
        }
        return validacion;
    }
    public static String validar_miniscula(String contra){
        int contador=0;
        String validacion;
        char caracter;
        for (int i=0;i<contra.length();i++)
        {
            caracter=contra.charAt(i);
            if(Character.isLowerCase(caracter)==true)
            {
                contador++;
            }
        }
        if (contador>=1)
        {
            validacion="true";
        }
        else
        {
            validacion="false";
        }
        return validacion;
    }
    public static String validar_numero(String contra){
        int contador=0;
        String validacion;
        char caracter;
        for (int i=0;i<contra.length();i++)
        {
            caracter=contra.charAt(i);
            if(Character.isDigit(caracter)==true)
            {
                contador++;
            }
        }
        if (contador>=1)
        {
            validacion="true";
        }
        else
        {
            validacion="false";
        }
        return validacion;
    }
}
