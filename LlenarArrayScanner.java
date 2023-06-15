import java.util.Scanner;

public class LlenarArrayScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int array[] = new int[5];
        int valor;

        for (int i = 0;i < array.length;i++){
            System.out.println("Digite un elemento en la pos " + i);
            array[i] = entrada.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
