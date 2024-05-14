/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.objects;

import java.util.Date;

/**
 * Clase para representar cada registro de la tabla <code>city</code> en la aplicación
 * de training
 * @author jsanm
 */
public class City {
    private Short cityId;
    private String city;
    private Short countryId; //este atributo podría ser de tipo Country (no definido)
    private Date lastUpdate;

    public City(Short cityId, String cityName, Short countryId, Date lastUpdate) {
        this.setCityId(cityId);
        this.setCity(cityName);
        this.setCountryId(countryId);
        this.setLastUpdate(lastUpdate);

    }

    public final Short getCityId() {
        return cityId;
    }

    public final void setCityId(Short cityId) {
        if(cityId==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.cityId = cityId;
    }

    public final String getCity() {
        return city;
    }

    public final void setCity(String city) {
        if(city==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.city = city;
    }

    public final Short getCountryId() {
        return countryId;
    }

    public final void setCountryId(Short countryId) {
        if(countryId==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.countryId = countryId;
    }

    public final Date getLastUpdate() {
        return lastUpdate;
    }

    public final void setLastUpdate(Date lastUpdate) {
        if(lastUpdate==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.lastUpdate = lastUpdate;
    }
    
    @Override
    public String toString(){
        return this.getCity();
    }
   
}
