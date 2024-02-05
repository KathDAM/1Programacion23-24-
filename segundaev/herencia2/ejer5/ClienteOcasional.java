package segundaev.herencia2.ejer5;

public class ClienteOcasional implements IAlquiler{
    // METODOS
    public float alquilaContenidoAudiovisual(ContenidoAudiovisual pretendeAlquilar){
        if (pretendeAlquilar instanceof Pelicula) {
            System.out.println("Son 6 euros la pelicula ");
            return 6;
        } else if (pretendeAlquilar instanceof Documental) {
            Documental documental = (Documental) pretendeAlquilar;
            if (documental.getCategoria() == CategoriaDocumentalEnum.FAUNA_Y_FLORA || documental.getCategoria() == CategoriaDocumentalEnum.FAUNA || documental.getCategoria() == CategoriaDocumentalEnum.FLORA || documental.getIdioma() == IdiomaEnum.PORTUGUES) {
                System.out.println("Son 2 euros el documental ");
                return 2; 
            } else {
                System.out.println("Son 3 euros el documental ");
                return 3; 
            }
        } else {
            Serie serie = (Serie) pretendeAlquilar;
            int total = 0;
            int numcap = serie.getNumCapitulosTemporadas();
            while (numcap > 0) {
                total = total + 10;
                numcap -= 15;
            }
            System.out.println("Son " + total + " euros la serie");
            return total;
        } 
    }
}
