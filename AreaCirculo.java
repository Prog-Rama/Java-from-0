import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int r;
        double area;

        System.out.print("Ingrese el radio: ");
        r = entrada.nextInt();
        area = Math.PI *(Math.pow(r,2));
        System.out.print("El área es: " + area);
    }
}
