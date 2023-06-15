import java.util.Scanner;

public class LongitudCadenas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String s1, s2;

        System.out.println("Ingrese ambas cadenas: ");
        s1 = entrada.next();
        s2 = entrada.next();

        int cadena1 = s1.length();
        int cadena2 = s2.length();


        if (cadena1 > cadena2){
            System.out.println("La cadena 1 es más larga: " + cadena1);
        }
        else {
        System.out.println("La cadena 2 es más larga: " + cadena2);
        }

    }
}
