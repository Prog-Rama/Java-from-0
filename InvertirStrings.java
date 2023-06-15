public class InvertirStrings {
    public static void main(String[] args) {

        String texto = "Hola mundo";
        String invertido = "";
        for (int i = texto.length() -1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        System.out.println(invertido);

    }
}
