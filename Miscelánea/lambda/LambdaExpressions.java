/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambda;

import java.util.Arrays;
import java.util.List;
import private_class.Punto;

/**
 *
 * @author j.sanmateujuan
 */
public class LambdaExpressions {
    
    @FunctionalInterface
    public interface InterfazExprLambSinParams{
        public String saludar();
    }
    
    @FunctionalInterface
    public interface InterfazExprLambUnParam{
        public boolean esCadenaLongitudPar(String cadena);
    }
    
    @FunctionalInterface
    public interface InterfazExprLambVariosParams{
        public int sumar(int a, int b);
    }
    
    @FunctionalInterface
    public interface InterfazExprLambBloqueCod{
        public int contarRepeticiones(char[] arr, char carBusq);
    }
    
    public static void main(String[] args){
        
        InterfazExprLambSinParams saludo = ()-> "Expresión lambda sin argumentos y devuelve String";
        System.out.println(saludo.saludar());
        System.out.println();
        
        InterfazExprLambUnParam contadorPares = (c) -> c.length()%2==0;
        String argumento = "Mi carro, me lo robaron";
        System.out.println("Verificando longitud par de: " + argumento);
        System.out.println(contadorPares.esCadenaLongitudPar(argumento));
        argumento+=".";
        System.out.println("Verificando longitud par de: " + argumento);
        System.out.println(contadorPares.esCadenaLongitudPar(argumento));
        System.out.println();
        
        InterfazExprLambVariosParams sumador = (a, b) -> a + b;
        System.out.println("Sumando 3 y -10");
        System.out.println(sumador.sumar(3, -10));
        System.out.println();
        
        InterfazExprLambBloqueCod contadorRepes = (arr, c) ->{
            int contador = 0;
            for(int i=0;i<arr.length; i++)
                if(arr[i]==c)
                    contador++;
            return contador;
        };
        char [] frase = "frase de prueba".toCharArray();
        char letraE = 'e';
        System.out.println("Contando número de repeticiones de la letra " + letraE + " en " + Arrays.toString(frase));
        System.out.println(contadorRepes.contarRepeticiones(frase, letraE));
        System.out.println();
        
    }
    
}
