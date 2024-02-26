package segundaev.string.ejercicio3;

public class NombreCompleto2 {
    public static void main(String[] args) {
        String nombre = "Catherine";
        String apellido1 = "Alventosa";
        String apellido2 = "Manyewu";

        String nombreCompleto = (nombre + " " + apellido1 + " " + apellido2);

        System.out.println("La longitud de la cadena es " + nombreCompleto.length());
        System.out.println("La primera letra del nombre es " + nombre.substring(0,1));
        System.out.println("La tres últimas letras del nombre completo es " + nombreCompleto.substring(24,27)); // nombreCompleto.substring(nombreCompleto.length() - 3))
        System.out.println("El primer espacio se encuentra en la posición " + nombreCompleto.indexOf(" "));
        System.out.println("El segundo espacio se encuentra en la posición " + nombreCompleto.indexOf(" ", nombreCompleto.indexOf(" ") + 1));
    }
}
