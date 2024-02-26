package segundaev.string.ejercicio4;

public class CaracteresFrase {
    public static void main(String[] args) {
        String frase1 = "Hoy es martes";
        String frase2 = "Hoy es lunes";

        if (frase1.length() < frase2.length()) {
            System.out.println("La frase más corta es '" + frase1 + "'");
        } else if (frase1.length() > frase2.length()) {
            System.out.println("La frase más corta es '" + frase2 + "'");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }   
    }
}
