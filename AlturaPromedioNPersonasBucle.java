import java.util.Scanner;

public class AlturaPromedioNPersonasBucle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int altura, n, promedio, iterador = 0, suma = 0;
        System.out.print("Cantidad de personas del conjunto: ");
        n = entrada.nextInt();

        while (iterador < n){
            System.out.println("Altura en cm: ");
            altura = entrada.nextInt();
            iterador++;
            suma += altura;
        }
        promedio = suma / n;
        System.out.println("La altura promedio es: " + promedio + "cm.");
    }
}
