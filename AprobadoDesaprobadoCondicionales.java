import java.util.Scanner;

public class AprobadoDesaprobadoCondicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, promedio;

        System.out.print("Nota 1: ");
        n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        n2 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        n3 = entrada.nextDouble();

        promedio = (n1+n2+n3)/3;

        if (promedio >= 7){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Desaprobado");
        }

    }
}
