package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Examen examen1 = new Examen();
        Fecha fecha1 = new Fecha(1,5,2010);
        
        examen1.nombre = "Matematicas";
        examen1.aula = 2;

        examen1.toString(); 
        fecha1.toString();
    }
}
