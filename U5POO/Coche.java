//Catherine AM
package U5POO;

public class Coche {

    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private TipoCoche tipo;
    private int anofabri;
    private ModalidadSeguro seguro;

     // ENUM
    public enum ModalidadSeguro {
        TERCEROS, TODO_RIESGO
    }

    public enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR,DEPORTIVO;
    }

    // Constructor
    public Coche(String modelo, String color, boolean metalizado, String matricula, TipoCoche tipo, int anoFabricacion, ModalidadSeguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipo = tipo;
        this.anofabri = anoFabricacion;
        this.seguro = seguro;
    }

    //GETTER
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoCoche getTipo() {
        return tipo;
    }

    public int getAnoFabricacion() {
        return anofabri;
    }

    public ModalidadSeguro getSeguro() {
        return seguro;
    }

    //METODOS
    public void imprimeCoche(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
}

 
  
    
   

   


