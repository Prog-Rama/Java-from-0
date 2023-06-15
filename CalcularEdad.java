import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int anoActual = 2023;
        int anoNacimiento;
        System.out.println("Ingrese el año de su nacimiento: ");
        anoNacimiento = entrada.nextInt();
        System.out.print("La edad actual: " + (anoActual - anoNacimiento));
    }
}
