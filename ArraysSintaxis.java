public class ArraysSintaxis {
    public static void main(String[] args) {

        //una forma de arreglo
        int numeros[] = {1,2,3,4,5};


        for (int i = 0;i < numeros.length;i++) {
            System.out.println(numeros[i]);
        }


        //otra sintaxis
        int num[] = new int[4];
        num[0] = 6;
        num[1] = 7;
        num[2] = 8;
        num[3] = 9;

        System.out.println(num[2]);

        //Strings

        String nombres[] = new String[5];
        nombres[0] = "Rama";
        nombres[1] = "Karen";
        nombres[2] = "Javier";
        nombres[3] = "Camila";
        nombres[4] = "Lola";

        for (int i=0; i < nombres.length;i++){
            System.out.println(nombres[i]);
        }
    }
}
