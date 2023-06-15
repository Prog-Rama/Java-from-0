import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int sinicial = 1000, sactual = sinicial, opcion, cantidad;

        System.out.println("Bienvenido, ¿qué desea hacer?");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Cantidad a depositar: ");
            cantidad = entrada.nextInt();
            sactual = sinicial + cantidad;
            System.out.println("Nuevo saldo: " + sactual);
            sinicial = sactual;
        } else if (opcion == 2) {
            System.out.println("Cantidad a retirar");
            cantidad = entrada.nextInt();
            sactual = sinicial - cantidad;
            System.out.println("Retiraste " + cantidad);
            System.out.println("Nuevo saldo: " + sactual);
            sinicial = sactual;
        } else if (opcion == 3) {
            System.out.println("Su saldo es: " + sactual);

        }
    }
}
