import java.util.Scanner;

public class ConectoresAndOr {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;

        System.out.println("Número: ");
        n1 = entrada.nextInt();

        // OR: ||    AND: &&
        if (n1 % 3 == 0 || n1 % 5 == 0) {
            System.out.println("SI");
        }
        else {
            System.out.println("NO");
        }
    }
}
