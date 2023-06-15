import java.util.Scanner;

public class MayorYmenorElementoArray {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("cantidad de elementos en el conjunto: ");
        n = entrada.nextInt();
        int num[] = new int[n];


        for (int i = 0;i < num.length; i++){
            num[i]= entrada.nextInt();
        }

        int mayor = num[0];
        int menor = num[0];

        for (int i = 0; i < num.length; i++){
            if (num[i] > mayor){
                mayor = num[i];
            }
            else if (num[i] < menor){
                menor = num[i];
            }
        }
        System.out.println("Serie: ");
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
