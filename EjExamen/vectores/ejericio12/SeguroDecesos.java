/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjExamen.vectores.ejericio12;

/**
 * La prima de un seguro de decesos se calcula en base a la siguiente relación según la edadAsegurado del asegurado
 * @author jsanm
 */
public class SeguroDecesos extends Seguro{
    
    /**
     * Crea un seguro de decesos informando el asegurado. Delega en el constructor heredado ya que
     * no se aportan nuevas propiedades en esta clase.
     * @param asegurado Asegurado del seguro en construcción
     * @see Seguro#Seguro(ejercicio2.Asegurado) 
     */
    public SeguroDecesos(Asegurado asegurado){
        super(asegurado);
    }
    
    /**
     * Calcula la prima anual en base a la edad del asegurado
     * @return La prima anual
     * @see Seguro#calcularPrimaAnual() 
     * @see Asegurado#calcularEdad() 
     */
    @Override
    public float calcularPrimaAnual(){
        
        int edadAsegurado = this.asegurado.calcularEdad();
        float result = 10; //importe para menores
        
       if(edadAsegurado >= 19 && edadAsegurado <= 39)
            result = 22;
       else if(edadAsegurado >= 40 && edadAsegurado <= 49)
           result = 45;
       else if(edadAsegurado >= 50 && edadAsegurado <= 55)
           result = 62;
       else if(edadAsegurado >= 56 && edadAsegurado <= 60)
           result = 88;
       else if(edadAsegurado > 60 ){
            //en estes subcaso, cada año a partir de 60 vale por 10€
            int anyosMasDe60 = edadAsegurado - 60;
            result = 88.0f + 10.0f * anyosMasDe60;
        }

        //devolvemos el resultado calculado
        return result;
    }
    
}
