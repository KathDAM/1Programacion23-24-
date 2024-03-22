/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambda;

import java.util.Arrays;
import private_class.Punto;

/**
 *
 * @author j.sanmateujuan
 */
public class FiltrarPuntosPorDistancia {
    
    public static Punto[] filtrarPuntosPorDistancia (float distanciaMaxima, Punto[] listaPuntos){
        
        Punto[] listaFiltrada = (Punto[])Arrays.asList(listaPuntos).stream()
                .filter((x) -> x.distancia(Punto.getOrigen()) < distanciaMaxima).toArray();
        return listaFiltrada;
    }
}
