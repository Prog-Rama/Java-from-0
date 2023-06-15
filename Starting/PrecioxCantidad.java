import java.util.Scanner;

public class PrecioxCantidad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        double precio;
        int cantidad;

        System.out.print("Nombre del producto: ");
        nombre = entrada.next();
        System.out.print("Precio del producto: ");
        precio = entrada.nextDouble();
        System.out.print("Cantidad de productos: ");
        cantidad = entrada.nextInt();

        System.out.print("Llevando " + " " + cantidad + " " + nombre + " el precio final es " + (precio*cantidad));

    }
}
