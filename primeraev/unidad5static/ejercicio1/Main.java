package unidad5static.ejercicio1;

//Catherine AM
public class Main {
    public static void main(String[] args) {
        Aparato bombilla = new Aparato("Bombilla", 100);
        Aparato radiador = new Aparato("Radiador", 2000);
        Aparato plancha = new Aparato("Plancha", 1200);
        Consumo consumo = new Consumo();

        //Imprime consumo inicial
        System.out.println("Consumo inicial: " + consumo.getConsumo() + " watios");

        bombilla.encender();
        plancha.encender();

        //Actualiza el consumo y lo muestra
        consumo.incrementarConsumo(bombilla.getWatios());
        consumo.incrementarConsumo(plancha.getWatios());
        System.out.println("Consumo después de encender la bombilla y la plancha: " + consumo.getConsumo() + " watios");

        plancha.apagar();
        radiador.encender();

        //Actualiza el consumo y lo muestra
        consumo.disminuirConsumo(plancha.getWatios());
        consumo.incrementarConsumo(radiador.getWatios());
        System.out.println("Consumo después de apagar la plancha y encender el radiador: " + consumo.getConsumo() + " watios");
   
    }
}
