
package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 30, 500000);

        System.out.println("Datos del empleado:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: $" + empleado1.getSalario());
    }
}
