package terceraev.ejemFILE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File4 {
    public static void main(String[] args) {

        BufferedInputStream bi = null;
        BufferedOutputStream bo = null; 

        try {
            String archivoEntrada = "/home/catalvman/Documents/U08 - Ejercicios avanzados.pdf";
            String archivoSalida = "/home/catalvman/Documents/U08 - Ejercicios avanzados_copia.pdf";

            bi = new BufferedInputStream(new FileInputStream(archivoEntrada));
            bo = new BufferedOutputStream(new FileOutputStream(archivoSalida));

            while (true) {
                int byte_ = bi.read();

                if (byte_ == -1) {
                    break;
                }
                bo.write(byte_);
            }
            System.out.println("Archivo copiado correctamente.");

        } catch(IOException e){
            System.out.println("Error de escritura del fichero ");
            System.out.println(e.getMessage());
        } finally{
            try {
                if (bo != null) {
                    bo.close();
                }
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


