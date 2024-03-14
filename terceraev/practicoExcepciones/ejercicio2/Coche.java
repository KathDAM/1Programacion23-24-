/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 * Un coche puede ser de cambio manual o automático. 
 * <p>
 * De cada coche, se desea conocer la matrícula, la velocidad (en km/h), la marcha (entre 0..6, siendo 0 el punto muerto) 
 * y el límite de velocidad máxima (en km/h). No hay marcha atrás, por lo que no hay valores negativos de marcha o velocidad. 
 * Todo coche instanciado en el sistema debe tener una matrícula, un límite de velocidad y parte con velocidad y marcha a 0. 
 * Añade la siguiente funcionalidad: 
 * <p>
 * a. Getters de las propiedades del coche. 
 * <p>
 * b. <i>acelerar</i>, que recibe como parámetro el incremento de velocidad a la que circula el coche. La función devuelve <i>true</i> si puede acelerar, 
 * <i>false</i> en caso de haber alcanzado la velocidad máxima. 
 * <p>
 * c. <i>frenar</i>, ídem, pero inverso a acelerar. Si no se detiene, la función devuelve <i>true</i>. <i>False</i> en caso de haberse detenido.  
 * <p>
 * d. Todo coche representado como cadena de caracteres, en el formato que consideres, pero que visualice todas sus propiedades. 
 * <p>
 * e. <i>cambiaMarcha</i>, en la que, según una determinad marcha, el coche cambia a la marcha indicada. Define la función como <i>protected</i>. 
 * La función devolverá siempre <i>true</i> indicando así que ha podido cambiar la marcha de forma efectiva.
 * @author jsanm
 */
public class Coche {

    
    /************************** PROPIEDADES PRIVADAS **************************/
    /**
     * La matrícula del coche
     */
    protected String matricula;
    
    /**
     * La velocidad a la que se mueve el coche. Inicialmente a 0.
     */
    protected double velocidad=0;
    
    /**
     * La marcha que lleva el coche. Inicialmente 0 (Punto muerto). Tipo <code>MarchaCoche</code>
     */
    protected MarchaCoche marcha = MarchaCoche.PUNTO_MUERTO;
    
    /**
     * Límite máximo de velocidad. La {@link #velocidad} nunca puede superar este límite
     */
    protected final double limiteMaximoVelocidad;
    
    /************************** TIPOS PÚBLICOS **************************/
    public enum MarchaCoche{
        PUNTO_MUERTO, 
        PRIMERA, 
        SEGUNDA, 
        TERCERA, 
        CUARTA, 
        QUINTA, 
        SEXTA;
        
        public static MarchaCoche fromString(String marcha){
            if("1".equals(marcha))
                return PRIMERA;
            else if("2".equals(marcha))
                return SEGUNDA;
            else if("3".equals(marcha))
                return TERCERA;
            else if("4".equals(marcha))
                return CUARTA;
            else if("5".equals(marcha))
                return QUINTA;
            else if("6".equals(marcha))
                return SEXTA;
            else 
                return PUNTO_MUERTO; //POR DEFECTO
        }
    }
    
    /************************** CONSTRUCTORES **************************/
    /**
     * Construye un objeto <code>Coche</code> con la matrícula y el límite máximo de velocidad
     * @param matricula La matrícula
     * @param limiteMaximoVelocidad El límite de velocidad
     */
    public Coche(String matricula, double limiteMaximoVelocidad){
        
        this.matricula = matricula;
        this.limiteMaximoVelocidad = limiteMaximoVelocidad;
    }

    /************************** GETTERS **************************/
    /**
     * Método get de la matrícula
     * @return La matrícula
     */
    public String getMatricula(){
        return this.matricula;
    }

    public double getVelocidad(){
        return this.velocidad;
    }

    public MarchaCoche getMarcha(){
        return this.marcha;
    }

    public double getLimiteMaximoVelocidad(){
        return this.limiteMaximoVelocidad;
    }
    
    /************************** FUNCIONES PÚBLICAS **************************/
    /**
     * Acelera el coche en base a la velocidad indicada. Si no puede acelerar por alcanzarse la velocidad máxima,
     * se establece la velocidad al máximo y devuelve un valor falso.
     * @param incrementoVelocidad Velocidad a incrementar
     * @return Cierto, si puede incrementar la velocidad en el valor indicado, falso en caso contrario.
     */
    public boolean acelerar(double incrementoVelocidad){
        
        if (this.velocidad + incrementoVelocidad >= this.limiteMaximoVelocidad){
            this.velocidad = this.limiteMaximoVelocidad;
            return false;            
        }else{
            this.velocidad += incrementoVelocidad;
            return true;
        }
    }
    
    /**
     * Frena el coche en base a la velocidad indicada. Si no puede frenar por detenerse el coche, 
     * se establece la velocidad en 0 y devuelve un valor falso.
     * @param decrementoVelocidad Velocidad a decrementar.
     * @return  Cierto, si puede disminuir la velocidad en el valor indicado, falso en caso contrario
     */
    public boolean frenar(double decrementoVelocidad){
        
        if (this.velocidad - decrementoVelocidad < 0){
            this.velocidad = 0;
            return false;            
        }else{
            this.velocidad -= decrementoVelocidad;
            return true;
        }
    }

    /**
     * Cambia la marcha. Nótese que es un método set con otro nombre y que se devuelve un valor de verdad en función
     * de si se permite o no el cambio de marcha.
     * @param marcha Nueva marcha
     * @return Siempre true en esta clase. Ver clases hijas que redefinen el comportamiento.
     */
    protected boolean cambiarMarcha(MarchaCoche marcha){
        
        this.marcha = marcha;
        return true;
        
    }
    
    /**
     * Convierte un objeto <code>Coche</code> en una cadena de caracteres
     * @return Una cadena de caracteres que represente el estado del objeto.
     */
    @Override
    public String toString(){
        return "Matrícula: " + (this.matricula!=null?this.matricula.toUpperCase():null) + "\n" + 
                "Velocidad: " + this.velocidad + "\n" + 
                "Máxima velocidad alcanzable: " + this.limiteMaximoVelocidad + "\n" +
                "Marcha: " + this.marcha ;
    }
}
    
    
    
   
