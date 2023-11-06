//Catherine AM

package U5POO;

public class Coche {
    private int modelo;
    private String color;
    private enum metalizado{
        METALIZADO, NOMETALIZADO;
    }
    private enum tipoCoche {
        MINI, UTILITARIO, FAMILIAR,DEPORTIVO;
    }
    private int anofabri;
    private String seguro;

    //GETTER
    public int getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
 
    public int getAnofabri() {
        return anofabri;
    }
    public String getSeguro() {
        return seguro;
    }

    //SETTER
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAnofabri(int anofabri) {
        this.anofabri = anofabri;
    }
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    //METODOS
    public static void imprimeCoche(){
        System.out.println(getModelo + getColor);
    }

  
    
   

   

}
