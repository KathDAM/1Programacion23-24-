/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Date;

/**
 * Clase para representar cada registro de la tabla <code>language</code> en la aplicación
 * de training
 * @author jsanm
 */
public class Language {
    
    private Short languageId;
    private String name;
    private Date lastUpdate;

    public Language(short languageId, String name, Date lastUpdate) {
        this.setLanguageId(languageId);
        this.setName(name);
        this.setLastUpdate(lastUpdate);
    }
    
    public Short getLanguageId() {
        return languageId;
    }

    public final void setLanguageId(Short languageId) {
        if(languageId == null)
            throw new IllegalArgumentException("El argumento no puede ser nulo");
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name==null)
            throw new IllegalArgumentException("El argumento no puede ser nulo");
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public final void setLastUpdate(Date lastUpdate) {
        if(lastUpdate==null)
            throw new IllegalArgumentException("El argumento no puede ser nulo");
        this.lastUpdate = lastUpdate;
    }

    
}
