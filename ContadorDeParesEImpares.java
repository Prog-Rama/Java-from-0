import java.util.Scanner;

public class ContadorDeParesEImpares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, pares=0, impares=0, iterador=0;
        System.out.println("Números hasta: ");
        n= entrada.nextInt();

        while (iterador < n){
            iterador++;
            if (iterador % 2 ==0){
                pares++;
            }
            else{
                impares++;
            }
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}
