import java.util.Scanner;

public class MayorDe2Num {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingrese 2 números: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        System.out.print("El número mayor es: " + Math.max(n1,n2));
    }
}
