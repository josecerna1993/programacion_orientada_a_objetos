public class Cuenta {
    //* atributos*//

    String titular;
    double saldo;

    //* constructor*//
    public Cuenta(String titular, double saldo){
        this.saldo=saldo;
        this.titular=titular;
    }

    public String toString(){
        return "Cuenta [titular=" +titular+ ",S saldo=" +saldo+"]";
    }
}
