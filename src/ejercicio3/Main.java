
package ejercicio3;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.modelo = "Corolla";
        auto1.color = "Blanco";

        Auto auto2 = new Auto();
        auto2.marca = "Ford";
        auto2.modelo = "Focus";
        auto2.color = "Negro";

        Auto auto3 = new Auto();
        auto3.marca = "Volkswagen";
        auto3.modelo = "Golf";
        auto3.color = "Blanco";

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}
