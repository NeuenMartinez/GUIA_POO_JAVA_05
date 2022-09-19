package Servicios05;

import Entidades05.Cuenta;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class CuentaService {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat df = new DecimalFormat("#.00");

    public Cuenta crearCuenta() {
        System.out.println("Ingresar Numero de Cuenta:");
        int NumeroCuenta = leer.nextInt();
        System.out.println("Ingresar su DNI:");
        String DNI = leer.next();
        System.out.println("Ingresar su Saldo:");
        int Saldo = leer.nextInt();
        return new Cuenta(NumeroCuenta, DNI, Saldo);
    }

    public Cuenta ingresar(double ingreso, Cuenta c1) {
        c1.setSaldo(c1.getSaldo() + ingreso);
        return c1;
    }

    public Cuenta retiro(double retiro, Cuenta c1) {
        if (retiro > c1.getSaldo()) {
            c1.setSaldo(0);
            return c1;
        } else {
            c1.setSaldo(c1.getSaldo() - retiro);
            return c1;
        }
    }

    public Cuenta extraccionRapida(Cuenta c1) {
        c1.setSaldo(c1.getSaldo() - (c1.getSaldo() * 0.20));
        return c1;
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Su saldo es: " + c1.getSaldo() + "$");
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println("NumeroCuenta =" + c1.getNumeroCuenta() + ", DNI =" + c1.getDNI() + ", Saldo =" + c1.getSaldo());
    }
}
