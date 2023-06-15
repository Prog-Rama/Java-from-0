import java.util.Scanner;

public class LlenarArrayStringsScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombres[] = new String[5];

        for (int i = 0;i < nombres.length;i++){
            System.out.println("Nombre en la pos " + i);
            nombres[i] = entrada.next();
        }

        for (int i = 0; i < nombres.length;i++){
            System.out.println(nombres[i]);
        }

    }
}
