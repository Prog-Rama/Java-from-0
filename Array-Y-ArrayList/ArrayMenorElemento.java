import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMenorElemento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int n;
        int elemento;
        int repetido = 0;
        System.out.println("Cantidad de elementos en la lista: ");
        n = entrada.nextInt();


        for (int i =0;i < n; i++){
            System.out.println("Elemento (" + i + "/" + n + "): ");
            lista.add(elemento = entrada.nextInt());
        }

        int menorElemento = lista.get(0);

        for (int i =0;i < lista.size() -1;i++) {
            if (lista.get(i) < menorElemento){
                menorElemento = lista.get(i);
            }
        }

        for (int i =0;i < lista.size();i++){
            if (menorElemento == lista.get(i)){
                repetido++;
            }
        }

        System.out.println("El elemento menor es: '" + menorElemento + "' el cual aparece " + repetido + " veces.");
    }
}
