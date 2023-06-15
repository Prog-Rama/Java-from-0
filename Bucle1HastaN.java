import java.sql.SQLOutput;
import java.util.Scanner;

public class Bucle1HastaN {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num = 1;
        int limite;
        System.out.println("Ingrese el tope de la cuenta: ");
        limite = entrada.nextInt();

        while(num <= limite){
            System.out.println(num);
            num++;
        }
    }
}
