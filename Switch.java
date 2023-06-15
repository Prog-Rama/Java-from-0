import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner nt = new Scanner(System.in);
        char c;

        System.out.print("A, B, C o D: ");
        c = nt.next().charAt(0);

        switch (c){
            case 'A':
                System.out.println("Elegiste A");
                break;
            case 'B':
                System.out.println("Elegiste B");
                break;
            case 'C':
                System.out.println("Elegiste C");
                break;
            case 'D':
                System.out.println("Elegiste D");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}
