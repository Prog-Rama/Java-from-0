import java.util.Scanner;

public class OperacionesBasicas2Valores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Primer número: ");
        n1 = entrada.nextInt();
        System.out.println("Segundo número: ");
        n2= entrada.nextInt();

        System.out.println("La suma es: " + (n1+n2));
        System.out.println("La resta es: " + (n1-n2));
        System.out.println("La multiplicación es: " + (n1*n2));
        System.out.println("La división es: " + (n1/n2));
    }
}
