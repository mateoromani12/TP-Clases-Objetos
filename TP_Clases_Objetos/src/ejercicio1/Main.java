
package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 20;

        Persona persona2 = new Persona();
        persona2.nombre = "Maria";
        persona2.edad = 25;

        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);

        System.out.println("Persona 2:");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);
    }
}
