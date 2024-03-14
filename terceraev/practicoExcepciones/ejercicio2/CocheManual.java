/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 * Un coche de cambio manual hace pública la funcionalidad de cambio de marcha, 
 * para que el programa invocante pueda manipular las marchas a su antojo. 
 * <p>
 * La única restricción que debe cumplir el programa ante un cambio de marcha o velocidad, 
 * es que la velocidad del coche debe estar siempre comprendida entre el nivel correspondiente a la marcha, 
 * el inmediatamente anterior o el posterior (en referencia a la tabla de velocidades del apartado anterior). 
 * @author jsanm
 */
public class CocheManual extends Coche{
    
     /**
     * Construye un objeto <code>CocheManual</code> con la matrícula y el límite máximo de velocidad
     * @param matricula La matrícula
     * @param limiteMaximoVelocidad El límite de velocidad
     * @see Coche#Coche(java.lang.String, double) 
     */
    public CocheManual(String matricula, double limiteMaximoVelocidad){
        super(matricula, limiteMaximoVelocidad);
    }

    @Override
    public boolean cambiarMarcha(MarchaCoche marcha) {
        if(marchaValidaParaVelocidad(marcha, this.velocidad))
            return super.cambiarMarcha(marcha);
        else
            return false;
    }

    @Override
    public boolean acelerar(double incrementoVelocidad) {
        
        if(marchaValidaParaVelocidad(this.marcha, this.velocidad+incrementoVelocidad))
            return super.acelerar(incrementoVelocidad);
        else
            return false;
    }
    
    @Override
    public boolean frenar(double decrementoVelocidad) {
        
        if(marchaValidaParaVelocidad(this.marcha, this.velocidad-decrementoVelocidad))
            return super.frenar(decrementoVelocidad);
        else
            return false;
    }
    

    /**
     * Indica si una marcha concreta es válida para una velocidad concreta. 
     * Para ello, la velocidad del coche debe estar siempre comprendida entre el nivel correspondiente a la marcha, 
     * el inmediatamente anterior o el posterior
     * @param marcha la marcha a validar
     * @param velocidad la velocidad a validar
     * @return Si es una marcha válida para la velocidad indicada
     */
    private boolean marchaValidaParaVelocidad(MarchaCoche marcha, double velocidad) {
        
        
        double velocidadMinimaPermitida = obtenerVelocidadMinimaPermitidaParaMarcha(marcha);
        double velocidadMaximaPermitida = obtenerVelocidadMaximaPermitidaParaMarcha(marcha);
        
        return velocidad >= velocidadMinimaPermitida && velocidad <= velocidadMaximaPermitida;
    }

    /**
     * Calcula la velocidad mínima permitida para una marcha dada. La mínima permitida es la más pequeña
     * en la que circula un coche con una marcha inmediatamente inferior.
     * @param marcha la marcha sobre la que calcular la velocidad mínima
     * @return la velocidad mínima permitida para la marcha
     */
    private double obtenerVelocidadMinimaPermitidaParaMarcha(MarchaCoche marcha) {
        //velocidad mínima por defecto si la marcha es 0, 1 o 2
        double velocidadMinima = 0;
        switch(marcha){
            case TERCERA:
                velocidadMinima = 10;
                break;
            case CUARTA:
                velocidadMinima = 25;
                break;
            case QUINTA:
                velocidadMinima = 50;
                break;
            case SEXTA:
                velocidadMinima = 75;
        }
        return velocidadMinima;
    }

    /**
     * Calcula la velocidad máxima permitida para una marcha dada. La máxima permitida es la más grande
     * en la que circula un coche con una marcha inmediatamente superior.
     * @param marcha la marcha sobre la que calcular la velocidad máxima
     * @return la velocidad máxima permitida para la marcha
     */
    private double obtenerVelocidadMaximaPermitidaParaMarcha(MarchaCoche marcha) {
        //velocidad máxima por defecto si la marcha es 5 o 6
        double velocidadMaxima = Double.MAX_VALUE;
        switch(marcha){
            case CUARTA:
                velocidadMaxima = 95;
                break;
            case TERCERA:
                velocidadMaxima = 75;
                break;
            case SEGUNDA:
                velocidadMaxima = 50;
                break;
            case PRIMERA:
                velocidadMaxima = 25;
                break;
            case PUNTO_MUERTO:
                velocidadMaxima = 10;
        }
        return velocidadMaxima;
    }

    

    
}
