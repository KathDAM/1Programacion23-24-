//Catherine AM
package Ejercicios2.Bucles;

public class Ej10 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        int cara = 0;
        int cruz = 0;
        int numlanza = 1000000;

        for (int i = 0; i < numlanza; i++) {
            double resultLanzamiento = Math.random();

            if (resultLanzamiento > 0.5) {
                cara ++;
            } else {
                cruz++;
            }
        }
    
        double porcentajecara =  (cara * 100.0) / numlanza;
        double porcentajecruz = (cruz * 100.0) / numlanza;

        System.out.println("Porcentaje de veces que sale cara: " + porcentajecara );
        System.out.println("Porcentaje de veces que sale cruz: " + porcentajecruz );
    }
}