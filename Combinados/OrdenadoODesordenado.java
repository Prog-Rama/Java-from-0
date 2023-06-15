import java.util.Scanner;

public class OrdenadoODesordenado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Cantidad de elementos: ");
        n = entrada.nextInt();
        int numeros[] = new int[n];
        boolean estanOrdenadosAsc = true;
        boolean estanOrdenadosDesc = true;

        for (int i = 0;i < numeros.length;i++){
            System.out.println("Elemento " + i);
            numeros[i]= entrada.nextInt();
        }
        for (int i = 0;i < numeros.length -1;i++){
            if (numeros[i] < numeros[i+1]){
                estanOrdenadosAsc = false;
            } else if (numeros[i] > numeros[i+1]) {
                estanOrdenadosDesc = false;
            }
            }
        if (estanOrdenadosAsc){
            System.out.println("Descendente");
        }
        else if (estanOrdenadosDesc){
            System.out.println("Ascendente");
        }
        else {
            System.out.println("Desordenado");
        }
        }
    }
