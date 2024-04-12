package terceraev.avanzadoscolecciones.ej3;

import java.util.ArrayList;
import java.util.List;

public class Archivador {

    private List<FichaPaciente> fichas  = new ArrayList<>();

    public void guardarFicha(FichaPaciente paciente) {
        fichas.add(paciente);
    }

    // METODO ELIMINA POR POSICION
    public void eliminarFicha(int posicion) {
        if (posicion >= 0 && posicion < fichas.size()) {
            fichas.remove(posicion);
            System.out.println("Ficha eliminada correctamente.");
        } else {
            System.out.println("Posición inválida. No se pudo eliminar la ficha.");
        }
    }

    // METODO ELIMINA POR NOMBRE Y APELLIDO
    public void eliminarFicha(String nombre, String apellidos) {
        FichaPaciente pacienteAEliminar = null;
        for (int i = 0; i < fichas.size(); i++) {
            FichaPaciente paciente = fichas.get(i);
            if (paciente.getNombre().equals(nombre) && paciente.getApellidos().equals(apellidos)) {
                pacienteAEliminar = paciente;
                break;
            }
        }
        if (pacienteAEliminar != null) {
            fichas.remove(pacienteAEliminar);
            System.out.println("Ficha eliminada correctamente.");
        } else {
            System.out.println("No se encontró ninguna ficha con el nombre y apellidos proporcionados.");
        }
    }

    // METODO INFORMATIVO CANTIDAD FICHAS
    public void imprimirFichas() {
        System.out.println("Número de fichas guardadas: " + fichas.size());
        for (int i = 0; i < fichas.size(); i++) {
            System.out.println("Ficha " + (i + 1) + ": " + fichas.get(i));
        }
    }
}
