/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;


import java.util.Scanner;

import excepciones.MiExcepcion;

/**
 * Escribe un programa que utilice dos coches, uno de cambio automático y otro manual e imprima un menú con las siguientes opciones: 
 * <ul>
 *      <li>Inicializar el coche de cambio automático. 
 *      El programa solicitará los datos del coche al usuario y lo dejará a punto para ser utilizado por el programa. </li>
 *      <li>Inicializar el coche de cambio manual. Ídem que en el apartado anterior. </li>
 *      <li>Acelerar. El usuario seleccionará qué coche quiere emplear en la aceleración y el incremento al que desea acelerar. 
 *      En caso de no poderse acelerar la velocidad indicada, el sistema debe informar al usuario. </li>
 *      <li>Frenar. El usuario seleccionará qué coche quiere emplear en la frenada y el decremento de velocidad que le aplica. 
 *      En caso de detenerse el vehículo o no poder decrementar la velocidad indicada, se notificará este extremo al usuario.</li>
 *      <li>Cambio de marcha. 
 *      El usuario seleccionará qué coche quiere emplear en el cambio de marcha y la marcha a la que desea cambiar. 
 *      En caso de no poderse cambiar la marcha o haber seleccionado el coche de cambio automático, se notificará este extremo al usuario.</li>
 *      <li>Imprimir. El usuario seleccionará qué coche quiere visualizar por pantalla y el programa mostrará toda su información. </li>
 *      <li>Salir. El programa finaliza. Si no se selecciona esta opción, el programa ejecuta la opción seleccionada y, tras ello, vuelve al menú principal. </li>
 * </ul>
 * @author jsanm
 */
public class TestApp {
    
    //se declaran estas variables estáticas porque se ha modularizado/disgregado el programa principal en funciones. De esta forma,
    //al tratarse de variables de ámbito global, se evita tener que pasar estas variables como parámetros
    
    //para leer de teclado
    static Scanner teclado = new Scanner(System.in);    
    
    //coche manual
    static Coche cocheManual = null;
    
    //coche automático
    static Coche cocheAutomatico = null;
   
    
    
