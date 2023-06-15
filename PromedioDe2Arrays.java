import java.util.Scanner;

public class PromedioDe2Arrays {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[5];
        double prom1=0, prom2=0;

        for (int i = 0;i < array1.length;i++){
            System.out.println("Valor arr1: ");
            array1[i] = entrada.nextInt();
            prom1 += array1[i];
        }
        for (int i = 0;i < array2.length;i++){
            System.out.println("Valor arr2: ");
            array2[i] = entrada.nextInt();
            prom2 += array2[i];
        }
        prom1 = prom1 / 5;
        prom2 = prom2 / 5;
        System.out.println("Promedio 1: " + prom1);
        System.out.println("Promedio 2: " + prom2);

        if (prom1 > prom2){
            System.out.println("El promedio 1 es mayor: " + prom1);
        }
        else {
            System.out.println("El promedio 2 es mayor" + prom2);
        }

    }
}
