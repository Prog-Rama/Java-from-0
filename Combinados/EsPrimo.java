import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        boolean esPrimo = true;
        System.out.println("Número: ");
        num = entrada.nextInt();

        for (int i = 2; i < num ; i++){
            if (num % i ==0){
                esPrimo = false;
                break;
            }
        }
        if (esPrimo){
            System.out.println("Es primo");
        }
        else {
            System.out.println("No es primo");
        }
    }
}
