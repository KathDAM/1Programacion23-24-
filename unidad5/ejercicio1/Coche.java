//Catherine AM

package unidad5.ejercicio1;

public class Coche {
    //ATRIBUTOS
    private String modelo;
    private String color;
    private boolean esMetalizado;
    private String matricula;
    private tipoCoche tipo;
    private int anofabri;
    private modalidadSeguro seguro;

    //ENUM
    public enum tipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    public enum modalidadSeguro {
        TERCEROS, TODO_RIESGO
    }
   
    //CONSTRUCTOR
    public Coche(String modelo, String color, boolean esMetalizado, String matricula, tipoCoche tipo, int anofabri, modalidadSeguro seguro) {
        this.setModelo(modelo);
        this.setColor(color);
        this.setEsMetalizado(isEsMetalizado());
        this.setMatricula(matricula);
        this.setTipo(tipo);
        this.setAnofabri(anofabri);
        this.setSeguro(seguro);
    }

    //GETTER
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
 
     public boolean isEsMetalizado() {
        return esMetalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public tipoCoche getTipo() {
        return tipo;
    }

    public int getAnofabri() {
        return anofabri;
    }

    public modalidadSeguro getSeguro() {
        return seguro;
    }

    //SETTER
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipo(tipoCoche tipo) {
        this.tipo = tipo;
    }

    public void setAnofabri(int anofabri) {
        this.anofabri = anofabri;
    }

    public void setSeguro(modalidadSeguro seguro) {
        this.seguro = seguro;
    }


    //METODOS
    public void imprimeCoche(){
       System.out.println("Modelo: " + modelo);
       System.out.println("Color: " + color);
    }

    
  
    
   

   

}
