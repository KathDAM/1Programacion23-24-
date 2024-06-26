import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import data_access.DataAccessManager;
import objects.Oficina;

/**
 * Training de acceso a datos sobre la app de test de MySQL (bbdd <i>Jardineria</i>). 
 * 
 * Se precisa para su funcionamiento
 * <ul>
 *  <li>Tener <b>instalado</b> y <b>levantado</b> el servidor de MySQL. <a href=https://dev.mysql.com/downloads/installer/>Descargar</a></li>
 *  <li>Tener <b>instalada</b> la aplicación de prueba <i>Jardineria</i> de MySQL <a href=https://dev.mysql.com/doc/index-other.html/>Descargar</a></li>
 *  <li>Tener <b>instalada</b> la libería JDBC de MySQL <a href=https://dev.mysql.com/downloads/connector/j/>Descargar</a></li> y configurada 
 *  en el classpath de esta aplicación 
 *  <li><b>Configurar</b> el acceso a la base de datos desde <i>resources/db.properties</i></li>
 * </ul>
 * @author jsanm
 */
public class MenuApp {

    private static Scanner lect = new Scanner(System.in);

    //Opciones del menú principal
    private enum MenuOption{
        MOSTRAR_INFORMACION_OFICINAS, BUSCAR_OFICINA, ELIMINAR_OFICINA, AGREGAR_OFICINA, SALIR_MENU 
    };
    
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
                    case MOSTRAR_INFORMACION_OFICINAS:
                        mostrarInformacionOficinas(dam);
                        break;
                    case BUSCAR_OFICINA:
                        buscarOficina(dam);
                        break;
                    case ELIMINAR_OFICINA:
                        eliminarOficina(dam);
                        break;
                    case AGREGAR_OFICINA:
                        agregarOficina(dam);
                        break;
                    case SALIR_MENU:                  
                        //nada que hacer
                }

            }while(opcionElegida!=MenuOption.SALIR_MENU);
           
        }catch(SQLException sqe){
            System.out.println("Error de acceso a datos: " + sqe.getMessage());
        }
          
        System.out.println("\n\n¡Hasta Luego!\n\n");
        lect.close();
                
    }
    
    //***************************** FUNCIONES LANZADAS DESDE LA ELECCIÓN DEL MENÚ DE LA APLICACIÓN *****************************
   //Muestra info de las oficinas
    private static void mostrarInformacionOficinas(DataAccessManager dam) throws SQLException {
        List<Oficina> oficinas = dam.oficinaDAO.obtenerTodasLasOficinas();
        System.out.println("\n\nListado de oficinas:\n");
        //mostrarDatosOficinas(oficinas);
         for(Oficina oficina : oficinas) {
            System.out.println(oficina.getCodigoOficina() + ", " + oficina.getCiudad() + ", " + oficina.getPais() + ", " + oficina.getRegion()
                            +   oficina.getCodigoPostal() + ", " + oficina.getTelefono() +  ", " + oficina.getLineaDireccion1() + ", " + oficina.getLineaDireccion2()  );
        }
    }
    
    //---------------------------------------------------------------------------------------------------------------------------
    //Menu busqueda para las oficinas
    private static void buscarOficina(DataAccessManager dam) throws SQLException {
        System.out.println("¿Cómo quieres buscar la oficina?");
        System.out.println("1) Por código de la oficina");
        System.out.println("2) Por ciudad");
        System.out.println("3) Por teléfono \n");
        System.out.print("Opción: ");
    
        int opcion = elegirOpcion();
    
        switch (opcion) {
            case 1:
                buscarPorCodigo(dam);
                break;
            case 2:
                buscarPorCiudad(dam);
                break;
            case 3:
                buscarPorTelefono(dam);
                break;
            default:
                System.out.println("Opción inválida. Inténtelo de nuevo.");
                buscarOficina(dam);
        }
    }

    private static void buscarPorCodigo(DataAccessManager dam) throws SQLException {
        String codigoOficina = pedirString("Introduce el código de la oficina a buscar en formato 'XXX-XX' o 'XXX-XXX': ");
        Oficina oficina = dam.oficinaDAO.buscarOficinaPorCodigo(codigoOficina);
        mostrarDatosOficina(oficina);
    }

    private static void buscarPorCiudad(DataAccessManager dam) throws SQLException {
        String ciudad = pedirString("Introduce la ciudad de la oficina: ");
        List<Oficina> oficina = dam.oficinaDAO.buscarOficinasPorCiudad(ciudad);
        mostrarDatosOficinas(oficina);
    }

    private static void buscarPorTelefono(DataAccessManager dam) throws SQLException {
        String prefijoTelefono = pedirString("Introduce los primeros números del fijo o prefijo(con un '+') del teléfono de las oficinas a buscar: ");
        List<Oficina> oficinas = dam.oficinaDAO.buscarOficinasPorPrefijoTelefono(prefijoTelefono);
        mostrarDatosOficinas(oficinas);
    }

    //---------------------------------------------------------------------------------------------------------------------------
    //Menu busqueda eliminar para las oficinas
    private static void eliminarOficina(DataAccessManager dam) throws SQLException {
        System.out.println("¿Cómo quieres eliminar la oficina?");
        System.out.println("1) Por código de la oficina");
        System.out.println("2) Por ciudad");
        System.out.println("3) Por teléfono");
        System.out.print("Opción: ");

        int opcion = elegirOpcion();

        switch (opcion) {
            case 1:
                eliminarPorCodigo(dam);
                break;
            case 2:
                eliminarPorCiudad(dam);
                break;
            case 3:
                eliminarPorPrefijoTelefono(dam);
                break;
            default:
                System.out.println("Opción inválida. Inténtelo de nuevo.");
                eliminarOficina(dam);
        }
    }
    
    private static void eliminarPorCodigo(DataAccessManager dam) throws SQLException {
        System.out.print("Introduce el código de la oficina a eliminar(formato 'XXX-XX' o 'XXX-XX'): ");
        String codigoOficina = lect.nextLine();
        Oficina oficina = dam.oficinaDAO.buscarOficinaPorCodigo(codigoOficina);
        if (oficina != null) {
                mostrarDatosOficina(oficina);
            if (confirmarEliminacion()) {
                eliminarOficinaSeleccionada(dam, codigoOficina);
            } else {
                System.out.println("Operación de eliminación cancelada.");
            }
        } else {
            System.out.println("No se encontró ninguna oficina con el código proporcionado.");
        }
    }

    private static void eliminarPorCiudad(DataAccessManager dam) throws SQLException {
        String ciudad = pedirString("Introduce la ciudad de la oficina: ");
        List<Oficina> oficinas = dam.oficinaDAO.buscarOficinasPorCiudad(ciudad);
        if (!oficinas.isEmpty()) {
            System.out.println("\nOficinas encontradas en " + ciudad + ":");
            for (Oficina oficina : oficinas) {
                mostrarDatosOficina(oficina);
                if (confirmarEliminacion()) {
                    eliminarOficinaSeleccionada(dam, oficina.getCiudad());
                } else {
                    System.out.println("Operación de eliminación cancelada.");
                }
            }
        } else {
            System.out.println("\nNo se encontraron oficinas en la ciudad proporcionada.");
        }
    }

    private static void eliminarPorPrefijoTelefono(DataAccessManager dam) throws SQLException {
        String prefijoTelefono = pedirString("Introduce los primeros números del fijo o prefijo(con un '+') del teléfono de las oficinas a eliminar: ");
        //prefijoTelefono = "+" + prefijoTelefono; // Agregar el signo '+' al prefijo
        List<Oficina> oficinas = dam.oficinaDAO.buscarOficinasPorPrefijoTelefono(prefijoTelefono);
        
        if (!oficinas.isEmpty()) {
            System.out.println("\nOficinas encontradas con el teléfono " + prefijoTelefono + ":");
            for (Oficina oficina : oficinas) {
                mostrarDatosOficina(oficina);
                if (confirmarEliminacion()) {
                    eliminarOficinaSeleccionada(dam, oficina.getCodigoOficina());
                } else {
                    System.out.println("Operación de eliminación cancelada para la oficina con números " + oficina.getTelefono() + ".");
                }
            }
        } else {
            System.out.println("\nNo se encontraron oficinas con los números de teléfono " + prefijoTelefono + ".");
        }
    }

    private static void eliminarOficinaSeleccionada(DataAccessManager dam, String valor) throws SQLException {
        boolean eliminada = dam.oficinaDAO.eliminarOficinaPorCodigo(valor);
        if (eliminada) {
            System.out.println("Oficina eliminada correctamente.");
        } else {
            System.out.println("Error al eliminar la oficina.");
        }
    }
    
    private static boolean confirmarEliminacion() {
        System.out.print("¿Estás seguro de que quieres eliminar esta oficina? (S/N): ");
        String confirmacion = lect.nextLine().toUpperCase();
        return confirmacion.equals("S");
    }
    
    //---------------------------------------------------------------------------------------------------------------------------

    private static void agregarOficina(DataAccessManager dam) throws SQLException {
        String codigoOficina = pedirString("Introduce el código de la oficina: ");
        String ciudad = pedirString("Introduce la ciudad de la oficina: ");
        String pais = pedirString("Introduce el país de la oficina: ");
        String codPostal = pedirString("Introduce el código postal de la oficina: ");
        String telefono = pedirString("Introduce el teléfono de la oficina con prefijo y un '+' delante: ");
        String lineaDireccion1 = pedirString("Introduce la línea de dirección 1 de la oficina: ");
       // La región y la línea de dirección 2 pueden ser nulas
        System.out.print("Introduce la región de la oficina (puede ser nulo): ");
        String region = lect.nextLine();
        
        System.out.print("Introduce la línea de dirección 2 de la oficina (puede ser nulo): ");
        String lineaDireccion2 = lect.nextLine();

        Oficina nuevaOficina = new Oficina(codigoOficina, ciudad, pais, region, codPostal, telefono, lineaDireccion1, lineaDireccion2);
        dam.oficinaDAO.agregarOficina(nuevaOficina);
        System.out.println("\nOficina agregada correctamente.");
    }
    

    //***************************** FIN DE FUNCIONES LANZADAS DESDE LA ELECCIÓN DEL MENÚ DE LA APLICACIÓN *****************************
    
    
    
    //**************** MÉTODOS DE LECTURA DE DATOS VÁLIDOS POR TECLADO ********************
    private static String pedirString(String mensaje) {
        String valor = null;
        do {
            System.out.print(mensaje);
            valor = lect.nextLine();
            if (valor == null || valor.isEmpty()) {
                System.out.println("El valor no puede ser nulo. Inténtelo de nuevo.");
            }
        } while (valor == null || valor.isEmpty());

        return valor;
    }
    

    private static MenuOption readChoice() {
        try{
            int choiceInt = Integer.valueOf(lect.nextLine());
            return MenuOption.values()[choiceInt-1];
        }
        catch(RuntimeException re){
            System.out.println("Opción inválida... Inténtelo otra vez.");
            System.out.println("Opción: ");
            return readChoice();
        }
    }
    
    private static int elegirOpcion() {
        int seleccion = 0;
        boolean esValido = false;
        do {
            try {
                seleccion = Integer.valueOf(lect.nextLine());
                esValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida... Inténtelo otra vez" );
                System.out.println("Opción: ");
            }
        } while (!esValido);
    
        return seleccion;
    }
    //**************** FIN MÉTODOS DE LECTURA DE DATOS VÁLIDOS POR TECLADO ********************
    
    private static void printOptions() {
        StringBuilder sb = new StringBuilder()
            .append("\n\n¡BIENVENIDO AL MENÚ!:")
            .append("\n\nElije una opción:\n")
            .append("\t1) Mostrar información de las oficinas\n")
            .append("\t2) Buscar una oficina\n")
            .append("\t3) Eliminar una oficina\n")
            .append("\t4) Agregar una nueva oficina\n")
            .append("\t5) Salir del menú\n")
            .append("\nOpción: ");
        System.out.print(sb.toString());
    }

    private static void mostrarDatosOficina(Oficina oficina) {
        if (oficina != null) {
            System.out.println("\tCódigo: " + oficina.getCodigoOficina());
            System.out.println("\tCiudad: " + oficina.getCiudad());
            System.out.println("\tPaís: " + oficina.getPais());
            System.out.println("\tRegión: " + oficina.getRegion());
            System.out.println("\tCod Postal: " + oficina.getCodigoPostal());
            System.out.println("\tTelefono: " + oficina.getTelefono());
            System.out.println("\tDirección 1: " + oficina.getLineaDireccion1());
            System.out.println("\tDirección 2: " + oficina.getLineaDireccion2());
        } /*else {
            System.out.println("\nNo se encontró ninguna oficina con el código proporcionado.");
        }*/
    }

    private static void mostrarDatosOficinas(List<Oficina> oficinas) {
        if (!oficinas.isEmpty()) {
            System.out.println("\nOficinas encontradas:");
            for (Oficina oficina : oficinas) {
                mostrarDatosOficina(oficina);
            }
        } else {
            System.out.println("\nNo se encontraron oficinas con los criterios proporcionados.");
        }
    }

}
