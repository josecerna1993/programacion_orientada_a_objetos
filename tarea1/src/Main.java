import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Sumar", "Restar", "Multiplicación", "División", "Potencia", "Salir"};
        int opcion;
        String seleccionar;
       /* String elegido = (String) JOptionPane.showInputDialog(null, "Elija una opción", null, 0, null, opciones, opciones[0]);*/
        /*JOptionPane.showMessageDialog(null, elegido);*/
        do {
            seleccionar= (String) JOptionPane.showInputDialog(null,"Elija una opcion",null,0,null,opciones,opciones[0]);
            switch (seleccionar) {
                case "Sumar":
                    int cont = 0;
                    int cantidad_numero;
                    cantidad_numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese cantidada de numeros a sumar"));
                    int[] numero = new int[cantidad_numero];
                    for (int i=0;i<cantidad_numero;i++){
                        numero[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero:"));
                        cont++;
                    }
                    JOptionPane.showMessageDialog(null, "La suma es "+suma(numero,cantidad_numero));
                    break;
                case "Restar":
                    int primer_numero,segundo_numero;
                    primer_numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primer numero"));
                    segundo_numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primer numero"));
                    JOptionPane.showMessageDialog(null,"La resta es "+resta(primer_numero,segundo_numero));
                    break;
                case "Multiplicación":
                    int cont_multiplicacion=0;
                    int cantidad_numeros_multiplicar;
                    cantidad_numeros_multiplicar=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de numeros a multiplicar"));
                    int [] numeros_multiplicar=new int[cantidad_numeros_multiplicar];
                    for (int i=0;i<cantidad_numeros_multiplicar;i++)
                    {
                        numeros_multiplicar[cont_multiplicacion]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero:"));
                        cont_multiplicacion++;
                    }
                    JOptionPane.showMessageDialog(null,"La multiplicacion es "+multiplicar(numeros_multiplicar,cantidad_numeros_multiplicar));

                    break;
                case "División":

                    double dividendo= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero(dividendo)"));
                    double divisor=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero(divisor)"));
                    if (divisor!=0)
                    {
                        JOptionPane.showMessageDialog(null,"La division es de "+String.format("%.2f",dividir(dividendo,divisor)));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"La division no es posible resultado infinito");
                    }
                    break;
                case "Potencia":
                    double base= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la base de la potencia"));
                    double exponente=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el exponente"));
                    if (base==0 && exponente==0)
                    {
                        JOptionPane.showMessageDialog(null,"La potencia es infinita e indetenimada");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"La potencia es "+String.format("%.2f",potencia(base,exponente)));
                    }
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null,"Nos vemos pronto");
            }
        } while (seleccionar !="Salir");
    }

    public static int suma(int numeros[], int cantidad) {
        int resultado = 0;

        for (int i = 0; i < cantidad; i++) {
            resultado += numeros[i];
        }
        return resultado;
    }
    public static int resta(int numero_uno,int numero_dos){
        int resultado=numero_uno-numero_dos;
        return resultado;
    }
    public static int multiplicar (int numeros[], int cantidad){
        int resultado=1;
        for (int i=0;i<cantidad;i++)
        {
            resultado=numeros[i]*resultado;
        }
        return resultado;
    }
    public  static double dividir (double numero_uno,double numero_dos){
        double resultado=numero_uno/numero_dos;
        return resultado;
    }
    public  static double potencia (double numero_uno,double numero_dos){
        double resultado=Math.pow(numero_uno,numero_dos);
        return resultado;
    }
}

