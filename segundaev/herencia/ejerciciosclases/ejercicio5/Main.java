// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio5;

import java.util.Scanner;

public class Main {
    static Scanner lect = new Scanner(System.in);
    static int menu = 0;
    public static void main(String[] args) {
        CocheAutomatico automatico = new CocheAutomatico(null, 0);
        CocheManual manual = new CocheManual(null, 0);

        do {
            System.out.println("   ----  Menu  ----  ");
            System.out.println("1. Inicializar el coche de cambio automático \n  "
                            + "2. Inicializar el coche de cambio manual \n" 
                            + "3. Acelerar \n" 
                            + "4.Frenar \n" 
                            + "5. Cambio de marcha \n"
                            + "6. Imprimir \n "
                            + "7. Salir");  

             switch (menu) {
                case 1:
                    
                    break;
                case 2:
                
                    break;
                case 3:
                    
                    break;

                case 4:
                
                    break;
                case 5:
                    
                    break;

                case 6:
                
                    break;
                case 7:
                    
                    break;
                default:
                System.out.println("No válido");
                    break;
            }
        } while (menu != 8);
           
    }
}
