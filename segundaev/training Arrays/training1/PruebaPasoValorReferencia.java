/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training1;

/**
 *
 * @author jsanm
 */
public class PruebaPasoValorReferencia {
    
    
 
    public static void main(String[] args){
        
        //declaramos tres variables, una de tipo primitivo, otra objetovaluada y una tercera array.
        //En todas introduciremos el valor 100
        
        // la de tipo primitivo
        int varTipoPrimitivo = 100;
        
        // la objetovaluada
        ClaseContenedoraInt objeto = new ClaseContenedoraInt(100);
        
        // array
        int[] array = new int[1];
        array[0] = 100;
        
        //cambia la variable de tipo primitivo por 200 en la función correspondiente y sacamos 
        //el resultado por 
        metodoRecibePrimitivo(varTipoPrimitivo, 200);
        System.out.println("Resultado prueba de concepto con tipo primitivo: " + varTipoPrimitivo);
        
        //haz lo mismo con la variable objetovaluada y el array
        metodoRecibeObjeto(objeto,200);
        System.out.println("Resultado prueba de concepto objetovaluada: " + objeto.getPropiedadInt());

        metodoRecibeArray(array, 200);
        System.out.println("Resultado prueba de concepto objetovaluada: " + array[0]);
                
    }

    private static void metodoRecibePrimitivo(int input, int nuevoValor) {
        System.out.println("input antes=" + input);
        input = nuevoValor;
        System.out.println("input después=" + input);
    }

    private static void metodoRecibeObjeto(ClaseContenedoraInt input, int nuevoValor) {
        System.out.println("input antes=" + input.getPropiedadInt());
        input.setPropiedadInt(nuevoValor);
        System.out.println("input después=" + input.getPropiedadInt());
    }

    private static void metodoRecibeArray(int[] array, int nuevoValor) {
        System.out.println("Array antes=" + array[0]);
        array[0] = nuevoValor;
        System.out.println("Array después=" + array[0]);
       
    }
}
