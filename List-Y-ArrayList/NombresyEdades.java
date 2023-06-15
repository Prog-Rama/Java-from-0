import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NombresyEdades {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombres[] = new String[5];
        int edades[] = new int[5];
        List<String> mayores = new ArrayList<>();

        for (int i = 0;i< nombres.length;i++){
            System.out.println("Nombre: ");
            nombres[i] = entrada.next();
            System.out.println("Edad: ");
            edades[i] = entrada.nextInt();
        }
        for (int i = 0;i < nombres.length;i++){
            if (edades[i] >= 18){
                mayores.add(nombres[i]);
            }
        }
        System.out.println("Las personas mayores de edad son: ");
        for (int i = 0; i<mayores.size();i++){
            System.out.println(mayores.get(i));
        }
    }
}
