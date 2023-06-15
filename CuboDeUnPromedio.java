import java.util.Scanner;

public class CuboDeUnPromedio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;
        double promedio;
        System.out.println("Ingrese los 3 números uno a uno: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        promedio = (n1+n2+n3) / 3;
        System.out.println("El cubo del promedio: " + Math.pow(promedio,3));
    }
}
