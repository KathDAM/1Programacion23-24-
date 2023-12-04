package ejerciciosopcionales;

public class PatronNumerico2 {
    public static void main(String[] args) {
        int filas = 9;

        for (int i = 1; i <= filas; i++) { // controla las filas
            for (int j = 1; j <= i; j++) { //imprime el número de la fila en cada columna, repitiéndolo según la fila correspondiente
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
