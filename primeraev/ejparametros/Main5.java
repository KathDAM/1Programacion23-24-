package ejparametros;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.println("¿Cuántos valores desea sumar?");
        int valores= lect.nextInt();

        MediaValores5 media5 = new MediaValores5(valores);
        double result = media5.mediaValores();

        System.out.println("La media de los " + valores + " valores introducidos es " + result);
        lect.close();
    }
}
