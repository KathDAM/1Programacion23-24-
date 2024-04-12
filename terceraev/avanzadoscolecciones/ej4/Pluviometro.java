package terceraev.avanzadoscolecciones.ej4;

import java.util.ArrayList;
import java.util.List;

public class Pluviometro {
    private List<Double> precipitaciones = new ArrayList<>();
    public static void main(String[] args) {
        Pluviometro pluviometro = new Pluviometro();

        pluviometro.registrarPrecipitacion(20.0); // Enero
        pluviometro.registrarPrecipitacion(25.0); // Febrero
        pluviometro.registrarPrecipitacion(30.0); // Marzo
        pluviometro.registrarPrecipitacion(15.0); // Abril
        pluviometro.registrarPrecipitacion(10.0); // Mayo
        pluviometro.registrarPrecipitacion(5.0);  // Junio
        pluviometro.registrarPrecipitacion(2.0);  // Julio
        pluviometro.registrarPrecipitacion(3.0);  // Agosto
        pluviometro.registrarPrecipitacion(7.0);  // Septiembre
        pluviometro.registrarPrecipitacion(12.0); // Octubre
        pluviometro.registrarPrecipitacion(18.0); // Noviembre
        pluviometro.registrarPrecipitacion(22.0); // Diciembre

        for (int i = 1; i <= 12; i++) {
            System.out.println("Media de precipitaciones en el mes " + i + ": " + pluviometro.calcularMediaMensual(i));
        }

        System.out.println("Media anual de precipitaciones: " + pluviometro.calcularMediaAnual());
    }

    public void registrarPrecipitacion(double precipitacion) {
        precipitaciones.add(precipitacion);
    }

    public double calcularMediaMensual(int mes) {
        double suma = 0;
        int contador = 0;

        for (int i = mes - 1; i < precipitaciones.size(); i++) {
            if ((i - mes + 1) % 12 == 0) {
                suma += precipitaciones.get(i);
                contador++;
            }
        }
        return suma / contador;
    }

    public double calcularMediaAnual() {
        double suma = 0.0;

        for (int i = 0; i < precipitaciones.size(); i++) {
            suma += precipitaciones.get(i);
        }
        return suma / precipitaciones.size();
    }
}
