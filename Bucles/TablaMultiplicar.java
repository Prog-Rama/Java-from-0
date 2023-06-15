import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("¿De qué número querés la tabla papu? Mandala con confianza: ");
        n = entrada.nextInt();

        for (int i = 1;i<=12;i++){
            System.out.println(i + "x" + n + "=" + n*i);

        }

    }
}
