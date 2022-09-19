/*
 * @author NeuenMartinez
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package POOej05;

import Entidades05.Cuenta;
import Servicios05.CuentaService;
import java.util.Scanner;

public class POOej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        CuentaService cs = new CuentaService();
        System.out.println("CREACION DE CUENTA:");
        System.out.println("==================");
        Cuenta c1 = cs.crearCuenta();
        do {
            System.out.println("MENU");
            System.out.println("==================");
            System.out.println("1- Ingresar dinero");
            System.out.println("2- Extraer dinero");
            System.out.println("3- Extraccion rapida");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Consultar Datos");
            System.out.println("6- Salir");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("¿Que cantidad de dinero desea ingresar?:");
                    cs.ingresar(leer.nextDouble(), c1);
                    break;
                case 2:
                    System.out.println("¿Que cantidad de dinero desea retirar?:");
                    cs.retiro(leer.nextDouble(), c1);
                    break;
                case 3:
                    System.out.println("Extrayendo el 20% de su saldo...");
                    cs.extraccionRapida(c1);
                    break;
                case 4:
                    cs.consultarSaldo(c1);
                    break;
                case 5:
                    cs.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.out.println("==================");
                    exit = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");

            }

        } while (exit == false);

    }
}
