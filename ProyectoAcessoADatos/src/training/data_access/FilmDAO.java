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

import training.objects.Film;
import training.objects.Language;

/**
 * Clase de acceso a datos que manipula la lógica de acceso de la tabla <code>film</code>
 * @author jsanm
 */
class FilmDAO extends DataAccessObject{
    
        
    FilmDAO(Connection cnt){
        super(cnt);
    }
    
    /**
     * Carga todas las películas de la tabla <code>film</code> que tienen una duración entre las indicadas.
     * @param fromLength Se buscan las películas publicadas a partir de dicha duración (en minutos). 
     * @param toLength Se buscan las películas publicadas hasta dicha duración (en minutos). 
     * @return Lista dinámica con tantos objetos {@link Film} como registros existan en la bbdd que
     * cumplan con el criterio de búsqueda
     * @throws SQLException Si hay algún error en la ejecución de la consulta
     */
    protected List<Film> loadFilmsByLengthRange(short fromLength, short toLength) throws SQLException {
        
        List<Film> films = new ArrayList<>();
        
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM film WHERE length BETWEEN ? AND ?");
        stmt.setShort(1,fromLength);
        stmt.setShort(2,toLength);
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            films.add(readFilmFromResultSet(result));
        }
        
        return films;
    } 
    
    /**
     * Carga la película que coincida con el título indicado
     * @param title Título de la película a buscar
     * @return La película con el título indicado en caso de existir en la bbdd. Nulo en caso contrario.
     * @throws SQLException Si ocurre algún error SQL
     */
    protected Film loadFilmByTitle(String title) throws SQLException{
        
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM film WHERE title = ?");
        stmt.setString(1,title);
        ResultSet result = stmt.executeQuery();
        
        Film film = null;
        if(result.next()){
            film = readFilmFromResultSet(result);
        }
        return film;
    }

    /**
     * Actualiza el registro en base de datos que coincida con el id del objeto {@link Film#getFilmId()}.
     * @param filmToUpdate Objeto a actualizar en base de datos. Contiene el id del registro a actualizar y el estado a persistir.
     * <p>De momento, solo se implementa la persistencia de la descripción y de la duración. Añadir otros campos a actualizar
     * en caso de necesidad.
     * @throws SQLException Si hay un error en base de datos
     */
    protected void updateFilm(Film filmToUpdate) throws SQLException{
       
        PreparedStatement stmt = cnt.prepareStatement("UPDATE film SET description = ?, length = ? WHERE film_id = ?");
        stmt.setString(1,filmToUpdate.getDescription());
        stmt.setShort(2,filmToUpdate.getLength());
        stmt.setShort(3,filmToUpdate.getFilmId());
        int numUpdatedRows = stmt.executeUpdate();
        
        if(numUpdatedRows!=1)
            throw new IllegalStateException("No se ha actualizado el registro que se esperaba actualizar");
        
    }
            
    /**
     * Lee de un <code>ResultSet</code> un registro de la base de datos. El result set debe contener las columnas de la tabla
     * <code>city</code>
     * @param rs ResultSet SQL
     * @return Una película con los datos del registro actual del result set. Carga en cascada el idioma
     * @throws SQLException Si ocurre algún error SQL
     */
    private static Film readFilmFromResultSet(ResultSet rs) throws SQLException{
        
        Short id = rs.getShort(FilmTableColumns.COLUMN_NAME__FILM_ID);
        String title = rs.getString(FilmTableColumns.COLUMN_NAME__TITLE);
        String description= rs.getString(FilmTableColumns.COLUMN_NAME__DESCRIPTION);
        Integer releaseYear = rs.getInt(FilmTableColumns.COLUMN_NAME__RELEASE_YEAR);
        Language language = LanguageDAO.getLanguage(rs.getShort(FilmTableColumns.COLUMN_NAME__LANGUAGE_ID));
        Language originalLanguage = LanguageDAO.getLanguage(rs.getShort(FilmTableColumns.COLUMN_NAME__ORIGINAL_LANGUAGE_ID));
        Short rentalDuration = rs.getShort(FilmTableColumns.COLUMN_NAME__RENTAL_DURATION);
        Float rentalRate = rs.getFloat(FilmTableColumns.COLUMN_NAME__RENTAL_RATE);
        Short length = rs.getShort(FilmTableColumns.COLUMN_NAME__LENGTH);
        Double replacementCost = rs.getDouble(FilmTableColumns.COLUMN_NAME__REPLACEMENT_COST);
        Date lastUpdate = rs.getDate(FilmTableColumns.COLUMN_NAME__LAST_UPDATE);
        
        return new Film(id, title, description, releaseYear, language, originalLanguage, rentalDuration, rentalRate, length, replacementCost, lastUpdate);
    }
    
    private class FilmTableColumns{
        //nombres de las columnas de la tabla "film"
    
        /**
         * Nombre de la columna con el identificador del registro
         */
        private final static String COLUMN_NAME__FILM_ID = "film_id";

        /**
         * Nombre de la columna con el título de la película
         */
        private final static String COLUMN_NAME__TITLE = "title";

        /**
         * Nombre de la columna con la descripción de la película
         */
        private final static String COLUMN_NAME__DESCRIPTION = "description";

        /**
         * Nombre de la columna con la fecha de lanzamiento de la película
         */
        private final static String COLUMN_NAME__RELEASE_YEAR = "release_year";

        /**
         * Nombre de la columna con el id del lenguaje de la película
         */
        private final static String COLUMN_NAME__LANGUAGE_ID = "language_id";

        /**
         * Nombre de la columna con el id del lenguaje original de la película
         */
        private final static String COLUMN_NAME__ORIGINAL_LANGUAGE_ID = "original_language_id";

        /**
         * Nombre de la columna con la duración del alquiler
         */
        private final static String COLUMN_NAME__RENTAL_DURATION = "rental_duration";

        /**
         * Nombre de la columna con el precio del alquiler
         */
        private final static String COLUMN_NAME__RENTAL_RATE = "rental_rate";

        /**
         * Nombre de la columna con la longitud de la película
         */
        private final static String COLUMN_NAME__LENGTH = "length";

        /**
         * Nombre de la columna con el coste de reemplazo
         */
        private final static String COLUMN_NAME__REPLACEMENT_COST = "replacement_cost";

        /**
         * Nombre de la columna con la valoración de la película (no se implementa en la app de training)
         */
        private final static String COLUMN_NAME__RATING = "rating";

        /**
         * Nombre de la columna con las características especiales de la película (no se implementa en la app de training)
         */
        private final static String COLUMN_NAME__SPECIAL_FEATURES = "special_features";

         /**
         * Nombre de la columna con la fecha de última modificación del registro 
         */
        private final static String COLUMN_NAME__LAST_UPDATE = "last_update";

    }
}
