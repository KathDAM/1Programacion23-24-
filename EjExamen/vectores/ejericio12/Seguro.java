/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjExamen.vectores.ejericio12;

/**
 * Crea una clase Seguro que conste de un asegurado (propiedad) y con un método abstracto 
 * para calcular la prima anual. La firma de la función será esta: 
 * 
 * <code>public abstract float calcularPrimaAnual()</code>
 * @author jsanm
 */
public abstract class Seguro {
    
    
    /**
     * Asegurado de un seguro. En base a sus propiedades internas, se calcula la {@link #calcularPrimaAnual()}
     */
    protected Asegurado asegurado;
    
    /**
     * Constructor base para asignar las propiedades del seguro.
     * @param asegurado Asegurado del seguro. No admite valor nulo.
     */
    public Seguro(Asegurado asegurado){
        if(asegurado==null)
        {
            //throw new RuntimeException("El asegurado debe estar informado");
            System.out.println("El asegurado debe estar informado");            
        }
        else
            this.asegurado = asegurado;
    }
    
    /**
     * Método abstracto a implementar en las clases hijas. Cada clase hija define cómo resolver el cálculo de prima anual
     * @return El importe de prima anual
     */
    public abstract float calcularPrimaAnual();
    
}
