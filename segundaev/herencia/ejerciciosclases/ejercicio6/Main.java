// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio6;
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
                acelerar(automatico, manual);
                break;
            case 4:
                frenar(automatico, manual);
                break;
            case 5:
                cambiarMarcha(automatico, manual);
                break;
            case 6:
                imprimir(automatico, manual);
                break;
            case 7:
                verificarCocheAutomatico(automatico, manual);
                break;
            case 8:
                detenerCoche(automatico, manual);
                break;
            case 9:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
                }
        } while (menu != 9);    
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
    private static void acelerar(CocheAutomatico automatico, CocheManual manual) {
        int opcionCoche = seleccionarCoche();

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.print("Introduce el incremento de velocidad para el coche automático: ");
                double incremento = lect.nextDouble();
                automatico.acelerar(incremento);
            } else {
                System.out.println("Coche automático no inicializado. No se puede acelerar.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.print("Introduce el incremento de velocidad para el coche manual: ");
                double incremento = lect.nextDouble();
                manual.acelerar(incremento);
            } else {
                System.out.println("Coche manual no inicializado. No se puede acelerar.");
            }
        }
    }

    private static void frenar(CocheAutomatico automatico, CocheManual manual) {
        int opcionCoche = seleccionarCoche();

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.print("Introduce el decremento de velocidad para el coche automático: ");
                double decremento = lect.nextDouble();
                automatico.frenar(decremento);
            } else {
                System.out.println("Coche automático no inicializado. No se puede frenar.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.print("Introduce el decremento de velocidad para el coche manual: ");
                double decremento = lect.nextDouble();
                manual.frenar(decremento);
            } else {
                System.out.println("Coche manual no inicializado. No se puede frenar.");
            }
        }
    }


    private static void cambiarMarcha(CocheAutomatico automatico, CocheManual manual) {
        int opcionCoche = seleccionarCoche();

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.print("Introduce la nueva marcha para el coche automático: ");
                int nuevaMarcha = lect.nextInt();
                automatico.cambiaMarcha(nuevaMarcha);
            } else {
                System.out.println("Coche automático no inicializado. No se puede cambiar la marcha.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.print("Introduce la nueva marcha para el coche manual: ");
                int nuevaMarcha = lect.nextInt();
                manual.cambiaMarcha(nuevaMarcha);
            } else {
                System.out.println("Coche manual no inicializado. No se puede cambiar la marcha.");
            }
        }
    }

    private static void imprimir(CocheAutomatico automatico, CocheManual manual) {
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

    private static void verificarCocheAutomatico(CocheAutomatico automatico, CocheManual manual) {
        int opcionCoche = seleccionarCoche();

        if (opcionCoche == 1) {
            if (automatico != null) {
                System.out.println("El coche seleccionado es automático: " + (automatico instanceof CocheAutomatico));
            } else {
                System.out.println("Coche automático no inicializado.");
            }
        } else if (opcionCoche == 2) {
            if (manual != null) {
                System.out.println("No es automatico.El coche seleccionado es manual. ");
            } else {
                System.out.println("Coche manual no inicializado.");
            }
        }
    }

    private static void detenerCoche(CocheAutomatico automatico, CocheManual manual) {
        int opcionCoche = seleccionarCoche();

        if (opcionCoche == 1) {
            detenerCocheAutomatico(automatico);
        } else if (opcionCoche == 2) {
            detenerCocheManual(manual);
        }
    }

    private static void detenerCocheAutomatico(CocheAutomatico automatico) {
        if (automatico != null) {
            automatico.frenar(automatico.getVelocidad());
            System.out.println("Coche automático detenido con éxito.");
        } else {
            imprimirCocheNoInicializado("Coche automático");
        }
    }

    private static void detenerCocheManual(CocheManual manual) {
        if (manual != null) {
            manual.frenar(manual.getVelocidad());
            System.out.println("Coche manual detenido con éxito.");
        } else {
            imprimirCocheNoInicializado("Coche manual");
        }
    }

    private static void imprimirCocheNoInicializado(String tipoCoche) {
        System.out.println(tipoCoche + " no inicializado. No se puede realizar la operación.");
    }
    
    private static int seleccionarCoche() {
        int opcionCoche;
        do {
            System.out.println("Seleccione el coche:\n1. Coche automático\n2. Coche manual");
            opcionCoche = lect.nextInt();
        } while (opcionCoche != 1 && opcionCoche != 2);

        return opcionCoche;
    }
}
