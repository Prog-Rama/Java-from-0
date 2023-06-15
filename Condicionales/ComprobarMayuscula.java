import java.util.Scanner;

public class ComprobarMayuscula {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char c1;

        System.out.print("Ingrese un caracter: ");
        c1 = entrada.next().charAt(0);

        if (Character.isUpperCase(c1)){
            System.out.println("Es mayúscula");
        }
        else {
            System.out.println("Minúscula");
        }
    }
}
