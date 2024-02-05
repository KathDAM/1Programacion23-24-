package segundaev.herencia2.ejer5;

public class Main { public static void main(String[] args) {

    Pelicula pelicula = new Pelicula("N", IdiomaEnum.PORTUGUES);
    Documental documental = new Documental("Depredadores", IdiomaEnum.FRANCES, CategoriaDocumentalEnum.SOCIOECONOMICO);
    Serie serie = new Serie("Griselda", IdiomaEnum.ALEMAN, 31);

    System.out.println("Cliente Ocasional");
    ClienteOcasional cliente = new ClienteOcasional();

    cliente.alquilaContenidoAudiovisual(pelicula);
    cliente.alquilaContenidoAudiovisual(documental);
    cliente.alquilaContenidoAudiovisual(serie);

    System.out.println("\nCliente Abonado");
    Abonado abonado = new Abonado();

    abonado.alquilaContenidoAudiovisual(pelicula);
    abonado.alquilaContenidoAudiovisual(documental);
    abonado.alquilaContenidoAudiovisual(serie);
}
}
