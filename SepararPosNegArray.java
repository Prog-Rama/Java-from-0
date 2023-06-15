import java.util.ArrayList;
import java.util.Scanner;

public class SepararPosNegArray {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaPos = new ArrayList<>();
        ArrayList<Integer> listaNeg = new ArrayList<>();
        ArrayList<Integer> listaCero = new ArrayList<>();
        int n;

        System.out.println("Cantidad de elementos en la lista: ");
        n = entrada.nextInt();

        for (int i = 0;i < n;i++){
            System.out.println("Elemento: ");
            lista.add(entrada.nextInt());
        }

        for (int i = 0; i < lista.size();i++){
            if (lista.get(i) > 0){
                listaPos.add(lista.get(i));
            }
        }

        for (int i = 0; i < lista.size();i++){
            if (lista.get(i) < 0){
                listaNeg.add(lista.get(i));
            }
        }

        for (int i = 0; i < lista.size();i++){
            if (lista.get(i) == 0){
                listaCero.add(lista.get(i));
            }
        }

        System.out.println("Lista completa: ");
        for (int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
            }
        System.out.println("Lista positivos: ");
        for (int i = 0; i < listaPos.size();i++){
            System.out.println(listaPos.get(i));
            }
        System.out.println("Lista negativos: ");
        for (int i = 0; i < listaNeg.size();i++){
            System.out.println(listaNeg.get(i));
        }
        System.out.println("Lista cero: ");
        for (int i = 0; i < listaCero.size();i++){
            System.out.println(listaCero.get(i));
        }
    }
}
