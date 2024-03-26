/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjExamen.vectores.ejericio12;


import java.util.Calendar;
import java.util.Scanner;

/**
 * Escribe un programa que solicite los datos del asegurado (nombre, apellidos y año de nacimiento) 
 * y le pregunte si desea contratar un seguro de decesos o de vida y muestre el importe de la prima anual correspondiente. 
 * @author jsanm
 */
public class TestApp {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        // Solicitamos el número de seguros a calcular
        System.out.println("*** CALCULAR TOTAL DE PRIMA DE UN CONJUNTO DE SEGUROS ***");
        System.out.println("¿Cuántos seguros desea calcular?");
        int numSeguros = input.nextInt();
        input.nextLine(); // Limpiar el buffer de entrada

        float totalPrima = 0;
        int segurosValidos = 0;

         // Solicitamos el rango de edad
         System.out.println("\n*** SELECCIÓN DEL RANGO DE EDAD ***");
         System.out.print("Edad mínima: ");
         int edadMinima = input.nextInt();
         input.nextLine(); // Limpiar el buffer de entrada
         System.out.print("Edad máxima: ");
         int edadMaxima = input.nextInt();
         input.nextLine(); // Limpiar el buffer de entrada

         
        // Iteramos para cada seguro
        for (int i = 0; i < numSeguros; i++) {
            //1º - Solicitamos los datos de entrada del asegurado. Nótse que permitimos no introducir algún dato al usuario
            System.out.println("*** INFORMACIÓN DE ENTRADA DEL ASEGURADO ***");
            System.out.println("Indique, por orden, el nombre, primer apellido, segundo apellido y año de nacimiento del asegurado.");
            System.out.println("->Si no conoce algún dato, pulse simplemente ENTER");
            String nombre = input.nextLine();
            String apellido1 = input.nextLine();
            String apellido2 = input.nextLine();
            int anyoDeNacimiento;
            boolean edadValida = false;

            // Verificamos la edad del asegurado
            do {
                anyoDeNacimiento = input.nextInt();
                input.nextLine(); // Limpiar el buffer de entrada

                // Verificamos si el asegurado está dentro del rango de edad
                int edadAsegurado = Calendar.getInstance().get(Calendar.YEAR) - anyoDeNacimiento;
                if (edadAsegurado < edadMinima || edadAsegurado > edadMaxima) {
                    System.out.println("El asegurado está fuera del rango de edad especificado (" + edadMinima + " - " + edadMaxima + ")");
                    System.out.println("Por favor, introduzca la fecha de nacimiento nuevamente.");
                } else {
                    edadValida = true;
                }
            } while (!edadValida);
            //2º - Creamos el asegurado en base al contenido introducido. Aquí internamente se valida si algún dato 
            //es incorrecto ya que las propiedades están bien encapsuladas
            Asegurado asegurado = new Asegurado(anyoDeNacimiento, nombre, apellido1, apellido2);
            
       
                //3º - Solicitamos la modalidad de seguro (vida o decesos?)
                Seguro seguro;
                System.out.println("*** SELECCIÓN DE MODALIDAD DE SEGURO ***");
                System.out.println("¿Qué tipo de modalidad de seguro desea?");
                System.out.print("->(V)ida o (D)ecesos: ");
                String modalidadSeguro = input.nextLine();
            
                //4º - Creamos el objeto polimórfico dinámicamente en base a la decisión del usuario
                if ("v".equalsIgnoreCase(modalidadSeguro)){
                    seguro = new SeguroVida(asegurado);
                    
                } else {
                    seguro = new SeguroDecesos(asegurado);
                    
                }
                // Calculamos la prima y sumamos al total
                float prima = seguro.calcularPrimaAnual();
                int edadAsegurado = Calendar.getInstance().get(Calendar.YEAR) - anyoDeNacimiento;
                if (edadAsegurado >= edadMinima && edadAsegurado <= edadMaxima) {
                    totalPrima += prima;
                    segurosValidos++;
                }
            } 
        
           //float mediaPrimas = segurosValidos > 0 ? totalPrima / segurosValidos : 0;
           float mediaPrimas;
           if (segurosValidos > 0) {
               mediaPrimas = totalPrima / segurosValidos;
           } else {
               mediaPrimas = 0;
           }
            // Mostramos la media de las primas
            System.out.printf("\nLa media de las primas de los seguros contratados por asegurados entre %d y %d años es de %.2f€\n", edadMinima, edadMaxima, mediaPrimas);
    
         
        // Cerramos el scanner
        input.close();
    }    
}
