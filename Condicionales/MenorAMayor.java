import java.util.Scanner;

public class MenorAMayor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Ingrese 3 números: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3){
            if (n2 > n3){
                System.out.println(Integer.toString(n1) + "-" + Integer.toString(n2) + "-" + Integer.toString(n3));
            }
            else{
                System.out.println(Integer.toString(n1) + "-" + Integer.toString(n3) + "-" + Integer.toString(n2));
            }
        }
        else if (n2 > n1 && n2 > n3){
            if (n1 > n3){
                System.out.println(Integer.toString(n2) + "-" + Integer.toString(n1) + "-" + Integer.toString(n3));
            }
            else {
                System.out.println(Integer.toString(n2) + "-" + Integer.toString(n3) + "-" + Integer.toString(n1));
            }
        }
        else if (n3 > n1 && n3 > n2){
            if (n1 > n2){
                System.out.println(Integer.toString(n3) + "-" + Integer.toString(n1) + "-" + Integer.toString(n2));
            }
            else {
                System.out.println(Integer.toString(n3) + "-" + Integer.toString(n2) + "-" + Integer.toString(n1));
            }
        }
        else {
            System.out.println("Los numeros son iguales");
        }
    }
}
