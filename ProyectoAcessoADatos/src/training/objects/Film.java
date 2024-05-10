/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.objects;

import java.util.Date;

/**
 * Clase para representar cada registro de la tabla <code>film</code> en la aplicación
 * de training
 * @author jsanm
 */
public class Film {

    private Short filmId;
    private String title;
    private String description;
    private Integer releaseYear;
    private Language language;
    private Language originalLanguage;
    private Short rentalDuration;
    private Float rentalRate;
    private Short length;
    private Double replacementCost;
    private Date lastUpdate;
    
    public Film(Short filmId, String title, String description, Integer releaseYear, Language language, Language originalLanguage, Short rentalDuration, Float rentalRate, Short length, Double replacementCost, Date lastUpdate) {
        this.setFilmId(filmId);
        this.setTitle(title);
        this.setDescription(description);
        this.setReleaseYear(releaseYear);
        this.setLanguage(language);
        this.setOriginalLanguage(originalLanguage);
        this.setRentalDuration(rentalDuration);
        this.setRentalRate(rentalRate);
        this.setLength(length);
        this.setReplacementCost(replacementCost);
        this.setLastUpdate(lastUpdate);
    }
  
    public Short getFilmId() {
        return filmId;
    }

    public final void setFilmId(Short filmId) {
        if(filmId==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        if(title==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public final void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Language getLanguage() {
        return language;
    }

    public final void setLanguage(Language language) {
        if(language==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.language = language;
    }

    public Language getOriginalLanguage() {
        return originalLanguage;
    }

    public final void setOriginalLanguage(Language originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Short getRentalDuration() {
        return rentalDuration;
    }

    public final void setRentalDuration(Short rentalDuration) {
        if(rentalDuration==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.rentalDuration = rentalDuration;
    }

    public Float getRentalRate() {
        return rentalRate;
    }

    public final void setRentalRate(Float rentalRate) {
        if(rentalRate==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public final void setLength(Short length) {
        this.length = length;
    }

    public Double getReplacementCost() {
        return replacementCost;
    }

    public final void setReplacementCost(Double replacementCost) {
        if(replacementCost==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.replacementCost = replacementCost;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public final void setLastUpdate(Date lastUpdate) {
        if(lastUpdate==null)
            throw new IllegalArgumentException("No se admite valor nulo");        
        this.lastUpdate = lastUpdate;
    }

     @Override
    public String toString(){
        StringBuilder sb = new StringBuilder().append(title).append(" - ").append(length!=null?length:"<desc>").append("' - ").append(language.getName());
        return sb.toString();
    }
    
}
