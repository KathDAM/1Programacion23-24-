package terceraev.ejemFILE;
import java.io.File;
import java.util.Scanner;

public class ManejoFile {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.println("Dime que archivo quieres buscar: ");
        String nombreArchivo = lect.nextLine();

        System.out.println("¿En que ruta esta el archivo?: ");
        String rutaDirectorio = lect.nextLine();

        System.out.println("Buscando...");
    
        File directorio = new File(nombreArchivo);
        if (directorio.exists()) {
            System.out.println("El archivo no existe");
            for (int i = 0; i < lista.length; i++) {
                File f = new File(rutaDirectorio + lista[i]);
                System.out.println("Nombre: " + f.getName());
                System.out.println("Tamaño: " + f.length());
            }
        } else {
            System.out.println("El directorio especificado no existe o no es accesible.");
        }
        lect.close();
    }
}


        // String nombreArchivo = "MiFile.txt"; 
        // String rutaDirectorio = "/home/catalvman/Baixades/MiFile.txt";