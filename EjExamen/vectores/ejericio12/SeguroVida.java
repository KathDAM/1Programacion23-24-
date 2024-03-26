/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjExamen.vectores.ejericio12;
/**
 * La prima de un seguro de vida se calcula como un factor multiplicado por la edad del asegurado. 
 * <p>
 * La correlación del factor, a su vez, se calcula en base a la siguiente relación: 
 * @author jsanm
 */
public class SeguroVida extends Seguro{
    
    /**
     * Crea un seguro de decesos informando el asegurado. Delega en el constructor heredado ya que
     * no se aportan nuevas propiedades en esta clase.
     * @param asegurado Asegurado del seguro en construcción
     * @see Seguro#Seguro(ejercicio2.Asegurado) 
     */
    public SeguroVida(Asegurado asegurado){
        super(asegurado);
    }
    
    
    /**
     * Calcula la prima anual en base a la edad del asegurado y un factor de correlación para multiplicarlos
     * @return La prima anual
     * @see Seguro#calcularPrimaAnual() 
     * @see Asegurado#calcularEdad() 
     */
    @Override
    public float calcularPrimaAnual() {
        
        int edadAsegurado = this.asegurado.calcularEdad();
        
        float factorCorrelacion = calcularFactorCorrelacion(edadAsegurado);
        
        return factorCorrelacion * edadAsegurado;
    }

    /**
     * Calcula un factor de correlación multiplicativo de la edad en base a un algoritmo 
     * definido por el usuario.
     * @param edad edad cuyo factor se desea calcular. Máximo de 64 años, en caso contrario genera un error.
     * @return El factor
     */
    private float calcularFactorCorrelacion(int edad) {
        if (edad < 25 )
            return 1;
        else if (edad >= 25 && edad <= 34)
            return 1.1f;
        else if (edad >= 35 && edad <= 44)
            return 1.2f;
        else if (edad >= 45 && edad <= 54)
            return 1.3f;
        else if (edad >= 55 && edad <= 64)
            return 1.4f;
        else {
            //throw new RuntimeException("Edad no válida de contratación para un seguro de vida");
            System.out.println("Edad no válida de contratación para un seguro de vida");
            return 0;
        }
    }
    
}
