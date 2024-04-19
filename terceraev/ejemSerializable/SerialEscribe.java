package terceraev.ejemSerializable;

import java.io.*;
import java.sql.Date;

public class SerialEscribe {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("prueba.dat");

            ObjectOutputStream ost = new ObjectOutputStream(f);
            Persona persona = new Persona("Eva", 27);
            Date fecha = new Date(6);
            ost.writeObject(persona);
            ost.writeObject(fecha);
            ost.writeInt(15);
            ost.writeDouble(2.5);
            ost.flush();
            ost.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
