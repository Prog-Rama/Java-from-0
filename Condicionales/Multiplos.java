import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;

        System.out.print("Ingrese su número: ");
        n1 = entrada.nextInt();
        if (n1 % 4 == 0){
            System.out.println("Es múltiplo de 4");
        }
        else {
            System.out.println("no es :c");
        }
    }
}
