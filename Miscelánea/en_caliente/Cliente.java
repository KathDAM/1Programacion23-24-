/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en_caliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jsanm
 */
public class Cliente {
    private String nombreCompleto;
    private Calendar fechaNacimiento;

    private final static SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("dd/MM/yyyy");
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getFechaNacimientoStr() {
        Date fechaNacTime = this.getFechaNacimiento().getTime();
        String fechaNacStr = DATE_FORMATTER.format(fechaNacTime);
        return fechaNacStr;
    }


    public Cliente(String nombreCompleto, Calendar fechaNacimiento) {
        if(nombreCompleto==null || fechaNacimiento==null)
            throw new RuntimeException("Propiedades obligatorias");
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Cliente(String nombreCompleto, String fechaNacimientoStr) {
        this(nombreCompleto, convertStrToCalendar(fechaNacimientoStr));
    }
        
    @Override
    public String toString(){
        return this.getNombreCompleto() + " nació el " + this.getFechaNacimientoStr();
    }
    
    
    private static Calendar convertStrToCalendar(String strDdMmYYYY)  {
        Calendar cl = Calendar.getInstance();
        try{
            cl.setTime(DATE_FORMATTER.parse(strDdMmYYYY));
        }
        catch(ParseException pe){
            throw new RuntimeException("Error al formatear la fecha " + strDdMmYYYY + ": "+ pe.getMessage(),pe);
        }
        return cl;
    }
}
