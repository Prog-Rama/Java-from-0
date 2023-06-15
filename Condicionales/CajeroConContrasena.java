import java.util.Scanner;

public class CajeroConContrasena {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pass, sIni = 0, sFin, opcion, user, passDefault = 1234, passDefault2;

        System.out.println("Bienvenido, ¿qué desea hacer?");
        System.out.println("1. Ingresar");
        System.out.println("2. Salir");
        opcion = entrada.nextInt();

        while (opcion != 1 || opcion != 2) {

            //Menu principal

            if (opcion == 1) {
                System.out.println("1. Nuevo usuario");
                System.out.println("2. Usuario existente");
                user = entrada.nextInt();

                //Menu opcion 1

                if (user == 1) {
                    System.out.println("Genere una contraseña numérica nueva: ");
                    pass = entrada.nextInt();
                    System.out.println("Contraseña creada!");
                    System.out.println("Su contraseña es: " + pass);

                } else if (user == 2) {
                    System.out.println("Ingrese su contraseña: ");
                    passDefault2 = entrada.nextInt();
                    if (passDefault == passDefault2) {
                        System.out.println("Bienvenido.");
                        System.out.println("¿Qué desea hacer?");
                        System.out.println("1. Ingresar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Consultar saldo");
                        System.out.println("4. Salir");
                    }
                } else {
                    System.out.println("¡Ingrese una opción válida!");
                }

            }
        }
    }
}
