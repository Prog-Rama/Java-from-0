import java.util.Scanner;

public class ConvertirMayusMinus {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char c1;

        System.out.print("Caracter: ");
        c1 = entrada.next().charAt(0);

        if (Character.isUpperCase(c1)){
            System.out.println(Character.toLowerCase(c1));
        }
        else if (Character.isLowerCase(c1)){
            System.out.println(Character.toUpperCase(c1));
        }
        else {
            System.out.println("k c yo man");
        }

    }
}
