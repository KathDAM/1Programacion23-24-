package terceraev.avanzadoscolecciones.ej3;

import java.util.Calendar;

public class GestionPacientes {
     public static void main(String[] args) {
        Archivador archivador = new Archivador();

        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(1990, Calendar.MARCH, 15);
        FichaPaciente paciente1 = new FichaPaciente("Juan", "Jose", fecha1);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1985, Calendar.DECEMBER, 20);
        FichaPaciente paciente2 = new FichaPaciente("Marta", "Lopez", fecha2);

        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(1978, Calendar.JULY, 10);
        FichaPaciente paciente3 = new FichaPaciente("Pedro", "Ruiz", fecha3);

        archivador.guardarFicha(paciente1);
        archivador.guardarFicha(paciente2);
        archivador.guardarFicha(paciente3);

        archivador.imprimirFichas();

        archivador.eliminarFicha(0);

        archivador.eliminarFicha("Marta", "Lopez");

        archivador.imprimirFichas();
    }
}
