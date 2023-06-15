import java.util.ArrayList;
import java.util.Scanner;

public class ArraySepararParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaPares = new ArrayList<>();
        ArrayList<Integer> listaImpares = new ArrayList<>();
        int n;
        System.out.println("Cantidad de elementos en la lista: ");
        n = entrada.nextInt();

        for (int i = 0;i < n; i++){
            System.out.println("Dato para la lista: ");
            lista.add(entrada.nextInt());
        }

        for (int i = 0;i < lista.size();i++){
            if (lista.get(i) % 2 == 0){
                listaPares.add(lista.get(i));
            } else {
                listaImpares.add(lista.get(i));
            }
        }

        System.out.println("Lista completa: ");
        for (int i = 0;i < lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("Lista pares: ");
        for (int i = 0;i < listaPares.size();i++){
            System.out.println(listaPares.get(i));
        }
        System.out.println("Lista impar: ");
        for (int i = 0;i < listaImpares.size();i++){
            System.out.println(listaImpares.get(i));
        }
    }
}
