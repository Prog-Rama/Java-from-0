import java.util.Scanner;

public class SumaCaracteres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char c1, c2;
        String suma = "";

        System.out.print("Ingrese el primer caracter: ");
        c1 = entrada.next().charAt(0);
        System.out.print("Ingrese el segundo caracter: ");
        c2 = entrada.next().charAt(0);

        suma = String.valueOf(c1) + String.valueOf(c2);
        System.out.println("La suma es: " + suma);

    }
}
