package ejercicio1;

/**
 * Figura genérica. 
 * @author jsanm
 */
public abstract class Figura {
    
    //******** PROPIEDADES *****
    /**
     * Nombre de la figura. A definir según tipo de figura.
     */
    protected String nombreFigura;
    
    /**
     * El color de la figura
     */
    protected Color color;

    
    //******** CONSTRUCTORES *****
    /**
     * Construye una figura indicando su color
     * @param color el color
     */
    public Figura(Color color){
        if(color==null)
            System.out.println("El color es obligatorio");
        else
            this.color = color;
    }
    
    //******** MÉTODOS DE ACCESO *****
    /**
     * Consulta el nombre de la figura
     * @return El nombre de la figura
     */
    public String getNombreFigura() {
        return nombreFigura;
    }

    /**
     * Consulta el color de la figura
     * @return El color de la figura
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * Representación de una figura como cadena alfanumérica
     * @return El nombre de la figura y su color
     */
    public String toString() {
        return this.nombreFigura + " - " + this.color;
    }
    
    //******** MÉTODOS ABSTRACTOS *****
    /**
     * Calcula el perímetro de la figura
     * @return El perímetro, según tipología de figura
     */
    public abstract double calcularPerimetro();
    
    /**
     * Calcula el área de la figura
     * @return El área, según tipología de figura
     */
    public abstract double calcularArea();
    
    
}
