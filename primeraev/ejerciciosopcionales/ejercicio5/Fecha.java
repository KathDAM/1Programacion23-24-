package ejerciciosopcionales.ejercicio5;

import java.util.Scanner;

public class Fecha {
    static boolean esFechaValida;
    static Scanner scanner = new Scanner(System.in);
    static int dia;
    static int mes;
    static int anyo;
    
    public Fecha(int dia, int mes, int anyo) {
        Fecha.dia = dia;
        Fecha.mes = mes;
        Fecha.anyo = anyo;
    }

    public static void main(String[] args) {
        Fecha fecha1 = obtenerDatosFecha();
        fecha1.validarFecha();

        Fecha fecha2 = obtenerDatosFecha();
        fecha2.validarFecha();

        fechaReciente(fecha1,fecha2);


        scanner.close();
    }

    private static Fecha obtenerDatosFecha() {
        System.out.print("Introduce el día: ");
        dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        anyo = scanner.nextInt();

        return new Fecha(dia, mes, anyo);
    }

    private static void validarFecha(){
        if (anyo > 0 && mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    esFechaValida = (dia >= 1 && dia <= 31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    esFechaValida = (dia >= 1 && dia <= 30);
                    break;
                case 2:
                    // Verificar si es un año bisiesto
                    if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
                        esFechaValida = (dia >= 1 && dia <= 29);
                    } else {
                        esFechaValida = (dia >= 1 && dia <= 28);
                    }
                    break;
                default:
                    esFechaValida = false;
                    break;
            }
        } else {
            esFechaValida = false;
        }

        if (esFechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " es válida.");

        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " no es válida.");
        }
    }


    private static void fechaReciente(Fecha fecha1, Fecha fecha2){
        if(fecha1 > fecha2){
            System.out.println("La fecha " + fecha1 + "es la más reciente");
        }else{
            System.out.println("La fecha " + fecha2 + "es la más reciente");
        }
    }


}
