import java.util.Scanner;

public class Mayor3NumCond {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Primer num: ");
        n1 = entrada.nextInt();
        System.out.println("Segundo num: ");
        n2 = entrada.nextInt();
        System.out.println("Tercer num: ");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.print("El mayor es: " + n1);
        }
        else if (n2 > n1 && n2 > n3){
            System.out.print("El mayor es: " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.print("El mayor es: " + n3);
        }
        else {
            System.out.println("Los números mayores son iguales");
        }
    }
}
