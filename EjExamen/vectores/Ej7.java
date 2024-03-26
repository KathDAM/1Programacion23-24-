package EjExamen.vectores;

public class Ej7 {
    public static void main(String[] args) {

        double[] medidasLados = {3.5, 4.2, 6.7, 5.0}; // Ejemplo de medidas de lados de cuadrados

        // Calcular áreas y perímetros de los cuadrados
        double[] areas = calcularAreasCuadrados(medidasLados);
        double[] perimetros = calcularPerimetrosCuadrados(medidasLados);

        // Mostrar resultados
        System.out.println("Áreas de los cuadrados:");
        mostrarResultados(areas);

        System.out.println("\nPerímetros de los cuadrados:");
        mostrarResultados(perimetros);
    }

    public static double[] calcularAreasCuadrados(double[] medidasLados) {
        double[] areas = new double[medidasLados.length];
        for (int i = 0; i < medidasLados.length; i++) {
            double lado = medidasLados[i];
            areas[i] = lado * lado; // Fórmula del área del cuadrado: lado * lado
        }
        return areas;
    }

    public static double[] calcularPerimetrosCuadrados(double[] medidasLados) {
        double[] perimetros = new double[medidasLados.length];
        for (int i = 0; i < medidasLados.length; i++) {
            double lado = medidasLados[i];
            perimetros[i] = 4 * lado; // Fórmula del perímetro del cuadrado: 4 * lado
        }
        return perimetros;
    }

    public static void mostrarResultados(double[] resultados) {
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Cuadrado " + (i + 1) + ": " + resultados[i]);
        }
    }
}

    /*    double[] medidasLados = {3.5, 4.2, 6.7, 5.0}; // Ejemplo de medidas de lados de cuadrados

        // Calcular y mostrar las áreas de los cuadrados
        System.out.println("Áreas de los cuadrados:");
        calcularYMostrarAreas(medidasLados);

        System.out.println("Perímetros de los cuadrados:");
        calcularYMostrarPerimetros(medidasLados);
    }

    public static void calcularYMostrarAreas(double[] medidasLados) {
        for (int i = 0; i < medidasLados.length; i++) {
            double lado = medidasLados[i];
            double area = calcularAreaCuadrado(lado);
            System.out.println("Cuadrado " + (i + 1) + ": Área = " + area);
        }
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado; // Fórmula del área del cuadrado: lado^2
    }

    public static void calcularYMostrarPerimetros(double[] medidasLados) {
        for (int i = 0; i < medidasLados.length; i++) {
            double lado = medidasLados[i];
            double perimetro = calcularPerimetroCuadrado(lado);
            System.out.println("Cuadrado " + (i + 1) + ": Perímetro = " + perimetro);
        }
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado; // Fórmula del perímetro del cuadrado: 4 * lado
    }
}
*/ 