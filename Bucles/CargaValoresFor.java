import java.util.Scanner;

public class CargaValoresFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, mult = 1;

        for (int i=0;i <=10;i++){
            System.out.println("Numero (" + i + "/10): ");
            num = entrada.nextInt();
            mult = num * mult;
        }
        System.out.println("Multiplicación: " + mult);
    }
}
