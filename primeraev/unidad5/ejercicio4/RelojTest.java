//Catherine AM
package unidad5.ejercicio4;

public class RelojTest {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(16,22,35);
        
        //Imprime la hora
        reloj.imprimirHora();
        System.out.println();
        
        //Imprime la hora en formato 24h
        reloj.imprimirHora(Reloj.FormatoHora.FORMATO24H);

        //Imprime la hora en formato 12h
        reloj.imprimirHora(Reloj.FormatoHora.FORMATO12H);
        System.out.println();
        
        //Imprime la hora modificada sin segundos
        reloj.ponerEnHora(15, 27);
        
        //Imprime la hora modificada con segundos
        reloj.ponerEnHora(18, 3, 44);
    
        //Imprime la hora modificada con el periodo del dia
        reloj.ponerEnHoraPeriodo(7,10,"PM");
    }
    
}
