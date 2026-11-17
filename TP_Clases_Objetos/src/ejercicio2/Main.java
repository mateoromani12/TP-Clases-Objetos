
package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupery", 1943);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Anio: " + libro1.anio);

        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.titulo);
        System.out.println("Autor: " + libro2.autor);
        System.out.println("Anio: " + libro2.anio);
    }
}
