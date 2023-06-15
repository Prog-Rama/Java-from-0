import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        double a;
        System.out.print("Ingrese el n°: ");
        n = entrada.nextInt();
        a = Math.sqrt(n);
        System.out.println("La raíz de " + n + " es " + a);
    }
}
