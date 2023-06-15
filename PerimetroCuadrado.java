import java.util.Scanner;

public class PerimetroCuadrado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextInt();
        System.out.println("El perímetro es: " + lado*4);
    }
}
