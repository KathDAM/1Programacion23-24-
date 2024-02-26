package segundaev.string.ejercicio1;

public class Caracteres {
    public static void main(String[] args) {
        System.out.println("* Programa de caracteres Unicode *");
        for (int i = 0x0000; i <= 0xFFF; i++) {
            String formato = String.format("%04X", i);
            String caracter = Character.toString((char) i);
            System.out.println("Caracter " + caracter + "  \\u" + formato);
        }
    } 
}
