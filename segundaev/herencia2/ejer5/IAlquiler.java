// Catherine AM
package segundaev.herencia2.ejer5;

public interface IAlquiler {
    
    /**
     * Función que devuelve un importe de alquiler para un contenido audiovisual
     * @param pretendeAlquilar Contenido audiovisual que se pretende alquilar
     * @return El importe a pagar por el cliente. Valor negativo en caso de no permitirse el alquiler.
     */
    public float alquilaContenidoAudiovisual(ContenidoAudiovisual pretendeAlquilar);
}
