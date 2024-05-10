/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import training.objects.City;

/**
 * Clase de acceso a datos que manipula la lógica de acceso de la tabla <code>city</code>
 * @author jsanm
 */
class CityDAO extends DataAccessObject {
    
        
    
    
    CityDAO(Connection cnt){
        super(cnt);
    }

    /**
     * Consulta de la tabla <code>city</code> todos los registros y los devuelve como lista
     * de objetos
     * @return Lista dinámica con tantos objetos {@link City} como registros existan en la bbdd (TODOS)
     * @throws SQLException Si hay algún error en la ejecución de la consulta
     */
    protected List<City> loadAllCities() throws SQLException {
        
        List<City> cities = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM city");
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            cities.add(readCityFromResultSet(result));
        }
        
        return cities;
    }
    
    /**
     * Carga todas las ciudades de la tabla <code>city</code> que contengan el contenido indicado.
     * @param content Contenido. Se buscan las ciudades que contengan dicho contenido. Puede ser una letra o una palabra.
     * @return Lista dinámica con tantos objetos {@link City} como registros existan en la bbdd que
     * cumplan con el criterio de búsqueda
     * @throws SQLException Si hay algún error en la ejecución de la consulta
     */
    protected List<City> loadCitiesContaining(String content) throws SQLException {
        
        List<City> cities = new ArrayList<>();
        
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM city WHERE city LIKE ?");
        stmt.setString(1,content);
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            cities.add(readCityFromResultSet(result));
        }
                      
            
        return cities;
    }
    
    /**
     * Lee de un <code>ResultSet</code> un registro de la base de datos. El result set debe contener las columnas de la tabla
     * <code>city</code>
     * @param rs ResultSet SQL
     * @return Una ciudad con los datos del registro actual del result set
     * @throws SQLException Si ocurre algún error SQL
     */
    private static City readCityFromResultSet(ResultSet rs) throws SQLException{
        Short cityId = rs.getShort(CityTableColumns.COLUMN_NAME__CITY_ID);
        String cityName = rs.getString(CityTableColumns.COLUMN_NAME__CITY);
        Short countryId = rs.getShort(CityTableColumns.COLUMN_NAME__COUNTRY_ID);
        Date lastUpdate = rs.getDate(CityTableColumns.COLUMN_NAME__LAST_UPDATE);
        City city = new City(cityId, cityName, countryId, lastUpdate);
        return city;
    }
    
    /**
     * Clase donde definir constantes con los nombres de las columnas de la tabla <code>city</code>
     */
    private class CityTableColumns{
            
        /**
         * Nombre de la columna con el identificador del registro
         */
        private final static String COLUMN_NAME__CITY_ID = "city_id";

        /**
         * Nombre de la columna que contiene el nombre de la ciudad
         */
        private final static String COLUMN_NAME__CITY = "city";

         /**
         * Nombre de la columna que contiene el identificador (fk) al país al que pertenece
         * la ciudad
         */
        private final static String COLUMN_NAME__COUNTRY_ID = "country_id";

         /**
         * Nombre de la columna que contiene la fecha de última modificación del registro
         */
        private final static String COLUMN_NAME__LAST_UPDATE = "last_update";
    }
}
