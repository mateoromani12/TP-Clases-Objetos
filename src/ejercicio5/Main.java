
package ejercicio5;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();

        rectangulo.setBase(10);
        rectangulo.setAltura(5);

        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area: " + rectangulo.calcularArea());
    }
}
