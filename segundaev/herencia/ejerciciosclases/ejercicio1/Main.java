package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Examen examen1 = new Examen();
        Fecha fecha1 = new Fecha();
        
        examen1.nombre = "Matematicas";
        examen1.aula = 2;
        fecha1.fecha = 12/07/1998;
       // examen1.hora = 09:30;

        examen1.toString(); 
    }
}
