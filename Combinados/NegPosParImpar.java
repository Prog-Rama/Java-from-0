import java.util.Scanner;

public class NegPosParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num[] = new int[10];
        int neg = 0, pos = 0, par = 0, impar = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Numeros: ");
            num[i] = entrada.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                neg++;
                if (num[i] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            } else if (num[i] > 0) {
                pos++;
                if (num[i] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares:  " + impar);
        System.out.println("Positivos:  " + pos);
        System.out.println("Negativos: " + neg);
    }
}
