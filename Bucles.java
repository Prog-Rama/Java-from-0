public class Bucles {
    public static void main(String[] args) {

        /* BUCLE WHILE

            while(condicion){
                instrucciones
            }
         */

        int numero = 0;

        while (numero < 5){
            System.out.println(numero);
            // Incremento en 1
            numero++;
        }

        /* BUCLE FOR

        for(int i= 0; condicion; i++){
            instrucciones
            }
         */

        //i empieza de 0, condicion mientras sea menor a 5, el iterador aumenta de 1 a 1
        // si pusiera al final i+=2 lo imprime de 2 en 2
        for(int i = 0; i < 5;i++) {
            System.out.println("iterador" + i);

            /*
            Bucle DO WHILE

            do{
                instrucciones
                }while(condicion);
             */
            int DoI = 0;
            do{
                System.out.println("Do while" + DoI);
                DoI++;
            }while(DoI<5);
        }
        }
    }
