package Entidades05;

/**
 *
 * @author NeuenMartinez
 */
public class Cuenta {

    private int NumeroCuenta;
    private String DNI;
    private double Saldo;

    public Cuenta() {
    }

    public Cuenta(int NumeroCuenta, String DNI, double Saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.Saldo = Saldo;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

}
