//Catherine AM
package Ejercicios1;

public class Ej15 {
    enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    public static void main(String[] args) {
        System.out.println("Ej15 - Dias de la semana");
        System.out.println("****************************************");
        DiaSemana dia = DiaSemana.MARTES;
        System.out.println("Hoy es " + dia);
        System.out.println("Y en cinco dias es: " + DiaSemana.DOMINGO);


    }
}
