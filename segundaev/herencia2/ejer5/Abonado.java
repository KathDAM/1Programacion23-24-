package segundaev.herencia2.ejer5;

public class Abonado implements IAlquiler {
    // ATRIBUTOS
    private int contador = 0;

    // METODOS
    public float alquilaContenidoAudiovisual(ContenidoAudiovisual pretendeAlquilar){
        if (pretendeAlquilar instanceof Pelicula) {
            if (contador <= 3) {
                contador++;
                System.out.println("Son 0 euros la pelicula ");
                return 0;
            } else {
                System.out.println("Son 6 euros la pelicula ");
                return 6;
            }     
        } else if (pretendeAlquilar instanceof Documental) {
            Documental documental = (Documental) pretendeAlquilar;
            if (documental.getCategoria() == CategoriaDocumentalEnum.ARTE) {
                if (documental.getIdioma() == IdiomaEnum.PORTUGUES) {
                    System.out.println("Son 0 euros el documental ");
                    return 0; 
                } else {
                    System.out.println("Son 3 euros el documental ");
                    return 3; 
                }
            } else {
                System.out.println("Son 0 euros el documental ");
                return 0;
            }
        } else {
            Serie serie = (Serie) pretendeAlquilar;
            if (serie.getNumCapitulosTemporadas() < 30) {
                System.out.println("Son 0 euros la serie ");
                return 0;
            } else if (serie.getNumCapitulosTemporadas() < 60) {
                System.out.println("Son 10 euros la serie ");
                return 10;
            }else{
                System.out.println("No apto para este tipo de Abonado ");
                return -1;
            }
        } 
    }
}
