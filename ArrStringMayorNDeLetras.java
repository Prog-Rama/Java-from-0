import java.util.Scanner;

public class ArrStringMayorNDeLetras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombres[] = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: ");
            nombres[i] = entrada.next();
        }

        int mayor = nombres[0].length();
        int menor = nombres[0].length();
        String may = "";
        String min = "";


        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() > mayor){
                mayor = nombres[i].length();
                may = nombres[i];
            } else if (nombres[i].length() < menor) {
                menor = nombres[i].length();
                min = nombres[i];
            }
        }
        System.out.println("La palabra más larga es " + may + " con " + mayor + " letras.");
        System.out.println("La palabra más corta es " + min + " con " + menor + " letras.");
    }
}