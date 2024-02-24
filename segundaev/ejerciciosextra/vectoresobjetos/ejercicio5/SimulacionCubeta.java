/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaev.ejerciciosextra.vectoresobjetos.ejercicio5;

/**
 * Clase para simular el llenado de una cubeta de lluvia
 * @author jsanm
 */
public class SimulacionCubeta {
    
    /**
     * Capacidad de la cubeta. Se inicializa en constructor y no cambia 
     */
    private final int CAPACIDAD_LLUVIA;
    
    /**
     * Capacidad remanente de la cubeta. Se inicializa en constructor y mengua según se
     * va simulando día a día
     */
    private int capacidadRemanente;
    
    /**
     * Número de días simulados. Inicialmente 0.
     */
    private int numDiasSimulados = 0;
    
    /**
     * Máximo de días. Se inicializa en constructor y no cambia.
     */
    private final int MAX_DIAS_SIMULACION;
    
    /**
     * Cantidad máxima a simular por día. 20.
     */
    private final int MAX_LLUVIA_DIARIA = 20;
    
    /**
     * Simulación de lluvia
     */
    private DiaLluvia[] simulacionLluvia;
    
    
    /**
     * Relación de cantidad remanente por día
     */
    private int[] capacidadRemanentePorDia; 
    
    

    public int getCapacidadLluvia() {
        return CAPACIDAD_LLUVIA;
    }

    public int getCapacidadRemanente() {
        return capacidadRemanente;
    }

    public int getNumDiasSimulados() {
        return numDiasSimulados;
    }
    
    public SimulacionCubeta(int capacidadLluvia, int diasSimulacion){
        
        //validaciones de propiedades
        if(capacidadLluvia <= 0)
            throw new IllegalArgumentException("La capacidad de lluvia de una cubeta ha de ser un valor positivo");
        if(diasSimulacion <= 0)
            throw new IllegalArgumentException("El número de días de simulación de una cubeta ha de ser un valor positivo");
        
        //asignamos propiedades ya validadas
        this.CAPACIDAD_LLUVIA = capacidadLluvia;
        this.capacidadRemanente = capacidadLluvia;
        this.MAX_DIAS_SIMULACION = diasSimulacion;
        
        //creamos el vector para almacenar la simulación de cada día
        simulacionLluvia = new DiaLluvia[MAX_DIAS_SIMULACION];

        //creamos el vector para almacenar la cantidad remanente por día
        capacidadRemanentePorDia = new int[MAX_DIAS_SIMULACION];
    }
    
    /**
     * Añade un día de simulación, si es posible, devolviendo el día simulado.En caso contrario devuelve null.
     * @return Día simulado. Null en caso de no poderse simular más días.
     */
    public DiaLluvia anyadirDiaSimulacion(){
        
        if(this.sePuedeSimularMasDias() && !this.cubetaLlena()){
            
            //cálculo aleatorio de lluvia sin superar el máximo por día
            int lluviaSimulada = (int)Math.round(Math.random()*MAX_LLUVIA_DIARIA+1);
            
            //objeto para almacenar la lluvia simulada
            DiaLluvia nuevoDia = new DiaLluvia(numDiasSimulados+1, lluviaSimulada);
            
            //almacenamos objeto en la lista de días simulados
            this.simulacionLluvia[numDiasSimulados]=nuevoDia;
            
            //adaptamos la propiedad que almacena la capacidad remanente, teniendo en cuenta que
            //no debemos permitir desbordar la cubeta
            capacidadRemanente-=lluviaSimulada;
            if(capacidadRemanente<0)
                capacidadRemanente = 0;
            
            //ídem con el array de capacidad remanente por día
            this.capacidadRemanentePorDia[numDiasSimulados]=capacidadRemanente;
            
            //incrementamos el número de días simulados
            numDiasSimulados++;
            
            //devolvemos al llamante el día simulado
            return nuevoDia;
        }
        
        //si no hay simulación, devolvemos null
        return null;
        
    }
    
    /**
     * Acceso indexado a la propiedad <code>simulacionLluvia</code>
     * @param numDia Índice. Empieza en 0.
     * @return Día simulado de lluvia
     */
    public DiaLluvia getSimulacionLluvia(int numDia){
        if(numDia<0||numDia>=(this.numDiasSimulados))
            throw new RuntimeException("Número de día fuera de rango");
        return this.simulacionLluvia[numDia];
    }
    
    /**
     * Acceso indexado a la propiedad <code>capacidadRemanentePorDia</code>
     * @param numDia Índice. Empieza en 0.
     * @return Capacidad remanente en la simualción para ese día
     */
    public int getCapacidadRemanentePorDia(int numDia){
        if(numDia<0||numDia>=(this.numDiasSimulados))
            throw new RuntimeException("Número de día fuera de rango");
        return this.capacidadRemanentePorDia[numDia];
    }
    
    /**
     * Indica si puedes seguir simulando en base al número de días simulados y el máximo permitido en la cubeta
     * @return 
     */
    public boolean sePuedeSimularMasDias(){
        return numDiasSimulados<MAX_DIAS_SIMULACION;
    }
    
    /**
     * Indica si una cubeta se ha llenado
     * @return Si se ha llenado
     */
    public boolean cubetaLlena(){
        return this.capacidadRemanente==0;
    }
    
    
}
