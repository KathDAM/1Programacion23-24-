// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio5;
import java.util.Scanner;

public class Main {
    static Scanner lect = new Scanner(System.in);
    static CocheAutomatico automatico = null;
    static CocheManual manual = null;
    static int menu;

    public static void main(String[] args) {

        do {
            System.out.println("   ----  Menu  ----  ");
            System.out.println("1. Inicializar el coche de cambio automático \n"
                            + "2. Inicializar el coche de cambio manual \n" 
                            + "3. Acelerar \n" 
                            + "4. Frenar \n" 
                            + "5. Cambio de marcha \n"
                            + "6. Imprimir \n"
                            + "7. Salir");  

            menu = lect.nextInt();
            lect.nextLine();

            switch (menu) {
                case 1:
                    inicializarCocheAutomatico();
                    break;
                case 2:
                    inicializarCocheManual();
                    break;
                case 3:
                    acelerar();
                    break;
                case 4:
                    frenar();
                    break;
                case 5:
                    cambiarMarcha();
                    break;
                case 6:
                    imprimir();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (menu != 7);    
    }

    private static void inicializarCocheAutomatico() {
        if (automatico == null) {
            System.out.print("Introduce la matrícula del coche automático: ");
            String matricula = lect.nextLine();
            System.out.print("Introduce el límite de velocidad máxima: ");
            double limiteVelocidad = lect.nextDouble();
            automatico = new CocheAutomatico(matricula, limiteVelocidad);
            System.out.println("Coche automático inicializado correctamente.");
        } else {
            System.out.println("El coche automático ya está inicializado. ¿Deseas sobrescribirlo? (S/N)");
            String respuesta = lect.next().trim().toLowerCase();
            lect.nextLine();  // Vaciar buffer
            if (respuesta.equals("s")) {
                System.out.println("Introduce la nueva matrícula del coche automático: ");
                String matricula = lect.nextLine();
                System.out.println("Introduce el nuevo límite de velocidad máxima: ");
                double limiteVelocidad = lect.nextDouble();
                automatico = new CocheAutomatico(matricula, limiteVelocidad);
                System.out.println("Coche automático sobrescrito correctamente.");
            } else {
                System.out.println("Operación cancelada. El coche automático no ha sido sobrescrito.");
            }
        }
    }

    private static void inicializarCocheManual() {
        if (manual == null) {
            System.out.print("Introduce la matrícula del coche manual: ");
            String matricula = lect.nextLine();
            System.out.print("Introduce el límite de velocidad máxima: ");
            double limiteVelocidad = lect.nextDouble();
            manual = new CocheManual(matricula, limiteVelocidad);
            System.out.println("Coche manual inicializado correctamente.");
        } else {
            System.out.println("El coche manual ya está inicializado. ¿Deseas sobrescribirlo? (S/N)");
            String respuesta = lect.next().trim().toLowerCase();
            lect.nextLine();  // Vaciar buffer
            if (respuesta.equals("s")) {
                System.out.println("Introduce la nueva matrícula del coche manual: ");
                String matricula = lect.nextLine();
                System.out.println("Introduce el nuevo límite de velocidad máxima: ");
                double limiteVelocidad = lect.nextDouble();
                manual = new CocheManual(matricula, limiteVelocidad);
                System.out.println("Coche manual sobrescrito correctamente.");
            } else {
                System.out.println("Operación cancelada. El coche manual no ha sido sobrescrito.");
            }
        }
    }

    private static void acelerar() {
        int opcionCoche = seleccionarCoche();
        double incremento;

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.print("Introduce el incremento de velocidad para el coche automático: ");
                incremento = lect.nextDouble();
                automatico.acelerar(incremento);
            } else {
                System.out.println("Coche automático no inicializado. No se puede acelerar.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.print("Introduce el incremento de velocidad para el coche manual: ");
                incremento = lect.nextDouble();
                manual.acelerar(incremento);
            } else {
                System.out.println("Coche manual no inicializado. No se puede acelerar.");
            }
        }
    }

    private static void frenar() {
        int opcionCoche = seleccionarCoche();
        double decremento;

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.print("Introduce el decremento de velocidad para el coche automático: ");
                decremento = lect.nextDouble();
                automatico.frenar(decremento);
            } else {
                System.out.println("Coche automático no inicializado. No se puede frenar.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.print("Introduce el decremento de velocidad para el coche manual: ");
                decremento = lect.nextDouble();
                manual.frenar(decremento);
            } else {
                System.out.println("Coche manual no inicializado. No se puede frenar.");
            }
        }
    }

    private static void cambiarMarcha() {
        int opcionCoche = seleccionarCoche();
        int nuevaMarcha;

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.println("El coche es automático. No puedes modificar la marcha ");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.print("Introduce la nueva marcha para el coche manual: ");
                nuevaMarcha = lect.nextInt();
                manual.cambiaMarcha(nuevaMarcha);
            } else {
                System.out.println("Coche manual no inicializado. No se puede cambiar la marcha.");
            }
        }
    }

    private static void imprimir() {
        int opcionCoche = seleccionarCoche();

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.println(automatico);
            } else {
                System.out.println("Coche automático no inicializado. No se puede imprimir.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.println(manual);
            } else {
                System.out.println("Coche manual no inicializado. No se puede imprimir.");
            }
        }
    }

    private static int seleccionarCoche() {
        int opcionCoche;

        do {
            System.out.println("Seleccione coche (1. Automático, 2. Manual): ");
            opcionCoche = lect.nextInt();
            lect.nextLine();  // Vaciar buffer

            if (opcionCoche != 1 && opcionCoche != 2) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionCoche != 1 && opcionCoche != 2);

        return opcionCoche;
    }
}
