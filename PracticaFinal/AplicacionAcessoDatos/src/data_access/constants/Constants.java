/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access.constants;

import java.io.File;

/**
 * Constantes de la aplicación de training
 * @author jsanm
 */
public class Constants {
        
    //path relativo del fichero de configuración que incluye las credenciales y URL configurables
    public final static String DB_CONFIG__FILE_NAME = "resources" + File.separator + "db.properties";
    
    public final static String MYSQL_DB_DRIVER__CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
    //propiedades configurables en el fichero de configuración
    public final static String DB_CONFIG__USER_PROPERTY = "user";
    public final static String DB_CONFIG__PWD_PROPERTY = "pass";
    public final static String DB_CONFIG__URL_PROPERTY = "url";
    
    //Valores por defecto de credenciales y URL de acceso a datos 
    //(utilizadas en caso de error en la carga del fichero de configuración)
    public final static String DEFAULT_DATA_BASE__USER = "tester";
    public final static String DEFAULT_DATA_BASE__PWD = "tester";
    public final static String DEFAULT_DATA_BASE__URL = "jdbc:mysql://localhost:3306/sakila";

}
