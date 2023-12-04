//Catherine AM
package unidad5static.ejercicio1;

public class Consumo {
    //ATRIBUTOS
    private int consumo;
   
    //GET
    public int getConsumo() {
        return consumo;
    }

    //METODOS
    public void incrementarConsumo(int watios){
        consumo += watios;
    }

    public void disminuirConsumo(int watios){
        consumo -= watios;
    }


}
