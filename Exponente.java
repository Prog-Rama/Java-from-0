import java.util.Scanner;

public class Exponente {
    public static void main(String[] args) {

        int x;
        int y;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        x = entrada.nextInt();
        System.out.print("Ingrese el exponente: ");
        y = entrada.nextInt();

        double a = Math.pow(x,y);

        System.out.println(x + " elevado a la " + y + " da como resultado " + a);

    }
}
