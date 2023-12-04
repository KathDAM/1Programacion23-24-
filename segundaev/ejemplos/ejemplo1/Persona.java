package segundaev.ejemplos.ejemplo1;

public class Persona {
    public String nombre;
    public String apellidos;
    public int añoDeNacimiento;

    public void imprime(){
        System.out.println("Datos personales:" + nombre  + " " + apellidos + "(" + añoDeNacimiento + ")");
    } 
}