    public static void main(String[] args) {
        
        System.out.println("****** Programa de simulación de coches  ****** ");
        System.out.println("*** Le deseamos que tenga un agradable viaje ** ");
        String opcionMenuSeleccionada = null;
        while(opcionMenuSeleccionada==null || !"g".equalsIgnoreCase(opcionMenuSeleccionada)){
            
            imprimirMenuPantalla();
            opcionMenuSeleccionada= teclado.nextLine();
            
        /* AÑADIMOS UN TRY CATCH EN EL MAIN */
            try {
                ejecutarOpcionMenu(opcionMenuSeleccionada);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        System.out.println("bye!");
        
    }
    
    /**
     * Imprime el menú de la aplicación
     */
    private static void imprimirMenuPantalla(){
        
        System.out.println("\nElija una opción:");
        System.out.println(" a. Inicializar coche automático.");
        System.out.println(" b. Inicializar coche manual.");
        System.out.println(" c. Acelerar un coche.");
        System.out.println(" d. Frenar un coche.");
        System.out.println(" e. Cambiar de marcha.");
        System.out.println(" f. Imprimir los datos de un coche.");
        System.out.println(" g. Salir.");
        System.out.print(" ");
    }
    
    /**
     * Ejecuta una opción de menú en base al menú impreso en la aplicación
     * @param opcion opción de menú seleccionada
     * @throws MiExcepcion 
     */
    private static void ejecutarOpcionMenu(String opcion) throws MiExcepcion{
        
        
        if ("a".equalsIgnoreCase(opcion)){
            
            // *** OPCIÓN A. INICIALIZAR COCHE AUTOMÁTICO ***            
            ejecutarOpcionInicializarCocheAutomatico();
            
        }else if ("b".equalsIgnoreCase(opcion)){
            
            // *** OPCIÓN B. INICIALIZAR COCHE MANUAL ***
            ejecutarOpcionInicializarCocheManual();
            
        }else if ("c".equals(opcion)){
            
            // *** OPCIÓN C. ACELERAR UN COCHE ***
            ejecutarOpcionAcelerar();
            
        }else if ("d".equals(opcion)){
            
            // *** OPCIÓN D. FRENAR UN COCHE ***
            ejecutarOpcionFrenar();
                        
        }else if ("e".equals(opcion)){
            
            // *** OPCIÓN E. CAMBIAR DE MARCHA ***
            ejecutarOpcionCambioDeMarcha();
                
        }else if ("f".equals(opcion)){
           
            // *** OPCIÓN F. IMPRIMIR ***
            ejecutarOpcionImprimir();
            
            
        }else if ("g".equals(opcion)){

            // *** OPCIÓN G. SALIR ***
            //nada que hacer
            
        }else{
            System.out.println("Opción no válida");
        }
        
    }

    private static void ejecutarOpcionImprimir() {
        
        //1º solicitamos que elija un coche y manejamos en la variable Coche elegida
        Coche coche = solicitarSeleccionarCocheYDevolverlo();
        
        //2º lo imprimimos
        if (coche!=null){
            System.out.println(coche);
        }
        else
            System.out.println("El coche elegido no esta instanciado");
    }

    private static void ejecutarOpcionCambioDeMarcha() {
                
        //1º solicitamos que elija un coche y manejamos en la variable Coche elegida
        Coche coche = solicitarSeleccionarCocheYDevolverlo();
        
        if (coche!=null && coche instanceof CocheManual){
            
            CocheManual cocheM = (CocheManual)coche;
            
            //2º solicitamos la nueva marcha
            System.out.print("Qué marcha desea poner? ");
            String nuevaMarcha = teclado.nextLine();
            
            //3º cambiamos la marcha
            if (!cocheM.cambiarMarcha(Coche.MarchaCoche.fromString(nuevaMarcha))){
                
                //4º avisamos si no se ha podido cambiar la marcha
                System.out.println("Cambio de marcha no permitido");
            }
        }
        else
            System.out.println("El coche elegido no esta instanciado o coche automático no permitido para el cambio de marcha");
    }

    private static void ejecutarOpcionFrenar() throws MiExcepcion {
        
        
        //1º solicitamos que elija un coche y manejamos en la variable Coche elegida
        Coche coche = solicitarSeleccionarCocheYDevolverlo();
        
        if (coche!=null){
            
            //2º solicitamos la velocidad que hay que decrementar
            System.out.print("Qué velocidad quiere decrementar: ");
            double decremento = Double.parseDouble(teclado.nextLine());
            
            //3º aceleramos
            if (!coche.frenar(decremento)){
                
                //4º avisamos si no se ha podido acelerar toda la velocidad indicada
                System.out.println("No se ha podido frenar la velocidad indicada");
            }
        }
        else
            System.out.println("El coche elegido no esta instanciado");
    }

    private static void ejecutarOpcionAcelerar()  {
                
        //1º solicitamos que elija un coche y manejamos en la variable Coche elegida
        Coche coche = solicitarSeleccionarCocheYDevolverlo();
        
        if (coche!=null){
            
            //2º solicitamos la velocidad que hay que incrementar
            System.out.print("Qué velocidad quiere incrementar: ");
            double incremento = Double.parseDouble(teclado.nextLine());
            
            //3º aceleramos
            if (!coche.acelerar(incremento)){
                
                //4º avisamos si no se ha podido acelerar toda la velocidad indicada
                System.out.println("No se ha podido acelerar la velocidad indicada");
            }
        }
        else
            System.out.println("El coche elegido no esta instanciado");
    }

    private static void ejecutarOpcionInicializarCocheManual()  {
        
        System.out.print("Escriba la matrícula: ");
        String matricula = teclado.nextLine();
        System.out.print("Y el límite de velocidad: ");
        double limiteMaximoVelocidad = Double.parseDouble(teclado.nextLine());
        
        cocheManual = new CocheManual(matricula, limiteMaximoVelocidad);
    }

    private static void ejecutarOpcionInicializarCocheAutomatico()  {
        
        System.out.print("Escriba la matrícula: ");
        String matricula = teclado.nextLine();
        System.out.print("Y el límite de velocidad: ");
        double limiteMaximoVelocidad = Double.parseDouble(teclado.nextLine());
        
        cocheAutomatico = new CocheAutomatico(matricula, limiteMaximoVelocidad);
    }
    
    
    /**
     * Se solicita al usuario que seleccione un coche (manual o automático) y se devuelve como 
     * resultado de la función
     * @return El coche automático si lo selecciona o manual (en caso contrario)
     */
    private static Coche solicitarSeleccionarCocheYDevolverlo(){
            
            System.out.println("Con qué coche desea trabajar? (a)utomático o (m)anual?");
            String cocheElegido= teclado.nextLine();
            
            return "a".equalsIgnoreCase(cocheElegido)?cocheAutomatico:cocheManual;
    }
    
    
}
