import java.util.Scanner;

public class AreaTrapecio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double bMenor;
        double bMayor;
        double altura;
        double area;

        System.out.print("Base menor: ");
        bMenor = entrada.nextDouble();
        System.out.print("Base mayor: ");
        bMayor = entrada.nextDouble();
        System.out.print("Altura: ");
        altura = entrada.nextDouble();

        area = (altura*(bMayor*bMenor)/2);

        System.out.print("El área es: " + area);
    }
}
