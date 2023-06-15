import java.util.Scanner;

public class JuegoAdivinarNumRandom {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int random = (int) (Math.random() * 51);
        int eleccion = 0;

        while (random != eleccion) {

            System.out.println("¿Qué número elegí?");
            eleccion = entrada.nextInt();

            if (eleccion == random) {
                System.out.println("¡Ganaste!");
            } else if (eleccion < random) {
                System.out.println("Más alto");
            } else {
                System.out.println("Más bajo");
            }
        }
    }
}