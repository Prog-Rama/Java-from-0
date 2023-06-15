import java.util.Scanner;

public class CompararStrings {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String s1, s2;

        System.out.println("Genere una contraseña: ");
        s1 = entrada.next();
        System.out.println("Confimar contraseña: ");
        s2 = entrada.next();

        if (s1.equals(s2)){
            System.out.println("¡Contraseña creada!");
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
