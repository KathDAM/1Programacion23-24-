package Miscelánea;

import java.util.Arrays;

public class OrdenarListaAnimales {
    public static void main(String[] args) {
       String[] argumentosJVM = args.clone();

       Arrays.sort(argumentosJVM);
       System.out.println(Arrays.toString(argumentosJVM));
    }
}
