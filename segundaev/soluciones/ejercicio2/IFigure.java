/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 * Interfaz que deben cumplir todas las figuras
 * @author jsanm
 */
public interface IFigure{
    
    /**
     * Devuelve el nombre de la figura
     * @return 
     */
    public String resolveFigureName();
    
    /**
     * Calcula el perímetro de la figura
     * @return El perímetro, según tipología de figura
     */
    public double resolvePerimeter();
    
    /**
     * Calcula el área de la figura
     * @return El área, según tipología de figura
     */
    public double resolveArea();
}
