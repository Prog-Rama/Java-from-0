import java.util.Scanner;

public class Va10lSuma5Bucle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int suma=0, n;

        for (int i = 1;i <= 10; i++){
            System.out.println("Num: (" + i + "/10): ");
            n = entrada.nextInt();
            if (i>5){
                suma +=n;
            }
        }
        System.out.println("La suma de los últimos 5 números es: " + suma);
    }
}
