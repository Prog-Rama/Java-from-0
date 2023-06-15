import java.util.Scanner;

public class EjerciciosArraysPromedioAlturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double alturas[] = new double[5];
        double promedio = 0;
        int mayor = 0, menor = 0;

        for (int i = 0;i < alturas.length;i++){
            System.out.println("Altura ["+i+"]: ");
            alturas[i] = entrada.nextDouble();
            promedio += alturas[i];
        }

        promedio = promedio /5;
        System.out.println("Promedio: " + promedio);

        for (int i = 0; i < alturas.length;i++){
            if (alturas[i] > promedio){
                mayor++;
            }
            else {
                menor++;
            }
        }
        System.out.println("Alturas mayores del promedio: " + mayor);
        System.out.println("Alturas menores al promedio: " + menor);


    }
}
