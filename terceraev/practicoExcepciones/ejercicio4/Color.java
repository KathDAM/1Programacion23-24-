package ejercicio4;
/**
 * Color de una Figura
 * @author jsanm
 */
public enum Color {
    
    NEGRO, BLANCO, ROJO, AZUL, AMARILLO, VERDE, NARANJA, MARRON, ROSA, VIOLETA, MAGENTA;
    
    /**
     * Convierte una cadena de texto en un Color
     * @param colorStr Color representado como cadena alfanumérica
     * @return 
     */
    public static Color fromString(String colorStr){
        if("NEGRO".equalsIgnoreCase(colorStr))
            return NEGRO;
        else if("BLANCO".equalsIgnoreCase(colorStr))
            return BLANCO;
        else if("ROJO".equalsIgnoreCase(colorStr))
            return ROJO;
        else if("AZUL".equalsIgnoreCase(colorStr))
            return AZUL;
        else if("AMARILLO".equalsIgnoreCase(colorStr))
            return AMARILLO;
        else if("VERDE".equalsIgnoreCase(colorStr))
            return VERDE;
        else if("NARANJA".equalsIgnoreCase(colorStr))
            return NARANJA;
        else if("MARRON".equalsIgnoreCase(colorStr))
            return MARRON;
        else if("ROSA".equalsIgnoreCase(colorStr))
            return ROSA;
        else if("VIOLETA".equalsIgnoreCase(colorStr))
            return VIOLETA;
        else 
            return MAGENTA;
        
    }
}
