import java.util.Scanner;

public class ContarNotasMayores7Bucle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nota, aprobado=0, desaprobado=0;

        for (int i = 0; i <= 10;i++){
            System.out.println("Nota (" + i + "/10): ");
            nota = entrada.nextInt();
            if (nota < 7){
                desaprobado++;
            }
            else {
                aprobado++;
            }
        }
        System.out.println("Aprobados: " + aprobado);
        System.out.println("Desaprobados: " + desaprobado);
    }
}
