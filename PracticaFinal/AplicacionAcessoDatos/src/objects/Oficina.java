package objects;

public class Oficina {
    // ATRIBUTOS
    private String codigoOficina, ciudad,pais,region,codigoPostal,telefono,lineaDireccion1,lineaDireccion2;
   
    // CONSTRUCTOR
     public Oficina(String codigoOficina, String ciudad, String pais, String region, String codigoPostal, String telefono, String lineaDireccion1, String lineaDireccion2) {
        this.setCodigoOficina(codigoOficina);
        this.setCiudad(ciudad);;
        this.setPais(pais);
        this.setRegion(region);;
        this.setCodigoPostal(codigoPostal);
        this.setTelefono(telefono);;
        this.setLineaDireccion1(lineaDireccion1);
        this.setLineaDireccion2(lineaDireccion2);
    }

    // GETTER
    public String getCodigoOficina() {
        return codigoOficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getRegion() {
        return region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLineaDireccion1() {
        return lineaDireccion1;
    }

    public String getLineaDireccion2() {
        return lineaDireccion2;
    }

    // SETTER
    public void setCodigoOficina(String codigoOficina) {
        if (codigoOficina == null)
            throw new IllegalArgumentException("El código de oficina no puede ser nulo");
        this.codigoOficina = codigoOficina;
    }

    public void setCiudad(String ciudad) {
        if (ciudad == null)
            throw new IllegalArgumentException("La ciudad no puede ser nula");
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        if (pais == null)
            throw new IllegalArgumentException("El país no puede ser nulo");
        this.pais = pais;
    }

    public void setRegion(String region) {
        this.region = region; //Permite valores nulos
    }

    public void setCodigoPostal(String codigoPostal) {
        if (codigoPostal == null)
            throw new IllegalArgumentException("El código postal no puede ser nulo");
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        if (telefono == null)
            throw new IllegalArgumentException("El teléfono no puede ser nulo");
        this.telefono = telefono;
    }

    public void setLineaDireccion1(String lineaDireccion1) {
        if (lineaDireccion1 == null)
            throw new IllegalArgumentException("La línea de dirección 1 no puede ser nula");
        this.lineaDireccion1 = lineaDireccion1;
    }

    public void setLineaDireccion2(String lineaDireccion2) {
        this.lineaDireccion2 = lineaDireccion2; //Permite valores nulos
    }

}

