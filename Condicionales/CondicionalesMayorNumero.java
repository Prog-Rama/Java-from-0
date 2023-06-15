import java.util.Scanner;

public class CondicionalesMayorNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1;
        int n2;
        System.out.println("Ingrese el primer número");
        n1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("El mayor n° es: " + n1);
        }
        else if (n1 < n2){
            System.out.println("El mayor n° es: " + n2);
        }
        else {
            System.out.println("Los números son iguales");
        }

    }
}
