import java.util.Scanner;

public class CeroRompeBucleWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = 1;

        while (n!=0){
            System.out.println("Poné el número correcto: ");
            n = entrada.nextInt();
        }
        System.out.println("Era ese");
    }
}
