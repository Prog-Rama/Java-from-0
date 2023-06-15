import java.util.Scanner;

public class CalcMenuBucles {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int n1,n2, opt;

        System.out.println("Bienvenido, ¿Qué desea hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        opt = entrada.nextInt();

        while (opt != 5){
            switch (opt) {
                case 1:
                    System.out.println("Primer número: ");
                    n1 = entrada.nextInt();
                    System.out.println("Segundo número: ");
                    n2 = entrada.nextInt();
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Primer número: ");
                    n1 = entrada.nextInt();
                    System.out.println("Segundo número: ");
                    n2 = entrada.nextInt();
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Primer número: ");
                    n1 = entrada.nextInt();
                    System.out.println("Segundo número: ");
                    n2 = entrada.nextInt();
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Primer número: ");
                    n1 = entrada.nextInt();
                    System.out.println("Segundo número: ");
                    n2 = entrada.nextInt();
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
            }
            System.out.println("Bienvenido, ¿Qué desea hacer?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opt = entrada.nextInt();
            }
        System.out.println("Adios!");
        }
    }
