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
import java.util.Date;
import java.util.HashMap;
import training.objects.Language;

/**
 * Clase de acceso a datos que manipula la lógica de acceso de la tabla <code>language</code>
 * <p>
 * En catálogos, que son tablas de poca o ninguna variación, y de poca capacidad (como por ejemplo en esta 
 * tabla de lenguajes), es de utilidad cargar en memoria todos los registros para facilitar el acceso
 * y minimizar las consultas a bbdd.
 * 
 * @author jsanm
 */
class LanguageDAO extends DataAccessObject{
    
    
    /**
     * Referencia en memoria a todos los lenguajes de la base de datos (tabla 
     * <code>language</code>). La clave es el identificador del registro y el valor
     * es el objeto {@link Language} correspondiente a ese id. Se maneja internamente
     * al cargar el DAO con el método {@link #loadAllLanguages}.
     * 
     */
    private static HashMap<Short, Language> languages = null;
    
    LanguageDAO(Connection cnt)throws SQLException{
        super(cnt);
        if(languages==null)
            loadAllLanguages();
    }

    /**
     * Carga en {@link #languages} un mapa con todos los lenguajes de la bbdd. Se invoca internamente al construir el DAO.
     * <p>
     * Se puede consultar un objeto {@link Language} por identificador con el método {@link #getLanguage(java.lang.Short)} sin
     * necesidad de volver a acceder a la base de datos
     * @throws SQLException 
     */
    private void loadAllLanguages() throws SQLException{
        
        languages = new HashMap<>();
        
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM language ");
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            Short languageId = result.getShort(LanguageTableColumns.COLUMN_NAME__LANGUAGE_ID);
            languages.put(languageId,readLanguageFromResultSet(result));
        }
    }

    /**
     * Lee de un <code>ResultSet</code> un registro de la base de datos. El result set debe contener las columnas de la tabla
     * <code>language</code>
     * @param rs ResultSet SQL
     * @return Un lenguage con los datos del registro actual del result set
     * @throws SQLException Si ocurre algún error SQL
     */
    private static Language readLanguageFromResultSet(ResultSet rs) throws SQLException{
        Short languageId = rs.getShort(LanguageTableColumns.COLUMN_NAME__LANGUAGE_ID);
        String languageName = rs.getString(LanguageTableColumns.COLUMN_NAME__NAME);
        Date lastUpdate = rs.getDate(LanguageTableColumns.COLUMN_NAME__LAST_UPDATE);
        Language language = new Language(languageId, languageName, lastUpdate);
        return language;
    }
    
    /**
     * Devuelve del mapa {@link #languages} que carga todos los lenguajes en memoria, aquel
     * objeto cuyo identificador en bbdd coincida con el indicado como argumento. Lanza una excepción en caso de no 
     * estar cargados los idiomas en memoria.
     * @param idLanguage Identificador del registro en bbdd. Admite nulos, en cuyo caso, devuelve nulo.
     * @return el objeto de la base de datos que coincide con dicho id (no accede a bbdd para obtenerlo)
     */
    protected static Language getLanguage(Short idLanguage){
        
        if(idLanguage==null)
            return null;
        
        if(languages==null)
            throw new IllegalStateException("No se puede hacer una consulta en memoria de lenguages si no se cargan antes de la base de datos");
        
        return languages.get(idLanguage);
    }
    
    /**
     * Clase donde definir constantes con los nombres de las columnas de la tabla <code>language</code>
     */
    private class LanguageTableColumns{

        /**
         * Nombre de la columna con el identificador del registro
         */
        public static final String COLUMN_NAME__LANGUAGE_ID = "language_id";
        
        /**
         * Nombre de la columna que contiene el nombre de la ciudad
         */
        public static final String COLUMN_NAME__NAME = "name";
        /**
         * Nombre de la columna que contiene la fecha de última modificación del registro
         */
        public static final String COLUMN_NAME__LAST_UPDATE = "last_update";
        
        
    }
    
}
