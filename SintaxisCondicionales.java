import java.util.Scanner;

public class SintaxisCondicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char c1;

        System.out.println("¿A o B?");
        c1 = entrada.next().charAt(0);

        if (c1 == 'A'){
            System.out.print("Elegiste A");
        }
        else if (c1 == 'B') {
            System.out.print("Elegiste B");
        }
        else {
            System.out.println("No elegiste una opción válida. INCIANDO AUTODESTRUCCION");
        }
    }
}
