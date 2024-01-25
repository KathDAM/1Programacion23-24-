/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training4;

import java.util.Arrays;

/**
 *
 * @author jsanm
 */
public class CopiaArrays {
    
    
    public static void main(String[] args) 
    {
      //Verificamos que tanto clone(), como Arrays.copyOf y System.arraycopy() 
      //mantienen la referencia del array original inmutable.

      //BLOQUE 1: método Object.clone()
      String[] str =  {"a","b","c"};
      String[] strings  = str.clone();
      //cambiamos el array resultado y verificamos inmutabilidad
      strings[2]= "d";
      System.out.println(Arrays.toString(str));
      System.out.println(Arrays.toString(strings));

      //BLOQUE 2: método Arrays.copyOf()
      String[] stringsCopy = Arrays.copyOf(str, str.length);
      //cambiamos el array resultado y verificamos inmutabilidad
      stringsCopy[2]= "d";
      System.out.println(Arrays.toString(str));
      System.out.println(Arrays.toString(stringsCopy));
      
      //BLOQUE 2: método System.arraycopy()
      String[] stringsArrayCopy = new String[3];
      System.arraycopy(str, 0, stringsArrayCopy, 0, str.length);
      //cambiamos el array resultado y verificamos inmutabilidad
      stringsArrayCopy[2]= "d";
      System.out.println(Arrays.toString(str));
      System.out.println(Arrays.toString(stringsArrayCopy));
      
    }
}
