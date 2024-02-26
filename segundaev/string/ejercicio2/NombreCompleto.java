package segundaev.string.ejercicio2;

public class NombreCompleto {
    public static void main(String[] args) {
        String nombre = "Catherine";
        String apellido1 = "Alventosa";
        String apellido2 = "Manyewu";

        String nombreCompleto = (nombre + " " + apellido1 + " " + apellido2);

        System.out.println("La longitud de la cadena es " + nombreCompleto.length());
    }
}
