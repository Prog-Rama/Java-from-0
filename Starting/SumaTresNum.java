import java.util.Scanner;

public class SumaTresNum {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.print("Primer número: ");
        n1 = entrada.nextInt();
        System.out.print("Segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("Tercer número: ");
        n3 = entrada.nextInt();

        System.out.println("La suma de los números es: " + (n1+n2+n3));
    }
}
