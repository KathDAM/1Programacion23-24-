//Catherine AM
package Ejercicios1;

public class Ej12 {
    public static void main(String[] args) {
        System.out.println( "");
        System.out.println("Ej12 - Cilindro");
        System.out.println("****************************************");
        double diam = 15.5;
        double alt = 42.4;
        double rad = diam/2;
        double arearec = 2 * Math.PI * rad * alt;
        double areabas = Math.PI * (rad*rad);
        System.out.println("Area del cilindro: " + areabas+arearec);
        System.out.println("Volumen del cilindro: "+ Math.PI + (rad*rad) * alt );
       
        
    }
}
