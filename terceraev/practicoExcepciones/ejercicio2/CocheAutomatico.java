/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import excepciones.MiExcepcion;

/**
 * Un coche de cambio automático cambia automáticamente de marcha en función de la velocidad, 
 * siguiendo una tabla de relación entre marcha y velocidad: 
 * @author jsanm
 */
public class CocheAutomatico extends Coche{
    
    /**
     * Construye un objeto <code>CocheAutomatico</code> con la matrícula y el límite máximo de velocidad
     * @param matricula La matrícula
     * @param limiteMaximoVelocidad El límite de velocidad
     * @see Coche#Coche(java.lang.String, double) 
     */
    public CocheAutomatico(String matricula, double limiteMaximoVelocidad){
        
        super(matricula, limiteMaximoVelocidad);
    }
    
    /**
     * En un coche automático, no se puede cambiar de marcha. El atributo depende de la velocidad y se calcula
     * automáticamente al modificar la velocidad.
     * <p>
     * Para incidir en la marcha de un coche automático, cambiar de velocidad con los métodos
     * {@link CocheAutomatico#acelerar(double)} y {@link CocheAutomatico#frenar(double)}
     * @param marcha Nueva marcha. Indiferente, no se utilizar.
     * @return Siempre <code>false</code>
     */
    @Override
    public boolean cambiarMarcha(MarchaCoche marcha){
        
        return false;
    }

    /**
     * Además de lo indicado en {@link Coche#acelerar(double)}, deriva (calcula) el valor de la marcha equivalente
     * @param incrementoVelocidad Incremento de velocidad
     * @return lo que devuelva el método heredado
     */
    @Override
    public boolean acelerar(double incrementoVelocidad){
        
        //valor de retorno y cambia la velocidad del coche
        boolean puedeAcelerar = super.acelerar(incrementoVelocidad);

        //cambiamos la marcha del coche en base a la velocidad que acabamos de modificar
        calcularMarcha();
        
        return puedeAcelerar;
    }

     /**
     * Además de lo indicado en {@link Coche#frenar(double)}, deriva (calcula) el valor de la marcha equivalente
     * @param decrementoVelocidad Decremento de velocidad
     * @return lo que devuelva el método heredado
     */
    @Override
    public boolean frenar(double decrementoVelocidad) throws MiExcepcion{
        
        //valor de retorno y cambia la velocidad del coche
        boolean puedeFrenar = super.frenar(decrementoVelocidad);

        //cambiamos la marcha del coche en base a la velocidad que acabamos de modificar
        calcularMarcha();
        
        return puedeFrenar;
        
    }
    
    /**
     * Calcula y cambia la marcha del coche en base a la velocidad actual. Se trata de un método privado
     * para controlar cuándo se ejecuta.
     */
    private void calcularMarcha(){
        
        if (this.velocidad == 0)
            this.marcha = MarchaCoche.PUNTO_MUERTO;            
        else if (this.velocidad > 0 && this.velocidad <= 10)
            this.marcha = MarchaCoche.PRIMERA;            
        else if (this.velocidad > 10 && this.velocidad <= 25)
            this.marcha = MarchaCoche.SEGUNDA;            
        else if (this.velocidad > 25 && this.velocidad <= 50)
            this.marcha = MarchaCoche.TERCERA;            
        else if (this.velocidad > 50 && this.velocidad <= 75)
            this.marcha = MarchaCoche.CUARTA;            
        else if (this.velocidad > 75 && this.velocidad <= 95)
            this.marcha = MarchaCoche.QUINTA;
        else if (this.velocidad > 95)
            this.marcha = MarchaCoche.SEXTA;                
    }

}