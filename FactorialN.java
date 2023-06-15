import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("número: ");
        num = entrada.nextInt();

        for (int i = num; i >= 1; i--){
            fact = i*fact;
        }
        System.out.println(fact);
    }
}
