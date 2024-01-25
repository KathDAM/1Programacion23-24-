/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training3;

/**
 * Training para verificar las diferencias entre las dos iteraciones FOR. 
 * 
 * Implementa con dos bucles for distintos la misma solución:
 * 
 * 
 * @author jsanm
 */
public class Iteraciones {
   
    public static void main(String[] args){
        
        //0. Frase de prueba
        String str = "hola mundo";
        
        //1. Partimos la frase caracter a caracter en un array
        char[] strCaracterACaracter = str.toCharArray();
        
        //inicio print indexado (índice "i" sobre "str") caracter a caracter
        for(int i=0; i<strCaracterACaracter.length; i++){
            System.out.print(strCaracterACaracter[i]);
        }
        
        System.out.println();
        
        //inicio print "for each" caracter 
        for(char c: strCaracterACaracter){
            System.out.print(c);
        }
        
        System.out.println();
    }
}
