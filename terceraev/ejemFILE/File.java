package terceraev.ejemFILE;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
    public File(String string) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        
    String nombreFichero = "prueba.txt";
    FileReader fr = null;
    
    try {
        fr = new FileReader(nombreFichero);
        int caract = fr.read();
        while (caract != -1) {
            System.out.println((char) caract);
            caract = fr.read();
        }
    } catch(FileNotFoundException e){
        System.out.println("Error: Fichero no encontrado");
    } catch(Exception e){
        System.out.println("Error de lectura del fichero ");
        System.out.println(e.getMessage());
    }finally{
        try {
            if (fr != null) {
                fr.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar el fichero ");
            System.out.println(e.getMessage());
        }
    }
    

    }

    public void renameTo(File file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renameTo'");
    }
}
