// Catherine AM
package segundaev.herencia2.ejer1;

import java.util.Calendar;

public class EquipoInformatico extends Producto {
    // ATRIBUTOS
    private int memoriaRAM;
    private int memoriaDisco;
    private String sistemaoperativo;
    private double frecuenciaCPU;

    // CONSTRUCTOR
    public EquipoInformatico(int codigo,String descripcion,double precio,Calendar fecha,int memoriaRAM,int memoriaDisco,String sistemaoperativo,double frecuenciaCPU) {
        super(codigo, descripcion, precio, fecha);
        this.memoriaRAM = memoriaRAM;
        this.memoriaDisco = memoriaDisco;
        this.sistemaoperativo = sistemaoperativo;
        this.frecuenciaCPU = frecuenciaCPU;
    }

    // GETTER
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getMemoriaDisco() {
        return memoriaDisco;
    }

    public String getSistemaoperativo() {
        return sistemaoperativo;
    }

    public double getFrecuenciaCPU() {
        return frecuenciaCPU;
    }

    // SETTER
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setMemoriaDisco(int memoriaDisco) {
        this.memoriaDisco = memoriaDisco;
    }

    public void setSistemaoperativo(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

    public void setFrecuenciaCPU(double frecuenciaCPU) {
        this.frecuenciaCPU = frecuenciaCPU;
    }
}
