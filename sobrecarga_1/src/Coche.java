public class Coche {
     String marca;
     String modelo;
     int anyo;

     public Coche(String a,String b,int c)
     {
         this.marca=a;
         this.modelo=b;
         this.anyo =c;
     }
     public Coche(String a,String b)
     {
         this.marca=a;
         this.modelo=b;
         this.anyo=2024;
     }
     public Coche(String a)
     {
         this.marca=a;
         this.modelo="Desconocido";
         this.anyo=2024;
     }
     public  Coche(String a,int b)
     {
         this.marca=a;
         this.modelo="Desconocido";
         this.anyo=b;
     }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                '}';
    }
}
