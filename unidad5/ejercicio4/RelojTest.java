package unidad5.ejercicio4;

public class RelojTest {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(15,10,30);
        
        System.out.println("Hora completa: " + reloj.obtenerHoraCompleta());
        System.out.println("Hora formato 12 horas: " + reloj.obtenerHoraFormato12());

        reloj.ponerEnHora(8, 45);
        System.out.println("Hora después de poner en hora: " + reloj.obtenerHoraCompleta());

        reloj.ponerEnHora(2, 15, 30);
        System.out.println("Hora después de poner en hora con segundos: " + reloj.obtenerHoraCompleta());

        reloj.ponerEnHora(7, 20, 0, "PM");
        System.out.println("Hora después de poner en hora con periodo PM: " + reloj.obtenerHoraFormato12());
   
    }
    
}
