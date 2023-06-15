import java.util.ArrayList;
import java.util.Scanner;

public class InvertirArreglo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanoLista;
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Tamaño de la lista: ");
        tamanoLista = entrada.nextInt();

        for (int i = 0;i < tamanoLista;i++){
            System.out.println("Elementos de la lista: ");
            lista.add(entrada.nextInt());
        }

        for (int i = tamanoLista -1;i >= 0 ;i--){
            System.out.println(lista.get(i));
        }
    }
}
