
package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Docente docente1 = new Docente("Maria", 35, "Matematica");
        Preceptor preceptor1 = new Preceptor("Carlos", 40, "5to 3ra");

        System.out.println("Datos del docente:");
        docente1.mostrarInformacion();

        System.out.println("Datos del preceptor:");
        preceptor1.mostrarInformacion();

        docente1.setEdad(36);

        System.out.println("Datos del docente actualizados:");
        docente1.mostrarInformacion();

        docente1.setEdad(-5);

        System.out.println("Datos despues de intentar edad negativa:");
        docente1.mostrarInformacion();
    }
}
