import java.util.Scanner;

public class Calculadora2Nums {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, suma, resta, multi, opcion;
        double div, raiz, exp, porcentaje, raiz3;

        System.out.println("---------------------------");
        System.out.println("Bienvenido a la calculadora");
        System.out.println("---------------------------");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Raiz Cuadrada");
        System.out.println("6. Raiz Cúbica");
        System.out.println("7. Elevar al explonente");
        System.out.println("8. Porcentaje");
        System.out.println("9. Salir");
        opcion = entrada.nextInt();
        System.out.println("Ingrese dos números uno después de otro: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        if (opcion == 1){
            suma = n1 + n2;
            System.out.println("La suma da: " + suma);
        } else if (opcion == 2){
            resta = n1 - n2;
            System.out.println("La resta da: " + resta);
        }
        else if (opcion == 3){
            multi = n1 * n2;
            System.out.println("La multiplicación da: " + multi);
        }
        else if (opcion == 4){
            div = n1 / n2;
            System.out.println("La división da: " + div);
        }
        else if (opcion == 5){
            raiz = Math.sqrt(n1);
            System.out.println("La raiz de " + n1 + " da " + raiz);
        }
        else if (opcion == 6){
            resta = n1 - n2;
            System.out.println("La resta da: " + resta);
        }
    }
}
