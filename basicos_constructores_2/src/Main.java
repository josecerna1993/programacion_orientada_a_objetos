import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] nombre= new String[2];
        int [] duracion= new int[2];
        String[] calificacion=new String[2];
        String[] saga=new String[2];
        String[] opcion_1={"1 estrella","2 estrellas","3 estrellas","4 estrellas", "5 estrellas"};
        String[] opcion_2={"si","no"};
        String confirmacion;
        int contador=0;


        while(contador!=2){
            do {
                nombre[contador]=JOptionPane.showInputDialog(null,"Ingrese el nombre de la pelicula"+(contador+1));
                duracion[contador]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la duracion de la pelicula (MINUTOS)"));
                confirmacion=verificar(nombre[contador],duracion[contador]);
                if (confirmacion!="true")
                {
                    JOptionPane.showMessageDialog(null,confirmacion);
                }
            }while (confirmacion!="true");

            calificacion[contador]=(String)JOptionPane.showInputDialog(null,"Elija la calificacion",null,0,null,opcion_1,opcion_1[0]);
            saga[contador]= (String) JOptionPane.showInputDialog(null,"Pertenece a una Saga?",null,0,null,opcion_2,opcion_2[0]);
            contador++;
        }

        Pelicula pelicula_1=new Pelicula(nombre[0],duracion[0],calificacion[0],saga[0]);
        Pelicula pelicula_2=new Pelicula(nombre[1],duracion[1],calificacion[1],saga[1]);

        JOptionPane.showMessageDialog(null,pelicula_1);
        JOptionPane.showMessageDialog(null,pelicula_2);

    }

    public static String verificar(String nombre,int duracion){
          String retorno;
          if (nombre.length()<2)
          {
              retorno="El nombre es incorrecto";
          }
          else
          {
              if (duracion<=60)
              {
                  retorno="La duracion de la pelicula es incorrecta";
              }
              else {
                  retorno="true";
              }
          }
          return retorno;
    }
}
