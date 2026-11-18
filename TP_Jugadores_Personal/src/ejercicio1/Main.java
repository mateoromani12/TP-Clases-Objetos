
package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Juan");
        Jugador jugador2 = new Jugador("Pedro");

        System.out.println("Datos iniciales:");

        System.out.println(jugador1.getNombre() + " - Nivel: "
                + jugador1.getNivel() + " - Puntos: "
                + jugador1.getPuntos());

        System.out.println(jugador2.getNombre() + " - Nivel: "
                + jugador2.getNivel() + " - Puntos: "
                + jugador2.getPuntos());

        jugador1.ganarPuntos(100);
        jugador2.ganarPuntos(50);

        jugador1.ganarPuntos(-20);

        jugador1.subirNivel();

        System.out.println("Datos finales:");

        System.out.println(jugador1.getNombre() + " - Nivel: "
                + jugador1.getNivel() + " - Puntos: "
                + jugador1.getPuntos());

        System.out.println(jugador2.getNombre() + " - Nivel: "
                + jugador2.getNivel() + " - Puntos: "
                + jugador2.getPuntos());
    }
}
