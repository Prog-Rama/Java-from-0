import java.util.Scanner;

public class CargaValoresBucle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1 , suma = 0, i=0, promedio;

        while(i<=10){
            System.out.println("Ingrese un valor (" + i + "/10): ");
            n1 = entrada.nextInt();
            suma += n1;
            i++;
        }
        promedio = suma / 10;
        System.out.println("Promedio: " + promedio);

    }
}
