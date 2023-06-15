import java.util.Scanner;

public class SuperficieCuadrado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double lado;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextDouble();
        System.out.println("La superficie es: " + lado * lado);

    }
}
