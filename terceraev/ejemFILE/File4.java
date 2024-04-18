package terceraev.ejemFILE;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class File4 {
    public class File3 {
    public static void main(String[] args) {
        String nombreFichero = "nuevo.txt";
        String texto = "Texto de prueba";
        BufferedInputStream bi = null; //BufferedOutputStream

        try {
            bi = new BufferedInputStream(new FileWriter(nombreFichero));
            bi.write(texto);
            bi.newLine();
        } catch(Exception e){
            System.out.println("Error de escritura del fichero ");
            System.out.println(e.getMessage());
        } finally{
            try {
                if (bi != null) {
                    bi.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero ");
                System.out.println(e.getMessage());
            }
        }
    }
}

}
