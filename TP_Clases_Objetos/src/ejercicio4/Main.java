
package ejercicio4;

public class Main {
    public static void main(String[] args) {

        CuentaBncaria cuenta = new CuentaBncaria();

        cuenta.setSaldo(15000);

        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.setSaldo(20000);

        System.out.println("Saldo actualizado: $" + cuenta.getSaldo());
    }
}
