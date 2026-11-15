
package ejercicio3;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Rocky", 3, "Labrador");

        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Edad: " + perro1.getEdad());
        System.out.println("Raza: " + perro1.getRaza());

        perro1.ladrar();
    }
}
