import java.util.Scanner;

public class SumaStrings {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String s1;
        String s2;

        System.out.println("Primer cadena: ");
        s1 = entrada.next();
        System.out.println("Segunda cadena: ");
        s2 = entrada.next();

        System.out.println("Su mensaje es: " + s1 + " " + s2);
    }
}
