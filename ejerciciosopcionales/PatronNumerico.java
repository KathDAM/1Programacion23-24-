package ejerciciosopcionales;

public class PatronNumerico {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(i);
            }
        }
    }
}
