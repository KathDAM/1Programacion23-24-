/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import data_access.DataAccessManager;
import objects.City;
import objects.Film;
import objects.Language;

/**
 * Training de acceso a datos sobre la app de test de MySQL (bbdd <i>Sakila</i>). 
 * 
 * Se precisa para su funcionamiento
 * <ul>
 *  <li>Tener <b>instalado</b> y <b>levantado</b> el servidor de MySQL. <a href=https://dev.mysql.com/downloads/installer/>Descargar</a></li>
 *  <li>Tener <b>instalada</b> la aplicación de prueba <i>Sakila</i> de MySQL <a href=https://dev.mysql.com/doc/index-other.html/>Descargar</a></li>
 *  <li>Tener <b>instalada</b> la libería JDBC de MySQL <a href=https://dev.mysql.com/downloads/connector/j/>Descargar</a></li> y configurada 
 *  en el classpath de esta aplicación 
 *  <li><b>Configurar</b> el acceso a la base de datos desde <i>resources/db.properties</i></li>
 * </ul>
 * @author jsanm
 */
public class TrainingApp {
    
    //para leer opciones de teclado
    private static Scanner tcl = new Scanner(System.in);


    //Opciones del menú principal
    private enum MenuOption{
      QUERY_CITIES, QUERY_CITIES_BY_CONTENT, QUERY_FILMS_BY_LENGTH_RANGE, UPDATE_FILM_DESCRIPTION, BYE 
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MenuOption opcionElegida = null;
        
        //instrucción try-con-recurso (el recurso es el objeto DataAccessManager declarado en el paréntesis). 
        // Automáticamente, tras el try-con-recurso, la JDK invoca al método AutoCloseable.close()
        //implementado en DataAcessManager.

       
         try(DataAccessManager dam = DataAccessManager.getInstance()){
        
            do{
                printOptions();
                opcionElegida = readChoice();

                switch(opcionElegida){
                  
                        
                    case BYE:                    
                        //nada que hacer
                }

            }while(opcionElegida!=MenuOption.BYE);
           
        }
        /*catch(SQLException sqe){
            System.out.println("Error de acceso a datos: " + sqe.getMessage());
        }
        */
          
        System.out.println("\n\nBye!\n\n");
        tcl.close();
                
    }
    
    //***************************** FUNCIONES LANZADAS DESDE LA ELECCIÓN DEL MENÚ DE LA APLICACIÓN *****************************
  



    //***************************** FIN DE FUNCIONES LANZADAS DESDE LA ELECCIÓN DEL MENÚ DE LA APLICACIÓN *****************************
    
    
    
    //**************** MÉTODOS DE LECTURA DE DATOS VÁLIDOS POR TECLADO ********************
    private static String readNotEmptyString() {
        String input = null;
        //prevenir texto vacío
        while(input==null || input.length()==0){
            input = tcl.nextLine();
            if(input.length()==0){
                System.out.println("escriba algo...");
            }
        }
        return input;
    }
    
    private static short readShort() {
        Short response = null;
        do{
            try{
                response = Short.valueOf(tcl.nextLine());
            }
            catch(RuntimeException re){
                System.out.println("Valor inválido... Inténtelo otra vez.");
            }
        }while(response==null);
        
        return response;
    }
    
    private static MenuOption readChoice() {
        try{
            int choiceInt = Integer.valueOf(tcl.nextLine());
            return MenuOption.values()[choiceInt-1];
        }
        catch(RuntimeException re){
            System.out.println("Opción inválida... Inténtelo otra vez.");
            return readChoice();
        }
    }
    
    //**************** FIN MÉTODOS DE LECTURA DE DATOS VÁLIDOS POR TECLADO ********************
    
    private static void printOptions() {
        StringBuilder sb = new StringBuilder()
                .append("\n\n\nElija una opción:\n")
                .append("\t1)Consultar todas las ciudades\n")
                .append("\t2)Consultar las ciudades filtradas por LIKE\n")
                .append("\t3)Consultar películas por rango de duración\n")
                .append("\t4)Modificar descripción de una película\n")
                .append("\t5)Salir\n")
                .append("Opción: ");
        System.out.print(sb.toString());
    }

    
    private static void printCities(List<City> cities) {
        if(cities==null || cities.isEmpty()){
            System.out.println("No hay registros...");
            return;
        }
        
        for(City city:cities){
            System.out.println("\t"+city);
        }
        System.out.println();
    }
    
    private static void printFilms(List<Film> films) {
        if(films==null || films.isEmpty()){
            System.out.println("No hay registros...");
            return;
        }
        
        for(Film film:films){
            System.out.println("\t"+film);
        }
        System.out.println();
    }
    
    private static String requestCityContentLike(){
        System.out.print("Escriba un contenido a filtrar (recuerde indicar con el caracter % el filtro de búsqueda): ");
        return readNotEmptyString();
        
    }
    
    private static String requestFilmTitle() {
        System.out.print("Escriba el título de la película: ");
        return readNotEmptyString();
    }
    
    private static short requestLengthFrom(){
        System.out.print("Escriba la duración desde: ");
        return readShort();
    }
    
    private static short requestLengthTo(){
        System.out.print("Escriba la duración hasta: ");
        return readShort();
    }
    
    private static String requestNewDescription() {
        System.out.print("Escriba la nueva descripción: ");
        return readNotEmptyString();
    }
}
