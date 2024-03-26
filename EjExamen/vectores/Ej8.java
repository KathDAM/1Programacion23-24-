package EjExamen.vectores;

public class Ej8 {
    public static void main(String[] args) {
        double[] medidasLados = {3.5, 4.2, 6.7, 5.0}; // Ejemplo de medidas de lados de cuadrados

        // Calcular áreas y perímetros de los cuadrados
        double[][] resultados = calcularAreasYPerimetros(medidasLados);

        // Mostrar resultados
        System.out.println("Áreas y perímetros de los cuadrados:");
        mostrarResultados(resultados);
    }

    public static double[][] calcularAreasYPerimetros(double[] medidasLados) {
        int numCuadrados = medidasLados.length;
        double[][] resultados = new double[2][numCuadrados];

        for (int i = 0; i < numCuadrados; i++) {
            double lado = medidasLados[i];
            resultados[0][i] = calcularAreaCuadrado(lado); // Almacenar área en la primera fila
            resultados[1][i] = calcularPerimetroCuadrado(lado); // Almacenar perímetro en la segunda fila
        }

        return resultados;
    }

    public static void mostrarResultados(double[][] resultados) {
        for (int fila = 0; fila < resultados.length; fila++) {
            String tipoMedida = (fila == 0) ? "Área" : "Perímetro";

            for (int col = 0; col < resultados[0].length; col++) {
                System.out.println("Cuadrado " + (col + 1) + ": " + tipoMedida + " = " + resultados[fila][col]);
            }
        }
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado; // Fórmula del área del cuadrado: lado * lado
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado; // Fórmula del perímetro del cuadrado: 4 * lado
    }
}