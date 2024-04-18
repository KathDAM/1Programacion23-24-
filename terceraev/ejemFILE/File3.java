package terceraev.ejemFILE;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File3 {
    public static void main(String[] args) {
        String nombreFichero = "nuevo.txt";
        String texto = "Texto de prueba";
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(nombreFichero));
            bw.write(texto);
            bw.newLine();
        } catch(Exception e){
            System.out.println("Error de escritura del fichero ");
            System.out.println(e.getMessage());
        } finally{
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero ");
                System.out.println(e.getMessage());
            }
        }
    }
}
