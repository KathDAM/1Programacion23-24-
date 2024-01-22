package ejerciciosopcionales.ejercicio2;
/* 2. Escribe un programa que pida el día de la semana (del 1 al 7) y muestre por 
pantalla el día correspondiente (lunes, martes, miércoles…). Si el usuario 
introduce un valor no válido, el sistema debe mostrar un mensaje de error*/
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.print("Dime un dia de la semana del 1 al 7 : ");
        int dia = lect.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El día correspondiente es Lunes");    
                break;
            case 2:
                System.out.println("El día correspondiente es Martes");
                break;
            case 3:
                System.out.println("El día correspondiente es Miércoles");
                break;
            case 4:
                System.out.println("El día correspondiente es Jueves");
                break;
            case 5:
                System.out.println("El día correspondiente es Viernes");
                break;
            case 6:
                System.out.println("El día correspondiente es Sábado");
                break;
            case 7:
                System.out.println("El día correspondiente es Domingo");
                break;      
            default:
                System.out.println("Error, dia inválido. Debe estar entre 1 y 7.");
                break;
        }  
        lect.close();
    }
}
