import java.util.Scanner;

public class PerfilesAlumFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int j, apto = 0, noApto = 0;
        double longi;
        System.out.println("Cantidad de piezas del lote: ");
        j = entrada.nextInt();

        for (int i = 0;i < j;i++){
            System.out.println("Longiut de la pieza: (" + i + "/" + j +")");
            longi = entrada.nextDouble();
            if (longi >= 1.20 && longi <= 1.30){
                apto++;
            }
            else{
                noApto++;
            }
        }
        System.out.println("En el lote de " + j + " piezas hay " + apto + " piezas aptas y " + noApto + " piezas no aptas.");
    }
}
