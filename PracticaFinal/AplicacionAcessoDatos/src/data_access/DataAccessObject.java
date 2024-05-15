/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access;

import java.sql.Connection;

/**
 * Clase genérica de acceso a datos
 * @author jsanm
 */
abstract class DataAccessObject {
    
    protected Connection cnt;
    
    DataAccessObject(Connection cnt){
        if(cnt==null)
            throw new IllegalArgumentException("Conexión obligatoria");
        this.cnt = cnt;
    }
    
}
